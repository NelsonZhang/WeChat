package com.zt.wechat.model;

import java.util.ArrayList;
import java.util.List;

public class EmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIsNull() {
            addCriterion("receiver_postcode is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIsNotNull() {
            addCriterion("receiver_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeEqualTo(String value) {
            addCriterion("receiver_postcode =", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotEqualTo(String value) {
            addCriterion("receiver_postcode <>", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeGreaterThan(String value) {
            addCriterion("receiver_postcode >", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_postcode >=", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLessThan(String value) {
            addCriterion("receiver_postcode <", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_postcode <=", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLike(String value) {
            addCriterion("receiver_postcode like", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotLike(String value) {
            addCriterion("receiver_postcode not like", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIn(List<String> values) {
            addCriterion("receiver_postcode in", values, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotIn(List<String> values) {
            addCriterion("receiver_postcode not in", values, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeBetween(String value1, String value2) {
            addCriterion("receiver_postcode between", value1, value2, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotBetween(String value1, String value2) {
            addCriterion("receiver_postcode not between", value1, value2, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberIsNull() {
            addCriterion("receiver_number is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberIsNotNull() {
            addCriterion("receiver_number is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberEqualTo(String value) {
            addCriterion("receiver_number =", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberNotEqualTo(String value) {
            addCriterion("receiver_number <>", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberGreaterThan(String value) {
            addCriterion("receiver_number >", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_number >=", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberLessThan(String value) {
            addCriterion("receiver_number <", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberLessThanOrEqualTo(String value) {
            addCriterion("receiver_number <=", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberLike(String value) {
            addCriterion("receiver_number like", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberNotLike(String value) {
            addCriterion("receiver_number not like", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberIn(List<String> values) {
            addCriterion("receiver_number in", values, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberNotIn(List<String> values) {
            addCriterion("receiver_number not in", values, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberBetween(String value1, String value2) {
            addCriterion("receiver_number between", value1, value2, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberNotBetween(String value1, String value2) {
            addCriterion("receiver_number not between", value1, value2, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNull() {
            addCriterion("sender_address is null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNotNull() {
            addCriterion("sender_address is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressEqualTo(String value) {
            addCriterion("sender_address =", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotEqualTo(String value) {
            addCriterion("sender_address <>", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThan(String value) {
            addCriterion("sender_address >", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sender_address >=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThan(String value) {
            addCriterion("sender_address <", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("sender_address <=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLike(String value) {
            addCriterion("sender_address like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotLike(String value) {
            addCriterion("sender_address not like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIn(List<String> values) {
            addCriterion("sender_address in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotIn(List<String> values) {
            addCriterion("sender_address not in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressBetween(String value1, String value2) {
            addCriterion("sender_address between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotBetween(String value1, String value2) {
            addCriterion("sender_address not between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeIsNull() {
            addCriterion("sender_postcode is null");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeIsNotNull() {
            addCriterion("sender_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeEqualTo(String value) {
            addCriterion("sender_postcode =", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotEqualTo(String value) {
            addCriterion("sender_postcode <>", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeGreaterThan(String value) {
            addCriterion("sender_postcode >", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sender_postcode >=", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeLessThan(String value) {
            addCriterion("sender_postcode <", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeLessThanOrEqualTo(String value) {
            addCriterion("sender_postcode <=", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeLike(String value) {
            addCriterion("sender_postcode like", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotLike(String value) {
            addCriterion("sender_postcode not like", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeIn(List<String> values) {
            addCriterion("sender_postcode in", values, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotIn(List<String> values) {
            addCriterion("sender_postcode not in", values, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeBetween(String value1, String value2) {
            addCriterion("sender_postcode between", value1, value2, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotBetween(String value1, String value2) {
            addCriterion("sender_postcode not between", value1, value2, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderNumberIsNull() {
            addCriterion("sender_number is null");
            return (Criteria) this;
        }

        public Criteria andSenderNumberIsNotNull() {
            addCriterion("sender_number is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNumberEqualTo(String value) {
            addCriterion("sender_number =", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberNotEqualTo(String value) {
            addCriterion("sender_number <>", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberGreaterThan(String value) {
            addCriterion("sender_number >", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sender_number >=", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberLessThan(String value) {
            addCriterion("sender_number <", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberLessThanOrEqualTo(String value) {
            addCriterion("sender_number <=", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberLike(String value) {
            addCriterion("sender_number like", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberNotLike(String value) {
            addCriterion("sender_number not like", value, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberIn(List<String> values) {
            addCriterion("sender_number in", values, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberNotIn(List<String> values) {
            addCriterion("sender_number not in", values, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberBetween(String value1, String value2) {
            addCriterion("sender_number between", value1, value2, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andSenderNumberNotBetween(String value1, String value2) {
            addCriterion("sender_number not between", value1, value2, "senderNumber");
            return (Criteria) this;
        }

        public Criteria andImageidIsNull() {
            addCriterion("imageID is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageID is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(String value) {
            addCriterion("imageID =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(String value) {
            addCriterion("imageID <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(String value) {
            addCriterion("imageID >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(String value) {
            addCriterion("imageID >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(String value) {
            addCriterion("imageID <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(String value) {
            addCriterion("imageID <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLike(String value) {
            addCriterion("imageID like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotLike(String value) {
            addCriterion("imageID not like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<String> values) {
            addCriterion("imageID in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<String> values) {
            addCriterion("imageID not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(String value1, String value2) {
            addCriterion("imageID between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(String value1, String value2) {
            addCriterion("imageID not between", value1, value2, "imageid");
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