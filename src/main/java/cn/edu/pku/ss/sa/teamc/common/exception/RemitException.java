package cn.edu.pku.ss.sa.teamc.common.exception;


import wangyin.app.server.facade.exception.AppException;

import java.util.HashMap;
import java.util.Map;

/**
 * author:wychangdonglei
 * Date:2014-05-12
 * Time:下午6:54
 * 说明:
 * 远程调用代付接口异常
 */
public class RemitException {

    public final static String remit_InternalFacade_transaction_err = "remit_InternalFacade.transaction_err";
    public final static AppException remit_InternalFacade_transaction_err_ = new AppException(-1, remit_InternalFacade_transaction_err, "代付InternalFacade.transaction异常", "连接服务器失败,请稍后重试");

    public final static String remit_InternalFacade_query_err = "remit_InternalFacade_query_err.query";
    public final static AppException remit_InternalFacade_query_err_ = new AppException(-1, remit_InternalFacade_query_err, "代付InternalFacade.query异常", "连接服务器失败,请稍后重试");


    public static Map<String, AppException> remitMap = new HashMap<String, AppException>();

    static {
        /**
         * ************************定义自己的返回状态*******************************************************************
         */
        remitMap.put(remit_InternalFacade_transaction_err, remit_InternalFacade_transaction_err_);
        remitMap.put(remit_InternalFacade_query_err, remit_InternalFacade_query_err_);

    }


}
