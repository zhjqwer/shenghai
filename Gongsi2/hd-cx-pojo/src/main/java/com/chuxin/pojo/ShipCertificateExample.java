package com.chuxin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipCertificateExample() {
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

        public Criteria andShipInspectionIdIsNull() {
            addCriterion("ship_inspection_id is null");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdIsNotNull() {
            addCriterion("ship_inspection_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdEqualTo(Integer value) {
            addCriterion("ship_inspection_id =", value, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdNotEqualTo(Integer value) {
            addCriterion("ship_inspection_id <>", value, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdGreaterThan(Integer value) {
            addCriterion("ship_inspection_id >", value, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_inspection_id >=", value, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdLessThan(Integer value) {
            addCriterion("ship_inspection_id <", value, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("ship_inspection_id <=", value, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdIn(List<Integer> values) {
            addCriterion("ship_inspection_id in", values, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdNotIn(List<Integer> values) {
            addCriterion("ship_inspection_id not in", values, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdBetween(Integer value1, Integer value2) {
            addCriterion("ship_inspection_id between", value1, value2, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andShipInspectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_inspection_id not between", value1, value2, "shipInspectionId");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgIsNull() {
            addCriterion("frontal_inspection_img is null");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgIsNotNull() {
            addCriterion("frontal_inspection_img is not null");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgEqualTo(String value) {
            addCriterion("frontal_inspection_img =", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgNotEqualTo(String value) {
            addCriterion("frontal_inspection_img <>", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgGreaterThan(String value) {
            addCriterion("frontal_inspection_img >", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgGreaterThanOrEqualTo(String value) {
            addCriterion("frontal_inspection_img >=", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgLessThan(String value) {
            addCriterion("frontal_inspection_img <", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgLessThanOrEqualTo(String value) {
            addCriterion("frontal_inspection_img <=", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgLike(String value) {
            addCriterion("frontal_inspection_img like", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgNotLike(String value) {
            addCriterion("frontal_inspection_img not like", value, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgIn(List<String> values) {
            addCriterion("frontal_inspection_img in", values, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgNotIn(List<String> values) {
            addCriterion("frontal_inspection_img not in", values, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgBetween(String value1, String value2) {
            addCriterion("frontal_inspection_img between", value1, value2, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andFrontalInspectionImgNotBetween(String value1, String value2) {
            addCriterion("frontal_inspection_img not between", value1, value2, "frontalInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgIsNull() {
            addCriterion("back_inspection_img is null");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgIsNotNull() {
            addCriterion("back_inspection_img is not null");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgEqualTo(String value) {
            addCriterion("back_inspection_img =", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgNotEqualTo(String value) {
            addCriterion("back_inspection_img <>", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgGreaterThan(String value) {
            addCriterion("back_inspection_img >", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgGreaterThanOrEqualTo(String value) {
            addCriterion("back_inspection_img >=", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgLessThan(String value) {
            addCriterion("back_inspection_img <", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgLessThanOrEqualTo(String value) {
            addCriterion("back_inspection_img <=", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgLike(String value) {
            addCriterion("back_inspection_img like", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgNotLike(String value) {
            addCriterion("back_inspection_img not like", value, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgIn(List<String> values) {
            addCriterion("back_inspection_img in", values, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgNotIn(List<String> values) {
            addCriterion("back_inspection_img not in", values, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgBetween(String value1, String value2) {
            addCriterion("back_inspection_img between", value1, value2, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andBackInspectionImgNotBetween(String value1, String value2) {
            addCriterion("back_inspection_img not between", value1, value2, "backInspectionImg");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeIsNull() {
            addCriterion("inspection_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeIsNotNull() {
            addCriterion("inspection_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeEqualTo(Date value) {
            addCriterion("inspection_failure_time =", value, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeNotEqualTo(Date value) {
            addCriterion("inspection_failure_time <>", value, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeGreaterThan(Date value) {
            addCriterion("inspection_failure_time >", value, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inspection_failure_time >=", value, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeLessThan(Date value) {
            addCriterion("inspection_failure_time <", value, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("inspection_failure_time <=", value, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeIn(List<Date> values) {
            addCriterion("inspection_failure_time in", values, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeNotIn(List<Date> values) {
            addCriterion("inspection_failure_time not in", values, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeBetween(Date value1, Date value2) {
            addCriterion("inspection_failure_time between", value1, value2, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andInspectionFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("inspection_failure_time not between", value1, value2, "inspectionFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdIsNull() {
            addCriterion("optional_one_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdIsNotNull() {
            addCriterion("optional_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdEqualTo(Integer value) {
            addCriterion("optional_one_id =", value, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdNotEqualTo(Integer value) {
            addCriterion("optional_one_id <>", value, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdGreaterThan(Integer value) {
            addCriterion("optional_one_id >", value, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("optional_one_id >=", value, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdLessThan(Integer value) {
            addCriterion("optional_one_id <", value, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdLessThanOrEqualTo(Integer value) {
            addCriterion("optional_one_id <=", value, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdIn(List<Integer> values) {
            addCriterion("optional_one_id in", values, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdNotIn(List<Integer> values) {
            addCriterion("optional_one_id not in", values, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdBetween(Integer value1, Integer value2) {
            addCriterion("optional_one_id between", value1, value2, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andOptionalOneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("optional_one_id not between", value1, value2, "optionalOneId");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgIsNull() {
            addCriterion("frontal_optional_one_img is null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgIsNotNull() {
            addCriterion("frontal_optional_one_img is not null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgEqualTo(String value) {
            addCriterion("frontal_optional_one_img =", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgNotEqualTo(String value) {
            addCriterion("frontal_optional_one_img <>", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgGreaterThan(String value) {
            addCriterion("frontal_optional_one_img >", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgGreaterThanOrEqualTo(String value) {
            addCriterion("frontal_optional_one_img >=", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgLessThan(String value) {
            addCriterion("frontal_optional_one_img <", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgLessThanOrEqualTo(String value) {
            addCriterion("frontal_optional_one_img <=", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgLike(String value) {
            addCriterion("frontal_optional_one_img like", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgNotLike(String value) {
            addCriterion("frontal_optional_one_img not like", value, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgIn(List<String> values) {
            addCriterion("frontal_optional_one_img in", values, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgNotIn(List<String> values) {
            addCriterion("frontal_optional_one_img not in", values, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgBetween(String value1, String value2) {
            addCriterion("frontal_optional_one_img between", value1, value2, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalOneImgNotBetween(String value1, String value2) {
            addCriterion("frontal_optional_one_img not between", value1, value2, "frontalOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgIsNull() {
            addCriterion("back_optional_one_img is null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgIsNotNull() {
            addCriterion("back_optional_one_img is not null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgEqualTo(String value) {
            addCriterion("back_optional_one_img =", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgNotEqualTo(String value) {
            addCriterion("back_optional_one_img <>", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgGreaterThan(String value) {
            addCriterion("back_optional_one_img >", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgGreaterThanOrEqualTo(String value) {
            addCriterion("back_optional_one_img >=", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgLessThan(String value) {
            addCriterion("back_optional_one_img <", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgLessThanOrEqualTo(String value) {
            addCriterion("back_optional_one_img <=", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgLike(String value) {
            addCriterion("back_optional_one_img like", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgNotLike(String value) {
            addCriterion("back_optional_one_img not like", value, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgIn(List<String> values) {
            addCriterion("back_optional_one_img in", values, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgNotIn(List<String> values) {
            addCriterion("back_optional_one_img not in", values, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgBetween(String value1, String value2) {
            addCriterion("back_optional_one_img between", value1, value2, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalOneImgNotBetween(String value1, String value2) {
            addCriterion("back_optional_one_img not between", value1, value2, "backOptionalOneImg");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeIsNull() {
            addCriterion("optional_one_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeIsNotNull() {
            addCriterion("optional_one_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeEqualTo(Date value) {
            addCriterion("optional_one_failure_time =", value, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeNotEqualTo(Date value) {
            addCriterion("optional_one_failure_time <>", value, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeGreaterThan(Date value) {
            addCriterion("optional_one_failure_time >", value, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("optional_one_failure_time >=", value, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeLessThan(Date value) {
            addCriterion("optional_one_failure_time <", value, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("optional_one_failure_time <=", value, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeIn(List<Date> values) {
            addCriterion("optional_one_failure_time in", values, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeNotIn(List<Date> values) {
            addCriterion("optional_one_failure_time not in", values, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeBetween(Date value1, Date value2) {
            addCriterion("optional_one_failure_time between", value1, value2, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalOneFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("optional_one_failure_time not between", value1, value2, "optionalOneFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdIsNull() {
            addCriterion("optional_two_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdIsNotNull() {
            addCriterion("optional_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdEqualTo(Integer value) {
            addCriterion("optional_two_id =", value, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdNotEqualTo(Integer value) {
            addCriterion("optional_two_id <>", value, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdGreaterThan(Integer value) {
            addCriterion("optional_two_id >", value, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("optional_two_id >=", value, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdLessThan(Integer value) {
            addCriterion("optional_two_id <", value, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdLessThanOrEqualTo(Integer value) {
            addCriterion("optional_two_id <=", value, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdIn(List<Integer> values) {
            addCriterion("optional_two_id in", values, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdNotIn(List<Integer> values) {
            addCriterion("optional_two_id not in", values, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdBetween(Integer value1, Integer value2) {
            addCriterion("optional_two_id between", value1, value2, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("optional_two_id not between", value1, value2, "optionalTwoId");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgIsNull() {
            addCriterion("frontal_optional_two_img is null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgIsNotNull() {
            addCriterion("frontal_optional_two_img is not null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgEqualTo(String value) {
            addCriterion("frontal_optional_two_img =", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgNotEqualTo(String value) {
            addCriterion("frontal_optional_two_img <>", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgGreaterThan(String value) {
            addCriterion("frontal_optional_two_img >", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgGreaterThanOrEqualTo(String value) {
            addCriterion("frontal_optional_two_img >=", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgLessThan(String value) {
            addCriterion("frontal_optional_two_img <", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgLessThanOrEqualTo(String value) {
            addCriterion("frontal_optional_two_img <=", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgLike(String value) {
            addCriterion("frontal_optional_two_img like", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgNotLike(String value) {
            addCriterion("frontal_optional_two_img not like", value, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgIn(List<String> values) {
            addCriterion("frontal_optional_two_img in", values, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgNotIn(List<String> values) {
            addCriterion("frontal_optional_two_img not in", values, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgBetween(String value1, String value2) {
            addCriterion("frontal_optional_two_img between", value1, value2, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalTwoImgNotBetween(String value1, String value2) {
            addCriterion("frontal_optional_two_img not between", value1, value2, "frontalOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgIsNull() {
            addCriterion("back_optional_two_img is null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgIsNotNull() {
            addCriterion("back_optional_two_img is not null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgEqualTo(String value) {
            addCriterion("back_optional_two_img =", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgNotEqualTo(String value) {
            addCriterion("back_optional_two_img <>", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgGreaterThan(String value) {
            addCriterion("back_optional_two_img >", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgGreaterThanOrEqualTo(String value) {
            addCriterion("back_optional_two_img >=", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgLessThan(String value) {
            addCriterion("back_optional_two_img <", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgLessThanOrEqualTo(String value) {
            addCriterion("back_optional_two_img <=", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgLike(String value) {
            addCriterion("back_optional_two_img like", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgNotLike(String value) {
            addCriterion("back_optional_two_img not like", value, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgIn(List<String> values) {
            addCriterion("back_optional_two_img in", values, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgNotIn(List<String> values) {
            addCriterion("back_optional_two_img not in", values, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgBetween(String value1, String value2) {
            addCriterion("back_optional_two_img between", value1, value2, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalTwoImgNotBetween(String value1, String value2) {
            addCriterion("back_optional_two_img not between", value1, value2, "backOptionalTwoImg");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeIsNull() {
            addCriterion("optional_two_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeIsNotNull() {
            addCriterion("optional_two_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeEqualTo(Date value) {
            addCriterion("optional_two_failure_time =", value, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeNotEqualTo(Date value) {
            addCriterion("optional_two_failure_time <>", value, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeGreaterThan(Date value) {
            addCriterion("optional_two_failure_time >", value, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("optional_two_failure_time >=", value, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeLessThan(Date value) {
            addCriterion("optional_two_failure_time <", value, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("optional_two_failure_time <=", value, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeIn(List<Date> values) {
            addCriterion("optional_two_failure_time in", values, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeNotIn(List<Date> values) {
            addCriterion("optional_two_failure_time not in", values, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeBetween(Date value1, Date value2) {
            addCriterion("optional_two_failure_time between", value1, value2, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalTwoFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("optional_two_failure_time not between", value1, value2, "optionalTwoFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdIsNull() {
            addCriterion("optional_three_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdIsNotNull() {
            addCriterion("optional_three_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdEqualTo(Integer value) {
            addCriterion("optional_three_id =", value, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdNotEqualTo(Integer value) {
            addCriterion("optional_three_id <>", value, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdGreaterThan(Integer value) {
            addCriterion("optional_three_id >", value, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("optional_three_id >=", value, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdLessThan(Integer value) {
            addCriterion("optional_three_id <", value, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("optional_three_id <=", value, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdIn(List<Integer> values) {
            addCriterion("optional_three_id in", values, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdNotIn(List<Integer> values) {
            addCriterion("optional_three_id not in", values, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdBetween(Integer value1, Integer value2) {
            addCriterion("optional_three_id between", value1, value2, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("optional_three_id not between", value1, value2, "optionalThreeId");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgIsNull() {
            addCriterion("frontal_optional_three_img is null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgIsNotNull() {
            addCriterion("frontal_optional_three_img is not null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgEqualTo(String value) {
            addCriterion("frontal_optional_three_img =", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgNotEqualTo(String value) {
            addCriterion("frontal_optional_three_img <>", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgGreaterThan(String value) {
            addCriterion("frontal_optional_three_img >", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgGreaterThanOrEqualTo(String value) {
            addCriterion("frontal_optional_three_img >=", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgLessThan(String value) {
            addCriterion("frontal_optional_three_img <", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgLessThanOrEqualTo(String value) {
            addCriterion("frontal_optional_three_img <=", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgLike(String value) {
            addCriterion("frontal_optional_three_img like", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgNotLike(String value) {
            addCriterion("frontal_optional_three_img not like", value, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgIn(List<String> values) {
            addCriterion("frontal_optional_three_img in", values, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgNotIn(List<String> values) {
            addCriterion("frontal_optional_three_img not in", values, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgBetween(String value1, String value2) {
            addCriterion("frontal_optional_three_img between", value1, value2, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalThreeImgNotBetween(String value1, String value2) {
            addCriterion("frontal_optional_three_img not between", value1, value2, "frontalOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgIsNull() {
            addCriterion("back_optional_three_img is null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgIsNotNull() {
            addCriterion("back_optional_three_img is not null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgEqualTo(String value) {
            addCriterion("back_optional_three_img =", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgNotEqualTo(String value) {
            addCriterion("back_optional_three_img <>", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgGreaterThan(String value) {
            addCriterion("back_optional_three_img >", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgGreaterThanOrEqualTo(String value) {
            addCriterion("back_optional_three_img >=", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgLessThan(String value) {
            addCriterion("back_optional_three_img <", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgLessThanOrEqualTo(String value) {
            addCriterion("back_optional_three_img <=", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgLike(String value) {
            addCriterion("back_optional_three_img like", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgNotLike(String value) {
            addCriterion("back_optional_three_img not like", value, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgIn(List<String> values) {
            addCriterion("back_optional_three_img in", values, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgNotIn(List<String> values) {
            addCriterion("back_optional_three_img not in", values, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgBetween(String value1, String value2) {
            addCriterion("back_optional_three_img between", value1, value2, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalThreeImgNotBetween(String value1, String value2) {
            addCriterion("back_optional_three_img not between", value1, value2, "backOptionalThreeImg");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeIsNull() {
            addCriterion("optional_three_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeIsNotNull() {
            addCriterion("optional_three_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeEqualTo(Date value) {
            addCriterion("optional_three_failure_time =", value, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeNotEqualTo(Date value) {
            addCriterion("optional_three_failure_time <>", value, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeGreaterThan(Date value) {
            addCriterion("optional_three_failure_time >", value, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("optional_three_failure_time >=", value, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeLessThan(Date value) {
            addCriterion("optional_three_failure_time <", value, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("optional_three_failure_time <=", value, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeIn(List<Date> values) {
            addCriterion("optional_three_failure_time in", values, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeNotIn(List<Date> values) {
            addCriterion("optional_three_failure_time not in", values, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeBetween(Date value1, Date value2) {
            addCriterion("optional_three_failure_time between", value1, value2, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalThreeFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("optional_three_failure_time not between", value1, value2, "optionalThreeFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdIsNull() {
            addCriterion("optional_four_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdIsNotNull() {
            addCriterion("optional_four_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdEqualTo(Integer value) {
            addCriterion("optional_four_id =", value, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdNotEqualTo(Integer value) {
            addCriterion("optional_four_id <>", value, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdGreaterThan(Integer value) {
            addCriterion("optional_four_id >", value, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("optional_four_id >=", value, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdLessThan(Integer value) {
            addCriterion("optional_four_id <", value, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdLessThanOrEqualTo(Integer value) {
            addCriterion("optional_four_id <=", value, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdIn(List<Integer> values) {
            addCriterion("optional_four_id in", values, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdNotIn(List<Integer> values) {
            addCriterion("optional_four_id not in", values, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdBetween(Integer value1, Integer value2) {
            addCriterion("optional_four_id between", value1, value2, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andOptionalFourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("optional_four_id not between", value1, value2, "optionalFourId");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgIsNull() {
            addCriterion("frontal_optional_four_img is null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgIsNotNull() {
            addCriterion("frontal_optional_four_img is not null");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgEqualTo(String value) {
            addCriterion("frontal_optional_four_img =", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgNotEqualTo(String value) {
            addCriterion("frontal_optional_four_img <>", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgGreaterThan(String value) {
            addCriterion("frontal_optional_four_img >", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgGreaterThanOrEqualTo(String value) {
            addCriterion("frontal_optional_four_img >=", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgLessThan(String value) {
            addCriterion("frontal_optional_four_img <", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgLessThanOrEqualTo(String value) {
            addCriterion("frontal_optional_four_img <=", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgLike(String value) {
            addCriterion("frontal_optional_four_img like", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgNotLike(String value) {
            addCriterion("frontal_optional_four_img not like", value, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgIn(List<String> values) {
            addCriterion("frontal_optional_four_img in", values, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgNotIn(List<String> values) {
            addCriterion("frontal_optional_four_img not in", values, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgBetween(String value1, String value2) {
            addCriterion("frontal_optional_four_img between", value1, value2, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andFrontalOptionalFourImgNotBetween(String value1, String value2) {
            addCriterion("frontal_optional_four_img not between", value1, value2, "frontalOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgIsNull() {
            addCriterion("back_optional_four_img is null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgIsNotNull() {
            addCriterion("back_optional_four_img is not null");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgEqualTo(String value) {
            addCriterion("back_optional_four_img =", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgNotEqualTo(String value) {
            addCriterion("back_optional_four_img <>", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgGreaterThan(String value) {
            addCriterion("back_optional_four_img >", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgGreaterThanOrEqualTo(String value) {
            addCriterion("back_optional_four_img >=", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgLessThan(String value) {
            addCriterion("back_optional_four_img <", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgLessThanOrEqualTo(String value) {
            addCriterion("back_optional_four_img <=", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgLike(String value) {
            addCriterion("back_optional_four_img like", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgNotLike(String value) {
            addCriterion("back_optional_four_img not like", value, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgIn(List<String> values) {
            addCriterion("back_optional_four_img in", values, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgNotIn(List<String> values) {
            addCriterion("back_optional_four_img not in", values, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgBetween(String value1, String value2) {
            addCriterion("back_optional_four_img between", value1, value2, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andBackOptionalFourImgNotBetween(String value1, String value2) {
            addCriterion("back_optional_four_img not between", value1, value2, "backOptionalFourImg");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeIsNull() {
            addCriterion("optional_four_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeIsNotNull() {
            addCriterion("optional_four_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeEqualTo(Date value) {
            addCriterion("optional_four_failure_time =", value, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeNotEqualTo(Date value) {
            addCriterion("optional_four_failure_time <>", value, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeGreaterThan(Date value) {
            addCriterion("optional_four_failure_time >", value, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("optional_four_failure_time >=", value, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeLessThan(Date value) {
            addCriterion("optional_four_failure_time <", value, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("optional_four_failure_time <=", value, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeIn(List<Date> values) {
            addCriterion("optional_four_failure_time in", values, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeNotIn(List<Date> values) {
            addCriterion("optional_four_failure_time not in", values, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeBetween(Date value1, Date value2) {
            addCriterion("optional_four_failure_time between", value1, value2, "optionalFourFailureTime");
            return (Criteria) this;
        }

        public Criteria andOptionalFourFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("optional_four_failure_time not between", value1, value2, "optionalFourFailureTime");
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