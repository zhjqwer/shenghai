package com.chuxin.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SeaServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeaServiceExample() {
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

        public Criteria andShipIdIsNull() {
            addCriterion("ship_id is null");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNotNull() {
            addCriterion("ship_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipIdEqualTo(Integer value) {
            addCriterion("ship_id =", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotEqualTo(Integer value) {
            addCriterion("ship_id <>", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThan(Integer value) {
            addCriterion("ship_id >", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_id >=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThan(Integer value) {
            addCriterion("ship_id <", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThanOrEqualTo(Integer value) {
            addCriterion("ship_id <=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdIn(List<Integer> values) {
            addCriterion("ship_id in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotIn(List<Integer> values) {
            addCriterion("ship_id not in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdBetween(Integer value1, Integer value2) {
            addCriterion("ship_id between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_id not between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
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
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdIsNull() {
            addCriterion("booking_time_id is null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdIsNotNull() {
            addCriterion("booking_time_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdEqualTo(Integer value) {
            addCriterion("booking_time_id =", value, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdNotEqualTo(Integer value) {
            addCriterion("booking_time_id <>", value, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdGreaterThan(Integer value) {
            addCriterion("booking_time_id >", value, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("booking_time_id >=", value, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdLessThan(Integer value) {
            addCriterion("booking_time_id <", value, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("booking_time_id <=", value, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdIn(List<Integer> values) {
            addCriterion("booking_time_id in", values, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdNotIn(List<Integer> values) {
            addCriterion("booking_time_id not in", values, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("booking_time_id between", value1, value2, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("booking_time_id not between", value1, value2, "bookingTimeId");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteIsNull() {
            addCriterion("embark_site is null");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteIsNotNull() {
            addCriterion("embark_site is not null");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteEqualTo(String value) {
            addCriterion("embark_site =", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteNotEqualTo(String value) {
            addCriterion("embark_site <>", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteGreaterThan(String value) {
            addCriterion("embark_site >", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteGreaterThanOrEqualTo(String value) {
            addCriterion("embark_site >=", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteLessThan(String value) {
            addCriterion("embark_site <", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteLessThanOrEqualTo(String value) {
            addCriterion("embark_site <=", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteLike(String value) {
            addCriterion("embark_site like", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteNotLike(String value) {
            addCriterion("embark_site not like", value, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteIn(List<String> values) {
            addCriterion("embark_site in", values, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteNotIn(List<String> values) {
            addCriterion("embark_site not in", values, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteBetween(String value1, String value2) {
            addCriterion("embark_site between", value1, value2, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andEmbarkSiteNotBetween(String value1, String value2) {
            addCriterion("embark_site not between", value1, value2, "embarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteIsNull() {
            addCriterion("disembark_site is null");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteIsNotNull() {
            addCriterion("disembark_site is not null");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteEqualTo(String value) {
            addCriterion("disembark_site =", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteNotEqualTo(String value) {
            addCriterion("disembark_site <>", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteGreaterThan(String value) {
            addCriterion("disembark_site >", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteGreaterThanOrEqualTo(String value) {
            addCriterion("disembark_site >=", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteLessThan(String value) {
            addCriterion("disembark_site <", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteLessThanOrEqualTo(String value) {
            addCriterion("disembark_site <=", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteLike(String value) {
            addCriterion("disembark_site like", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteNotLike(String value) {
            addCriterion("disembark_site not like", value, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteIn(List<String> values) {
            addCriterion("disembark_site in", values, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteNotIn(List<String> values) {
            addCriterion("disembark_site not in", values, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteBetween(String value1, String value2) {
            addCriterion("disembark_site between", value1, value2, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andDisembarkSiteNotBetween(String value1, String value2) {
            addCriterion("disembark_site not between", value1, value2, "disembarkSite");
            return (Criteria) this;
        }

        public Criteria andMostPeopleIsNull() {
            addCriterion("most_people is null");
            return (Criteria) this;
        }

        public Criteria andMostPeopleIsNotNull() {
            addCriterion("most_people is not null");
            return (Criteria) this;
        }

        public Criteria andMostPeopleEqualTo(Integer value) {
            addCriterion("most_people =", value, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleNotEqualTo(Integer value) {
            addCriterion("most_people <>", value, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleGreaterThan(Integer value) {
            addCriterion("most_people >", value, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("most_people >=", value, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleLessThan(Integer value) {
            addCriterion("most_people <", value, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("most_people <=", value, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleIn(List<Integer> values) {
            addCriterion("most_people in", values, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleNotIn(List<Integer> values) {
            addCriterion("most_people not in", values, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleBetween(Integer value1, Integer value2) {
            addCriterion("most_people between", value1, value2, "mostPeople");
            return (Criteria) this;
        }

        public Criteria andMostPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("most_people not between", value1, value2, "mostPeople");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPresentPriceIsNull() {
            addCriterion("present_price is null");
            return (Criteria) this;
        }

        public Criteria andPresentPriceIsNotNull() {
            addCriterion("present_price is not null");
            return (Criteria) this;
        }

        public Criteria andPresentPriceEqualTo(BigDecimal value) {
            addCriterion("present_price =", value, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceNotEqualTo(BigDecimal value) {
            addCriterion("present_price <>", value, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceGreaterThan(BigDecimal value) {
            addCriterion("present_price >", value, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("present_price >=", value, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceLessThan(BigDecimal value) {
            addCriterion("present_price <", value, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("present_price <=", value, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceIn(List<BigDecimal> values) {
            addCriterion("present_price in", values, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceNotIn(List<BigDecimal> values) {
            addCriterion("present_price not in", values, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("present_price between", value1, value2, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andPresentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("present_price not between", value1, value2, "presentPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIsNull() {
            addCriterion("details_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIsNotNull() {
            addCriterion("details_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdEqualTo(Integer value) {
            addCriterion("details_id =", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotEqualTo(Integer value) {
            addCriterion("details_id <>", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThan(Integer value) {
            addCriterion("details_id >", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_id >=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThan(Integer value) {
            addCriterion("details_id <", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("details_id <=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIn(List<Integer> values) {
            addCriterion("details_id in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotIn(List<Integer> values) {
            addCriterion("details_id not in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("details_id between", value1, value2, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("details_id not between", value1, value2, "detailsId");
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

        public Criteria andTargetIslandIsNull() {
            addCriterion("target_island is null");
            return (Criteria) this;
        }

        public Criteria andTargetIslandIsNotNull() {
            addCriterion("target_island is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIslandEqualTo(String value) {
            addCriterion("target_island =", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandNotEqualTo(String value) {
            addCriterion("target_island <>", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandGreaterThan(String value) {
            addCriterion("target_island >", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandGreaterThanOrEqualTo(String value) {
            addCriterion("target_island >=", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandLessThan(String value) {
            addCriterion("target_island <", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandLessThanOrEqualTo(String value) {
            addCriterion("target_island <=", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandLike(String value) {
            addCriterion("target_island like", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandNotLike(String value) {
            addCriterion("target_island not like", value, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandIn(List<String> values) {
            addCriterion("target_island in", values, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandNotIn(List<String> values) {
            addCriterion("target_island not in", values, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandBetween(String value1, String value2) {
            addCriterion("target_island between", value1, value2, "targetIsland");
            return (Criteria) this;
        }

        public Criteria andTargetIslandNotBetween(String value1, String value2) {
            addCriterion("target_island not between", value1, value2, "targetIsland");
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