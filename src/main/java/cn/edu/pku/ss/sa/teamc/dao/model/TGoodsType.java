package cn.edu.pku.ss.sa.teamc.dao.model;

public class TGoodsType {
    private Integer id;

    private String 商品类型名称;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get商品类型名称() {
        return 商品类型名称;
    }

    public void set商品类型名称(String 商品类型名称) {
        this.商品类型名称 = 商品类型名称 == null ? null : 商品类型名称.trim();
    }
}