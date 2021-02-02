// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb/apis/mobile.model.proto

package ru.pnhub.widgetsdk.model;

/**
 * Protobuf type {@code pb.CardNetworkParameters}
 */
public final class CardNetworkParameters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.CardNetworkParameters)
    CardNetworkParametersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CardNetworkParameters.newBuilder() to construct.
  private CardNetworkParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CardNetworkParameters() {
    cardNetwork_ = "";
    acquirerBin_ = "";
    acquirerMerchantId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CardNetworkParameters();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CardNetworkParameters(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            cardNetwork_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            acquirerBin_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            acquirerMerchantId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.pnhub.widgetsdk.model.MobileModel.internal_static_pb_CardNetworkParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.pnhub.widgetsdk.model.MobileModel.internal_static_pb_CardNetworkParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.pnhub.widgetsdk.model.CardNetworkParameters.class, ru.pnhub.widgetsdk.model.CardNetworkParameters.Builder.class);
  }

  public static final int CARD_NETWORK_FIELD_NUMBER = 1;
  private volatile java.lang.Object cardNetwork_;
  /**
   * <code>string card_network = 1;</code>
   * @return The cardNetwork.
   */
  @java.lang.Override
  public java.lang.String getCardNetwork() {
    java.lang.Object ref = cardNetwork_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardNetwork_ = s;
      return s;
    }
  }
  /**
   * <code>string card_network = 1;</code>
   * @return The bytes for cardNetwork.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCardNetworkBytes() {
    java.lang.Object ref = cardNetwork_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cardNetwork_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACQUIRER_BIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object acquirerBin_;
  /**
   * <code>string acquirer_bin = 2;</code>
   * @return The acquirerBin.
   */
  @java.lang.Override
  public java.lang.String getAcquirerBin() {
    java.lang.Object ref = acquirerBin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acquirerBin_ = s;
      return s;
    }
  }
  /**
   * <code>string acquirer_bin = 2;</code>
   * @return The bytes for acquirerBin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcquirerBinBytes() {
    java.lang.Object ref = acquirerBin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acquirerBin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACQUIRER_MERCHANT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object acquirerMerchantId_;
  /**
   * <code>string acquirer_merchant_id = 3;</code>
   * @return The acquirerMerchantId.
   */
  @java.lang.Override
  public java.lang.String getAcquirerMerchantId() {
    java.lang.Object ref = acquirerMerchantId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acquirerMerchantId_ = s;
      return s;
    }
  }
  /**
   * <code>string acquirer_merchant_id = 3;</code>
   * @return The bytes for acquirerMerchantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcquirerMerchantIdBytes() {
    java.lang.Object ref = acquirerMerchantId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acquirerMerchantId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCardNetworkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cardNetwork_);
    }
    if (!getAcquirerBinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, acquirerBin_);
    }
    if (!getAcquirerMerchantIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, acquirerMerchantId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCardNetworkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cardNetwork_);
    }
    if (!getAcquirerBinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, acquirerBin_);
    }
    if (!getAcquirerMerchantIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, acquirerMerchantId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.pnhub.widgetsdk.model.CardNetworkParameters)) {
      return super.equals(obj);
    }
    ru.pnhub.widgetsdk.model.CardNetworkParameters other = (ru.pnhub.widgetsdk.model.CardNetworkParameters) obj;

    if (!getCardNetwork()
        .equals(other.getCardNetwork())) return false;
    if (!getAcquirerBin()
        .equals(other.getAcquirerBin())) return false;
    if (!getAcquirerMerchantId()
        .equals(other.getAcquirerMerchantId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CARD_NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getCardNetwork().hashCode();
    hash = (37 * hash) + ACQUIRER_BIN_FIELD_NUMBER;
    hash = (53 * hash) + getAcquirerBin().hashCode();
    hash = (37 * hash) + ACQUIRER_MERCHANT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAcquirerMerchantId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.pnhub.widgetsdk.model.CardNetworkParameters parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ru.pnhub.widgetsdk.model.CardNetworkParameters prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code pb.CardNetworkParameters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.CardNetworkParameters)
      ru.pnhub.widgetsdk.model.CardNetworkParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.pnhub.widgetsdk.model.MobileModel.internal_static_pb_CardNetworkParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.pnhub.widgetsdk.model.MobileModel.internal_static_pb_CardNetworkParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.pnhub.widgetsdk.model.CardNetworkParameters.class, ru.pnhub.widgetsdk.model.CardNetworkParameters.Builder.class);
    }

    // Construct using ru.pnhub.widgetsdk.model.CardNetworkParameters.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      cardNetwork_ = "";

      acquirerBin_ = "";

      acquirerMerchantId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.pnhub.widgetsdk.model.MobileModel.internal_static_pb_CardNetworkParameters_descriptor;
    }

    @java.lang.Override
    public ru.pnhub.widgetsdk.model.CardNetworkParameters getDefaultInstanceForType() {
      return ru.pnhub.widgetsdk.model.CardNetworkParameters.getDefaultInstance();
    }

    @java.lang.Override
    public ru.pnhub.widgetsdk.model.CardNetworkParameters build() {
      ru.pnhub.widgetsdk.model.CardNetworkParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.pnhub.widgetsdk.model.CardNetworkParameters buildPartial() {
      ru.pnhub.widgetsdk.model.CardNetworkParameters result = new ru.pnhub.widgetsdk.model.CardNetworkParameters(this);
      result.cardNetwork_ = cardNetwork_;
      result.acquirerBin_ = acquirerBin_;
      result.acquirerMerchantId_ = acquirerMerchantId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.pnhub.widgetsdk.model.CardNetworkParameters) {
        return mergeFrom((ru.pnhub.widgetsdk.model.CardNetworkParameters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.pnhub.widgetsdk.model.CardNetworkParameters other) {
      if (other == ru.pnhub.widgetsdk.model.CardNetworkParameters.getDefaultInstance()) return this;
      if (!other.getCardNetwork().isEmpty()) {
        cardNetwork_ = other.cardNetwork_;
        onChanged();
      }
      if (!other.getAcquirerBin().isEmpty()) {
        acquirerBin_ = other.acquirerBin_;
        onChanged();
      }
      if (!other.getAcquirerMerchantId().isEmpty()) {
        acquirerMerchantId_ = other.acquirerMerchantId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ru.pnhub.widgetsdk.model.CardNetworkParameters parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.pnhub.widgetsdk.model.CardNetworkParameters) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object cardNetwork_ = "";
    /**
     * <code>string card_network = 1;</code>
     * @return The cardNetwork.
     */
    public java.lang.String getCardNetwork() {
      java.lang.Object ref = cardNetwork_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardNetwork_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string card_network = 1;</code>
     * @return The bytes for cardNetwork.
     */
    public com.google.protobuf.ByteString
        getCardNetworkBytes() {
      java.lang.Object ref = cardNetwork_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cardNetwork_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string card_network = 1;</code>
     * @param value The cardNetwork to set.
     * @return This builder for chaining.
     */
    public Builder setCardNetwork(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cardNetwork_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string card_network = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCardNetwork() {
      
      cardNetwork_ = getDefaultInstance().getCardNetwork();
      onChanged();
      return this;
    }
    /**
     * <code>string card_network = 1;</code>
     * @param value The bytes for cardNetwork to set.
     * @return This builder for chaining.
     */
    public Builder setCardNetworkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cardNetwork_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object acquirerBin_ = "";
    /**
     * <code>string acquirer_bin = 2;</code>
     * @return The acquirerBin.
     */
    public java.lang.String getAcquirerBin() {
      java.lang.Object ref = acquirerBin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acquirerBin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string acquirer_bin = 2;</code>
     * @return The bytes for acquirerBin.
     */
    public com.google.protobuf.ByteString
        getAcquirerBinBytes() {
      java.lang.Object ref = acquirerBin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acquirerBin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string acquirer_bin = 2;</code>
     * @param value The acquirerBin to set.
     * @return This builder for chaining.
     */
    public Builder setAcquirerBin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      acquirerBin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string acquirer_bin = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcquirerBin() {
      
      acquirerBin_ = getDefaultInstance().getAcquirerBin();
      onChanged();
      return this;
    }
    /**
     * <code>string acquirer_bin = 2;</code>
     * @param value The bytes for acquirerBin to set.
     * @return This builder for chaining.
     */
    public Builder setAcquirerBinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      acquirerBin_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object acquirerMerchantId_ = "";
    /**
     * <code>string acquirer_merchant_id = 3;</code>
     * @return The acquirerMerchantId.
     */
    public java.lang.String getAcquirerMerchantId() {
      java.lang.Object ref = acquirerMerchantId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acquirerMerchantId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string acquirer_merchant_id = 3;</code>
     * @return The bytes for acquirerMerchantId.
     */
    public com.google.protobuf.ByteString
        getAcquirerMerchantIdBytes() {
      java.lang.Object ref = acquirerMerchantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acquirerMerchantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string acquirer_merchant_id = 3;</code>
     * @param value The acquirerMerchantId to set.
     * @return This builder for chaining.
     */
    public Builder setAcquirerMerchantId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      acquirerMerchantId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string acquirer_merchant_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcquirerMerchantId() {
      
      acquirerMerchantId_ = getDefaultInstance().getAcquirerMerchantId();
      onChanged();
      return this;
    }
    /**
     * <code>string acquirer_merchant_id = 3;</code>
     * @param value The bytes for acquirerMerchantId to set.
     * @return This builder for chaining.
     */
    public Builder setAcquirerMerchantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      acquirerMerchantId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pb.CardNetworkParameters)
  }

  // @@protoc_insertion_point(class_scope:pb.CardNetworkParameters)
  private static final ru.pnhub.widgetsdk.model.CardNetworkParameters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.pnhub.widgetsdk.model.CardNetworkParameters();
  }

  public static ru.pnhub.widgetsdk.model.CardNetworkParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardNetworkParameters>
      PARSER = new com.google.protobuf.AbstractParser<CardNetworkParameters>() {
    @java.lang.Override
    public CardNetworkParameters parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CardNetworkParameters(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CardNetworkParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardNetworkParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.pnhub.widgetsdk.model.CardNetworkParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

