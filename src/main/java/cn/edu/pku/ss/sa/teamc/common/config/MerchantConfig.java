package cn.edu.pku.ss.sa.teamc.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * Author:donglei.chang
 * <p/>
 * 说明:ccr消费商户号配置
 */
@Component("merchant")
public class MerchantConfig {

    @Value("${ccr.merchant.num}")
    private String ccrMerchantNum;

    public String getCcrMerchantNum() {
        return ccrMerchantNum;
    }

    public void setCcrMerchantNum(String ccrMerchantNum) {
        this.ccrMerchantNum = ccrMerchantNum;
    }
}
