package com.chuxin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExtendExample() {
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalIsNull() {
            addCriterion("id_card_img_frontal is null");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalIsNotNull() {
            addCriterion("id_card_img_frontal is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalEqualTo(String value) {
            addCriterion("id_card_img_frontal =", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalNotEqualTo(String value) {
            addCriterion("id_card_img_frontal <>", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalGreaterThan(String value) {
            addCriterion("id_card_img_frontal >", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_img_frontal >=", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalLessThan(String value) {
            addCriterion("id_card_img_frontal <", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalLessThanOrEqualTo(String value) {
            addCriterion("id_card_img_frontal <=", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalLike(String value) {
            addCriterion("id_card_img_frontal like", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalNotLike(String value) {
            addCriterion("id_card_img_frontal not like", value, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalIn(List<String> values) {
            addCriterion("id_card_img_frontal in", values, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalNotIn(List<String> values) {
            addCriterion("id_card_img_frontal not in", values, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalBetween(String value1, String value2) {
            addCriterion("id_card_img_frontal between", value1, value2, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgFrontalNotBetween(String value1, String value2) {
            addCriterion("id_card_img_frontal not between", value1, value2, "idCardImgFrontal");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackIsNull() {
            addCriterion("id_card_img_back is null");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackIsNotNull() {
            addCriterion("id_card_img_back is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackEqualTo(String value) {
            addCriterion("id_card_img_back =", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackNotEqualTo(String value) {
            addCriterion("id_card_img_back <>", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackGreaterThan(String value) {
            addCriterion("id_card_img_back >", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_img_back >=", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackLessThan(String value) {
            addCriterion("id_card_img_back <", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackLessThanOrEqualTo(String value) {
            addCriterion("id_card_img_back <=", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackLike(String value) {
            addCriterion("id_card_img_back like", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackNotLike(String value) {
            addCriterion("id_card_img_back not like", value, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackIn(List<String> values) {
            addCriterion("id_card_img_back in", values, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackNotIn(List<String> values) {
            addCriterion("id_card_img_back not in", values, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackBetween(String value1, String value2) {
            addCriterion("id_card_img_back between", value1, value2, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andIdCardImgBackNotBetween(String value1, String value2) {
            addCriterion("id_card_img_back not between", value1, value2, "idCardImgBack");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalIsNull() {
            addCriterion("certificate_img_frontal is null");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalIsNotNull() {
            addCriterion("certificate_img_frontal is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalEqualTo(String value) {
            addCriterion("certificate_img_frontal =", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalNotEqualTo(String value) {
            addCriterion("certificate_img_frontal <>", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalGreaterThan(String value) {
            addCriterion("certificate_img_frontal >", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_img_frontal >=", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalLessThan(String value) {
            addCriterion("certificate_img_frontal <", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalLessThanOrEqualTo(String value) {
            addCriterion("certificate_img_frontal <=", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalLike(String value) {
            addCriterion("certificate_img_frontal like", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalNotLike(String value) {
            addCriterion("certificate_img_frontal not like", value, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalIn(List<String> values) {
            addCriterion("certificate_img_frontal in", values, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalNotIn(List<String> values) {
            addCriterion("certificate_img_frontal not in", values, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalBetween(String value1, String value2) {
            addCriterion("certificate_img_frontal between", value1, value2, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgFrontalNotBetween(String value1, String value2) {
            addCriterion("certificate_img_frontal not between", value1, value2, "certificateImgFrontal");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackIsNull() {
            addCriterion("certificate_img_back is null");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackIsNotNull() {
            addCriterion("certificate_img_back is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackEqualTo(String value) {
            addCriterion("certificate_img_back =", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackNotEqualTo(String value) {
            addCriterion("certificate_img_back <>", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackGreaterThan(String value) {
            addCriterion("certificate_img_back >", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_img_back >=", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackLessThan(String value) {
            addCriterion("certificate_img_back <", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackLessThanOrEqualTo(String value) {
            addCriterion("certificate_img_back <=", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackLike(String value) {
            addCriterion("certificate_img_back like", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackNotLike(String value) {
            addCriterion("certificate_img_back not like", value, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackIn(List<String> values) {
            addCriterion("certificate_img_back in", values, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackNotIn(List<String> values) {
            addCriterion("certificate_img_back not in", values, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackBetween(String value1, String value2) {
            addCriterion("certificate_img_back between", value1, value2, "certificateImgBack");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBackNotBetween(String value1, String value2) {
            addCriterion("certificate_img_back not between", value1, value2, "certificateImgBack");
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdIsNull() {
            addCriterion("driving_license_id is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdIsNotNull() {
            addCriterion("driving_license_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdEqualTo(String value) {
            addCriterion("driving_license_id =", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdNotEqualTo(String value) {
            addCriterion("driving_license_id <>", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdGreaterThan(String value) {
            addCriterion("driving_license_id >", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_id >=", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdLessThan(String value) {
            addCriterion("driving_license_id <", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdLessThanOrEqualTo(String value) {
            addCriterion("driving_license_id <=", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdLike(String value) {
            addCriterion("driving_license_id like", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdNotLike(String value) {
            addCriterion("driving_license_id not like", value, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdIn(List<String> values) {
            addCriterion("driving_license_id in", values, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdNotIn(List<String> values) {
            addCriterion("driving_license_id not in", values, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdBetween(String value1, String value2) {
            addCriterion("driving_license_id between", value1, value2, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIdNotBetween(String value1, String value2) {
            addCriterion("driving_license_id not between", value1, value2, "drivingLicenseId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalIsNull() {
            addCriterion("driving_license_img_frontal is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalIsNotNull() {
            addCriterion("driving_license_img_frontal is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalEqualTo(String value) {
            addCriterion("driving_license_img_frontal =", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalNotEqualTo(String value) {
            addCriterion("driving_license_img_frontal <>", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalGreaterThan(String value) {
            addCriterion("driving_license_img_frontal >", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_img_frontal >=", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalLessThan(String value) {
            addCriterion("driving_license_img_frontal <", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalLessThanOrEqualTo(String value) {
            addCriterion("driving_license_img_frontal <=", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalLike(String value) {
            addCriterion("driving_license_img_frontal like", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalNotLike(String value) {
            addCriterion("driving_license_img_frontal not like", value, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalIn(List<String> values) {
            addCriterion("driving_license_img_frontal in", values, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalNotIn(List<String> values) {
            addCriterion("driving_license_img_frontal not in", values, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalBetween(String value1, String value2) {
            addCriterion("driving_license_img_frontal between", value1, value2, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgFrontalNotBetween(String value1, String value2) {
            addCriterion("driving_license_img_frontal not between", value1, value2, "drivingLicenseImgFrontal");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackIsNull() {
            addCriterion("driving_license_img_back is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackIsNotNull() {
            addCriterion("driving_license_img_back is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackEqualTo(String value) {
            addCriterion("driving_license_img_back =", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackNotEqualTo(String value) {
            addCriterion("driving_license_img_back <>", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackGreaterThan(String value) {
            addCriterion("driving_license_img_back >", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_img_back >=", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackLessThan(String value) {
            addCriterion("driving_license_img_back <", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackLessThanOrEqualTo(String value) {
            addCriterion("driving_license_img_back <=", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackLike(String value) {
            addCriterion("driving_license_img_back like", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackNotLike(String value) {
            addCriterion("driving_license_img_back not like", value, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackIn(List<String> values) {
            addCriterion("driving_license_img_back in", values, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackNotIn(List<String> values) {
            addCriterion("driving_license_img_back not in", values, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackBetween(String value1, String value2) {
            addCriterion("driving_license_img_back between", value1, value2, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseImgBackNotBetween(String value1, String value2) {
            addCriterion("driving_license_img_back not between", value1, value2, "drivingLicenseImgBack");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeIsNull() {
            addCriterion("driving_license_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeIsNotNull() {
            addCriterion("driving_license_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_start_time =", value, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_start_time <>", value, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("driving_license_start_time >", value, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_start_time >=", value, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("driving_license_start_time <", value, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_start_time <=", value, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license_start_time in", values, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license_start_time not in", values, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license_start_time between", value1, value2, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license_start_time not between", value1, value2, "drivingLicenseStartTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeIsNull() {
            addCriterion("driving_license_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeIsNotNull() {
            addCriterion("driving_license_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_end_time =", value, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_end_time <>", value, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("driving_license_end_time >", value, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_end_time >=", value, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("driving_license_end_time <", value, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_end_time <=", value, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license_end_time in", values, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license_end_time not in", values, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license_end_time between", value1, value2, "drivingLicenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license_end_time not between", value1, value2, "drivingLicenseEndTime");
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