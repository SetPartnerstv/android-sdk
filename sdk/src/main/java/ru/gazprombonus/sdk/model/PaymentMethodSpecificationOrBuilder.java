// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mobile.proto

package ru.gazprombonus.sdk.model;

public interface PaymentMethodSpecificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pbv1.PaymentMethodSpecification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>.pbv1.CardParameters parameters = 2;</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <code>.pbv1.CardParameters parameters = 2;</code>
   * @return The parameters.
   */
  ru.gazprombonus.sdk.model.CardParameters getParameters();
  /**
   * <code>.pbv1.CardParameters parameters = 2;</code>
   */
  ru.gazprombonus.sdk.model.CardParametersOrBuilder getParametersOrBuilder();

  /**
   * <code>.pbv1.TokenizationSpecification tokenization_specification = 3;</code>
   * @return Whether the tokenizationSpecification field is set.
   */
  boolean hasTokenizationSpecification();
  /**
   * <code>.pbv1.TokenizationSpecification tokenization_specification = 3;</code>
   * @return The tokenizationSpecification.
   */
  ru.gazprombonus.sdk.model.TokenizationSpecification getTokenizationSpecification();
  /**
   * <code>.pbv1.TokenizationSpecification tokenization_specification = 3;</code>
   */
  ru.gazprombonus.sdk.model.TokenizationSpecificationOrBuilder getTokenizationSpecificationOrBuilder();
}
