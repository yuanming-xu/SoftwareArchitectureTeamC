package cn.edu.pku.ss.sa.teamc.common.constant;

/**
 *@author:donglei.chang
 *@Date:2016-06-07
 *@Time:17:38
 * <p/>
 * 说明:
 * 加解密的 3Deskey
 * 1.用于数据库和manage页面的展示
 * 2.timer 使用
 */
public class CcrDes3Constant {


//    public static String des3KeyStr = "91 60 35 17 3A FE 15 4E 1C 7B BC 49 CE 73 C5 60 4C C9 5D 8B E4 31 02 8C"; //原3des密文字符串

    public static byte[] ccrDeskey = new byte[]{
            (byte) 0x91, (byte) 0x60, (byte) 0x35, (byte) 0x17, (byte) 0x3A, (byte) 0xFE, (byte) 0x15, (byte) 0x4E,
            (byte) 0x1C, (byte) 0x7B, (byte) 0xBC, (byte) 0x49, (byte) 0xCE, (byte) 0x73, (byte) 0xC5, (byte) 0x60,
            (byte) 0x4C, (byte) 0xC9, (byte) 0x5D, (byte) 0x8B, (byte) 0xE4, (byte) 0x31, (byte) 0x02, (byte) 0x8C
    };

}




