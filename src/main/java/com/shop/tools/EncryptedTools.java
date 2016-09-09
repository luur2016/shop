package com.shop.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptedTools {

	public static String stringToMd5(String orgin){
		if(orgin == null || orgin.isEmpty())
			return null;
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
		byte[] result = md.digest(orgin.getBytes());
		return byteArrayToHexString(result).toLowerCase();
	}
	
	//十六进制下数字到字符的映射数组  
    private final static String[] hexDigits = {"0", "1", "2", "3", "4",
        "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
 
	 /**
	  * 将一个字节转化成十六进制形式的字符串
	  * @param b
	  * @return
	  */
	 private static String byteToHexString(byte b){
	        int n = b;
	        if (n < 0)
	            n = 256 + n;
	        int d1 = n / 16;
	        int d2 = n % 16;
	        return hexDigits[d1] + hexDigits[d2];
	    }
	 
	 /**
	  * 转换字节数组为十六进制字符串
	  * @param b   字节数组
	  * @return    十六进制字符串
	  */
	 private static String byteArrayToHexString(byte[] b){
	        StringBuffer resultSb = new StringBuffer();
	        for (int i = 0; i < b.length; i++){
	            resultSb.append(byteToHexString(b[i]));
	        }
	        return resultSb.toString();
	 }
}
