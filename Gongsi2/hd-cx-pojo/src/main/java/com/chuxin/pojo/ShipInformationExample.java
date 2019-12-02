package com.chuxin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipInformationExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipImgIsNull() {
            addCriterion("ship_img is null");
            return (Criteria) this;
        }

        public Criteria andShipImgIsNotNull() {
            addCriterion("ship_img is not null");
            return (Criteria) this;
        }

        public Criteria andShipImgEqualTo(String value) {
            addCriterion("ship_img =", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgNotEqualTo(String value) {
            addCriterion("ship_img <>", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgGreaterThan(String value) {
            addCriterion("ship_img >", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgGreaterThanOrEqualTo(String value) {
            addCriterion("ship_img >=", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgLessThan(String value) {
            addCriterion("ship_img <", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgLessThanOrEqualTo(String value) {
            addCriterion("ship_img <=", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgLike(String value) {
            addCriterion("ship_img like", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgNotLike(String value) {
            addCriterion("ship_img not like", value, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgIn(List<String> values) {
            addCriterion("ship_img in", values, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgNotIn(List<String> values) {
            addCriterion("ship_img not in", values, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgBetween(String value1, String value2) {
            addCriterion("ship_img between", value1, value2, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipImgNotBetween(String value1, String value2) {
            addCriterion("ship_img not between", value1, value2, "shipImg");
            return (Criteria) this;
        }

        public Criteria andShipCodingIsNull() {
            addCriterion("ship_coding is null");
            return (Criteria) this;
        }

        public Criteria andShipCodingIsNotNull() {
            addCriterion("ship_coding is not null");
            return (Criteria) this;
        }

        public Criteria andShipCodingEqualTo(String value) {
            addCriterion("ship_coding =", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingNotEqualTo(String value) {
            addCriterion("ship_coding <>", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingGreaterThan(String value) {
            addCriterion("ship_coding >", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingGreaterThanOrEqualTo(String value) {
            addCriterion("ship_coding >=", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingLessThan(String value) {
            addCriterion("ship_coding <", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingLessThanOrEqualTo(String value) {
            addCriterion("ship_coding <=", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingLike(String value) {
            addCriterion("ship_coding like", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingNotLike(String value) {
            addCriterion("ship_coding not like", value, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingIn(List<String> values) {
            addCriterion("ship_coding in", values, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingNotIn(List<String> values) {
            addCriterion("ship_coding not in", values, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingBetween(String value1, String value2) {
            addCriterion("ship_coding between", value1, value2, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipCodingNotBetween(String value1, String value2) {
            addCriterion("ship_coding not between", value1, value2, "shipCoding");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNull() {
            addCriterion("ship_type is null");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNotNull() {
            addCriterion("ship_type is not null");
            return (Criteria) this;
        }

        public Criteria andShipTypeEqualTo(String value) {
            addCriterion("ship_type =", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotEqualTo(String value) {
            addCriterion("ship_type <>", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThan(String value) {
            addCriterion("ship_type >", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_type >=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThan(String value) {
            addCriterion("ship_type <", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThanOrEqualTo(String value) {
            addCriterion("ship_type <=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLike(String value) {
            addCriterion("ship_type like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotLike(String value) {
            addCriterion("ship_type not like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeIn(List<String> values) {
            addCriterion("ship_type in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotIn(List<String> values) {
            addCriterion("ship_type not in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeBetween(String value1, String value2) {
            addCriterion("ship_type between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotBetween(String value1, String value2) {
            addCriterion("ship_type not between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipLengthIsNull() {
            addCriterion("ship_length is null");
            return (Criteria) this;
        }

        public Criteria andShipLengthIsNotNull() {
            addCriterion("ship_length is not null");
            return (Criteria) this;
        }

        public Criteria andShipLengthEqualTo(Integer value) {
            addCriterion("ship_length =", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthNotEqualTo(Integer value) {
            addCriterion("ship_length <>", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthGreaterThan(Integer value) {
            addCriterion("ship_length >", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_length >=", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthLessThan(Integer value) {
            addCriterion("ship_length <", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthLessThanOrEqualTo(Integer value) {
            addCriterion("ship_length <=", value, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthIn(List<Integer> values) {
            addCriterion("ship_length in", values, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthNotIn(List<Integer> values) {
            addCriterion("ship_length not in", values, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthBetween(Integer value1, Integer value2) {
            addCriterion("ship_length between", value1, value2, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_length not between", value1, value2, "shipLength");
            return (Criteria) this;
        }

        public Criteria andShipWidthIsNull() {
            addCriterion("ship_width is null");
            return (Criteria) this;
        }

        public Criteria andShipWidthIsNotNull() {
            addCriterion("ship_width is not null");
            return (Criteria) this;
        }

        public Criteria andShipWidthEqualTo(Integer value) {
            addCriterion("ship_width =", value, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthNotEqualTo(Integer value) {
            addCriterion("ship_width <>", value, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthGreaterThan(Integer value) {
            addCriterion("ship_width >", value, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_width >=", value, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthLessThan(Integer value) {
            addCriterion("ship_width <", value, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthLessThanOrEqualTo(Integer value) {
            addCriterion("ship_width <=", value, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthIn(List<Integer> values) {
            addCriterion("ship_width in", values, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthNotIn(List<Integer> values) {
            addCriterion("ship_width not in", values, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthBetween(Integer value1, Integer value2) {
            addCriterion("ship_width between", value1, value2, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andShipWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_width not between", value1, value2, "shipWidth");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingIsNull() {
            addCriterion("load_limiting is null");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingIsNotNull() {
            addCriterion("load_limiting is not null");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingEqualTo(Integer value) {
            addCriterion("load_limiting =", value, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingNotEqualTo(Integer value) {
            addCriterion("load_limiting <>", value, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingGreaterThan(Integer value) {
            addCriterion("load_limiting >", value, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_limiting >=", value, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingLessThan(Integer value) {
            addCriterion("load_limiting <", value, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingLessThanOrEqualTo(Integer value) {
            addCriterion("load_limiting <=", value, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingIn(List<Integer> values) {
            addCriterion("load_limiting in", values, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingNotIn(List<Integer> values) {
            addCriterion("load_limiting not in", values, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingBetween(Integer value1, Integer value2) {
            addCriterion("load_limiting between", value1, value2, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andLoadLimitingNotBetween(Integer value1, Integer value2) {
            addCriterion("load_limiting not between", value1, value2, "loadLimiting");
            return (Criteria) this;
        }

        public Criteria andShipSpeedIsNull() {
            addCriterion("ship_speed is null");
            return (Criteria) this;
        }

        public Criteria andShipSpeedIsNotNull() {
            addCriterion("ship_speed is not null");
            return (Criteria) this;
        }

        public Criteria andShipSpeedEqualTo(Integer value) {
            addCriterion("ship_speed =", value, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedNotEqualTo(Integer value) {
            addCriterion("ship_speed <>", value, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedGreaterThan(Integer value) {
            addCriterion("ship_speed >", value, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_speed >=", value, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedLessThan(Integer value) {
            addCriterion("ship_speed <", value, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("ship_speed <=", value, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedIn(List<Integer> values) {
            addCriterion("ship_speed in", values, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedNotIn(List<Integer> values) {
            addCriterion("ship_speed not in", values, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedBetween(Integer value1, Integer value2) {
            addCriterion("ship_speed between", value1, value2, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andShipSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_speed not between", value1, value2, "shipSpeed");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaIsNull() {
            addCriterion("navigation_area is null");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaIsNotNull() {
            addCriterion("navigation_area is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaEqualTo(String value) {
            addCriterion("navigation_area =", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaNotEqualTo(String value) {
            addCriterion("navigation_area <>", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaGreaterThan(String value) {
            addCriterion("navigation_area >", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaGreaterThanOrEqualTo(String value) {
            addCriterion("navigation_area >=", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaLessThan(String value) {
            addCriterion("navigation_area <", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaLessThanOrEqualTo(String value) {
            addCriterion("navigation_area <=", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaLike(String value) {
            addCriterion("navigation_area like", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaNotLike(String value) {
            addCriterion("navigation_area not like", value, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaIn(List<String> values) {
            addCriterion("navigation_area in", values, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaNotIn(List<String> values) {
            addCriterion("navigation_area not in", values, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaBetween(String value1, String value2) {
            addCriterion("navigation_area between", value1, value2, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andNavigationAreaNotBetween(String value1, String value2) {
            addCriterion("navigation_area not between", value1, value2, "navigationArea");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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