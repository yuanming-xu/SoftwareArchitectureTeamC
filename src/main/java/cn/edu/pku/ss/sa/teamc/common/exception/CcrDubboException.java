package cn.edu.pku.ss.sa.teamc.common.exception;

import wangyin.app.server.facade.common.AppConstant;
import wangyin.app.server.facade.exception.AppException;

/**
 * Created by lijunfu on 14-4-27.
 * <p/>
 * 信用卡还款Dubbo exception
 */
public class CcrDubboException {


    public final static String SYS_ERR = "SYS_ERR";
    public final static AppException SYS_ERR_ = new AppException(AppConstant.CODE_FAIL, SYS_ERR, "系统异常", "连接服务器失败,请稍后重试");


    /**
     * 数据库查询失败
     */
    public final static String DB_SELECT_EXCEPTION = "DB_SELECT_EXCEPTION";
    public final static AppException DB_SELECT_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, DB_SELECT_EXCEPTION, "数据库查询失败", "连接服务器失败,请稍后重试");


    /**
     * 创建订单失败
     */
    public final static String CREATE_ORDER_EXCEPTION = "CREATE_ORDER_EXCEPTION";
    public final static AppException CREATE_ORDER_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, CREATE_ORDER_EXCEPTION, "创建订单失败", "创建订单失败");

    /**
     * 订单为不可支付的状态
     */
    public final static String ORDER_STATUS_EXCEPTION = "ORDER_STATUS_EXCEPTION";
    public final static AppException ORDER_STATUS_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, ORDER_STATUS_EXCEPTION, "订单为不可支付的状态", "该订单已完成支付,请勿重复支付");

    /**
     * 创建交易流水失败
     */
    public final static String CREATE_TRADE_NUM_EXCEPTION = "CREATE_TRADE_NUM_EXCEPTION";
    public final static AppException CREATE_TRADE_NUM_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, CREATE_TRADE_NUM_EXCEPTION, "创建交易流水失败", "创建交易流水失败");

    /**
     * 修改交易流水状态失败
     */
    public final static String UPDATE_TRADE_STATUS_EXCEPTION = "UPDATE_TRADE_STATUS_EXCEPTION";
    public final static AppException UPDATE_TRADE_STATUS_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, UPDATE_TRADE_STATUS_EXCEPTION, "修改交易流水状态失败", "修改交易流水状态失败");


    /**
     * 传入的页码大于当前的页数
     */
    public final static String PAGE_NUM_OUT = "PAGE_NUM_OUT";
    public final static AppException PAGE_NUM_OUT_ = new AppException(AppConstant.CODE_FAIL_STANDBY, PAGE_NUM_OUT, "已经到达最后一页", "已经到达最后一页");

    /**
     * 获取风控信息失败
     */
    public final static String GET_RISK_INFO_EXCEPTION = "GET_RISK_INFO_EXCEPTION";
    public final static AppException GET_RISK_INFO_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, GET_RISK_INFO_EXCEPTION, "获取风控信息失败", "连接服务器失败,请稍后重试");


    /**
     * 添加还款信用卡败
     */
    public final static String ADD_CREDIT_CARD_EXCEPTION = "ADD_CREDIT_CARD_EXCEPTION";
    public final static AppException ADD_CREDIT_CARD_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, ADD_CREDIT_CARD_EXCEPTION, "添加还款信用卡败,请重试", "添加还款信用卡败,请重试");


    /**
     * 删除还款信用卡败
     */
    public final static String DELETE_CREDIT_CARD_EXCEPTION = "DELETE_CREDIT_CARD_EXCEPTION";
    public final static AppException DELETE_CREDIT_CARD_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, DELETE_CREDIT_CARD_EXCEPTION, "删除还款信用卡败,请重试", "删除还款信用卡败,请重试");

    /**
     * 修改还款信用卡败
     */
    public final static String UPDATE_CREDIT_CARD_EXCEPTION = "UPDATE_CREDIT_CARD_EXCEPTION";
    public final static AppException UPDATE_CREDIT_CARD_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, UPDATE_CREDIT_CARD_EXCEPTION, "修改还款信用卡败,请重试", "修改还款信用卡败,请重试");


    /**
     * 获取还款信用卡败
     */
    public final static String GET_CREDIT_CARD_EXCEPTION = "GET_CREDIT_CARD_EXCEPTION";
    public final static AppException GET_CREDIT_CARD_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, GET_CREDIT_CARD_EXCEPTION, "获取还款信用卡败,请重试", "获取还款信用卡败,请重试");


    /**
     * 重复支付订单
     */
    public final static String DUPLICATE_PAYMENT_EXCEPTION = "DUPLICATE_PAYMENT_EXCEPTION";
    public final static AppException DUPLICATE_PAYMENT_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, DUPLICATE_PAYMENT_EXCEPTION, "订单不能被重复支付", "订单不能被重复支付");


    /**
     * 订单号错误
     * 用户信息验证失败，请重试
     */
    public final static String USER_VERIFY_EXCEPTION = "USER_VERIFY_EXCEPTION";
    public final static AppException USER_VERIFY_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, USER_VERIFY_EXCEPTION, "用户信息验证失败，请重试", "用户信息验证失败，请重试");


    /**
     * 没有创建订单或者未发起支付
     */
    public final static String TRADE_NOT_FIND_EXCEPTION = "TRADE_NOT_FIND_EXCEPTION";
    public final static AppException TRADE_NOT_FIND_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, TRADE_NOT_FIND_EXCEPTION, "交易流水不存在", "交易流水不存在");

    /**
     * 超过最大添加数量
     */
    public final static String OVER_MAX_EXCEPTION = "OVER_MAX_EXCEPTION";
    public final static AppException OVER_MAX_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, OVER_MAX_EXCEPTION, "添加银行卡数量过多,请重试", "添加银行卡数量过多,请重试");

    /**
     * 关联的信用卡卡号重复
     */
    public final static String CREDIT_NUM_DULPLICATE_EXCEPTION = "CREDIT_NUM_DULPLICATE_EXCEPTION";
    public final static AppException CREDIT_NUM_DULPLICATE_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, CREDIT_NUM_DULPLICATE_EXCEPTION, "信用卡卡号重复,请重试", "信用卡卡号重复,请重试");


    /**
     * 提交的信用卡卡号卡bin 不支持
     * 创建订单时输入的卡号不正确（页面做了改动）
     */
    public final static String CREDIT_NUM_ERROR_EXCEPTION = "CREDIT_NUM_ERROR_EXCEPTION";
    public final static AppException CREDIT_NUM_ERROR_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, CREDIT_NUM_ERROR_EXCEPTION, "信用卡卡号错误,请重试", "信用卡卡号错误,请重试");

    /**
     * 暂不支持该银行还款
     */
    public final static String CREDIT_CARD_SUPPORT_EXCEPTION = "CREDIT_CARD_SUPPORT_EXCEPTION";
    public final static AppException CREDIT_CARD_SUPPORT_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, CREDIT_CARD_SUPPORT_EXCEPTION, "当前不支持向此银行卡还款", "当前不支持向此银行卡还款");

    /**
     * 选择的银行错误
     */
    public final static String BANK_CHOOSE_EXCEPTION = "BANK_CHOOSE_EXCEPTION";
    public final static AppException BANK_CHOOSE_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, BANK_CHOOSE_EXCEPTION, "您输入的卡号与发卡银行不匹配,请重试确认", "您输入的卡号与发卡银行不匹配,请重试确认");


    /**
     * 获取银行列表失败
     * 获取支持还款的银行
     */
    public final static String GET_REPAY_BANK_EXCEPTION = "GET_REPAY_BANK_EXCEPTION";
    public final static AppException GET_REPAY_BANK_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, GET_REPAY_BANK_EXCEPTION, "获取银行列表失败,请重试", "获取银行列表失败,请重试");

    /**
     * 用户不存在
     */
    public final static String MEMBER_NOT_EXISTS = "MEMBER_NOT_EXISTS";
    public final static AppException MEMBER_NOT_EXISTS_ = new AppException(AppConstant.CODE_FAIL_STANDBY, MEMBER_NOT_EXISTS, "用户不存在", "用户不存在");

    /**
     * 只支持本人还款
     */
    public final static String SUPPORT_OWN_ONLY = "SUPPORT_OWN_ONLY";
    public final static AppException SUPPORT_OWN_ONLY_ = new AppException(AppConstant.CODE_FAIL_STANDBY, SUPPORT_OWN_ONLY, "当前只能给您本人的信用卡还款", "当前只能给您本人的信用卡还款");


    /**
     * 签约失败
     */
    public final static String BANK_SIGN_EXCEPTION = "BANK_SIGN_EXCEPTION";
    public final static AppException BANK_SIGN_EXCEPTION_ = new AppException(AppConstant.CODE_FAIL_STANDBY, BANK_SIGN_EXCEPTION, "银行卡签约返回码异常", "付款人太多,请稍后重试");


}
