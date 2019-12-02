package com.chuxin.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupMasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupMasterExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleIsNull() {
            addCriterion("number_people is null");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleIsNotNull() {
            addCriterion("number_people is not null");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleEqualTo(Integer value) {
            addCriterion("number_people =", value, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleNotEqualTo(Integer value) {
            addCriterion("number_people <>", value, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleGreaterThan(Integer value) {
            addCriterion("number_people >", value, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_people >=", value, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleLessThan(Integer value) {
            addCriterion("number_people <", value, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("number_people <=", value, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleIn(List<Integer> values) {
            addCriterion("number_people in", values, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleNotIn(List<Integer> values) {
            addCriterion("number_people not in", values, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleBetween(Integer value1, Integer value2) {
            addCriterion("number_people between", value1, value2, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andNumberPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("number_people not between", value1, value2, "numberPeople");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNull() {
            addCriterion("group_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNotNull() {
            addCriterion("group_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualTo(String value) {
            addCriterion("group_type =", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualTo(String value) {
            addCriterion("group_type <>", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThan(String value) {
            addCriterion("group_type >", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("group_type >=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThan(String value) {
            addCriterion("group_type <", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualTo(String value) {
            addCriterion("group_type <=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLike(String value) {
            addCriterion("group_type like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotLike(String value) {
            addCriterion("group_type not like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIn(List<String> values) {
            addCriterion("group_type in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotIn(List<String> values) {
            addCriterion("group_type not in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeBetween(String value1, String value2) {
            addCriterion("group_type between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotBetween(String value1, String value2) {
            addCriterion("group_type not between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupStateIsNull() {
            addCriterion("group_state is null");
            return (Criteria) this;
        }

        public Criteria andGroupStateIsNotNull() {
            addCriterion("group_state is not null");
            return (Criteria) this;
        }

        public Criteria andGroupStateEqualTo(Integer value) {
            addCriterion("group_state =", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateNotEqualTo(Integer value) {
            addCriterion("group_state <>", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateGreaterThan(Integer value) {
            addCriterion("group_state >", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_state >=", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateLessThan(Integer value) {
            addCriterion("group_state <", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateLessThanOrEqualTo(Integer value) {
            addCriterion("group_state <=", value, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateIn(List<Integer> values) {
            addCriterion("group_state in", values, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateNotIn(List<Integer> values) {
            addCriterion("group_state not in", values, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateBetween(Integer value1, Integer value2) {
            addCriterion("group_state between", value1, value2, "groupState");
            return (Criteria) this;
        }

        public Criteria andGroupStateNotBetween(Integer value1, Integer value2) {
            addCriterion("group_state not between", value1, value2, "groupState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateIsNull() {
            addCriterion("clustering_state is null");
            return (Criteria) this;
        }

        public Criteria andClusteringStateIsNotNull() {
            addCriterion("clustering_state is not null");
            return (Criteria) this;
        }

        public Criteria andClusteringStateEqualTo(Integer value) {
            addCriterion("clustering_state =", value, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateNotEqualTo(Integer value) {
            addCriterion("clustering_state <>", value, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateGreaterThan(Integer value) {
            addCriterion("clustering_state >", value, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("clustering_state >=", value, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateLessThan(Integer value) {
            addCriterion("clustering_state <", value, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateLessThanOrEqualTo(Integer value) {
            addCriterion("clustering_state <=", value, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateIn(List<Integer> values) {
            addCriterion("clustering_state in", values, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateNotIn(List<Integer> values) {
            addCriterion("clustering_state not in", values, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateBetween(Integer value1, Integer value2) {
            addCriterion("clustering_state between", value1, value2, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andClusteringStateNotBetween(Integer value1, Integer value2) {
            addCriterion("clustering_state not between", value1, value2, "clusteringState");
            return (Criteria) this;
        }

        public Criteria andGroupTargetIsNull() {
            addCriterion("group_target is null");
            return (Criteria) this;
        }

        public Criteria andGroupTargetIsNotNull() {
            addCriterion("group_target is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTargetEqualTo(Integer value) {
            addCriterion("group_target =", value, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetNotEqualTo(Integer value) {
            addCriterion("group_target <>", value, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetGreaterThan(Integer value) {
            addCriterion("group_target >", value, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_target >=", value, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetLessThan(Integer value) {
            addCriterion("group_target <", value, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetLessThanOrEqualTo(Integer value) {
            addCriterion("group_target <=", value, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetIn(List<Integer> values) {
            addCriterion("group_target in", values, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetNotIn(List<Integer> values) {
            addCriterion("group_target not in", values, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetBetween(Integer value1, Integer value2) {
            addCriterion("group_target between", value1, value2, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andGroupTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("group_target not between", value1, value2, "groupTarget");
            return (Criteria) this;
        }

        public Criteria andTargetPriceIsNull() {
            addCriterion("target_price is null");
            return (Criteria) this;
        }

        public Criteria andTargetPriceIsNotNull() {
            addCriterion("target_price is not null");
            return (Criteria) this;
        }

        public Criteria andTargetPriceEqualTo(BigDecimal value) {
            addCriterion("target_price =", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceNotEqualTo(BigDecimal value) {
            addCriterion("target_price <>", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceGreaterThan(BigDecimal value) {
            addCriterion("target_price >", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("target_price >=", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceLessThan(BigDecimal value) {
            addCriterion("target_price <", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("target_price <=", value, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceIn(List<BigDecimal> values) {
            addCriterion("target_price in", values, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceNotIn(List<BigDecimal> values) {
            addCriterion("target_price not in", values, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_price between", value1, value2, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andTargetPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_price not between", value1, value2, "targetPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIsNull() {
            addCriterion("group_price is null");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIsNotNull() {
            addCriterion("group_price is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPriceEqualTo(BigDecimal value) {
            addCriterion("group_price =", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotEqualTo(BigDecimal value) {
            addCriterion("group_price <>", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceGreaterThan(BigDecimal value) {
            addCriterion("group_price >", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_price >=", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceLessThan(BigDecimal value) {
            addCriterion("group_price <", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_price <=", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIn(List<BigDecimal> values) {
            addCriterion("group_price in", values, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotIn(List<BigDecimal> values) {
            addCriterion("group_price not in", values, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_price between", value1, value2, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_price not between", value1, value2, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andCaptainIsNull() {
            addCriterion("captain is null");
            return (Criteria) this;
        }

        public Criteria andCaptainIsNotNull() {
            addCriterion("captain is not null");
            return (Criteria) this;
        }

        public Criteria andCaptainEqualTo(Integer value) {
            addCriterion("captain =", value, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainNotEqualTo(Integer value) {
            addCriterion("captain <>", value, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainGreaterThan(Integer value) {
            addCriterion("captain >", value, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainGreaterThanOrEqualTo(Integer value) {
            addCriterion("captain >=", value, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainLessThan(Integer value) {
            addCriterion("captain <", value, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainLessThanOrEqualTo(Integer value) {
            addCriterion("captain <=", value, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainIn(List<Integer> values) {
            addCriterion("captain in", values, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainNotIn(List<Integer> values) {
            addCriterion("captain not in", values, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainBetween(Integer value1, Integer value2) {
            addCriterion("captain between", value1, value2, "captain");
            return (Criteria) this;
        }

        public Criteria andCaptainNotBetween(Integer value1, Integer value2) {
            addCriterion("captain not between", value1, value2, "captain");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleIsNull() {
            addCriterion("join_number_people is null");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleIsNotNull() {
            addCriterion("join_number_people is not null");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleEqualTo(Integer value) {
            addCriterion("join_number_people =", value, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleNotEqualTo(Integer value) {
            addCriterion("join_number_people <>", value, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleGreaterThan(Integer value) {
            addCriterion("join_number_people >", value, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_number_people >=", value, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleLessThan(Integer value) {
            addCriterion("join_number_people <", value, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("join_number_people <=", value, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleIn(List<Integer> values) {
            addCriterion("join_number_people in", values, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleNotIn(List<Integer> values) {
            addCriterion("join_number_people not in", values, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleBetween(Integer value1, Integer value2) {
            addCriterion("join_number_people between", value1, value2, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andJoinNumberPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("join_number_people not between", value1, value2, "joinNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleIsNull() {
            addCriterion("lack_number_people is null");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleIsNotNull() {
            addCriterion("lack_number_people is not null");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleEqualTo(Integer value) {
            addCriterion("lack_number_people =", value, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleNotEqualTo(Integer value) {
            addCriterion("lack_number_people <>", value, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleGreaterThan(Integer value) {
            addCriterion("lack_number_people >", value, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("lack_number_people >=", value, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleLessThan(Integer value) {
            addCriterion("lack_number_people <", value, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("lack_number_people <=", value, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleIn(List<Integer> values) {
            addCriterion("lack_number_people in", values, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleNotIn(List<Integer> values) {
            addCriterion("lack_number_people not in", values, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleBetween(Integer value1, Integer value2) {
            addCriterion("lack_number_people between", value1, value2, "lackNumberPeople");
            return (Criteria) this;
        }

        public Criteria andLackNumberPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("lack_number_people not between", value1, value2, "lackNumberPeople");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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