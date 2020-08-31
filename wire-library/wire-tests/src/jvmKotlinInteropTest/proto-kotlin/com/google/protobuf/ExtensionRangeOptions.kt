// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.ExtensionRangeOptions in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.immutableCopyOf
import com.squareup.wire.internal.redactElements
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.jvm.JvmField
import okio.ByteString

class ExtensionRangeOptions(
  uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY
) : Message<ExtensionRangeOptions, ExtensionRangeOptions.Builder>(ADAPTER, unknownFields) {
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val uninterpreted_option: List<UninterpretedOption> = immutableCopyOf("uninterpreted_option",
      uninterpreted_option)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ExtensionRangeOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "ExtensionRangeOptions{", separator = ", ", postfix = "}")
  }

  fun copy(uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
      unknownFields: ByteString = this.unknownFields): ExtensionRangeOptions =
      ExtensionRangeOptions(uninterpreted_option, unknownFields)

  class Builder : Message.Builder<ExtensionRangeOptions, Builder>() {
    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): ExtensionRangeOptions = ExtensionRangeOptions(
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<ExtensionRangeOptions> = object : ProtoAdapter<ExtensionRangeOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      ExtensionRangeOptions::class, 
      "type.googleapis.com/google.protobuf.ExtensionRangeOptions", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: ExtensionRangeOptions): Int {
        var size = value.unknownFields.size
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      override fun encode(writer: ProtoWriter, value: ExtensionRangeOptions) {
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): ExtensionRangeOptions {
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return ExtensionRangeOptions(
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: ExtensionRangeOptions): ExtensionRangeOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
