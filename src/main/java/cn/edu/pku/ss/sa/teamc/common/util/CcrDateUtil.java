package cn.edu.pku.ss.sa.teamc.common.util;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@author:donglei.chang
 *@Date:2016-06-07
 *@Time:17:38
 * 说明:
 * 针对Ccr自己的DateUtil
 */
public class CcrDateUtil {


    /**
     * <p/>
     * 将yyyyMMddHHmmssSSS 格式的日期转换成Date格式的数据
     * 已经对空串进行处理
     * 如果传递的参数为null 则返回系统当前时间
     *
     * @param timeStr
     * @return
     */
    public static Date parseStr2Date(String timeStr) {

        Date date = new Date();
        if (StringUtils.isEmpty(timeStr)) {
            return date;
        }

        String yyyyMMddHHmmssStr = "yyyyMMddHHmmssSSS";
        SimpleDateFormat yyyy_MM_dd_HH_mm_ss = new SimpleDateFormat(yyyyMMddHHmmssStr);

        try {
            date = yyyy_MM_dd_HH_mm_ss.parse(timeStr);
        } catch (Exception e) {//格式化失败,取系统当前时间
            date = new Date();
        }

        return date;
    }


}
