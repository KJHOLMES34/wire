// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.edgecases.NoFields in edge_cases.proto
package com.squareup.wire.protos.edgecases;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class NoFields extends Message<NoFields, NoFields.Builder> {
  public static final ProtoAdapter<NoFields> ADAPTER = new ProtoAdapter_NoFields();

  private static final long serialVersionUID = 0L;

  public NoFields() {
    this(ByteString.EMPTY);
  }

  public NoFields(ByteString unknownFields) {
    super(ADAPTER, unknownFields);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof NoFields)) return false;
    NoFields o = (NoFields) other;
    return unknownFields().equals(o.unknownFields());
  }

  @Override
  public int hashCode() {
    return unknownFields().hashCode();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    return builder.replace(0, 2, "NoFields{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<NoFields, Builder> {
    public Builder() {
    }

    @Override
    public NoFields build() {
      return new NoFields(super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_NoFields extends ProtoAdapter<NoFields> {
    public ProtoAdapter_NoFields() {
      super(FieldEncoding.LENGTH_DELIMITED, NoFields.class, "type.googleapis.com/squareup.protos.edgecases.NoFields", Syntax.PROTO_2, null);
    }

    @Override
    public int encodedSize(NoFields value) {
      int result = 0;
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, NoFields value) throws IOException {
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public NoFields decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public NoFields redact(NoFields value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
