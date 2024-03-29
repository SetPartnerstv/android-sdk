// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mobile.proto

package ru.gazprombonus.sdk.model;

/**
 * Protobuf type {@code pbv1.ShippingAddressParameters}
 */
public final class ShippingAddressParameters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pbv1.ShippingAddressParameters)
    ShippingAddressParametersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShippingAddressParameters.newBuilder() to construct.
  private ShippingAddressParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShippingAddressParameters() {
    allowedCountryCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShippingAddressParameters();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShippingAddressParameters(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              allowedCountryCodes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            allowedCountryCodes_.add(s);
            break;
          }
          case 16: {

            phoneNumberRequired_ = input.readBool();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        allowedCountryCodes_ = allowedCountryCodes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_ShippingAddressParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_ShippingAddressParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.gazprombonus.sdk.model.ShippingAddressParameters.class, ru.gazprombonus.sdk.model.ShippingAddressParameters.Builder.class);
  }

  public static final int ALLOWED_COUNTRY_CODES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList allowedCountryCodes_;
  /**
   * <code>repeated string allowed_country_codes = 1;</code>
   * @return A list containing the allowedCountryCodes.
   */
  public com.google.protobuf.ProtocolStringList
      getAllowedCountryCodesList() {
    return allowedCountryCodes_;
  }
  /**
   * <code>repeated string allowed_country_codes = 1;</code>
   * @return The count of allowedCountryCodes.
   */
  public int getAllowedCountryCodesCount() {
    return allowedCountryCodes_.size();
  }
  /**
   * <code>repeated string allowed_country_codes = 1;</code>
   * @param index The index of the element to return.
   * @return The allowedCountryCodes at the given index.
   */
  public java.lang.String getAllowedCountryCodes(int index) {
    return allowedCountryCodes_.get(index);
  }
  /**
   * <code>repeated string allowed_country_codes = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedCountryCodes at the given index.
   */
  public com.google.protobuf.ByteString
      getAllowedCountryCodesBytes(int index) {
    return allowedCountryCodes_.getByteString(index);
  }

  public static final int PHONE_NUMBER_REQUIRED_FIELD_NUMBER = 2;
  private boolean phoneNumberRequired_;
  /**
   * <code>bool phone_number_required = 2;</code>
   * @return The phoneNumberRequired.
   */
  @java.lang.Override
  public boolean getPhoneNumberRequired() {
    return phoneNumberRequired_;
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
    for (int i = 0; i < allowedCountryCodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowedCountryCodes_.getRaw(i));
    }
    if (phoneNumberRequired_ != false) {
      output.writeBool(2, phoneNumberRequired_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedCountryCodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowedCountryCodes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedCountryCodesList().size();
    }
    if (phoneNumberRequired_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, phoneNumberRequired_);
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
    if (!(obj instanceof ru.gazprombonus.sdk.model.ShippingAddressParameters)) {
      return super.equals(obj);
    }
    ru.gazprombonus.sdk.model.ShippingAddressParameters other = (ru.gazprombonus.sdk.model.ShippingAddressParameters) obj;

    if (!getAllowedCountryCodesList()
        .equals(other.getAllowedCountryCodesList())) return false;
    if (getPhoneNumberRequired()
        != other.getPhoneNumberRequired()) return false;
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
    if (getAllowedCountryCodesCount() > 0) {
      hash = (37 * hash) + ALLOWED_COUNTRY_CODES_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedCountryCodesList().hashCode();
    }
    hash = (37 * hash) + PHONE_NUMBER_REQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPhoneNumberRequired());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.gazprombonus.sdk.model.ShippingAddressParameters parseFrom(
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
  public static Builder newBuilder(ru.gazprombonus.sdk.model.ShippingAddressParameters prototype) {
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
   * Protobuf type {@code pbv1.ShippingAddressParameters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pbv1.ShippingAddressParameters)
      ru.gazprombonus.sdk.model.ShippingAddressParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_ShippingAddressParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_ShippingAddressParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.gazprombonus.sdk.model.ShippingAddressParameters.class, ru.gazprombonus.sdk.model.ShippingAddressParameters.Builder.class);
    }

    // Construct using ru.gazprombonus.sdk.model.ShippingAddressParameters.newBuilder()
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
      allowedCountryCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      phoneNumberRequired_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_ShippingAddressParameters_descriptor;
    }

    @java.lang.Override
    public ru.gazprombonus.sdk.model.ShippingAddressParameters getDefaultInstanceForType() {
      return ru.gazprombonus.sdk.model.ShippingAddressParameters.getDefaultInstance();
    }

    @java.lang.Override
    public ru.gazprombonus.sdk.model.ShippingAddressParameters build() {
      ru.gazprombonus.sdk.model.ShippingAddressParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.gazprombonus.sdk.model.ShippingAddressParameters buildPartial() {
      ru.gazprombonus.sdk.model.ShippingAddressParameters result = new ru.gazprombonus.sdk.model.ShippingAddressParameters(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        allowedCountryCodes_ = allowedCountryCodes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowedCountryCodes_ = allowedCountryCodes_;
      result.phoneNumberRequired_ = phoneNumberRequired_;
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
      if (other instanceof ru.gazprombonus.sdk.model.ShippingAddressParameters) {
        return mergeFrom((ru.gazprombonus.sdk.model.ShippingAddressParameters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.gazprombonus.sdk.model.ShippingAddressParameters other) {
      if (other == ru.gazprombonus.sdk.model.ShippingAddressParameters.getDefaultInstance()) return this;
      if (!other.allowedCountryCodes_.isEmpty()) {
        if (allowedCountryCodes_.isEmpty()) {
          allowedCountryCodes_ = other.allowedCountryCodes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedCountryCodesIsMutable();
          allowedCountryCodes_.addAll(other.allowedCountryCodes_);
        }
        onChanged();
      }
      if (other.getPhoneNumberRequired() != false) {
        setPhoneNumberRequired(other.getPhoneNumberRequired());
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
      ru.gazprombonus.sdk.model.ShippingAddressParameters parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.gazprombonus.sdk.model.ShippingAddressParameters) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList allowedCountryCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAllowedCountryCodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedCountryCodes_ = new com.google.protobuf.LazyStringArrayList(allowedCountryCodes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @return A list containing the allowedCountryCodes.
     */
    public com.google.protobuf.ProtocolStringList
        getAllowedCountryCodesList() {
      return allowedCountryCodes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @return The count of allowedCountryCodes.
     */
    public int getAllowedCountryCodesCount() {
      return allowedCountryCodes_.size();
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @param index The index of the element to return.
     * @return The allowedCountryCodes at the given index.
     */
    public java.lang.String getAllowedCountryCodes(int index) {
      return allowedCountryCodes_.get(index);
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the allowedCountryCodes at the given index.
     */
    public com.google.protobuf.ByteString
        getAllowedCountryCodesBytes(int index) {
      return allowedCountryCodes_.getByteString(index);
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @param index The index to set the value at.
     * @param value The allowedCountryCodes to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedCountryCodes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAllowedCountryCodesIsMutable();
      allowedCountryCodes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @param value The allowedCountryCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedCountryCodes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAllowedCountryCodesIsMutable();
      allowedCountryCodes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @param values The allowedCountryCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedCountryCodes(
        java.lang.Iterable<java.lang.String> values) {
      ensureAllowedCountryCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, allowedCountryCodes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowedCountryCodes() {
      allowedCountryCodes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string allowed_country_codes = 1;</code>
     * @param value The bytes of the allowedCountryCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedCountryCodesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAllowedCountryCodesIsMutable();
      allowedCountryCodes_.add(value);
      onChanged();
      return this;
    }

    private boolean phoneNumberRequired_ ;
    /**
     * <code>bool phone_number_required = 2;</code>
     * @return The phoneNumberRequired.
     */
    @java.lang.Override
    public boolean getPhoneNumberRequired() {
      return phoneNumberRequired_;
    }
    /**
     * <code>bool phone_number_required = 2;</code>
     * @param value The phoneNumberRequired to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumberRequired(boolean value) {
      
      phoneNumberRequired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool phone_number_required = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneNumberRequired() {
      
      phoneNumberRequired_ = false;
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


    // @@protoc_insertion_point(builder_scope:pbv1.ShippingAddressParameters)
  }

  // @@protoc_insertion_point(class_scope:pbv1.ShippingAddressParameters)
  private static final ru.gazprombonus.sdk.model.ShippingAddressParameters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.gazprombonus.sdk.model.ShippingAddressParameters();
  }

  public static ru.gazprombonus.sdk.model.ShippingAddressParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShippingAddressParameters>
      PARSER = new com.google.protobuf.AbstractParser<ShippingAddressParameters>() {
    @java.lang.Override
    public ShippingAddressParameters parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShippingAddressParameters(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShippingAddressParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShippingAddressParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.gazprombonus.sdk.model.ShippingAddressParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

