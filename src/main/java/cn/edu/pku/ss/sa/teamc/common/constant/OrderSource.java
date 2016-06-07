package cn.edu.pku.ss.sa.teamc.common.constant;

import java.util.HashMap;
import java.util.Map;


public class OrderSource {

    public final static int WY = 1;

    public final static int JD = 2;


    public final static int PC = 3;


    public static int getOrderSource(String accountSource) {
        Map<String, Integer> orderSourceMap = new HashMap<String, Integer>();
        orderSourceMap.put("WY", WY);
        orderSourceMap.put("JD", JD);
        orderSourceMap.put("PC", PC);
        if (orderSourceMap.containsKey(accountSource)) {
            return orderSourceMap.get(accountSource);
        }

        return 0;//找不到来源
    }


}
