package ru.gazprombonus.sdk

import org.junit.Test
import org.junit.Assert.*
import ru.gazprombonus.sdk.model.BillingAddressParameters
import ru.gazprombonus.sdk.model.CardInfo
import ru.gazprombonus.sdk.model.IsReadyToPayRequest

private const val BILLING_ADDRESS_PARAMS_JSON = """{"format":"TEST","phoneNumberRequired":true}"""

class UtilsTest {
    @Test
    fun protobuf_MessageToJsonIsCorrect() {
        val json = BillingAddressParameters.newBuilder().run {
            format = "TEST"
            phoneNumberRequired = true
            toJson()
        }

        assertEquals(BILLING_ADDRESS_PARAMS_JSON, json)
    }

    @Test
    fun protobuf_MessageFromJsonIsCorrect() {
        val message = BillingAddressParameters.newBuilder().run {
            fromJson(BILLING_ADDRESS_PARAMS_JSON)
            build()
        }

        assertEquals("TEST", message.format)
        assertEquals(true, message.phoneNumberRequired)
    }

    @Test
    fun protobuf_NestedBuilderIsCorrect() {
        val message = CardInfo.newBuilder().run {
            cardNetwork = "test card network"
            cardDetails = "test card details"
            billingAddressBuilder.fromJson("""{"name":"test address name"}""")
            build()
        }

        assertEquals("test address name", message.billingAddress.name)
    }

    @Test
    fun protobuf_ApiVersionMinorIsCorrect() {
        val json = IsReadyToPayRequest.newBuilder().run {
            apiVersion = 2
            apiVersionMinor = 0
            toJson()
        }

        assert(json.contains("\"apiVersionMinor\""))
    }
}
