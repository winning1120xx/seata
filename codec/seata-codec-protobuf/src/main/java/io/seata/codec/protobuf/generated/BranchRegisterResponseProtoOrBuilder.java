// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: branchRegisterResponse.proto

package io.seata.codec.protobuf.generated;

public interface BranchRegisterResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.BranchRegisterResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  boolean hasAbstractTransactionResponse();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  io.seata.codec.protobuf.generated.AbstractTransactionResponseProto getAbstractTransactionResponse();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  io.seata.codec.protobuf.generated.AbstractTransactionResponseProtoOrBuilder getAbstractTransactionResponseOrBuilder();

  /**
   * <code>int64 branchId = 2;</code>
   */
  long getBranchId();
}
