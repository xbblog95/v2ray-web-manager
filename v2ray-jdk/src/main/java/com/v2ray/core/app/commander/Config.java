// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/commander/config.proto

package com.v2ray.core.app.commander;

/**
 * <pre>
 * Config is the settings for Commander.
 * </pre>
 *
 * Protobuf type {@code v2ray.core.app.commander.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.commander.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    tag_ = "";
    service_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
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
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              service_ = new java.util.ArrayList<com.v2ray.core.common.serial.TypedMessage>();
              mutable_bitField0_ |= 0x00000002;
            }
            service_.add(
                input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        service_ = java.util.Collections.unmodifiableList(service_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.commander.ConfigOuterClass.internal_static_v2ray_core_app_commander_Config_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.commander.ConfigOuterClass.internal_static_v2ray_core_app_commander_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Config.class, Builder.class);
  }

  private int bitField0_;
  public static final int TAG_FIELD_NUMBER = 1;
  private volatile Object tag_;
  /**
   * <pre>
   * Tag of the outbound handler that handles grpc connections.
   * </pre>
   *
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
   * <pre>
   * Tag of the outbound handler that handles grpc connections.
   * </pre>
   *
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

  public static final int SERVICE_FIELD_NUMBER = 2;
  private java.util.List<com.v2ray.core.common.serial.TypedMessage> service_;
  /**
   * <pre>
   * Services that supported by this server. All services must implement Service interface.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
   */
  public java.util.List<com.v2ray.core.common.serial.TypedMessage> getServiceList() {
    return service_;
  }
  /**
   * <pre>
   * Services that supported by this server. All services must implement Service interface.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
   */
  public java.util.List<? extends com.v2ray.core.common.serial.TypedMessageOrBuilder> 
      getServiceOrBuilderList() {
    return service_;
  }
  /**
   * <pre>
   * Services that supported by this server. All services must implement Service interface.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
   */
  public int getServiceCount() {
    return service_.size();
  }
  /**
   * <pre>
   * Services that supported by this server. All services must implement Service interface.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getService(int index) {
    return service_.get(index);
  }
  /**
   * <pre>
   * Services that supported by this server. All services must implement Service interface.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getServiceOrBuilder(
      int index) {
    return service_.get(index);
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
    for (int i = 0; i < service_.size(); i++) {
      output.writeMessage(2, service_.get(i));
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
    for (int i = 0; i < service_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, service_.get(i));
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
    if (!(obj instanceof Config)) {
      return super.equals(obj);
    }
    Config other = (Config) obj;

    if (!getTag()
        .equals(other.getTag())) return false;
    if (!getServiceList()
        .equals(other.getServiceList())) return false;
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
    if (getServiceCount() > 0) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getServiceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Config parseFrom(
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
  public static Builder newBuilder(Config prototype) {
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
   * <pre>
   * Config is the settings for Commander.
   * </pre>
   *
   * Protobuf type {@code v2ray.core.app.commander.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.commander.Config)
      com.v2ray.core.app.commander.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.commander.ConfigOuterClass.internal_static_v2ray_core_app_commander_Config_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.commander.ConfigOuterClass.internal_static_v2ray_core_app_commander_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Config.class, Builder.class);
    }

    // Construct using com.v2ray.core.app.commander.Config.newBuilder()
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
        getServiceFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      tag_ = "";

      if (serviceBuilder_ == null) {
        service_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        serviceBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.commander.ConfigOuterClass.internal_static_v2ray_core_app_commander_Config_descriptor;
    }

    @Override
    public Config getDefaultInstanceForType() {
      return Config.getDefaultInstance();
    }

    @Override
    public Config build() {
      Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Config buildPartial() {
      Config result = new Config(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.tag_ = tag_;
      if (serviceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          service_ = java.util.Collections.unmodifiableList(service_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.service_ = service_;
      } else {
        result.service_ = serviceBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof Config) {
        return mergeFrom((Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Config other) {
      if (other == Config.getDefaultInstance()) return this;
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      if (serviceBuilder_ == null) {
        if (!other.service_.isEmpty()) {
          if (service_.isEmpty()) {
            service_ = other.service_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureServiceIsMutable();
            service_.addAll(other.service_);
          }
          onChanged();
        }
      } else {
        if (!other.service_.isEmpty()) {
          if (serviceBuilder_.isEmpty()) {
            serviceBuilder_.dispose();
            serviceBuilder_ = null;
            service_ = other.service_;
            bitField0_ = (bitField0_ & ~0x00000002);
            serviceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServiceFieldBuilder() : null;
          } else {
            serviceBuilder_.addAllMessages(other.service_);
          }
        }
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
      Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object tag_ = "";
    /**
     * <pre>
     * Tag of the outbound handler that handles grpc connections.
     * </pre>
     *
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
     * <pre>
     * Tag of the outbound handler that handles grpc connections.
     * </pre>
     *
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
     * <pre>
     * Tag of the outbound handler that handles grpc connections.
     * </pre>
     *
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
     * <pre>
     * Tag of the outbound handler that handles grpc connections.
     * </pre>
     *
     * <code>string tag = 1;</code>
     */
    public Builder clearTag() {
      
      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tag of the outbound handler that handles grpc connections.
     * </pre>
     *
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

    private java.util.List<com.v2ray.core.common.serial.TypedMessage> service_ =
      java.util.Collections.emptyList();
    private void ensureServiceIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        service_ = new java.util.ArrayList<com.v2ray.core.common.serial.TypedMessage>(service_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> serviceBuilder_;

    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public java.util.List<com.v2ray.core.common.serial.TypedMessage> getServiceList() {
      if (serviceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(service_);
      } else {
        return serviceBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public int getServiceCount() {
      if (serviceBuilder_ == null) {
        return service_.size();
      } else {
        return serviceBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getService(int index) {
      if (serviceBuilder_ == null) {
        return service_.get(index);
      } else {
        return serviceBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder setService(
        int index, com.v2ray.core.common.serial.TypedMessage value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceIsMutable();
        service_.set(index, value);
        onChanged();
      } else {
        serviceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder setService(
        int index, com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.set(index, builderForValue.build());
        onChanged();
      } else {
        serviceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder addService(com.v2ray.core.common.serial.TypedMessage value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceIsMutable();
        service_.add(value);
        onChanged();
      } else {
        serviceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder addService(
        int index, com.v2ray.core.common.serial.TypedMessage value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceIsMutable();
        service_.add(index, value);
        onChanged();
      } else {
        serviceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder addService(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.add(builderForValue.build());
        onChanged();
      } else {
        serviceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder addService(
        int index, com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.add(index, builderForValue.build());
        onChanged();
      } else {
        serviceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder addAllService(
        Iterable<? extends com.v2ray.core.common.serial.TypedMessage> values) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, service_);
        onChanged();
      } else {
        serviceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder clearService() {
      if (serviceBuilder_ == null) {
        service_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        serviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public Builder removeService(int index) {
      if (serviceBuilder_ == null) {
        ensureServiceIsMutable();
        service_.remove(index);
        onChanged();
      } else {
        serviceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getServiceBuilder(
        int index) {
      return getServiceFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getServiceOrBuilder(
        int index) {
      if (serviceBuilder_ == null) {
        return service_.get(index);  } else {
        return serviceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public java.util.List<? extends com.v2ray.core.common.serial.TypedMessageOrBuilder> 
         getServiceOrBuilderList() {
      if (serviceBuilder_ != null) {
        return serviceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(service_);
      }
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder addServiceBuilder() {
      return getServiceFieldBuilder().addBuilder(
          com.v2ray.core.common.serial.TypedMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder addServiceBuilder(
        int index) {
      return getServiceFieldBuilder().addBuilder(
          index, com.v2ray.core.common.serial.TypedMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * Services that supported by this server. All services must implement Service interface.
     * </pre>
     *
     * <code>repeated .v2ray.core.common.serial.TypedMessage service = 2;</code>
     */
    public java.util.List<com.v2ray.core.common.serial.TypedMessage.Builder> 
         getServiceBuilderList() {
      return getServiceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getServiceFieldBuilder() {
      if (serviceBuilder_ == null) {
        serviceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                service_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        service_ = null;
      }
      return serviceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.commander.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.commander.Config)
  private static final Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Config();
  }

  public static Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @Override
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @Override
  public Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

