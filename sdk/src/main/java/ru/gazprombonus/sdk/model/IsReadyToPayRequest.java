// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mobile.proto

package ru.gazprombonus.sdk.model;

/**
 * Protobuf type {@code pbv1.IsReadyToPayRequest}
 */
public final class IsReadyToPayRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pbv1.IsReadyToPayRequest)
    IsReadyToPayRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IsReadyToPayRequest.newBuilder() to construct.
  private IsReadyToPayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IsReadyToPayRequest() {
    allowedPaymentMethods_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IsReadyToPayRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IsReadyToPayRequest(
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
          case 8: {

            apiVersion_ = input.readUInt32();
            break;
          }
          case 16: {

            apiVersionMinor_ = input.readUInt32();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              allowedPaymentMethods_ = new java.util.ArrayList<ru.gazprombonus.sdk.model.PaymentMethodSpecification>();
              mutable_bitField0_ |= 0x00000001;
            }
            allowedPaymentMethods_.add(
                input.readMessage(ru.gazprombonus.sdk.model.PaymentMethodSpecification.parser(), extensionRegistry));
            break;
          }
          case 32: {

            existingPaymentMethodRequired_ = input.readBool();
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
        allowedPaymentMethods_ = java.util.Collections.unmodifiableList(allowedPaymentMethods_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_IsReadyToPayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_IsReadyToPayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.gazprombonus.sdk.model.IsReadyToPayRequest.class, ru.gazprombonus.sdk.model.IsReadyToPayRequest.Builder.class);
  }

  public static final int API_VERSION_FIELD_NUMBER = 1;
  private int apiVersion_;
  /**
   * <code>uint32 api_version = 1;</code>
   * @return The apiVersion.
   */
  @java.lang.Override
  public int getApiVersion() {
    return apiVersion_;
  }

  public static final int API_VERSION_MINOR_FIELD_NUMBER = 2;
  private int apiVersionMinor_;
  /**
   * <code>uint32 api_version_minor = 2;</code>
   * @return The apiVersionMinor.
   */
  @java.lang.Override
  public int getApiVersionMinor() {
    return apiVersionMinor_;
  }

  public static final int ALLOWED_PAYMENT_METHODS_FIELD_NUMBER = 3;
  private java.util.List<ru.gazprombonus.sdk.model.PaymentMethodSpecification> allowedPaymentMethods_;
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  @java.lang.Override
  public java.util.List<ru.gazprombonus.sdk.model.PaymentMethodSpecification> getAllowedPaymentMethodsList() {
    return allowedPaymentMethods_;
  }
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder> 
      getAllowedPaymentMethodsOrBuilderList() {
    return allowedPaymentMethods_;
  }
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  @java.lang.Override
  public int getAllowedPaymentMethodsCount() {
    return allowedPaymentMethods_.size();
  }
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  @java.lang.Override
  public ru.gazprombonus.sdk.model.PaymentMethodSpecification getAllowedPaymentMethods(int index) {
    return allowedPaymentMethods_.get(index);
  }
  /**
   * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
   */
  @java.lang.Override
  public ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder getAllowedPaymentMethodsOrBuilder(
      int index) {
    return allowedPaymentMethods_.get(index);
  }

  public static final int EXISTING_PAYMENT_METHOD_REQUIRED_FIELD_NUMBER = 4;
  private boolean existingPaymentMethodRequired_;
  /**
   * <code>bool existing_payment_method_required = 4;</code>
   * @return The existingPaymentMethodRequired.
   */
  @java.lang.Override
  public boolean getExistingPaymentMethodRequired() {
    return existingPaymentMethodRequired_;
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
    if (apiVersion_ != 0) {
      output.writeUInt32(1, apiVersion_);
    }
    if (apiVersionMinor_ != 0) {
      output.writeUInt32(2, apiVersionMinor_);
    }
    for (int i = 0; i < allowedPaymentMethods_.size(); i++) {
      output.writeMessage(3, allowedPaymentMethods_.get(i));
    }
    if (existingPaymentMethodRequired_ != false) {
      output.writeBool(4, existingPaymentMethodRequired_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apiVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, apiVersion_);
    }
    if (apiVersionMinor_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, apiVersionMinor_);
    }
    for (int i = 0; i < allowedPaymentMethods_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, allowedPaymentMethods_.get(i));
    }
    if (existingPaymentMethodRequired_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, existingPaymentMethodRequired_);
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
    if (!(obj instanceof ru.gazprombonus.sdk.model.IsReadyToPayRequest)) {
      return super.equals(obj);
    }
    ru.gazprombonus.sdk.model.IsReadyToPayRequest other = (ru.gazprombonus.sdk.model.IsReadyToPayRequest) obj;

    if (getApiVersion()
        != other.getApiVersion()) return false;
    if (getApiVersionMinor()
        != other.getApiVersionMinor()) return false;
    if (!getAllowedPaymentMethodsList()
        .equals(other.getAllowedPaymentMethodsList())) return false;
    if (getExistingPaymentMethodRequired()
        != other.getExistingPaymentMethodRequired()) return false;
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
    hash = (37 * hash) + API_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getApiVersion();
    hash = (37 * hash) + API_VERSION_MINOR_FIELD_NUMBER;
    hash = (53 * hash) + getApiVersionMinor();
    if (getAllowedPaymentMethodsCount() > 0) {
      hash = (37 * hash) + ALLOWED_PAYMENT_METHODS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedPaymentMethodsList().hashCode();
    }
    hash = (37 * hash) + EXISTING_PAYMENT_METHOD_REQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getExistingPaymentMethodRequired());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest parseFrom(
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
  public static Builder newBuilder(ru.gazprombonus.sdk.model.IsReadyToPayRequest prototype) {
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
   * Protobuf type {@code pbv1.IsReadyToPayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pbv1.IsReadyToPayRequest)
      ru.gazprombonus.sdk.model.IsReadyToPayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_IsReadyToPayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_IsReadyToPayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.gazprombonus.sdk.model.IsReadyToPayRequest.class, ru.gazprombonus.sdk.model.IsReadyToPayRequest.Builder.class);
    }

    // Construct using ru.gazprombonus.sdk.model.IsReadyToPayRequest.newBuilder()
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
        getAllowedPaymentMethodsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      apiVersion_ = 0;

      apiVersionMinor_ = 0;

      if (allowedPaymentMethodsBuilder_ == null) {
        allowedPaymentMethods_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        allowedPaymentMethodsBuilder_.clear();
      }
      existingPaymentMethodRequired_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.gazprombonus.sdk.model.Mobile.internal_static_pbv1_IsReadyToPayRequest_descriptor;
    }

    @java.lang.Override
    public ru.gazprombonus.sdk.model.IsReadyToPayRequest getDefaultInstanceForType() {
      return ru.gazprombonus.sdk.model.IsReadyToPayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ru.gazprombonus.sdk.model.IsReadyToPayRequest build() {
      ru.gazprombonus.sdk.model.IsReadyToPayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.gazprombonus.sdk.model.IsReadyToPayRequest buildPartial() {
      ru.gazprombonus.sdk.model.IsReadyToPayRequest result = new ru.gazprombonus.sdk.model.IsReadyToPayRequest(this);
      int from_bitField0_ = bitField0_;
      result.apiVersion_ = apiVersion_;
      result.apiVersionMinor_ = apiVersionMinor_;
      if (allowedPaymentMethodsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          allowedPaymentMethods_ = java.util.Collections.unmodifiableList(allowedPaymentMethods_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.allowedPaymentMethods_ = allowedPaymentMethods_;
      } else {
        result.allowedPaymentMethods_ = allowedPaymentMethodsBuilder_.build();
      }
      result.existingPaymentMethodRequired_ = existingPaymentMethodRequired_;
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
      if (other instanceof ru.gazprombonus.sdk.model.IsReadyToPayRequest) {
        return mergeFrom((ru.gazprombonus.sdk.model.IsReadyToPayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.gazprombonus.sdk.model.IsReadyToPayRequest other) {
      if (other == ru.gazprombonus.sdk.model.IsReadyToPayRequest.getDefaultInstance()) return this;
      if (other.getApiVersion() != 0) {
        setApiVersion(other.getApiVersion());
      }
      if (other.getApiVersionMinor() != 0) {
        setApiVersionMinor(other.getApiVersionMinor());
      }
      if (allowedPaymentMethodsBuilder_ == null) {
        if (!other.allowedPaymentMethods_.isEmpty()) {
          if (allowedPaymentMethods_.isEmpty()) {
            allowedPaymentMethods_ = other.allowedPaymentMethods_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAllowedPaymentMethodsIsMutable();
            allowedPaymentMethods_.addAll(other.allowedPaymentMethods_);
          }
          onChanged();
        }
      } else {
        if (!other.allowedPaymentMethods_.isEmpty()) {
          if (allowedPaymentMethodsBuilder_.isEmpty()) {
            allowedPaymentMethodsBuilder_.dispose();
            allowedPaymentMethodsBuilder_ = null;
            allowedPaymentMethods_ = other.allowedPaymentMethods_;
            bitField0_ = (bitField0_ & ~0x00000001);
            allowedPaymentMethodsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAllowedPaymentMethodsFieldBuilder() : null;
          } else {
            allowedPaymentMethodsBuilder_.addAllMessages(other.allowedPaymentMethods_);
          }
        }
      }
      if (other.getExistingPaymentMethodRequired() != false) {
        setExistingPaymentMethodRequired(other.getExistingPaymentMethodRequired());
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
      ru.gazprombonus.sdk.model.IsReadyToPayRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.gazprombonus.sdk.model.IsReadyToPayRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int apiVersion_ ;
    /**
     * <code>uint32 api_version = 1;</code>
     * @return The apiVersion.
     */
    @java.lang.Override
    public int getApiVersion() {
      return apiVersion_;
    }
    /**
     * <code>uint32 api_version = 1;</code>
     * @param value The apiVersion to set.
     * @return This builder for chaining.
     */
    public Builder setApiVersion(int value) {
      
      apiVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 api_version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApiVersion() {
      
      apiVersion_ = 0;
      onChanged();
      return this;
    }

    private int apiVersionMinor_ ;
    /**
     * <code>uint32 api_version_minor = 2;</code>
     * @return The apiVersionMinor.
     */
    @java.lang.Override
    public int getApiVersionMinor() {
      return apiVersionMinor_;
    }
    /**
     * <code>uint32 api_version_minor = 2;</code>
     * @param value The apiVersionMinor to set.
     * @return This builder for chaining.
     */
    public Builder setApiVersionMinor(int value) {
      
      apiVersionMinor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 api_version_minor = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApiVersionMinor() {
      
      apiVersionMinor_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<ru.gazprombonus.sdk.model.PaymentMethodSpecification> allowedPaymentMethods_ =
      java.util.Collections.emptyList();
    private void ensureAllowedPaymentMethodsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedPaymentMethods_ = new java.util.ArrayList<ru.gazprombonus.sdk.model.PaymentMethodSpecification>(allowedPaymentMethods_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.gazprombonus.sdk.model.PaymentMethodSpecification, ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder, ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder> allowedPaymentMethodsBuilder_;

    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public java.util.List<ru.gazprombonus.sdk.model.PaymentMethodSpecification> getAllowedPaymentMethodsList() {
      if (allowedPaymentMethodsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allowedPaymentMethods_);
      } else {
        return allowedPaymentMethodsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public int getAllowedPaymentMethodsCount() {
      if (allowedPaymentMethodsBuilder_ == null) {
        return allowedPaymentMethods_.size();
      } else {
        return allowedPaymentMethodsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public ru.gazprombonus.sdk.model.PaymentMethodSpecification getAllowedPaymentMethods(int index) {
      if (allowedPaymentMethodsBuilder_ == null) {
        return allowedPaymentMethods_.get(index);
      } else {
        return allowedPaymentMethodsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder setAllowedPaymentMethods(
        int index, ru.gazprombonus.sdk.model.PaymentMethodSpecification value) {
      if (allowedPaymentMethodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedPaymentMethodsIsMutable();
        allowedPaymentMethods_.set(index, value);
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder setAllowedPaymentMethods(
        int index, ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder builderForValue) {
      if (allowedPaymentMethodsBuilder_ == null) {
        ensureAllowedPaymentMethodsIsMutable();
        allowedPaymentMethods_.set(index, builderForValue.build());
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder addAllowedPaymentMethods(ru.gazprombonus.sdk.model.PaymentMethodSpecification value) {
      if (allowedPaymentMethodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedPaymentMethodsIsMutable();
        allowedPaymentMethods_.add(value);
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder addAllowedPaymentMethods(
        int index, ru.gazprombonus.sdk.model.PaymentMethodSpecification value) {
      if (allowedPaymentMethodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedPaymentMethodsIsMutable();
        allowedPaymentMethods_.add(index, value);
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder addAllowedPaymentMethods(
        ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder builderForValue) {
      if (allowedPaymentMethodsBuilder_ == null) {
        ensureAllowedPaymentMethodsIsMutable();
        allowedPaymentMethods_.add(builderForValue.build());
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder addAllowedPaymentMethods(
        int index, ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder builderForValue) {
      if (allowedPaymentMethodsBuilder_ == null) {
        ensureAllowedPaymentMethodsIsMutable();
        allowedPaymentMethods_.add(index, builderForValue.build());
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder addAllAllowedPaymentMethods(
        java.lang.Iterable<? extends ru.gazprombonus.sdk.model.PaymentMethodSpecification> values) {
      if (allowedPaymentMethodsBuilder_ == null) {
        ensureAllowedPaymentMethodsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allowedPaymentMethods_);
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder clearAllowedPaymentMethods() {
      if (allowedPaymentMethodsBuilder_ == null) {
        allowedPaymentMethods_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public Builder removeAllowedPaymentMethods(int index) {
      if (allowedPaymentMethodsBuilder_ == null) {
        ensureAllowedPaymentMethodsIsMutable();
        allowedPaymentMethods_.remove(index);
        onChanged();
      } else {
        allowedPaymentMethodsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder getAllowedPaymentMethodsBuilder(
        int index) {
      return getAllowedPaymentMethodsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder getAllowedPaymentMethodsOrBuilder(
        int index) {
      if (allowedPaymentMethodsBuilder_ == null) {
        return allowedPaymentMethods_.get(index);  } else {
        return allowedPaymentMethodsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public java.util.List<? extends ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder> 
         getAllowedPaymentMethodsOrBuilderList() {
      if (allowedPaymentMethodsBuilder_ != null) {
        return allowedPaymentMethodsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allowedPaymentMethods_);
      }
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder addAllowedPaymentMethodsBuilder() {
      return getAllowedPaymentMethodsFieldBuilder().addBuilder(
          ru.gazprombonus.sdk.model.PaymentMethodSpecification.getDefaultInstance());
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder addAllowedPaymentMethodsBuilder(
        int index) {
      return getAllowedPaymentMethodsFieldBuilder().addBuilder(
          index, ru.gazprombonus.sdk.model.PaymentMethodSpecification.getDefaultInstance());
    }
    /**
     * <code>repeated .pbv1.PaymentMethodSpecification allowed_payment_methods = 3;</code>
     */
    public java.util.List<ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder> 
         getAllowedPaymentMethodsBuilderList() {
      return getAllowedPaymentMethodsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.gazprombonus.sdk.model.PaymentMethodSpecification, ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder, ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder> 
        getAllowedPaymentMethodsFieldBuilder() {
      if (allowedPaymentMethodsBuilder_ == null) {
        allowedPaymentMethodsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ru.gazprombonus.sdk.model.PaymentMethodSpecification, ru.gazprombonus.sdk.model.PaymentMethodSpecification.Builder, ru.gazprombonus.sdk.model.PaymentMethodSpecificationOrBuilder>(
                allowedPaymentMethods_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        allowedPaymentMethods_ = null;
      }
      return allowedPaymentMethodsBuilder_;
    }

    private boolean existingPaymentMethodRequired_ ;
    /**
     * <code>bool existing_payment_method_required = 4;</code>
     * @return The existingPaymentMethodRequired.
     */
    @java.lang.Override
    public boolean getExistingPaymentMethodRequired() {
      return existingPaymentMethodRequired_;
    }
    /**
     * <code>bool existing_payment_method_required = 4;</code>
     * @param value The existingPaymentMethodRequired to set.
     * @return This builder for chaining.
     */
    public Builder setExistingPaymentMethodRequired(boolean value) {
      
      existingPaymentMethodRequired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool existing_payment_method_required = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExistingPaymentMethodRequired() {
      
      existingPaymentMethodRequired_ = false;
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


    // @@protoc_insertion_point(builder_scope:pbv1.IsReadyToPayRequest)
  }

  // @@protoc_insertion_point(class_scope:pbv1.IsReadyToPayRequest)
  private static final ru.gazprombonus.sdk.model.IsReadyToPayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.gazprombonus.sdk.model.IsReadyToPayRequest();
  }

  public static ru.gazprombonus.sdk.model.IsReadyToPayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IsReadyToPayRequest>
      PARSER = new com.google.protobuf.AbstractParser<IsReadyToPayRequest>() {
    @java.lang.Override
    public IsReadyToPayRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IsReadyToPayRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IsReadyToPayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IsReadyToPayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.gazprombonus.sdk.model.IsReadyToPayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

