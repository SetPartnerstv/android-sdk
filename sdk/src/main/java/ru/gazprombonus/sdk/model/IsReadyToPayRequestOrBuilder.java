// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mobile.proto

package ru.gazprombonus.sdk.model;

public interface IsReadyToPayRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pbv1.IsReadyToPayRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 api_version = 1;</code>
   * @return The apiVersion.
   */
  int getApiVersion();

  /**
   * <code>uint32 api_version_minor = 2;</code>
   * @return The apiVersionMinor.
   */
  int getApiVersionMinor();

  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  java.util.List<ru.gazprombonus.sdk.model.PaymentMethodSpecification> 
      getAllowedPaymentMethodsList();
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  ru.gazprombonus.sdk.model.PaymentMethodSpecification getAllowedPaymentMethods(int index);
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  int getAllowedPaymentMethodsCount();
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  java.util.List<? extends ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder> 
      getAllowedPaymentMethodsOrBuilderList();
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder getAllowedPaymentMethodsOrBuilder(
      int index);

  /**
   * <code>bool existing_payment_method_required = 4;</code>
   * @return The existingPaymentMethodRequired.
   */
  boolean getExistingPaymentMethodRequired();
}
