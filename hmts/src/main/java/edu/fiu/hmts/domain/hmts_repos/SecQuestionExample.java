package edu.fiu.hmts.domain.hmts_repos;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class SecQuestionExample.
 */
public class SecQuestionExample {
    
    /** The order by clause. */
    protected String orderByClause;

    /** The distinct. */
    protected boolean distinct;

    /** The ored criteria. */
    protected List<Criteria> oredCriteria;

    /**
	 * Instantiates a new sec question example.
	 */
    public SecQuestionExample() {
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

        public Criteria andSecQuestionIdIsNull() {
            addCriterion("sec_question_id is null");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdIsNotNull() {
            addCriterion("sec_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdEqualTo(Integer value) {
            addCriterion("sec_question_id =", value, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdNotEqualTo(Integer value) {
            addCriterion("sec_question_id <>", value, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdGreaterThan(Integer value) {
            addCriterion("sec_question_id >", value, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sec_question_id >=", value, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdLessThan(Integer value) {
            addCriterion("sec_question_id <", value, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("sec_question_id <=", value, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdIn(List<Integer> values) {
            addCriterion("sec_question_id in", values, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdNotIn(List<Integer> values) {
            addCriterion("sec_question_id not in", values, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("sec_question_id between", value1, value2, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andSecQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sec_question_id not between", value1, value2, "secQuestionId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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