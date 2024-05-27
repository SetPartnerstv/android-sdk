// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mobile.proto

package ru.gazprombonus.sdk.model;

public interface ApplePayPaymentTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pbv1.ApplePayPaymentToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string payment_data = 1;</code>
   * @return The paymentData.
   */
  java.lang.String getPaymentData();
  /**
   * <code>string payment_data = 1;</code>
   * @return The bytes for paymentData.
   */
  com.google.protobuf.ByteString
      getPaymentDataBytes();

  /**
   * <code>string transaction_identifier = 2;</code>
   * @return The transactionIdentifier.
   */
  java.lang.String getTransactionIdentifier();
  /**
   * <code>string transaction_identifier = 2;</code>
   * @return The bytes for transactionIdentifier.
   */
  com.google.protobuf.ByteString
      getTransactionIdentifierBytes();

  /**
   * <code>.pbv1.ApplePaymentMethod payment_method = 3;</code>
   * @return Whether the paymentMethod field is set.
   */
  boolean hasPaymentMethod();
  /**
   * <code>.pbv1.ApplePaymentMethod payment_method = 3;</code>
   * @return The paymentMethod.
   */
  ru.gazprombonus.sdk.model.ApplePaymentMethod getPaymentMethod();
  /**
   * <code>.pbv1.ApplePaymentMethod payment_method = 3;</code>
   */
  ru.gazprombonus.sdk.model.ApplePaymentMethodOrBuilder getPaymentMethodOrBuilder();
}