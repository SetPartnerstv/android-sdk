package ru.gazprombonus.sdk.handlers

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import android.provider.MediaStore
import ru.gazprombonus.sdk.model.MobileAppPromocodeType
import ru.gazprombonus.sdk.model.MobileEventType
import ru.gazprombonus.sdk.model.MobileEvent
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter
import androidx.core.content.FileProvider
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream

class SharePromocodeEventHandler(private val context: Context) : MobileEventHandler {
    override fun handle(event: MobileEvent): Boolean = event.takeIf {
        it.type == MobileEventType.MOBILE_EVENT_SHARE_PROMOCODE_REQUEST
    }?.let {
        var bitMatrix: BitMatrix? = null;
        var width = 150
        var height = 90
        when(event.promocode.type) {
            MobileAppPromocodeType.QR -> {
                val size = 256
                width = size
                height = size
                val qrCodeWriter = QRCodeWriter()
                bitMatrix = qrCodeWriter.encode(event.promocode.text, BarcodeFormat.QR_CODE, width, height)
            }
            MobileAppPromocodeType.BARCODE128 -> {
                width = 800
                height = 400
                var codeWriter = MultiFormatWriter()
                bitMatrix = codeWriter.encode(
                    event.promocode.valuePromocode,
                    BarcodeFormat.CODE_128,
                    width,
                    height,
                )
            }
            MobileAppPromocodeType.UNSPECIFIED -> {
            }
            MobileAppPromocodeType.BARCODEEAN13 -> {
                width = 600
                height = 270
                var codeWriter = MultiFormatWriter()
                bitMatrix = codeWriter.encode(
                    event.promocode.valuePromocode,
                    BarcodeFormat.EAN_13,
                    width,
                    height,
                )
            }
            MobileAppPromocodeType.BARCODEEAN8 -> {
                width = 450
                height = 270
                var codeWriter = MultiFormatWriter()
                bitMatrix = codeWriter.encode(
                    event.promocode.valuePromocode,
                    BarcodeFormat.EAN_8,
                    width,
                    height,
                )
            }
            MobileAppPromocodeType.PROMOCODE -> {
            }
            MobileAppPromocodeType.UNRECOGNIZED -> {
            }
        }


        bitMatrix?.let {
            val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            for (x in 0 until width) {
                for (y in 0 until height) {
                    bitmap.setPixel(x, y,  if (bitMatrix.get(x, y)) Color.BLACK else Color.WHITE)
                }
            }
            val uri = saveBitmapToCache(bitmap)
            val inputStream = uri?.let { it1 -> context.contentResolver.openInputStream(it1) }
                ?: throw Error("Input stream is null.")
            inputStream.close()

            val sendIntent: Intent = Intent(Intent.ACTION_SEND).apply {
                putExtra(Intent.EXTRA_STREAM, uri)
                putExtra(Intent.EXTRA_TEXT, "${event.promocode.valuePromocode}\n\n${event.promocode.text}")
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                type = "image/png"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            context.startActivity(shareIntent)
        }

        true
    } ?: false

    private fun saveBitmapToCache(bitmap: Bitmap): Uri? {
        val cachePath = File(context.cacheDir, "images")
        cachePath.mkdirs()
        val file = File(cachePath, "share_img.png")

        FileOutputStream(file).use { stream ->
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
        }

        return FileProvider.getUriForFile(
            context,
            "${context.applicationContext.packageName}.ru.gazprombonus.sdk.fileprovider",
            file
        )
    }
}
