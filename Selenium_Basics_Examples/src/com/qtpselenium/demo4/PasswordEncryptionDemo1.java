package com.qtpselenium.demo4;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncryptionDemo1 {

	public static void main(String[] args) 
	{
		String strPassword = "Sample@123";
		
		byte[] encode = Base64.encodeBase64(strPassword.getBytes());
		
		String encodedStr = new String(encode);
		System.out.println("The Encoded Password is --> "+encodedStr);
		
		byte[] decode = Base64.decodeBase64(encodedStr.getBytes());
		
		String decodedStr = new String(decode);
		
		System.out.println("The Decoded Password is --> "+decodedStr);

	}

}
