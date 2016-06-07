package cn.edu.pku.ss.sa.teamc.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Author:wychangdonglei
 * Date:2014-09-30
 * Time:下午3:55
 * <p/>
 * 说明:CCR自己使用的金额显示类
 */
public class CcrAmountUtil {

    /**
     * 金额为分的格式
     */
    private static final String CURRENCY_FEN_REGEX = "\\-?[0-9]+";


    /**
     * 将分转化成元
     * 并保留两位小数
     *
     * @param fen
     * @return
     */
    public static String changeFen2Yuan(int fen) {

        String amount = String.valueOf(fen);
        if (!amount.matches(CURRENCY_FEN_REGEX)) {
            throw new RuntimeException("金额格式错误|" + amount);
        }
        String yuan = "";
        BigDecimal bigDecimalYuan = BigDecimal.valueOf(Long.valueOf(amount)).divide(new BigDecimal(100));
        DecimalFormat decimalFormat = new DecimalFormat("0.00");//
        yuan = decimalFormat.format(bigDecimalYuan);
        return yuan;

    }


}
