// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.agsft.template002;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;

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
    public static class RecoredType extends KaitaiStruct {
        public static RecoredType fromFile(String fileName) throws IOException {
            return new RecoredType(new ByteBufferKaitaiStream(fileName));
        }

        public RecoredType(KaitaiStream _io) {
            this(_io, null, null);
        }

        public RecoredType(KaitaiStream _io, SmartAttribute _parent) {
            this(_io, _parent, null);
        }

        public RecoredType(KaitaiStream _io, SmartAttribute _parent, SmartAttribute _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU1();
            this.flag = this._io.readU2le();
            this.attr = this._io.readU1();
            this.worst = this._io.readU1();
            this._raw_value = this._io.readBytes(6);
            KaitaiStream _io__raw_value = new ByteBufferKaitaiStream(_raw_value);
            this.value = new ValueType(_io__raw_value, this, _root);
            this.rsv = this._io.readU1();
        }
        private int id;
        private int flag;
        private int attr;
        private int worst;
        private ValueType value;
        private int rsv;
        private SmartAttribute _root;
        private SmartAttribute _parent;
        private byte[] _raw_value;
        public int id() { return id; }
        public int flag() { return flag; }
        public int attr() { return attr; }
        public int worst() { return worst; }
        public ValueType value() { return value; }
        public int rsv() { return rsv; }
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

        public ValueType(KaitaiStream _io, SmartAttribute.RecoredType _parent) {
            this(_io, _parent, null);
        }

        public ValueType(KaitaiStream _io, SmartAttribute.RecoredType _parent, SmartAttribute _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.firstWord = this._io.readU2le();
            this.secondWord = this._io.readU2le();
            this.thirdWord = this._io.readU2le();
        }
        private int firstWord;
        private int secondWord;
        private int thirdWord;
        private SmartAttribute _root;
        private SmartAttribute.RecoredType _parent;
        public int firstWord() { return firstWord; }
        public int secondWord() { return secondWord; }
        public int thirdWord() { return thirdWord; }
        public SmartAttribute _root() { return _root; }
        public SmartAttribute.RecoredType _parent() { return _parent; }
    }
    private ArrayList<RecoredType> recored;
    public ArrayList<RecoredType> recored() {
        if (this.recored != null)
            return this.recored;
        long _pos = this._io.pos();
        this._io.seek(2);
        recored = new ArrayList<RecoredType>((int) (23));
        for (int i = 0; i < 23; i++) {
            this.recored.add(new RecoredType(this._io, this, _root));
        }
        this._io.seek(_pos);
        return this.recored;
    }
    private SmartAttribute _root;
    private KaitaiStruct _parent;
    public SmartAttribute _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
