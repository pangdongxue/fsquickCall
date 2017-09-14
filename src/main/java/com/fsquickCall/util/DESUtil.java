package com.fsquickCall.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import sun.misc.BASE64Encoder;
public class DESUtil {
	public static final String ALGORITHM_DES = "DES/CBC/PKCS5Padding";

	  public static String encrypt(String encryptString, String secretkey)
	    throws Exception
	  {
	    IvParameterSpec iv = new IvParameterSpec(secretkey.getBytes("UTF-8"));
	    DESKeySpec dks = new DESKeySpec(secretkey.getBytes("UTF-8"));
	    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
	    SecretKey key = keyFactory.generateSecret(dks);
	    Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
	    cipher.init(1, key, iv);
	    BASE64Encoder base64 = new BASE64Encoder();
	    byte[] encodeByte = cipher.doFinal(encryptString.getBytes("UTF-8"));
	    String tmp = hexToString(encodeByte);

	    String encodeStr = base64.encode(tmp.getBytes("UTF-8"));

	    encodeStr = encodeStr.replace("\r\n", "");

	    return encodeStr;
	  }

	  public static String hexToString(byte[] encodeByte) {
	    StringBuffer sbu = new StringBuffer();
	    for (int i = 0; i < encodeByte.length; i++) {
	      int tmp = encodeByte[i];
	      if (tmp < 0) tmp += 256;
	      String str = Integer.toHexString(tmp);
	      if (str.length() < 2) str = "0" + str;
	      sbu.append(str);
	    }
	    return sbu.toString().toUpperCase();
	  }

	  public static void main(String[] args)
	    throws Exception
	  {
	  }
}
