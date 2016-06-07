package cn.edu.pku.ss.sa.teamc.common.exception;


import wangyin.app.server.facade.exception.AppException;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class SuccessException {

    /**
     * ***************************************** 所有系统的成功开始 *****************************************
     */
    public final static Integer SUCCESS = 0;
    public final static AppException SUCCESS_ = new AppException(0, "SUCCESS", "成功", "成功");

    /**
     * 没有找到对应的订单号
     */
    public final static String ORDER_NOT_EXIST_EXCEPTION = "ORDER_NOT_EXIST_EXCEPTION";
    public final static AppException ORDER_NOT_EXIST_EXCEPTION_ = new AppException(8, ORDER_NOT_EXIST_EXCEPTION, "没有找到对应的订单号", "没有找到对应的订单号");


    /**
     * 收银台成功
     */
    public final static Integer SYT_SUCCESS = "00".hashCode();
    public final static AppException SYT_SUCCESS_ = new AppException(0, "SYT_SUCCESS", "成功", "成功");


    /**
     * 余额还白条
     */
    public final static Integer CreditRepayByBalance_SUCCESS = "CreditRepayByBalanceSuccess".hashCode();
    public final static AppException CreditRepayByBalance_SUCCESS_ = new AppException(0, "CreditRepayByBalanceSuccess", "成功", "还款成功");

    /**
     * 小金库(收银台) and 水电煤
     */
    public final static Integer SDM_SUCCESS = "0000000".hashCode();
    public final static AppException SDM_SUCCESS_ = new AppException(0, "SDM_SUCCESS", "成功", "成功");

    public static Map<Integer, AppException> successMap = new HashMap<Integer, AppException>();

    static {
        /**
         * ************************定义成功的结果集**************************************
         */
        //成都接口成功

        //收银台成功
        successMap.put(SYT_SUCCESS, SYT_SUCCESS_);
        //白条成功
        //水电煤成功
        successMap.put(SDM_SUCCESS, SDM_SUCCESS_);

        //自己系统定义的成功
        successMap.put(SUCCESS, SUCCESS_);
        successMap.put(CreditRepayByBalance_SUCCESS, CreditRepayByBalance_SUCCESS_);

        //个人站绑定快捷不发短信
        //同卡进同卡出，查询打标签卡信息

    }

}
