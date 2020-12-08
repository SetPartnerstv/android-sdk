// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb/apis/mobile.model.proto

package ru.pnhub.widgetsdk.model;

public interface PaymentMethodDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pb.PaymentMethodData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  String getType();
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>.pb.CardInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.pb.CardInfo info = 2;</code>
   * @return The info.
   */
  CardInfo getInfo();
  /**
   * <code>.pb.CardInfo info = 2;</code>
   */
  CardInfoOrBuilder getInfoOrBuilder();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
   * @return Whether the tokenizationData field is set.
   */
  boolean hasTokenizationData();
  /**
   * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
   * @return The tokenizationData.
   */
  PaymentMethodTokenizationData getTokenizationData();
  /**
   * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
   */
  PaymentMethodTokenizationDataOrBuilder getTokenizationDataOrBuilder();
}
