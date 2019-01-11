package com.bupt.core.supplier.model;

import java.util.ArrayList;
import java.util.List;

public class TBusinessSupplierAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBusinessSupplierAuditExample() {
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

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-12-20
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andInitTimeIsNull() {
            addCriterion("init_time is null");
            return (Criteria) this;
        }

        public Criteria andInitTimeIsNotNull() {
            addCriterion("init_time is not null");
            return (Criteria) this;
        }

        public Criteria andInitTimeEqualTo(String value) {
            addCriterion("init_time =", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotEqualTo(String value) {
            addCriterion("init_time <>", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeGreaterThan(String value) {
            addCriterion("init_time >", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("init_time >=", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeLessThan(String value) {
            addCriterion("init_time <", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeLessThanOrEqualTo(String value) {
            addCriterion("init_time <=", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeLike(String value) {
            addCriterion("init_time like", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotLike(String value) {
            addCriterion("init_time not like", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeIn(List<String> values) {
            addCriterion("init_time in", values, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotIn(List<String> values) {
            addCriterion("init_time not in", values, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeBetween(String value1, String value2) {
            addCriterion("init_time between", value1, value2, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotBetween(String value1, String value2) {
            addCriterion("init_time not between", value1, value2, "initTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("audit_user is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(Integer value) {
            addCriterion("audit_user =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(Integer value) {
            addCriterion("audit_user <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(Integer value) {
            addCriterion("audit_user >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_user >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(Integer value) {
            addCriterion("audit_user <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(Integer value) {
            addCriterion("audit_user <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<Integer> values) {
            addCriterion("audit_user in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<Integer> values) {
            addCriterion("audit_user not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(Integer value1, Integer value2) {
            addCriterion("audit_user between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_user not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeIsNull() {
            addCriterion("audit_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeIsNotNull() {
            addCriterion("audit_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeEqualTo(String value) {
            addCriterion("audit_start_time =", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeNotEqualTo(String value) {
            addCriterion("audit_start_time <>", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeGreaterThan(String value) {
            addCriterion("audit_start_time >", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_start_time >=", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeLessThan(String value) {
            addCriterion("audit_start_time <", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeLessThanOrEqualTo(String value) {
            addCriterion("audit_start_time <=", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeLike(String value) {
            addCriterion("audit_start_time like", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeNotLike(String value) {
            addCriterion("audit_start_time not like", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeIn(List<String> values) {
            addCriterion("audit_start_time in", values, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeNotIn(List<String> values) {
            addCriterion("audit_start_time not in", values, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeBetween(String value1, String value2) {
            addCriterion("audit_start_time between", value1, value2, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeNotBetween(String value1, String value2) {
            addCriterion("audit_start_time not between", value1, value2, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeIsNull() {
            addCriterion("audit_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeIsNotNull() {
            addCriterion("audit_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeEqualTo(String value) {
            addCriterion("audit_end_time =", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeNotEqualTo(String value) {
            addCriterion("audit_end_time <>", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeGreaterThan(String value) {
            addCriterion("audit_end_time >", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_end_time >=", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeLessThan(String value) {
            addCriterion("audit_end_time <", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeLessThanOrEqualTo(String value) {
            addCriterion("audit_end_time <=", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeLike(String value) {
            addCriterion("audit_end_time like", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeNotLike(String value) {
            addCriterion("audit_end_time not like", value, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeIn(List<String> values) {
            addCriterion("audit_end_time in", values, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeNotIn(List<String> values) {
            addCriterion("audit_end_time not in", values, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeBetween(String value1, String value2) {
            addCriterion("audit_end_time between", value1, value2, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andAuditEndTimeNotBetween(String value1, String value2) {
            addCriterion("audit_end_time not between", value1, value2, "auditEndTime");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNull() {
            addCriterion("credit_score is null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNotNull() {
            addCriterion("credit_score is not null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreEqualTo(Integer value) {
            addCriterion("credit_score =", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotEqualTo(Integer value) {
            addCriterion("credit_score <>", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThan(Integer value) {
            addCriterion("credit_score >", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_score >=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThan(Integer value) {
            addCriterion("credit_score <", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThanOrEqualTo(Integer value) {
            addCriterion("credit_score <=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIn(List<Integer> values) {
            addCriterion("credit_score in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotIn(List<Integer> values) {
            addCriterion("credit_score not in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreBetween(Integer value1, Integer value2) {
            addCriterion("credit_score between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_score not between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(String value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(String value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(String value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(String value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(String value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(String value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLike(String value) {
            addCriterion("audit_result like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotLike(String value) {
            addCriterion("audit_result not like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<String> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<String> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(String value1, String value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(String value1, String value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditUrlIsNull() {
            addCriterion("audit_url is null");
            return (Criteria) this;
        }

        public Criteria andAuditUrlIsNotNull() {
            addCriterion("audit_url is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUrlEqualTo(String value) {
            addCriterion("audit_url =", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlNotEqualTo(String value) {
            addCriterion("audit_url <>", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlGreaterThan(String value) {
            addCriterion("audit_url >", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlGreaterThanOrEqualTo(String value) {
            addCriterion("audit_url >=", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlLessThan(String value) {
            addCriterion("audit_url <", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlLessThanOrEqualTo(String value) {
            addCriterion("audit_url <=", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlLike(String value) {
            addCriterion("audit_url like", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlNotLike(String value) {
            addCriterion("audit_url not like", value, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlIn(List<String> values) {
            addCriterion("audit_url in", values, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlNotIn(List<String> values) {
            addCriterion("audit_url not in", values, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlBetween(String value1, String value2) {
            addCriterion("audit_url between", value1, value2, "auditUrl");
            return (Criteria) this;
        }

        public Criteria andAuditUrlNotBetween(String value1, String value2) {
            addCriterion("audit_url not between", value1, value2, "auditUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-12-20
     */
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