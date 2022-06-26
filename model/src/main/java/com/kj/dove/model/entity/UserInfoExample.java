package com.kj.dove.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
* 注释 Example
*
* @author daksy
* @date 2022-06-25 17:58
*/
public class UserInfoExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNull() {
            addCriterion("USER_NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNotNull() {
            addCriterion("USER_NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameEqualTo(String value) {
            addCriterion("USER_NICK_NAME =", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotEqualTo(String value) {
            addCriterion("USER_NICK_NAME <>", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThan(String value) {
            addCriterion("USER_NICK_NAME >", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NICK_NAME >=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThan(String value) {
            addCriterion("USER_NICK_NAME <", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NICK_NAME <=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLike(String value) {
            addCriterion("USER_NICK_NAME like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotLike(String value) {
            addCriterion("USER_NICK_NAME not like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIn(List<String> values) {
            addCriterion("USER_NICK_NAME in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotIn(List<String> values) {
            addCriterion("USER_NICK_NAME not in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameBetween(String value1, String value2) {
            addCriterion("USER_NICK_NAME between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotBetween(String value1, String value2) {
            addCriterion("USER_NICK_NAME not between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIsNull() {
            addCriterion("USER_PHONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIsNotNull() {
            addCriterion("USER_PHONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumEqualTo(String value) {
            addCriterion("USER_PHONE_NUM =", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotEqualTo(String value) {
            addCriterion("USER_PHONE_NUM <>", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumGreaterThan(String value) {
            addCriterion("USER_PHONE_NUM >", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PHONE_NUM >=", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLessThan(String value) {
            addCriterion("USER_PHONE_NUM <", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("USER_PHONE_NUM <=", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLike(String value) {
            addCriterion("USER_PHONE_NUM like", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotLike(String value) {
            addCriterion("USER_PHONE_NUM not like", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIn(List<String> values) {
            addCriterion("USER_PHONE_NUM in", values, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotIn(List<String> values) {
            addCriterion("USER_PHONE_NUM not in", values, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumBetween(String value1, String value2) {
            addCriterion("USER_PHONE_NUM between", value1, value2, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotBetween(String value1, String value2) {
            addCriterion("USER_PHONE_NUM not between", value1, value2, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("USER_EMAIL like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewIsNull() {
            addCriterion("USER_COVER_VIEW is null");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewIsNotNull() {
            addCriterion("USER_COVER_VIEW is not null");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewEqualTo(String value) {
            addCriterion("USER_COVER_VIEW =", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewNotEqualTo(String value) {
            addCriterion("USER_COVER_VIEW <>", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewGreaterThan(String value) {
            addCriterion("USER_COVER_VIEW >", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewGreaterThanOrEqualTo(String value) {
            addCriterion("USER_COVER_VIEW >=", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewLessThan(String value) {
            addCriterion("USER_COVER_VIEW <", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewLessThanOrEqualTo(String value) {
            addCriterion("USER_COVER_VIEW <=", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewLike(String value) {
            addCriterion("USER_COVER_VIEW like", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewNotLike(String value) {
            addCriterion("USER_COVER_VIEW not like", value, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewIn(List<String> values) {
            addCriterion("USER_COVER_VIEW in", values, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewNotIn(List<String> values) {
            addCriterion("USER_COVER_VIEW not in", values, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewBetween(String value1, String value2) {
            addCriterion("USER_COVER_VIEW between", value1, value2, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserCoverViewNotBetween(String value1, String value2) {
            addCriterion("USER_COVER_VIEW not between", value1, value2, "userCoverView");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNull() {
            addCriterion("USER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNotNull() {
            addCriterion("USER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescEqualTo(String value) {
            addCriterion("USER_DESC =", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotEqualTo(String value) {
            addCriterion("USER_DESC <>", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThan(String value) {
            addCriterion("USER_DESC >", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DESC >=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThan(String value) {
            addCriterion("USER_DESC <", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThanOrEqualTo(String value) {
            addCriterion("USER_DESC <=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLike(String value) {
            addCriterion("USER_DESC like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotLike(String value) {
            addCriterion("USER_DESC not like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescIn(List<String> values) {
            addCriterion("USER_DESC in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotIn(List<String> values) {
            addCriterion("USER_DESC not in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescBetween(String value1, String value2) {
            addCriterion("USER_DESC between", value1, value2, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotBetween(String value1, String value2) {
            addCriterion("USER_DESC not between", value1, value2, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("USER_WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("USER_WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("USER_WECHAT =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("USER_WECHAT <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("USER_WECHAT >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WECHAT >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("USER_WECHAT <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("USER_WECHAT <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("USER_WECHAT like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("USER_WECHAT not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("USER_WECHAT in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("USER_WECHAT not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("USER_WECHAT between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("USER_WECHAT not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("USER_QQ is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("USER_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(String value) {
            addCriterion("USER_QQ =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(String value) {
            addCriterion("USER_QQ <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(String value) {
            addCriterion("USER_QQ >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("USER_QQ >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(String value) {
            addCriterion("USER_QQ <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(String value) {
            addCriterion("USER_QQ <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLike(String value) {
            addCriterion("USER_QQ like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotLike(String value) {
            addCriterion("USER_QQ not like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<String> values) {
            addCriterion("USER_QQ in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<String> values) {
            addCriterion("USER_QQ not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(String value1, String value2) {
            addCriterion("USER_QQ between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(String value1, String value2) {
            addCriterion("USER_QQ not between", value1, value2, "userQq");
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
