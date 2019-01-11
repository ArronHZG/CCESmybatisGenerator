package com.bupt.core.supplier.model;

import java.util.ArrayList;
import java.util.List;

public class TBusinessSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBusinessSupplierExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAbbrIsNull() {
            addCriterion("abbr is null");
            return (Criteria) this;
        }

        public Criteria andAbbrIsNotNull() {
            addCriterion("abbr is not null");
            return (Criteria) this;
        }

        public Criteria andAbbrEqualTo(String value) {
            addCriterion("abbr =", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotEqualTo(String value) {
            addCriterion("abbr <>", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrGreaterThan(String value) {
            addCriterion("abbr >", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("abbr >=", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrLessThan(String value) {
            addCriterion("abbr <", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrLessThanOrEqualTo(String value) {
            addCriterion("abbr <=", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrLike(String value) {
            addCriterion("abbr like", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotLike(String value) {
            addCriterion("abbr not like", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrIn(List<String> values) {
            addCriterion("abbr in", values, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotIn(List<String> values) {
            addCriterion("abbr not in", values, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrBetween(String value1, String value2) {
            addCriterion("abbr between", value1, value2, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotBetween(String value1, String value2) {
            addCriterion("abbr not between", value1, value2, "abbr");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeIsNull() {
            addCriterion("institutional_code is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeIsNotNull() {
            addCriterion("institutional_code is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeEqualTo(String value) {
            addCriterion("institutional_code =", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeNotEqualTo(String value) {
            addCriterion("institutional_code <>", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeGreaterThan(String value) {
            addCriterion("institutional_code >", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("institutional_code >=", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeLessThan(String value) {
            addCriterion("institutional_code <", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeLessThanOrEqualTo(String value) {
            addCriterion("institutional_code <=", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeLike(String value) {
            addCriterion("institutional_code like", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeNotLike(String value) {
            addCriterion("institutional_code not like", value, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeIn(List<String> values) {
            addCriterion("institutional_code in", values, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeNotIn(List<String> values) {
            addCriterion("institutional_code not in", values, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeBetween(String value1, String value2) {
            addCriterion("institutional_code between", value1, value2, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionalCodeNotBetween(String value1, String value2) {
            addCriterion("institutional_code not between", value1, value2, "institutionalCode");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("property like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("property not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andTaxNumberIsNull() {
            addCriterion("tax_number is null");
            return (Criteria) this;
        }

        public Criteria andTaxNumberIsNotNull() {
            addCriterion("tax_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNumberEqualTo(String value) {
            addCriterion("tax_number =", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotEqualTo(String value) {
            addCriterion("tax_number <>", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberGreaterThan(String value) {
            addCriterion("tax_number >", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tax_number >=", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberLessThan(String value) {
            addCriterion("tax_number <", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberLessThanOrEqualTo(String value) {
            addCriterion("tax_number <=", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberLike(String value) {
            addCriterion("tax_number like", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotLike(String value) {
            addCriterion("tax_number not like", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberIn(List<String> values) {
            addCriterion("tax_number in", values, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotIn(List<String> values) {
            addCriterion("tax_number not in", values, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberBetween(String value1, String value2) {
            addCriterion("tax_number between", value1, value2, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotBetween(String value1, String value2) {
            addCriterion("tax_number not between", value1, value2, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNull() {
            addCriterion("register_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNotNull() {
            addCriterion("register_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressEqualTo(String value) {
            addCriterion("register_address =", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotEqualTo(String value) {
            addCriterion("register_address <>", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThan(String value) {
            addCriterion("register_address >", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("register_address >=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThan(String value) {
            addCriterion("register_address <", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThanOrEqualTo(String value) {
            addCriterion("register_address <=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLike(String value) {
            addCriterion("register_address like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotLike(String value) {
            addCriterion("register_address not like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIn(List<String> values) {
            addCriterion("register_address in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotIn(List<String> values) {
            addCriterion("register_address not in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressBetween(String value1, String value2) {
            addCriterion("register_address between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotBetween(String value1, String value2) {
            addCriterion("register_address not between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(String value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(String value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(String value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(String value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(String value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(String value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLike(String value) {
            addCriterion("register_date like", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotLike(String value) {
            addCriterion("register_date not like", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<String> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<String> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(String value1, String value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(String value1, String value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("industry_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(Integer value) {
            addCriterion("industry_id =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(Integer value) {
            addCriterion("industry_id <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(Integer value) {
            addCriterion("industry_id >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_id >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(Integer value) {
            addCriterion("industry_id <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(Integer value) {
            addCriterion("industry_id <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<Integer> values) {
            addCriterion("industry_id in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<Integer> values) {
            addCriterion("industry_id not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(Integer value1, Integer value2) {
            addCriterion("industry_id between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_id not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAssetIsNull() {
            addCriterion("asset is null");
            return (Criteria) this;
        }

        public Criteria andAssetIsNotNull() {
            addCriterion("asset is not null");
            return (Criteria) this;
        }

        public Criteria andAssetEqualTo(Integer value) {
            addCriterion("asset =", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotEqualTo(Integer value) {
            addCriterion("asset <>", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThan(Integer value) {
            addCriterion("asset >", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset >=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThan(Integer value) {
            addCriterion("asset <", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThanOrEqualTo(Integer value) {
            addCriterion("asset <=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetIn(List<Integer> values) {
            addCriterion("asset in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotIn(List<Integer> values) {
            addCriterion("asset not in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetBetween(Integer value1, Integer value2) {
            addCriterion("asset between", value1, value2, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotBetween(Integer value1, Integer value2) {
            addCriterion("asset not between", value1, value2, "asset");
            return (Criteria) this;
        }

        public Criteria andMailingAddressIsNull() {
            addCriterion("mailing_address is null");
            return (Criteria) this;
        }

        public Criteria andMailingAddressIsNotNull() {
            addCriterion("mailing_address is not null");
            return (Criteria) this;
        }

        public Criteria andMailingAddressEqualTo(String value) {
            addCriterion("mailing_address =", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotEqualTo(String value) {
            addCriterion("mailing_address <>", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressGreaterThan(String value) {
            addCriterion("mailing_address >", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mailing_address >=", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressLessThan(String value) {
            addCriterion("mailing_address <", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressLessThanOrEqualTo(String value) {
            addCriterion("mailing_address <=", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressLike(String value) {
            addCriterion("mailing_address like", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotLike(String value) {
            addCriterion("mailing_address not like", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressIn(List<String> values) {
            addCriterion("mailing_address in", values, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotIn(List<String> values) {
            addCriterion("mailing_address not in", values, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressBetween(String value1, String value2) {
            addCriterion("mailing_address between", value1, value2, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotBetween(String value1, String value2) {
            addCriterion("mailing_address not between", value1, value2, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNull() {
            addCriterion("business_address is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNotNull() {
            addCriterion("business_address is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressEqualTo(String value) {
            addCriterion("business_address =", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotEqualTo(String value) {
            addCriterion("business_address <>", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThan(String value) {
            addCriterion("business_address >", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThanOrEqualTo(String value) {
            addCriterion("business_address >=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThan(String value) {
            addCriterion("business_address <", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThanOrEqualTo(String value) {
            addCriterion("business_address <=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLike(String value) {
            addCriterion("business_address like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotLike(String value) {
            addCriterion("business_address not like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIn(List<String> values) {
            addCriterion("business_address in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotIn(List<String> values) {
            addCriterion("business_address not in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressBetween(String value1, String value2) {
            addCriterion("business_address between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotBetween(String value1, String value2) {
            addCriterion("business_address not between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNull() {
            addCriterion("homepage is null");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNotNull() {
            addCriterion("homepage is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageEqualTo(String value) {
            addCriterion("homepage =", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotEqualTo(String value) {
            addCriterion("homepage <>", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThan(String value) {
            addCriterion("homepage >", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("homepage >=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThan(String value) {
            addCriterion("homepage <", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThanOrEqualTo(String value) {
            addCriterion("homepage <=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLike(String value) {
            addCriterion("homepage like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotLike(String value) {
            addCriterion("homepage not like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageIn(List<String> values) {
            addCriterion("homepage in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotIn(List<String> values) {
            addCriterion("homepage not in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageBetween(String value1, String value2) {
            addCriterion("homepage between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotBetween(String value1, String value2) {
            addCriterion("homepage not between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(String value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(String value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(String value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(String value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(String value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLike(String value) {
            addCriterion("payment_time like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotLike(String value) {
            addCriterion("payment_time not like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<String> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<String> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(String value1, String value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(String value1, String value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIsNull() {
            addCriterion("audit_person is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIsNotNull() {
            addCriterion("audit_person is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonEqualTo(String value) {
            addCriterion("audit_person =", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotEqualTo(String value) {
            addCriterion("audit_person <>", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonGreaterThan(String value) {
            addCriterion("audit_person >", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonGreaterThanOrEqualTo(String value) {
            addCriterion("audit_person >=", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLessThan(String value) {
            addCriterion("audit_person <", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLessThanOrEqualTo(String value) {
            addCriterion("audit_person <=", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLike(String value) {
            addCriterion("audit_person like", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotLike(String value) {
            addCriterion("audit_person not like", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIn(List<String> values) {
            addCriterion("audit_person in", values, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotIn(List<String> values) {
            addCriterion("audit_person not in", values, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonBetween(String value1, String value2) {
            addCriterion("audit_person between", value1, value2, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotBetween(String value1, String value2) {
            addCriterion("audit_person not between", value1, value2, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneIsNull() {
            addCriterion("audit_phone is null");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneIsNotNull() {
            addCriterion("audit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneEqualTo(String value) {
            addCriterion("audit_phone =", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneNotEqualTo(String value) {
            addCriterion("audit_phone <>", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneGreaterThan(String value) {
            addCriterion("audit_phone >", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("audit_phone >=", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneLessThan(String value) {
            addCriterion("audit_phone <", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneLessThanOrEqualTo(String value) {
            addCriterion("audit_phone <=", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneLike(String value) {
            addCriterion("audit_phone like", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneNotLike(String value) {
            addCriterion("audit_phone not like", value, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneIn(List<String> values) {
            addCriterion("audit_phone in", values, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneNotIn(List<String> values) {
            addCriterion("audit_phone not in", values, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneBetween(String value1, String value2) {
            addCriterion("audit_phone between", value1, value2, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditPhoneNotBetween(String value1, String value2) {
            addCriterion("audit_phone not between", value1, value2, "auditPhone");
            return (Criteria) this;
        }

        public Criteria andAuditEmailIsNull() {
            addCriterion("audit_email is null");
            return (Criteria) this;
        }

        public Criteria andAuditEmailIsNotNull() {
            addCriterion("audit_email is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEmailEqualTo(String value) {
            addCriterion("audit_email =", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailNotEqualTo(String value) {
            addCriterion("audit_email <>", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailGreaterThan(String value) {
            addCriterion("audit_email >", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailGreaterThanOrEqualTo(String value) {
            addCriterion("audit_email >=", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailLessThan(String value) {
            addCriterion("audit_email <", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailLessThanOrEqualTo(String value) {
            addCriterion("audit_email <=", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailLike(String value) {
            addCriterion("audit_email like", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailNotLike(String value) {
            addCriterion("audit_email not like", value, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailIn(List<String> values) {
            addCriterion("audit_email in", values, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailNotIn(List<String> values) {
            addCriterion("audit_email not in", values, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailBetween(String value1, String value2) {
            addCriterion("audit_email between", value1, value2, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andAuditEmailNotBetween(String value1, String value2) {
            addCriterion("audit_email not between", value1, value2, "auditEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonIsNull() {
            addCriterion("due_diligence_person is null");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonIsNotNull() {
            addCriterion("due_diligence_person is not null");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonEqualTo(String value) {
            addCriterion("due_diligence_person =", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonNotEqualTo(String value) {
            addCriterion("due_diligence_person <>", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonGreaterThan(String value) {
            addCriterion("due_diligence_person >", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonGreaterThanOrEqualTo(String value) {
            addCriterion("due_diligence_person >=", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonLessThan(String value) {
            addCriterion("due_diligence_person <", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonLessThanOrEqualTo(String value) {
            addCriterion("due_diligence_person <=", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonLike(String value) {
            addCriterion("due_diligence_person like", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonNotLike(String value) {
            addCriterion("due_diligence_person not like", value, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonIn(List<String> values) {
            addCriterion("due_diligence_person in", values, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonNotIn(List<String> values) {
            addCriterion("due_diligence_person not in", values, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonBetween(String value1, String value2) {
            addCriterion("due_diligence_person between", value1, value2, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePersonNotBetween(String value1, String value2) {
            addCriterion("due_diligence_person not between", value1, value2, "dueDiligencePerson");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneIsNull() {
            addCriterion("due_diligence_phone is null");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneIsNotNull() {
            addCriterion("due_diligence_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneEqualTo(String value) {
            addCriterion("due_diligence_phone =", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneNotEqualTo(String value) {
            addCriterion("due_diligence_phone <>", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneGreaterThan(String value) {
            addCriterion("due_diligence_phone >", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("due_diligence_phone >=", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneLessThan(String value) {
            addCriterion("due_diligence_phone <", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneLessThanOrEqualTo(String value) {
            addCriterion("due_diligence_phone <=", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneLike(String value) {
            addCriterion("due_diligence_phone like", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneNotLike(String value) {
            addCriterion("due_diligence_phone not like", value, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneIn(List<String> values) {
            addCriterion("due_diligence_phone in", values, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneNotIn(List<String> values) {
            addCriterion("due_diligence_phone not in", values, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneBetween(String value1, String value2) {
            addCriterion("due_diligence_phone between", value1, value2, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligencePhoneNotBetween(String value1, String value2) {
            addCriterion("due_diligence_phone not between", value1, value2, "dueDiligencePhone");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailIsNull() {
            addCriterion("due_diligence_email is null");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailIsNotNull() {
            addCriterion("due_diligence_email is not null");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailEqualTo(String value) {
            addCriterion("due_diligence_email =", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailNotEqualTo(String value) {
            addCriterion("due_diligence_email <>", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailGreaterThan(String value) {
            addCriterion("due_diligence_email >", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailGreaterThanOrEqualTo(String value) {
            addCriterion("due_diligence_email >=", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailLessThan(String value) {
            addCriterion("due_diligence_email <", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailLessThanOrEqualTo(String value) {
            addCriterion("due_diligence_email <=", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailLike(String value) {
            addCriterion("due_diligence_email like", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailNotLike(String value) {
            addCriterion("due_diligence_email not like", value, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailIn(List<String> values) {
            addCriterion("due_diligence_email in", values, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailNotIn(List<String> values) {
            addCriterion("due_diligence_email not in", values, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailBetween(String value1, String value2) {
            addCriterion("due_diligence_email between", value1, value2, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceEmailNotBetween(String value1, String value2) {
            addCriterion("due_diligence_email not between", value1, value2, "dueDiligenceEmail");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultIsNull() {
            addCriterion("due_diligence_result is null");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultIsNotNull() {
            addCriterion("due_diligence_result is not null");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultEqualTo(String value) {
            addCriterion("due_diligence_result =", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultNotEqualTo(String value) {
            addCriterion("due_diligence_result <>", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultGreaterThan(String value) {
            addCriterion("due_diligence_result >", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultGreaterThanOrEqualTo(String value) {
            addCriterion("due_diligence_result >=", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultLessThan(String value) {
            addCriterion("due_diligence_result <", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultLessThanOrEqualTo(String value) {
            addCriterion("due_diligence_result <=", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultLike(String value) {
            addCriterion("due_diligence_result like", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultNotLike(String value) {
            addCriterion("due_diligence_result not like", value, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultIn(List<String> values) {
            addCriterion("due_diligence_result in", values, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultNotIn(List<String> values) {
            addCriterion("due_diligence_result not in", values, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultBetween(String value1, String value2) {
            addCriterion("due_diligence_result between", value1, value2, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDiligenceResultNotBetween(String value1, String value2) {
            addCriterion("due_diligence_result not between", value1, value2, "dueDiligenceResult");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateIsNull() {
            addCriterion("due_deligence_date is null");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateIsNotNull() {
            addCriterion("due_deligence_date is not null");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateEqualTo(String value) {
            addCriterion("due_deligence_date =", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateNotEqualTo(String value) {
            addCriterion("due_deligence_date <>", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateGreaterThan(String value) {
            addCriterion("due_deligence_date >", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateGreaterThanOrEqualTo(String value) {
            addCriterion("due_deligence_date >=", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateLessThan(String value) {
            addCriterion("due_deligence_date <", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateLessThanOrEqualTo(String value) {
            addCriterion("due_deligence_date <=", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateLike(String value) {
            addCriterion("due_deligence_date like", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateNotLike(String value) {
            addCriterion("due_deligence_date not like", value, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateIn(List<String> values) {
            addCriterion("due_deligence_date in", values, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateNotIn(List<String> values) {
            addCriterion("due_deligence_date not in", values, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateBetween(String value1, String value2) {
            addCriterion("due_deligence_date between", value1, value2, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andDueDeligenceDateNotBetween(String value1, String value2) {
            addCriterion("due_deligence_date not between", value1, value2, "dueDeligenceDate");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
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

        public Criteria andCreditRatingIsNull() {
            addCriterion("credit_rating is null");
            return (Criteria) this;
        }

        public Criteria andCreditRatingIsNotNull() {
            addCriterion("credit_rating is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRatingEqualTo(String value) {
            addCriterion("credit_rating =", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotEqualTo(String value) {
            addCriterion("credit_rating <>", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingGreaterThan(String value) {
            addCriterion("credit_rating >", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingGreaterThanOrEqualTo(String value) {
            addCriterion("credit_rating >=", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingLessThan(String value) {
            addCriterion("credit_rating <", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingLessThanOrEqualTo(String value) {
            addCriterion("credit_rating <=", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingLike(String value) {
            addCriterion("credit_rating like", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotLike(String value) {
            addCriterion("credit_rating not like", value, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingIn(List<String> values) {
            addCriterion("credit_rating in", values, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotIn(List<String> values) {
            addCriterion("credit_rating not in", values, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingBetween(String value1, String value2) {
            addCriterion("credit_rating between", value1, value2, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCreditRatingNotBetween(String value1, String value2) {
            addCriterion("credit_rating not between", value1, value2, "creditRating");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIsNull() {
            addCriterion("certificate_id is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIsNotNull() {
            addCriterion("certificate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdEqualTo(Integer value) {
            addCriterion("certificate_id =", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotEqualTo(Integer value) {
            addCriterion("certificate_id <>", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThan(Integer value) {
            addCriterion("certificate_id >", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificate_id >=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThan(Integer value) {
            addCriterion("certificate_id <", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThanOrEqualTo(Integer value) {
            addCriterion("certificate_id <=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIn(List<Integer> values) {
            addCriterion("certificate_id in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotIn(List<Integer> values) {
            addCriterion("certificate_id not in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdBetween(Integer value1, Integer value2) {
            addCriterion("certificate_id between", value1, value2, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("certificate_id not between", value1, value2, "certificateId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesIsNull() {
            addCriterion("supplier_files is null");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesIsNotNull() {
            addCriterion("supplier_files is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesEqualTo(String value) {
            addCriterion("supplier_files =", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesNotEqualTo(String value) {
            addCriterion("supplier_files <>", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesGreaterThan(String value) {
            addCriterion("supplier_files >", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_files >=", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesLessThan(String value) {
            addCriterion("supplier_files <", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesLessThanOrEqualTo(String value) {
            addCriterion("supplier_files <=", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesLike(String value) {
            addCriterion("supplier_files like", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesNotLike(String value) {
            addCriterion("supplier_files not like", value, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesIn(List<String> values) {
            addCriterion("supplier_files in", values, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesNotIn(List<String> values) {
            addCriterion("supplier_files not in", values, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesBetween(String value1, String value2) {
            addCriterion("supplier_files between", value1, value2, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andSupplierFilesNotBetween(String value1, String value2) {
            addCriterion("supplier_files not between", value1, value2, "supplierFiles");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNull() {
            addCriterion("reserved1 is null");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNotNull() {
            addCriterion("reserved1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved1EqualTo(String value) {
            addCriterion("reserved1 =", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotEqualTo(String value) {
            addCriterion("reserved1 <>", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThan(String value) {
            addCriterion("reserved1 >", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("reserved1 >=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThan(String value) {
            addCriterion("reserved1 <", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThanOrEqualTo(String value) {
            addCriterion("reserved1 <=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Like(String value) {
            addCriterion("reserved1 like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotLike(String value) {
            addCriterion("reserved1 not like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1In(List<String> values) {
            addCriterion("reserved1 in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotIn(List<String> values) {
            addCriterion("reserved1 not in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Between(String value1, String value2) {
            addCriterion("reserved1 between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotBetween(String value1, String value2) {
            addCriterion("reserved1 not between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNull() {
            addCriterion("reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNotNull() {
            addCriterion("reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved2EqualTo(String value) {
            addCriterion("reserved2 =", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotEqualTo(String value) {
            addCriterion("reserved2 <>", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThan(String value) {
            addCriterion("reserved2 >", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("reserved2 >=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThan(String value) {
            addCriterion("reserved2 <", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThanOrEqualTo(String value) {
            addCriterion("reserved2 <=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Like(String value) {
            addCriterion("reserved2 like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotLike(String value) {
            addCriterion("reserved2 not like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2In(List<String> values) {
            addCriterion("reserved2 in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotIn(List<String> values) {
            addCriterion("reserved2 not in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Between(String value1, String value2) {
            addCriterion("reserved2 between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotBetween(String value1, String value2) {
            addCriterion("reserved2 not between", value1, value2, "reserved2");
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

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(String value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(String value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(String value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(String value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(String value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLike(String value) {
            addCriterion("payment_status like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotLike(String value) {
            addCriterion("payment_status not like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<String> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<String> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(String value1, String value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(String value1, String value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
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