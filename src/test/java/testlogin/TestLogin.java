package testlogin;

import org.junit.Test;

import cn.edu.pku.ss.sa.teamc.util.DigestUtil;

/**
 * 
 * @author xuyuanming
 *
 * 2016年4月26日下午3:45:26
 */
public class TestLogin {
	@Test
	public void generateMd5(){
		System.out.println(DigestUtil.hashToMD5Hex("xuyuanming111111"));
	}
}
