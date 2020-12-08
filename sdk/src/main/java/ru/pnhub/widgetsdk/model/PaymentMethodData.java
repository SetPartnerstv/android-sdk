// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb/apis/mobile.model.proto

package ru.pnhub.widgetsdk.model;

/**
 * Protobuf type {@code pb.PaymentMethodData}
 */
public final class PaymentMethodData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.PaymentMethodData)
    PaymentMethodDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaymentMethodData.newBuilder() to construct.
  private PaymentMethodData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentMethodData() {
    type_ = "";
    description_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaymentMethodData();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaymentMethodData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 18: {
            CardInfo.Builder subBuilder = null;
            if (info_ != null) {
              subBuilder = info_.toBuilder();
            }
            info_ = input.readMessage(CardInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(info_);
              info_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 34: {
            PaymentMethodTokenizationData.Builder subBuilder = null;
            if (tokenizationData_ != null) {
              subBuilder = tokenizationData_.toBuilder();
            }
            tokenizationData_ = input.readMessage(PaymentMethodTokenizationData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tokenizationData_);
              tokenizationData_ = subBuilder.buildPartial();
            }

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
    return MobileModel.internal_static_pb_PaymentMethodData_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MobileModel.internal_static_pb_PaymentMethodData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PaymentMethodData.class, Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile Object type_;
  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  @Override
  public String getType() {
    Object ref = type_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    Object ref = type_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFO_FIELD_NUMBER = 2;
  private CardInfo info_;
  /**
   * <code>.pb.CardInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  @Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <code>.pb.CardInfo info = 2;</code>
   * @return The info.
   */
  @Override
  public CardInfo getInfo() {
    return info_ == null ? CardInfo.getDefaultInstance() : info_;
  }
  /**
   * <code>.pb.CardInfo info = 2;</code>
   */
  @Override
  public CardInfoOrBuilder getInfoOrBuilder() {
    return getInfo();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile Object description_;
  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  @Override
  public String getDescription() {
    Object ref = description_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  @Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    Object ref = description_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKENIZATION_DATA_FIELD_NUMBER = 4;
  private PaymentMethodTokenizationData tokenizationData_;
  /**
   * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
   * @return Whether the tokenizationData field is set.
   */
  @Override
  public boolean hasTokenizationData() {
    return tokenizationData_ != null;
  }
  /**
   * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
   * @return The tokenizationData.
   */
  @Override
  public PaymentMethodTokenizationData getTokenizationData() {
    return tokenizationData_ == null ? PaymentMethodTokenizationData.getDefaultInstance() : tokenizationData_;
  }
  /**
   * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
   */
  @Override
  public PaymentMethodTokenizationDataOrBuilder getTokenizationDataOrBuilder() {
    return getTokenizationData();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (info_ != null) {
      output.writeMessage(2, getInfo());
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (tokenizationData_ != null) {
      output.writeMessage(4, getTokenizationData());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInfo());
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (tokenizationData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTokenizationData());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof PaymentMethodData)) {
      return super.equals(obj);
    }
    PaymentMethodData other = (PaymentMethodData) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasTokenizationData() != other.hasTokenizationData()) return false;
    if (hasTokenizationData()) {
      if (!getTokenizationData()
          .equals(other.getTokenizationData())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasTokenizationData()) {
      hash = (37 * hash) + TOKENIZATION_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getTokenizationData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PaymentMethodData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PaymentMethodData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PaymentMethodData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PaymentMethodData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PaymentMethodData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PaymentMethodData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PaymentMethodData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PaymentMethodData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PaymentMethodData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PaymentMethodData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PaymentMethodData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PaymentMethodData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(PaymentMethodData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code pb.PaymentMethodData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.PaymentMethodData)
      PaymentMethodDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MobileModel.internal_static_pb_PaymentMethodData_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MobileModel.internal_static_pb_PaymentMethodData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PaymentMethodData.class, Builder.class);
    }

    // Construct using ru.pnhub.widgetsdk.model.PaymentMethodData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      type_ = "";

      if (infoBuilder_ == null) {
        info_ = null;
      } else {
        info_ = null;
        infoBuilder_ = null;
      }
      description_ = "";

      if (tokenizationDataBuilder_ == null) {
        tokenizationData_ = null;
      } else {
        tokenizationData_ = null;
        tokenizationDataBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MobileModel.internal_static_pb_PaymentMethodData_descriptor;
    }

    @Override
    public PaymentMethodData getDefaultInstanceForType() {
      return PaymentMethodData.getDefaultInstance();
    }

    @Override
    public PaymentMethodData build() {
      PaymentMethodData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public PaymentMethodData buildPartial() {
      PaymentMethodData result = new PaymentMethodData(this);
      result.type_ = type_;
      if (infoBuilder_ == null) {
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
      }
      result.description_ = description_;
      if (tokenizationDataBuilder_ == null) {
        result.tokenizationData_ = tokenizationData_;
      } else {
        result.tokenizationData_ = tokenizationDataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof PaymentMethodData) {
        return mergeFrom((PaymentMethodData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PaymentMethodData other) {
      if (other == PaymentMethodData.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.hasTokenizationData()) {
        mergeTokenizationData(other.getTokenizationData());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      PaymentMethodData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (PaymentMethodData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object type_ = "";
    /**
     * <code>string type = 1;</code>
     * @return The type.
     */
    public String getType() {
      Object ref = type_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private CardInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        CardInfo, CardInfo.Builder, CardInfoOrBuilder> infoBuilder_;
    /**
     * <code>.pb.CardInfo info = 2;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return infoBuilder_ != null || info_ != null;
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     * @return The info.
     */
    public CardInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? CardInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     */
    public Builder setInfo(CardInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     */
    public Builder setInfo(
        CardInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     */
    public Builder mergeInfo(CardInfo value) {
      if (infoBuilder_ == null) {
        if (info_ != null) {
          info_ =
            CardInfo.newBuilder(info_).mergeFrom(value).buildPartial();
        } else {
          info_ = value;
        }
        onChanged();
      } else {
        infoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = null;
        onChanged();
      } else {
        info_ = null;
        infoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     */
    public CardInfo.Builder getInfoBuilder() {
      
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     */
    public CardInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            CardInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <code>.pb.CardInfo info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        CardInfo, CardInfo.Builder, CardInfoOrBuilder>
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            CardInfo, CardInfo.Builder, CardInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private Object description_ = "";
    /**
     * <code>string description = 3;</code>
     * @return The description.
     */
    public String getDescription() {
      Object ref = description_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private PaymentMethodTokenizationData tokenizationData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        PaymentMethodTokenizationData, PaymentMethodTokenizationData.Builder, PaymentMethodTokenizationDataOrBuilder> tokenizationDataBuilder_;
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     * @return Whether the tokenizationData field is set.
     */
    public boolean hasTokenizationData() {
      return tokenizationDataBuilder_ != null || tokenizationData_ != null;
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     * @return The tokenizationData.
     */
    public PaymentMethodTokenizationData getTokenizationData() {
      if (tokenizationDataBuilder_ == null) {
        return tokenizationData_ == null ? PaymentMethodTokenizationData.getDefaultInstance() : tokenizationData_;
      } else {
        return tokenizationDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     */
    public Builder setTokenizationData(PaymentMethodTokenizationData value) {
      if (tokenizationDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenizationData_ = value;
        onChanged();
      } else {
        tokenizationDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     */
    public Builder setTokenizationData(
        PaymentMethodTokenizationData.Builder builderForValue) {
      if (tokenizationDataBuilder_ == null) {
        tokenizationData_ = builderForValue.build();
        onChanged();
      } else {
        tokenizationDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     */
    public Builder mergeTokenizationData(PaymentMethodTokenizationData value) {
      if (tokenizationDataBuilder_ == null) {
        if (tokenizationData_ != null) {
          tokenizationData_ =
            PaymentMethodTokenizationData.newBuilder(tokenizationData_).mergeFrom(value).buildPartial();
        } else {
          tokenizationData_ = value;
        }
        onChanged();
      } else {
        tokenizationDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     */
    public Builder clearTokenizationData() {
      if (tokenizationDataBuilder_ == null) {
        tokenizationData_ = null;
        onChanged();
      } else {
        tokenizationData_ = null;
        tokenizationDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     */
    public PaymentMethodTokenizationData.Builder getTokenizationDataBuilder() {
      
      onChanged();
      return getTokenizationDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     */
    public PaymentMethodTokenizationDataOrBuilder getTokenizationDataOrBuilder() {
      if (tokenizationDataBuilder_ != null) {
        return tokenizationDataBuilder_.getMessageOrBuilder();
      } else {
        return tokenizationData_ == null ?
            PaymentMethodTokenizationData.getDefaultInstance() : tokenizationData_;
      }
    }
    /**
     * <code>.pb.PaymentMethodTokenizationData tokenization_data = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        PaymentMethodTokenizationData, PaymentMethodTokenizationData.Builder, PaymentMethodTokenizationDataOrBuilder>
        getTokenizationDataFieldBuilder() {
      if (tokenizationDataBuilder_ == null) {
        tokenizationDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            PaymentMethodTokenizationData, PaymentMethodTokenizationData.Builder, PaymentMethodTokenizationDataOrBuilder>(
                getTokenizationData(),
                getParentForChildren(),
                isClean());
        tokenizationData_ = null;
      }
      return tokenizationDataBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pb.PaymentMethodData)
  }

  // @@protoc_insertion_point(class_scope:pb.PaymentMethodData)
  private static final PaymentMethodData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PaymentMethodData();
  }

  public static PaymentMethodData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentMethodData>
      PARSER = new com.google.protobuf.AbstractParser<PaymentMethodData>() {
    @Override
    public PaymentMethodData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaymentMethodData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaymentMethodData> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PaymentMethodData> getParserForType() {
    return PARSER;
  }

  @Override
  public PaymentMethodData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

