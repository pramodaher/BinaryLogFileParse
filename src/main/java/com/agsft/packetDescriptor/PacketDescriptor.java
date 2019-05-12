// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.agsft.packetDescriptor;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;

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
        this.rackNumber = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.slotNumber = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.systemFw = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.os = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.interfacee = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.attribute = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
        this.numberOfRecords = new String(this._io.readBytesTerm(13, false, true, true), Charset.forName("UTF-8"));
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
    private String rackNumber;
    private String slotNumber;
    private String systemFw;
    private String os;
    private String interfacee;
    private String attribute;
    private String numberOfRecords;
    private PacketDescriptor _root;
    private KaitaiStruct _parent;
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
    public String rackNumber() { return rackNumber; }
    public String slotNumber() { return slotNumber; }
    public String systemFw() { return systemFw; }
    public String os() { return os; }
    public String interfacee() { return interfacee; }
    public String attribute() { return attribute; }
    public String numberOfRecords() { return numberOfRecords; }
    public PacketDescriptor _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
