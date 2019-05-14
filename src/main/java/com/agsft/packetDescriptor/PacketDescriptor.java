// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.agsft.packetDescriptor;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class PacketDescriptor extends KaitaiStruct {
    public static PacketDescriptor fromFile(String fileName) throws IOException {
        return new PacketDescriptor(new ByteBufferKaitaiStream(fileName));
    }

    public PacketDescriptor(KaitaiStream _io) {
        this(_io, null, null);
    }

    public PacketDescriptor(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public PacketDescriptor(KaitaiStream _io, KaitaiStruct _parent, PacketDescriptor _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.headerSize = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.header = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.version = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.copyrightInfo = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.signature = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.date = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.time = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.modelNumber = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.serialNumber = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.firmwareVersion = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.hostId = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.systemFw = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.os = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.interfacee = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.attribute = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.numberOfRecord = new String(this._io.readBytesTerm(58, false, true, true), Charset.forName("UTF-8"));
        this._raw__raw_recordLength = this._io.readBytesTerm(13, false, true, true);
        com.agsft.process.Length _process__raw__raw_recordLength = new com.agsft.process.Length();
        this._raw_recordLength = _process__raw__raw_recordLength.decode(this._raw__raw_recordLength);
        KaitaiStream _io__raw_recordLength = new ByteBufferKaitaiStream(_raw_recordLength);
        this.recordLength = new StrTrim(_io__raw_recordLength, this, _root);
        template = new ArrayList<TemplateType>((int) (recordLength().length()));
        for (int i = 0; i < recordLength().length(); i++) {
            this.template.add(new TemplateType(this._io, this, _root));
        }
    }
    public static class TemplateType extends KaitaiStruct {
        public static TemplateType fromFile(String fileName) throws IOException {
            return new TemplateType(new ByteBufferKaitaiStream(fileName));
        }

        public TemplateType(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TemplateType(KaitaiStream _io, PacketDescriptor _parent) {
            this(_io, _parent, null);
        }

        public TemplateType(KaitaiStream _io, PacketDescriptor _parent, PacketDescriptor _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.byteIndex = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
            this.length = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
            this.type = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        }
        private String byteIndex;
        private String length;
        private String type;
        private PacketDescriptor _root;
        private PacketDescriptor _parent;
        public String byteIndex() { return byteIndex; }
        public String length() { return length; }
        public String type() { return type; }
        public PacketDescriptor _root() { return _root; }
        public PacketDescriptor _parent() { return _parent; }
    }
    public static class StrTrim extends KaitaiStruct {
        public static StrTrim fromFile(String fileName) throws IOException {
            return new StrTrim(new ByteBufferKaitaiStream(fileName));
        }

        public StrTrim(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StrTrim(KaitaiStream _io, PacketDescriptor _parent) {
            this(_io, _parent, null);
        }

        public StrTrim(KaitaiStream _io, PacketDescriptor _parent, PacketDescriptor _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.length = this._io.readS1();
        }
        private byte length;
        private PacketDescriptor _root;
        private PacketDescriptor _parent;
        public byte length() { return length; }
        public PacketDescriptor _root() { return _root; }
        public PacketDescriptor _parent() { return _parent; }
    }
    private String headerSize;
    private String header;
    private String version;
    private String copyrightInfo;
    private String signature;
    private String date;
    private String time;
    private String modelNumber;
    private String serialNumber;
    private String firmwareVersion;
    private String hostId;
    private String systemFw;
    private String os;
    private String interfacee;
    private String attribute;
    private String numberOfRecord;
    private StrTrim recordLength;
    private ArrayList<TemplateType> template;
    private PacketDescriptor _root;
    private KaitaiStruct _parent;
    private byte[] _raw__raw_recordLength;
    private byte[] _raw_recordLength;
    public String headerSize() { return headerSize; }
    public String header() { return header; }
    public String version() { return version; }
    public String copyrightInfo() { return copyrightInfo; }
    public String signature() { return signature; }
    public String date() { return date; }
    public String time() { return time; }
    public String modelNumber() { return modelNumber; }
    public String serialNumber() { return serialNumber; }
    public String firmwareVersion() { return firmwareVersion; }
    public String hostId() { return hostId; }
    public String systemFw() { return systemFw; }
    public String os() { return os; }
    public String interfacee() { return interfacee; }
    public String attribute() { return attribute; }
    public String numberOfRecord() { return numberOfRecord; }
    public StrTrim recordLength() { return recordLength; }
    public ArrayList<TemplateType> template() { return template; }
    public PacketDescriptor _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
    public byte[] _raw__raw_recordLength() { return _raw__raw_recordLength; }
    public byte[] _raw_recordLength() { return _raw_recordLength; }
}
