// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mobile.proto

package ru.gazprombonus.sdk.model;

/**
 * Protobuf enum {@code pbv1.MobileAnalyticsEventType}
 */
public enum MobileAnalyticsEventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_UNSPECIFIED = 0;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_UNSPECIFIED(0),
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_APP_INSTALL_REFERRER = 1;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_APP_INSTALL_REFERRER(1),
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_INSTALL = 2;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_INSTALL(2),
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_CANCEL = 3;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_CANCEL(3),
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_PASSWORD = 4;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_PASSWORD(4),
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_BIOMETRY = 5;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_BIOMETRY(5),
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_APP_BIOMETRY_RESET = 6;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_APP_BIOMETRY_RESET(6),
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ERROR_AUTH_BIOMETRY = 7;</code>
   */
  MOBILE_ANALYTICS_EVENT_TYPE_ERROR_AUTH_BIOMETRY(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_APP_INSTALL_REFERRER = 1;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_APP_INSTALL_REFERRER_VALUE = 1;
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_INSTALL = 2;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_INSTALL_VALUE = 2;
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_CANCEL = 3;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_CANCEL_VALUE = 3;
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_PASSWORD = 4;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_PASSWORD_VALUE = 4;
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_BIOMETRY = 5;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_BIOMETRY_VALUE = 5;
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_APP_BIOMETRY_RESET = 6;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_APP_BIOMETRY_RESET_VALUE = 6;
  /**
   * <code>MOBILE_ANALYTICS_EVENT_TYPE_ERROR_AUTH_BIOMETRY = 7;</code>
   */
  public static final int MOBILE_ANALYTICS_EVENT_TYPE_ERROR_AUTH_BIOMETRY_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MobileAnalyticsEventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MobileAnalyticsEventType forNumber(int value) {
    switch (value) {
      case 0: return MOBILE_ANALYTICS_EVENT_TYPE_UNSPECIFIED;
      case 1: return MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_APP_INSTALL_REFERRER;
      case 2: return MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_INSTALL;
      case 3: return MOBILE_ANALYTICS_EVENT_TYPE_ANDROID_IAU_CANCEL;
      case 4: return MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_PASSWORD;
      case 5: return MOBILE_ANALYTICS_EVENT_TYPE_LOGIN_APP_BIOMETRY;
      case 6: return MOBILE_ANALYTICS_EVENT_TYPE_APP_BIOMETRY_RESET;
      case 7: return MOBILE_ANALYTICS_EVENT_TYPE_ERROR_AUTH_BIOMETRY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MobileAnalyticsEventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MobileAnalyticsEventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MobileAnalyticsEventType>() {
          public MobileAnalyticsEventType findValueByNumber(int number) {
            return MobileAnalyticsEventType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return ru.gazprombonus.sdk.model.Mobile.getDescriptor().getEnumTypes().get(1);
  }

  private static final MobileAnalyticsEventType[] VALUES = values();

  public static MobileAnalyticsEventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MobileAnalyticsEventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pbv1.MobileAnalyticsEventType)
}
