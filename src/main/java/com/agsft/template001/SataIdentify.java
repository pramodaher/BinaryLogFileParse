// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.agsft.template001;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class SataIdentify extends KaitaiStruct {
    public static SataIdentify fromFile(String fileName) throws IOException {
        return new SataIdentify(new ByteBufferKaitaiStream(fileName));
    }

    public SataIdentify(KaitaiStream _io) {
        this(_io, null, null);
    }

    public SataIdentify(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public SataIdentify(KaitaiStream _io, KaitaiStruct _parent, SataIdentify _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
    }
    public static class SingleWordType extends KaitaiStruct {
        public static SingleWordType fromFile(String fileName) throws IOException {
            return new SingleWordType(new ByteBufferKaitaiStream(fileName));
        }

        public SingleWordType(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SingleWordType(KaitaiStream _io, SataIdentify _parent) {
            this(_io, _parent, null);
        }

        public SingleWordType(KaitaiStream _io, SataIdentify _parent, SataIdentify _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.firstByte = this._io.readS1();
            this.secondByte = this._io.readS1();
        }
        private byte firstByte;
        private byte secondByte;
        private SataIdentify _root;
        private SataIdentify _parent;
        public byte firstByte() { return firstByte; }
        public byte secondByte() { return secondByte; }
        public SataIdentify _root() { return _root; }
        public SataIdentify _parent() { return _parent; }
    }
    private String firmwareVersion;
    public String firmwareVersion() {
        if (this.firmwareVersion != null)
            return this.firmwareVersion;
        long _pos = this._io.pos();
        this._io.seek(46);
        this.firmwareVersion = new String(this._io.readBytes(8), Charset.forName("ASCII"));
        this._io.seek(_pos);
        return this.firmwareVersion;
    }
    private String modelNumber;
    public String modelNumber() {
        if (this.modelNumber != null)
            return this.modelNumber;
        long _pos = this._io.pos();
        this._io.seek(54);
        this.modelNumber = new String(this._io.readBytes(40), Charset.forName("ASCII"));
        this._io.seek(_pos);
        return this.modelNumber;
    }
    private String serialNumber;
    public String serialNumber() {
        if (this.serialNumber != null)
            return this.serialNumber;
        long _pos = this._io.pos();
        this._io.seek(21);
        this.serialNumber = new String(this._io.readBytes(20), Charset.forName("ASCII"));
        this._io.seek(_pos);
        return this.serialNumber;
    }
    private SingleWordType capabilitiess;
    public SingleWordType capabilitiess() {
        if (this.capabilitiess != null)
            return this.capabilitiess;
        long _pos = this._io.pos();
        this._io.seek(98);
        this._raw_capabilitiess = this._io.readBytes(2);
        KaitaiStream _io__raw_capabilitiess = new ByteBufferKaitaiStream(_raw_capabilitiess);
        this.capabilitiess = new SingleWordType(_io__raw_capabilitiess, this, _root);
        this._io.seek(_pos);
        return this.capabilitiess;
    }
    private SingleWordType capabilities;
    public SingleWordType capabilities() {
        if (this.capabilities != null)
            return this.capabilities;
        long _pos = this._io.pos();
        this._io.seek(98);
        this._raw_capabilities = this._io.readBytes(2);
        KaitaiStream _io__raw_capabilities = new ByteBufferKaitaiStream(_raw_capabilities);
        this.capabilities = new SingleWordType(_io__raw_capabilities, this, _root);
        this._io.seek(_pos);
        return this.capabilities;
    }
    private SingleWordType genralInformation;
    public SingleWordType genralInformation() {
        if (this.genralInformation != null)
            return this.genralInformation;
        long _pos = this._io.pos();
        this._io.seek(0);
        this._raw_genralInformation = this._io.readBytes(2);
        KaitaiStream _io__raw_genralInformation = new ByteBufferKaitaiStream(_raw_genralInformation);
        this.genralInformation = new SingleWordType(_io__raw_genralInformation, this, _root);
        this._io.seek(_pos);
        return this.genralInformation;
    }
    private SingleWordType trustedComputingFuture;
    public SingleWordType trustedComputingFuture() {
        if (this.trustedComputingFuture != null)
            return this.trustedComputingFuture;
        long _pos = this._io.pos();
        this._io.seek(96);
        this._raw_trustedComputingFuture = this._io.readBytes(2);
        KaitaiStream _io__raw_trustedComputingFuture = new ByteBufferKaitaiStream(_raw_trustedComputingFuture);
        this.trustedComputingFuture = new SingleWordType(_io__raw_trustedComputingFuture, this, _root);
        this._io.seek(_pos);
        return this.trustedComputingFuture;
    }
    private SataIdentify _root;
    private KaitaiStruct _parent;
    private byte[] _raw_capabilitiess;
    private byte[] _raw_capabilities;
    private byte[] _raw_genralInformation;
    private byte[] _raw_trustedComputingFuture;
    public SataIdentify _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
    public byte[] _raw_capabilitiess() { return _raw_capabilitiess; }
    public byte[] _raw_capabilities() { return _raw_capabilities; }
    public byte[] _raw_genralInformation() { return _raw_genralInformation; }
    public byte[] _raw_trustedComputingFuture() { return _raw_trustedComputingFuture; }
}
