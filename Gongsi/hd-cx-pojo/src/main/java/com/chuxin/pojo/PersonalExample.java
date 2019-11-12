package com.chuxin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalExample() {
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

        public Criteria andMyFunctionIsNull() {
            addCriterion("my_function is null");
            return (Criteria) this;
        }

        public Criteria andMyFunctionIsNotNull() {
            addCriterion("my_function is not null");
            return (Criteria) this;
        }

        public Criteria andMyFunctionEqualTo(String value) {
            addCriterion("my_function =", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionNotEqualTo(String value) {
            addCriterion("my_function <>", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionGreaterThan(String value) {
            addCriterion("my_function >", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("my_function >=", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionLessThan(String value) {
            addCriterion("my_function <", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionLessThanOrEqualTo(String value) {
            addCriterion("my_function <=", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionLike(String value) {
            addCriterion("my_function like", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionNotLike(String value) {
            addCriterion("my_function not like", value, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionIn(List<String> values) {
            addCriterion("my_function in", values, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionNotIn(List<String> values) {
            addCriterion("my_function not in", values, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionBetween(String value1, String value2) {
            addCriterion("my_function between", value1, value2, "myFunction");
            return (Criteria) this;
        }

        public Criteria andMyFunctionNotBetween(String value1, String value2) {
            addCriterion("my_function not between", value1, value2, "myFunction");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Integer value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Integer value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Integer value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Integer value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Integer value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Integer> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Integer> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Integer value1, Integer value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andSpareOneIsNull() {
            addCriterion("spare_one is null");
            return (Criteria) this;
        }

        public Criteria andSpareOneIsNotNull() {
            addCriterion("spare_one is not null");
            return (Criteria) this;
        }

        public Criteria andSpareOneEqualTo(String value) {
            addCriterion("spare_one =", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneNotEqualTo(String value) {
            addCriterion("spare_one <>", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneGreaterThan(String value) {
            addCriterion("spare_one >", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneGreaterThanOrEqualTo(String value) {
            addCriterion("spare_one >=", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneLessThan(String value) {
            addCriterion("spare_one <", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneLessThanOrEqualTo(String value) {
            addCriterion("spare_one <=", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneLike(String value) {
            addCriterion("spare_one like", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneNotLike(String value) {
            addCriterion("spare_one not like", value, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneIn(List<String> values) {
            addCriterion("spare_one in", values, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneNotIn(List<String> values) {
            addCriterion("spare_one not in", values, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneBetween(String value1, String value2) {
            addCriterion("spare_one between", value1, value2, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareOneNotBetween(String value1, String value2) {
            addCriterion("spare_one not between", value1, value2, "spareOne");
            return (Criteria) this;
        }

        public Criteria andSpareTwoIsNull() {
            addCriterion("spare_two is null");
            return (Criteria) this;
        }

        public Criteria andSpareTwoIsNotNull() {
            addCriterion("spare_two is not null");
            return (Criteria) this;
        }

        public Criteria andSpareTwoEqualTo(String value) {
            addCriterion("spare_two =", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoNotEqualTo(String value) {
            addCriterion("spare_two <>", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoGreaterThan(String value) {
            addCriterion("spare_two >", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoGreaterThanOrEqualTo(String value) {
            addCriterion("spare_two >=", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoLessThan(String value) {
            addCriterion("spare_two <", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoLessThanOrEqualTo(String value) {
            addCriterion("spare_two <=", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoLike(String value) {
            addCriterion("spare_two like", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoNotLike(String value) {
            addCriterion("spare_two not like", value, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoIn(List<String> values) {
            addCriterion("spare_two in", values, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoNotIn(List<String> values) {
            addCriterion("spare_two not in", values, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoBetween(String value1, String value2) {
            addCriterion("spare_two between", value1, value2, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andSpareTwoNotBetween(String value1, String value2) {
            addCriterion("spare_two not between", value1, value2, "spareTwo");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(Integer value) {
            addCriterion("update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(Integer value) {
            addCriterion("update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(Integer value) {
            addCriterion("update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(Integer value) {
            addCriterion("update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(Integer value) {
            addCriterion("update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<Integer> values) {
            addCriterion("update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<Integer> values) {
            addCriterion("update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(Integer value1, Integer value2) {
            addCriterion("update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(Integer value1, Integer value2) {
            addCriterion("update_name not between", value1, value2, "updateName");
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