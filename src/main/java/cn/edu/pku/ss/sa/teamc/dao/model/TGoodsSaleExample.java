package cn.edu.pku.ss.sa.teamc.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TGoodsSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGoodsSaleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(Integer value) {
            addCriterion("goods_type_id =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(Integer value) {
            addCriterion("goods_type_id <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(Integer value) {
            addCriterion("goods_type_id >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(Integer value) {
            addCriterion("goods_type_id <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<Integer> values) {
            addCriterion("goods_type_id in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<Integer> values) {
            addCriterion("goods_type_id not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id not between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIsNull() {
            addCriterion("goods_type_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIsNotNull() {
            addCriterion("goods_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameEqualTo(String value) {
            addCriterion("goods_type_name =", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotEqualTo(String value) {
            addCriterion("goods_type_name <>", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameGreaterThan(String value) {
            addCriterion("goods_type_name >", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type_name >=", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLessThan(String value) {
            addCriterion("goods_type_name <", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("goods_type_name <=", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLike(String value) {
            addCriterion("goods_type_name like", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotLike(String value) {
            addCriterion("goods_type_name not like", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIn(List<String> values) {
            addCriterion("goods_type_name in", values, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotIn(List<String> values) {
            addCriterion("goods_type_name not in", values, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameBetween(String value1, String value2) {
            addCriterion("goods_type_name between", value1, value2, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotBetween(String value1, String value2) {
            addCriterion("goods_type_name not between", value1, value2, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameIsNull() {
            addCriterion("goods_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameIsNotNull() {
            addCriterion("goods_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameEqualTo(String value) {
            addCriterion("goods_nick_name =", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameNotEqualTo(String value) {
            addCriterion("goods_nick_name <>", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameGreaterThan(String value) {
            addCriterion("goods_nick_name >", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_nick_name >=", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameLessThan(String value) {
            addCriterion("goods_nick_name <", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameLessThanOrEqualTo(String value) {
            addCriterion("goods_nick_name <=", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameLike(String value) {
            addCriterion("goods_nick_name like", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameNotLike(String value) {
            addCriterion("goods_nick_name not like", value, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameIn(List<String> values) {
            addCriterion("goods_nick_name in", values, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameNotIn(List<String> values) {
            addCriterion("goods_nick_name not in", values, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameBetween(String value1, String value2) {
            addCriterion("goods_nick_name between", value1, value2, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andGoodsNickNameNotBetween(String value1, String value2) {
            addCriterion("goods_nick_name not between", value1, value2, "goodsNickName");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNull() {
            addCriterion("sale_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNotNull() {
            addCriterion("sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeEqualTo(Date value) {
            addCriterion("sale_time =", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotEqualTo(Date value) {
            addCriterion("sale_time <>", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThan(Date value) {
            addCriterion("sale_time >", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_time >=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThan(Date value) {
            addCriterion("sale_time <", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_time <=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIn(List<Date> values) {
            addCriterion("sale_time in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotIn(List<Date> values) {
            addCriterion("sale_time not in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeBetween(Date value1, Date value2) {
            addCriterion("sale_time between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_time not between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNull() {
            addCriterion("sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNotNull() {
            addCriterion("sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCountEqualTo(Integer value) {
            addCriterion("sale_count =", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotEqualTo(Integer value) {
            addCriterion("sale_count <>", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThan(Integer value) {
            addCriterion("sale_count >", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_count >=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThan(Integer value) {
            addCriterion("sale_count <", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_count <=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountIn(List<Integer> values) {
            addCriterion("sale_count in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotIn(List<Integer> values) {
            addCriterion("sale_count not in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_count between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_count not between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNull() {
            addCriterion("receipt is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNotNull() {
            addCriterion("receipt is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEqualTo(Short value) {
            addCriterion("receipt =", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotEqualTo(Short value) {
            addCriterion("receipt <>", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThan(Short value) {
            addCriterion("receipt >", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThanOrEqualTo(Short value) {
            addCriterion("receipt >=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThan(Short value) {
            addCriterion("receipt <", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThanOrEqualTo(Short value) {
            addCriterion("receipt <=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptIn(List<Short> values) {
            addCriterion("receipt in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotIn(List<Short> values) {
            addCriterion("receipt not in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptBetween(Short value1, Short value2) {
            addCriterion("receipt between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotBetween(Short value1, Short value2) {
            addCriterion("receipt not between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Short value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Short value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Short value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Short value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Short value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Short value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Short> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Short> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Short value1, Short value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Short value1, Short value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Short value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Short value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Short value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Short value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Short value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Short value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Short> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Short> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Short value1, Short value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Short value1, Short value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("`audit` is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("`audit` is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(Short value) {
            addCriterion("`audit` =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Short value) {
            addCriterion("`audit` <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Short value) {
            addCriterion("`audit` >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Short value) {
            addCriterion("`audit` >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Short value) {
            addCriterion("`audit` <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Short value) {
            addCriterion("`audit` <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Short> values) {
            addCriterion("`audit` in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Short> values) {
            addCriterion("`audit` not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Short value1, Short value2) {
            addCriterion("`audit` between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Short value1, Short value2) {
            addCriterion("`audit` not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria and客户idIsNull() {
            addCriterion("客户id is null");
            return (Criteria) this;
        }

        public Criteria and客户idIsNotNull() {
            addCriterion("客户id is not null");
            return (Criteria) this;
        }

        public Criteria and客户idEqualTo(Long value) {
            addCriterion("客户id =", value, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idNotEqualTo(Long value) {
            addCriterion("客户id <>", value, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idGreaterThan(Long value) {
            addCriterion("客户id >", value, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idGreaterThanOrEqualTo(Long value) {
            addCriterion("客户id >=", value, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idLessThan(Long value) {
            addCriterion("客户id <", value, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idLessThanOrEqualTo(Long value) {
            addCriterion("客户id <=", value, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idIn(List<Long> values) {
            addCriterion("客户id in", values, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idNotIn(List<Long> values) {
            addCriterion("客户id not in", values, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idBetween(Long value1, Long value2) {
            addCriterion("客户id between", value1, value2, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户idNotBetween(Long value1, Long value2) {
            addCriterion("客户id not between", value1, value2, "客户id");
            return (Criteria) this;
        }

        public Criteria and客户名称IsNull() {
            addCriterion("客户名称 is null");
            return (Criteria) this;
        }

        public Criteria and客户名称IsNotNull() {
            addCriterion("客户名称 is not null");
            return (Criteria) this;
        }

        public Criteria and客户名称EqualTo(String value) {
            addCriterion("客户名称 =", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称NotEqualTo(String value) {
            addCriterion("客户名称 <>", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称GreaterThan(String value) {
            addCriterion("客户名称 >", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称GreaterThanOrEqualTo(String value) {
            addCriterion("客户名称 >=", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称LessThan(String value) {
            addCriterion("客户名称 <", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称LessThanOrEqualTo(String value) {
            addCriterion("客户名称 <=", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称Like(String value) {
            addCriterion("客户名称 like", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称NotLike(String value) {
            addCriterion("客户名称 not like", value, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称In(List<String> values) {
            addCriterion("客户名称 in", values, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称NotIn(List<String> values) {
            addCriterion("客户名称 not in", values, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称Between(String value1, String value2) {
            addCriterion("客户名称 between", value1, value2, "客户名称");
            return (Criteria) this;
        }

        public Criteria and客户名称NotBetween(String value1, String value2) {
            addCriterion("客户名称 not between", value1, value2, "客户名称");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}