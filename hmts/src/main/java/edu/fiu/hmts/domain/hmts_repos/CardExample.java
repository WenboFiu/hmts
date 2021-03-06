package edu.fiu.hmts.domain.hmts_repos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * The Class CardExample.
 */
public class CardExample {
    
    /** The order by clause. */
    protected String orderByClause;

    /** The distinct. */
    protected boolean distinct;

    /** The ored criteria. */
    protected List<Criteria> oredCriteria;

    /**
	 * Instantiates a new card example.
	 */
    public CardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
	 * Sets the order by clause.
	 *
	 * @param orderByClause
	 *            the new order by clause
	 */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
	 * Gets the order by clause.
	 *
	 * @return the order by clause
	 */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
	 * Sets the distinct.
	 *
	 * @param distinct
	 *            the new distinct
	 */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
	 * Checks if is distinct.
	 *
	 * @return true, if is distinct
	 */
    public boolean isDistinct() {
        return distinct;
    }

    /**
	 * Gets the ored criteria.
	 *
	 * @return the ored criteria
	 */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
	 * Or.
	 *
	 * @param criteria
	 *            the criteria
	 */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
	 * Or.
	 *
	 * @return the criteria
	 */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
	 * Creates the criteria.
	 *
	 * @return the criteria
	 */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
	 * Creates the criteria internal.
	 *
	 * @return the criteria
	 */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
	 * Clear.
	 */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
	 * The Class GeneratedCriteria.
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Long value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Long value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Long value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Long value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Long value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Long> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Long> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Long value1, Long value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Long value1, Long value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNull() {
            addCriterion("card_num is null");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNotNull() {
            addCriterion("card_num is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumEqualTo(String value) {
            addCriterion("card_num =", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotEqualTo(String value) {
            addCriterion("card_num <>", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThan(String value) {
            addCriterion("card_num >", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("card_num >=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThan(String value) {
            addCriterion("card_num <", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThanOrEqualTo(String value) {
            addCriterion("card_num <=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLike(String value) {
            addCriterion("card_num like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotLike(String value) {
            addCriterion("card_num not like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumIn(List<String> values) {
            addCriterion("card_num in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotIn(List<String> values) {
            addCriterion("card_num not in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumBetween(String value1, String value2) {
            addCriterion("card_num between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotBetween(String value1, String value2) {
            addCriterion("card_num not between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardOwnerIsNull() {
            addCriterion("card_owner is null");
            return (Criteria) this;
        }

        public Criteria andCardOwnerIsNotNull() {
            addCriterion("card_owner is not null");
            return (Criteria) this;
        }

        public Criteria andCardOwnerEqualTo(String value) {
            addCriterion("card_owner =", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerNotEqualTo(String value) {
            addCriterion("card_owner <>", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerGreaterThan(String value) {
            addCriterion("card_owner >", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("card_owner >=", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerLessThan(String value) {
            addCriterion("card_owner <", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerLessThanOrEqualTo(String value) {
            addCriterion("card_owner <=", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerLike(String value) {
            addCriterion("card_owner like", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerNotLike(String value) {
            addCriterion("card_owner not like", value, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerIn(List<String> values) {
            addCriterion("card_owner in", values, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerNotIn(List<String> values) {
            addCriterion("card_owner not in", values, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerBetween(String value1, String value2) {
            addCriterion("card_owner between", value1, value2, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andCardOwnerNotBetween(String value1, String value2) {
            addCriterion("card_owner not between", value1, value2, "cardOwner");
            return (Criteria) this;
        }

        public Criteria andBillAddressIsNull() {
            addCriterion("bill_address is null");
            return (Criteria) this;
        }

        public Criteria andBillAddressIsNotNull() {
            addCriterion("bill_address is not null");
            return (Criteria) this;
        }

        public Criteria andBillAddressEqualTo(String value) {
            addCriterion("bill_address =", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotEqualTo(String value) {
            addCriterion("bill_address <>", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressGreaterThan(String value) {
            addCriterion("bill_address >", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bill_address >=", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressLessThan(String value) {
            addCriterion("bill_address <", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressLessThanOrEqualTo(String value) {
            addCriterion("bill_address <=", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressLike(String value) {
            addCriterion("bill_address like", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotLike(String value) {
            addCriterion("bill_address not like", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressIn(List<String> values) {
            addCriterion("bill_address in", values, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotIn(List<String> values) {
            addCriterion("bill_address not in", values, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressBetween(String value1, String value2) {
            addCriterion("bill_address between", value1, value2, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotBetween(String value1, String value2) {
            addCriterion("bill_address not between", value1, value2, "billAddress");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNull() {
            addCriterion("exp_date is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("exp_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(Date value) {
            addCriterionForJDBCDate("exp_date =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("exp_date <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("exp_date >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exp_date >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(Date value) {
            addCriterionForJDBCDate("exp_date <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exp_date <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<Date> values) {
            addCriterionForJDBCDate("exp_date in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("exp_date not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exp_date between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exp_date not between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andSecCodeIsNull() {
            addCriterion("sec_code is null");
            return (Criteria) this;
        }

        public Criteria andSecCodeIsNotNull() {
            addCriterion("sec_code is not null");
            return (Criteria) this;
        }

        public Criteria andSecCodeEqualTo(String value) {
            addCriterion("sec_code =", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeNotEqualTo(String value) {
            addCriterion("sec_code <>", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeGreaterThan(String value) {
            addCriterion("sec_code >", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sec_code >=", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeLessThan(String value) {
            addCriterion("sec_code <", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeLessThanOrEqualTo(String value) {
            addCriterion("sec_code <=", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeLike(String value) {
            addCriterion("sec_code like", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeNotLike(String value) {
            addCriterion("sec_code not like", value, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeIn(List<String> values) {
            addCriterion("sec_code in", values, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeNotIn(List<String> values) {
            addCriterion("sec_code not in", values, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeBetween(String value1, String value2) {
            addCriterion("sec_code between", value1, value2, "secCode");
            return (Criteria) this;
        }

        public Criteria andSecCodeNotBetween(String value1, String value2) {
            addCriterion("sec_code not between", value1, value2, "secCode");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyIsNull() {
            addCriterion("bs_consistency is null");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyIsNotNull() {
            addCriterion("bs_consistency is not null");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyEqualTo(Integer value) {
            addCriterion("bs_consistency =", value, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyNotEqualTo(Integer value) {
            addCriterion("bs_consistency <>", value, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyGreaterThan(Integer value) {
            addCriterion("bs_consistency >", value, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("bs_consistency >=", value, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyLessThan(Integer value) {
            addCriterion("bs_consistency <", value, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyLessThanOrEqualTo(Integer value) {
            addCriterion("bs_consistency <=", value, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyIn(List<Integer> values) {
            addCriterion("bs_consistency in", values, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyNotIn(List<Integer> values) {
            addCriterion("bs_consistency not in", values, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyBetween(Integer value1, Integer value2) {
            addCriterion("bs_consistency between", value1, value2, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andBsConsistencyNotBetween(Integer value1, Integer value2) {
            addCriterion("bs_consistency not between", value1, value2, "bsConsistency");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Long value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Long value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Long value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Long value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Long> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Long> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Long value1, Long value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }
    }

    /**
	 * The Class Criteria.
	 */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
	 * The Class Criterion.
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

        /**
		 * Gets the type handler.
		 *
		 * @return the type handler
		 */
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