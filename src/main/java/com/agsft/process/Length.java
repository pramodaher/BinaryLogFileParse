package com.agsft.process;

import java.math.BigInteger;

import io.kaitai.struct.CustomDecoder;

public class Length implements CustomDecoder{

	public byte[] decode(byte[] src) {
		String str = new String(src);
		Integer integ = Integer.parseInt(str.trim());
		BigInteger bigInt = BigInteger.valueOf(integ); 
		return bigInt.toByteArray();
	}

}
