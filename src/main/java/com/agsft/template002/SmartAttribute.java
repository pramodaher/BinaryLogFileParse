// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.agsft.template002;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;

public class SmartAttribute extends KaitaiStruct {
    public static SmartAttribute fromFile(String fileName) throws IOException {
        return new SmartAttribute(new ByteBufferKaitaiStream(fileName));
    }

    public SmartAttribute(KaitaiStream _io) {
        this(_io, null, null);
    }

    public SmartAttribute(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public SmartAttribute(KaitaiStream _io, KaitaiStruct _parent, SmartAttribute _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
    }
    public static class CustomeType extends KaitaiStruct {
        public static CustomeType fromFile(String fileName) throws IOException {
            return new CustomeType(new ByteBufferKaitaiStream(fileName));
        }

        public CustomeType(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CustomeType(KaitaiStream _io, SmartAttribute _parent) {
            this(_io, _parent, null);
        }

        public CustomeType(KaitaiStream _io, SmartAttribute _parent, SmartAttribute _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readS1();
            this.flag = this._io.readS2le();
            this.attr = this._io.readS1();
            this.worst = this._io.readS1();
            this._raw_value = this._io.readBytes(6);
            KaitaiStream _io__raw_value = new ByteBufferKaitaiStream(_raw_value);
            this.value = new ValueType(_io__raw_value, this, _root);
            this.rev = this._io.readS1();
        }
        private byte id;
        private short flag;
        private byte attr;
        private byte worst;
        private ValueType value;
        private byte rev;
        private SmartAttribute _root;
        private SmartAttribute _parent;
        private byte[] _raw_value;
        public byte id() { return id; }
        public short flag() { return flag; }
        public byte attr() { return attr; }
        public byte worst() { return worst; }
        public ValueType value() { return value; }
        public byte rev() { return rev; }
        public SmartAttribute _root() { return _root; }
        public SmartAttribute _parent() { return _parent; }
        public byte[] _raw_value() { return _raw_value; }
    }
    public static class ValueType extends KaitaiStruct {
        public static ValueType fromFile(String fileName) throws IOException {
            return new ValueType(new ByteBufferKaitaiStream(fileName));
        }

        public ValueType(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ValueType(KaitaiStream _io, SmartAttribute.CustomeType _parent) {
            this(_io, _parent, null);
        }

        public ValueType(KaitaiStream _io, SmartAttribute.CustomeType _parent, SmartAttribute _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.firstWord = this._io.readS2le();
            this.secondWord = this._io.readS2le();
            this.thirdWord = this._io.readS2le();
        }
        private short firstWord;
        private short secondWord;
        private short thirdWord;
        private SmartAttribute _root;
        private SmartAttribute.CustomeType _parent;
        public short firstWord() { return firstWord; }
        public short secondWord() { return secondWord; }
        public short thirdWord() { return thirdWord; }
        public SmartAttribute _root() { return _root; }
        public SmartAttribute.CustomeType _parent() { return _parent; }
    }
    private CustomeType thirdAttribute;
    public CustomeType thirdAttribute() {
        if (this.thirdAttribute != null)
            return this.thirdAttribute;
        long _pos = this._io.pos();
        this._io.seek(26);
        this._raw_thirdAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_thirdAttribute = new ByteBufferKaitaiStream(_raw_thirdAttribute);
        this.thirdAttribute = new CustomeType(_io__raw_thirdAttribute, this, _root);
        this._io.seek(_pos);
        return this.thirdAttribute;
    }
    private CustomeType ninthAttribute;
    public CustomeType ninthAttribute() {
        if (this.ninthAttribute != null)
            return this.ninthAttribute;
        long _pos = this._io.pos();
        this._io.seek(98);
        this._raw_ninthAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_ninthAttribute = new ByteBufferKaitaiStream(_raw_ninthAttribute);
        this.ninthAttribute = new CustomeType(_io__raw_ninthAttribute, this, _root);
        this._io.seek(_pos);
        return this.ninthAttribute;
    }
    private CustomeType eightAttribute;
    public CustomeType eightAttribute() {
        if (this.eightAttribute != null)
            return this.eightAttribute;
        long _pos = this._io.pos();
        this._io.seek(86);
        this._raw_eightAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_eightAttribute = new ByteBufferKaitaiStream(_raw_eightAttribute);
        this.eightAttribute = new CustomeType(_io__raw_eightAttribute, this, _root);
        this._io.seek(_pos);
        return this.eightAttribute;
    }
    private CustomeType tenthAttribute;
    public CustomeType tenthAttribute() {
        if (this.tenthAttribute != null)
            return this.tenthAttribute;
        long _pos = this._io.pos();
        this._io.seek(2);
        this._raw_tenthAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_tenthAttribute = new ByteBufferKaitaiStream(_raw_tenthAttribute);
        this.tenthAttribute = new CustomeType(_io__raw_tenthAttribute, this, _root);
        this._io.seek(_pos);
        return this.tenthAttribute;
    }
    private CustomeType sixthAttribute;
    public CustomeType sixthAttribute() {
        if (this.sixthAttribute != null)
            return this.sixthAttribute;
        long _pos = this._io.pos();
        this._io.seek(62);
        this._raw_sixthAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_sixthAttribute = new ByteBufferKaitaiStream(_raw_sixthAttribute);
        this.sixthAttribute = new CustomeType(_io__raw_sixthAttribute, this, _root);
        this._io.seek(_pos);
        return this.sixthAttribute;
    }
    private CustomeType firstAttribute;
    public CustomeType firstAttribute() {
        if (this.firstAttribute != null)
            return this.firstAttribute;
        long _pos = this._io.pos();
        this._io.seek(2);
        this._raw_firstAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_firstAttribute = new ByteBufferKaitaiStream(_raw_firstAttribute);
        this.firstAttribute = new CustomeType(_io__raw_firstAttribute, this, _root);
        this._io.seek(_pos);
        return this.firstAttribute;
    }
    private CustomeType seventhAttribute;
    public CustomeType seventhAttribute() {
        if (this.seventhAttribute != null)
            return this.seventhAttribute;
        long _pos = this._io.pos();
        this._io.seek(74);
        this._raw_seventhAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_seventhAttribute = new ByteBufferKaitaiStream(_raw_seventhAttribute);
        this.seventhAttribute = new CustomeType(_io__raw_seventhAttribute, this, _root);
        this._io.seek(_pos);
        return this.seventhAttribute;
    }
    private CustomeType secondAttribute;
    public CustomeType secondAttribute() {
        if (this.secondAttribute != null)
            return this.secondAttribute;
        long _pos = this._io.pos();
        this._io.seek(14);
        this._raw_secondAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_secondAttribute = new ByteBufferKaitaiStream(_raw_secondAttribute);
        this.secondAttribute = new CustomeType(_io__raw_secondAttribute, this, _root);
        this._io.seek(_pos);
        return this.secondAttribute;
    }
    private CustomeType forthAttribute;
    public CustomeType forthAttribute() {
        if (this.forthAttribute != null)
            return this.forthAttribute;
        long _pos = this._io.pos();
        this._io.seek(38);
        this._raw_forthAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_forthAttribute = new ByteBufferKaitaiStream(_raw_forthAttribute);
        this.forthAttribute = new CustomeType(_io__raw_forthAttribute, this, _root);
        this._io.seek(_pos);
        return this.forthAttribute;
    }
    private CustomeType fifthAttribute;
    public CustomeType fifthAttribute() {
        if (this.fifthAttribute != null)
            return this.fifthAttribute;
        long _pos = this._io.pos();
        this._io.seek(50);
        this._raw_fifthAttribute = this._io.readBytes(12);
        KaitaiStream _io__raw_fifthAttribute = new ByteBufferKaitaiStream(_raw_fifthAttribute);
        this.fifthAttribute = new CustomeType(_io__raw_fifthAttribute, this, _root);
        this._io.seek(_pos);
        return this.fifthAttribute;
    }
    private SmartAttribute _root;
    private KaitaiStruct _parent;
    private byte[] _raw_thirdAttribute;
    private byte[] _raw_ninthAttribute;
    private byte[] _raw_eightAttribute;
    private byte[] _raw_tenthAttribute;
    private byte[] _raw_sixthAttribute;
    private byte[] _raw_firstAttribute;
    private byte[] _raw_seventhAttribute;
    private byte[] _raw_secondAttribute;
    private byte[] _raw_forthAttribute;
    private byte[] _raw_fifthAttribute;
    public SmartAttribute _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
    public byte[] _raw_thirdAttribute() { return _raw_thirdAttribute; }
    public byte[] _raw_ninthAttribute() { return _raw_ninthAttribute; }
    public byte[] _raw_eightAttribute() { return _raw_eightAttribute; }
    public byte[] _raw_tenthAttribute() { return _raw_tenthAttribute; }
    public byte[] _raw_sixthAttribute() { return _raw_sixthAttribute; }
    public byte[] _raw_firstAttribute() { return _raw_firstAttribute; }
    public byte[] _raw_seventhAttribute() { return _raw_seventhAttribute; }
    public byte[] _raw_secondAttribute() { return _raw_secondAttribute; }
    public byte[] _raw_forthAttribute() { return _raw_forthAttribute; }
    public byte[] _raw_fifthAttribute() { return _raw_fifthAttribute; }
}
