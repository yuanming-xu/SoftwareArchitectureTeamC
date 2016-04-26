package cn.edu.pku.ss.sa.teamc.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
/**
 * 
 * @author xuyuanming
 *
 * 2016年4月26日下午3:08:51
 */
public class DigestUtil {
	/**
	 * 对字符串进行MD5并返回结果
	 * @param sourceStr
	 * @return
	 */
	public static String hashToMD5Hex(String sourceStr){
		String signStr = "";
		try {
			byte[] bytes = sourceStr.getBytes("utf-8");
			MessageDigest md5 = MessageDigest.getInstance("MD5"); md5.update(bytes);
			byte[] md5Byte = md5.digest();
			if(md5Byte != null){
			signStr = HexBin.encode(md5Byte); }
			} catch (NoSuchAlgorithmException e) { e.printStackTrace();
			} catch (UnsupportedEncodingException e) { e.printStackTrace();
			}
			return signStr;
	}
	
	public static String urlEncode(String sourceStr){
		try {
			return URLEncoder.encode(sourceStr, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// 
			e.printStackTrace();
		}
		return sourceStr;
	}
	/**
	 * 使用 HMAC-SHA1 签名方法对对 encryptText 进行签名
	 *
	 * @param encryptText
	 *            被签名的字符串
	 * @param encryptKey
	 *            密钥
	 * @return 返回被加密后的字符串
	 * @throws Exception
	 */
	public static String HmacSHA1Encrypt(String encryptText, String encryptKey) throws Exception {
		byte[] digest = HmacSHA1EncryptByte(encryptText, encryptKey);
		StringBuilder sBuilder = bytesToHexString(digest);
		return sBuilder.toString();
	}

	/**
	 * 使用 HMAC-SHA1 签名方法对对 encryptText 进行签名
	 *
	 * @param encryptText
	 *            被签名的字符串
	 * @param encryptKey
	 *            密钥
	 * @return 返回被加密后的字符串
	 * @throws Exception
	 */
	public static byte[] HmacSHA1EncryptByte(String encryptText, String encryptKey) throws Exception {
		String MAC_NAME = "HmacSHA1";
		String ENCODING = "UTF-8";
		
		byte[] data = encryptKey.getBytes(ENCODING);
		SecretKey secretKey = new SecretKeySpec(data, MAC_NAME);
		Mac mac = Mac.getInstance(MAC_NAME);
		mac.init(secretKey);
		byte[] text = encryptText.getBytes(ENCODING);
		byte[] digest = mac.doFinal(text);
		return digest;
	}

	/**
	 * 转换成Hex
	 *
	 * @param bytesArray
	 */
	public static StringBuilder bytesToHexString(byte[] bytesArray) {
		if (bytesArray == null) {
			return null;
		}
		StringBuilder sBuilder = new StringBuilder();
		for (byte b : bytesArray) {
			String hv = String.format("%02x", b);
			sBuilder.append(hv);
		}
		return sBuilder;
	}
	public static void main(String[] args) {
		String str = "eyJzaWduIjoiMDRiZjQyODRlY2IzZWFkMDVmZjk3MzgyYjNjMTQ3MmEiLCJhdXRoVG9rZW4iOiI5NXRzOFdxYVRZU2N3c2c2IiwidUlkIjoiNDU3NjkyIiwiYXBwSWQiOiIxMTA2IiwiY2hhbm5lbElkIjoibWkiLCJuYW1lIjoi6buY6K6k6LSm5Y+3In0";
		System.out.println(urlEncode(str));
	}
}
