// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

/**
 * Protobuf type {@code v2ray.core.app.proxyman.InboundHandlerConfig}
 */
public  final class InboundHandlerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.proxyman.InboundHandlerConfig)
    InboundHandlerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InboundHandlerConfig.newBuilder() to construct.
  private InboundHandlerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InboundHandlerConfig() {
    tag_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InboundHandlerConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            tag_ = s;
            break;
          }
          case 18: {
            com.v2ray.core.common.serial.TypedMessage.Builder subBuilder = null;
            if (receiverSettings_ != null) {
              subBuilder = receiverSettings_.toBuilder();
            }
            receiverSettings_ = input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(receiverSettings_);
              receiverSettings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.v2ray.core.common.serial.TypedMessage.Builder subBuilder = null;
            if (proxySettings_ != null) {
              subBuilder = proxySettings_.toBuilder();
            }
            proxySettings_ = input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(proxySettings_);
              proxySettings_ = subBuilder.buildPartial();
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
    return Config.internal_static_v2ray_core_app_proxyman_InboundHandlerConfig_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Config.internal_static_v2ray_core_app_proxyman_InboundHandlerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            InboundHandlerConfig.class, Builder.class);
  }

  public static final int TAG_FIELD_NUMBER = 1;
  private volatile Object tag_;
  /**
   * <code>string tag = 1;</code>
   */
  public String getTag() {
    Object ref = tag_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <code>string tag = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTagBytes() {
    Object ref = tag_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVER_SETTINGS_FIELD_NUMBER = 2;
  private com.v2ray.core.common.serial.TypedMessage receiverSettings_;
  /**
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  public boolean hasReceiverSettings() {
    return receiverSettings_ != null;
  }
  /**
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getReceiverSettings() {
    return receiverSettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
  }
  /**
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder() {
    return getReceiverSettings();
  }

  public static final int PROXY_SETTINGS_FIELD_NUMBER = 3;
  private com.v2ray.core.common.serial.TypedMessage proxySettings_;
  /**
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  public boolean hasProxySettings() {
    return proxySettings_ != null;
  }
  /**
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getProxySettings() {
    return proxySettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
  }
  /**
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder() {
    return getProxySettings();
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
    if (!getTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tag_);
    }
    if (receiverSettings_ != null) {
      output.writeMessage(2, getReceiverSettings());
    }
    if (proxySettings_ != null) {
      output.writeMessage(3, getProxySettings());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tag_);
    }
    if (receiverSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReceiverSettings());
    }
    if (proxySettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProxySettings());
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
    if (!(obj instanceof InboundHandlerConfig)) {
      return super.equals(obj);
    }
    InboundHandlerConfig other = (InboundHandlerConfig) obj;

    if (!getTag()
        .equals(other.getTag())) return false;
    if (hasReceiverSettings() != other.hasReceiverSettings()) return false;
    if (hasReceiverSettings()) {
      if (!getReceiverSettings()
          .equals(other.getReceiverSettings())) return false;
    }
    if (hasProxySettings() != other.hasProxySettings()) return false;
    if (hasProxySettings()) {
      if (!getProxySettings()
          .equals(other.getProxySettings())) return false;
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
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    if (hasReceiverSettings()) {
      hash = (37 * hash) + RECEIVER_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getReceiverSettings().hashCode();
    }
    if (hasProxySettings()) {
      hash = (37 * hash) + PROXY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getProxySettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static InboundHandlerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static InboundHandlerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static InboundHandlerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static InboundHandlerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static InboundHandlerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static InboundHandlerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static InboundHandlerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static InboundHandlerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static InboundHandlerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static InboundHandlerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static InboundHandlerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static InboundHandlerConfig parseFrom(
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
  public static Builder newBuilder(InboundHandlerConfig prototype) {
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
   * Protobuf type {@code v2ray.core.app.proxyman.InboundHandlerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.proxyman.InboundHandlerConfig)
      com.v2ray.core.app.proxyman.InboundHandlerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Config.internal_static_v2ray_core_app_proxyman_InboundHandlerConfig_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Config.internal_static_v2ray_core_app_proxyman_InboundHandlerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              InboundHandlerConfig.class, Builder.class);
    }

    // Construct using com.v2ray.core.app.proxyman.InboundHandlerConfig.newBuilder()
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
      tag_ = "";

      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = null;
      } else {
        receiverSettings_ = null;
        receiverSettingsBuilder_ = null;
      }
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Config.internal_static_v2ray_core_app_proxyman_InboundHandlerConfig_descriptor;
    }

    @Override
    public InboundHandlerConfig getDefaultInstanceForType() {
      return InboundHandlerConfig.getDefaultInstance();
    }

    @Override
    public InboundHandlerConfig build() {
      InboundHandlerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public InboundHandlerConfig buildPartial() {
      InboundHandlerConfig result = new InboundHandlerConfig(this);
      result.tag_ = tag_;
      if (receiverSettingsBuilder_ == null) {
        result.receiverSettings_ = receiverSettings_;
      } else {
        result.receiverSettings_ = receiverSettingsBuilder_.build();
      }
      if (proxySettingsBuilder_ == null) {
        result.proxySettings_ = proxySettings_;
      } else {
        result.proxySettings_ = proxySettingsBuilder_.build();
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
      if (other instanceof InboundHandlerConfig) {
        return mergeFrom((InboundHandlerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(InboundHandlerConfig other) {
      if (other == InboundHandlerConfig.getDefaultInstance()) return this;
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      if (other.hasReceiverSettings()) {
        mergeReceiverSettings(other.getReceiverSettings());
      }
      if (other.hasProxySettings()) {
        mergeProxySettings(other.getProxySettings());
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
      InboundHandlerConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (InboundHandlerConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object tag_ = "";
    /**
     * <code>string tag = 1;</code>
     */
    public String getTag() {
      Object ref = tag_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string tag = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tag = 1;</code>
     */
    public Builder setTag(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 1;</code>
     */
    public Builder clearTag() {
      
      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 1;</code>
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tag_ = value;
      onChanged();
      return this;
    }

    private com.v2ray.core.common.serial.TypedMessage receiverSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> receiverSettingsBuilder_;
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public boolean hasReceiverSettings() {
      return receiverSettingsBuilder_ != null || receiverSettings_ != null;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getReceiverSettings() {
      if (receiverSettingsBuilder_ == null) {
        return receiverSettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
      } else {
        return receiverSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder setReceiverSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (receiverSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        receiverSettings_ = value;
        onChanged();
      } else {
        receiverSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder setReceiverSettings(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = builderForValue.build();
        onChanged();
      } else {
        receiverSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder mergeReceiverSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (receiverSettingsBuilder_ == null) {
        if (receiverSettings_ != null) {
          receiverSettings_ =
            com.v2ray.core.common.serial.TypedMessage.newBuilder(receiverSettings_).mergeFrom(value).buildPartial();
        } else {
          receiverSettings_ = value;
        }
        onChanged();
      } else {
        receiverSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder clearReceiverSettings() {
      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = null;
        onChanged();
      } else {
        receiverSettings_ = null;
        receiverSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getReceiverSettingsBuilder() {
      
      onChanged();
      return getReceiverSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder() {
      if (receiverSettingsBuilder_ != null) {
        return receiverSettingsBuilder_.getMessageOrBuilder();
      } else {
        return receiverSettings_ == null ?
            com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
      }
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getReceiverSettingsFieldBuilder() {
      if (receiverSettingsBuilder_ == null) {
        receiverSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                getReceiverSettings(),
                getParentForChildren(),
                isClean());
        receiverSettings_ = null;
      }
      return receiverSettingsBuilder_;
    }

    private com.v2ray.core.common.serial.TypedMessage proxySettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> proxySettingsBuilder_;
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public boolean hasProxySettings() {
      return proxySettingsBuilder_ != null || proxySettings_ != null;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getProxySettings() {
      if (proxySettingsBuilder_ == null) {
        return proxySettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
      } else {
        return proxySettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder setProxySettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (proxySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proxySettings_ = value;
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder setProxySettings(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = builderForValue.build();
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder mergeProxySettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (proxySettingsBuilder_ == null) {
        if (proxySettings_ != null) {
          proxySettings_ =
            com.v2ray.core.common.serial.TypedMessage.newBuilder(proxySettings_).mergeFrom(value).buildPartial();
        } else {
          proxySettings_ = value;
        }
        onChanged();
      } else {
        proxySettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder clearProxySettings() {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
        onChanged();
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getProxySettingsBuilder() {
      
      onChanged();
      return getProxySettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder() {
      if (proxySettingsBuilder_ != null) {
        return proxySettingsBuilder_.getMessageOrBuilder();
      } else {
        return proxySettings_ == null ?
            com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
      }
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getProxySettingsFieldBuilder() {
      if (proxySettingsBuilder_ == null) {
        proxySettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                getProxySettings(),
                getParentForChildren(),
                isClean());
        proxySettings_ = null;
      }
      return proxySettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.proxyman.InboundHandlerConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.proxyman.InboundHandlerConfig)
  private static final InboundHandlerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InboundHandlerConfig();
  }

  public static InboundHandlerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InboundHandlerConfig>
      PARSER = new com.google.protobuf.AbstractParser<InboundHandlerConfig>() {
    @Override
    public InboundHandlerConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InboundHandlerConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InboundHandlerConfig> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<InboundHandlerConfig> getParserForType() {
    return PARSER;
  }

  @Override
  public InboundHandlerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

