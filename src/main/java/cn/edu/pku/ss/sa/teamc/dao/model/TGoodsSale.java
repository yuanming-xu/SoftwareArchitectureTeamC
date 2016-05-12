package cn.edu.pku.ss.sa.teamc.dao.model;

import java.util.Date;

public class TGoodsSale {
    private Long id;

    private Long goodsId;

    private String goodsName;

    private Integer goodsTypeId;

    private String goodsTypeName;

    private String goodsNickName;

    private Date saleTime;

    private Integer saleCount;

    private Short receipt;

    private Short invoice;

    private Short money;

    private Short audit;

    private Short status;

    private Long 客户id;

    private String 客户名称;

    private Integer sellerId;

    private String sellerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName == null ? null : goodsTypeName.trim();
    }

    public String getGoodsNickName() {
        return goodsNickName;
    }

    public void setGoodsNickName(String goodsNickName) {
        this.goodsNickName = goodsNickName == null ? null : goodsNickName.trim();
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Short getReceipt() {
        return receipt;
    }

    public void setReceipt(Short receipt) {
        this.receipt = receipt;
    }

    public Short getInvoice() {
        return invoice;
    }

    public void setInvoice(Short invoice) {
        this.invoice = invoice;
    }

    public Short getMoney() {
        return money;
    }

    public void setMoney(Short money) {
        this.money = money;
    }

    public Short getAudit() {
        return audit;
    }

    public void setAudit(Short audit) {
        this.audit = audit;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long get客户id() {
        return 客户id;
    }

    public void set客户id(Long 客户id) {
        this.客户id = 客户id;
    }

    public String get客户名称() {
        return 客户名称;
    }

    public void set客户名称(String 客户名称) {
        this.客户名称 = 客户名称 == null ? null : 客户名称.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }
}