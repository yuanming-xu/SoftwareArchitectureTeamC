package cn.edu.pku.ss.sa.teamc.common.exception;

/**
 * Author:RayChiong
 * Date:2016-06-08
 * Time:20:55
 * <br>
 * 说明:异常信息
 */
public class AppException extends  Exception{


    private int code;
    private String logMsg;
    private String appMsg;
    private String exceptionMsg;


    public AppException(int code, String logMsg, String appMsg, String exceptionMsg) {
        this.code = code;
        this.logMsg = logMsg;
        this.appMsg = appMsg;
        this.exceptionMsg = exceptionMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }

    public String getAppMsg() {
        return appMsg;
    }

    public void setAppMsg(String appMsg) {
        this.appMsg = appMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
