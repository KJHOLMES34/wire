// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.packed_encoding.OuterMessage in packed_encoding.proto
import Foundation
import Wire

public struct OuterMessage {

    @ProtoDefaulted
    public var outer_number_before: Int32?
    @ProtoDefaulted
    public var embedded_message: EmbeddedMessage?
    public var unknownFields: Foundation.Data = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if WIRE_INCLUDE_MEMBERWISE_INITIALIZER
extension OuterMessage {

    @_disfavoredOverload
    @available(*, deprecated)
    public init(outer_number_before: Int32? = nil, embedded_message: EmbeddedMessage? = nil) {
        self._outer_number_before.wrappedValue = outer_number_before
        self._embedded_message.wrappedValue = embedded_message
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension OuterMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OuterMessage : Hashable {
}
#endif

#if swift(>=5.5)
extension OuterMessage : Sendable {
}
#endif

extension OuterMessage : ProtoDefaultedValue {

    public static var defaultedValue: OuterMessage {
        OuterMessage()
    }
}

extension OuterMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.packed_encoding.OuterMessage"
    }

}

extension OuterMessage : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var outer_number_before: Int32? = nil
        var embedded_message: EmbeddedMessage? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: outer_number_before = try protoReader.decode(Int32.self)
            case 2: embedded_message = try protoReader.decode(EmbeddedMessage.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._outer_number_before.wrappedValue = outer_number_before
        self._embedded_message.wrappedValue = embedded_message
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.outer_number_before)
        try protoWriter.encode(tag: 2, value: self.embedded_message)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension OuterMessage : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._outer_number_before.wrappedValue = try container.decodeIfPresent(Int32.self, firstOfKeys: "outerNumberBefore", "outer_number_before")
        self._embedded_message.wrappedValue = try container.decodeIfPresent(EmbeddedMessage.self, firstOfKeys: "embeddedMessage", "embedded_message")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase

        try container.encodeIfPresent(self.outer_number_before, forKey: preferCamelCase ? "outerNumberBefore" : "outer_number_before")
        try container.encodeIfPresent(self.embedded_message, forKey: preferCamelCase ? "embeddedMessage" : "embedded_message")
    }

}
#endif
