package com.kj.dove.model.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;

/**
 * 注释
 *
 * @author daksy
 * @date 2022-06-25 17:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户自增主键
     */
    @Id
    private Integer id;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 用户真实姓名
     */
    private String userName;

    /**
     * 用户手机号
     */
    private String userPhoneNum;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户头像
     */
    private String userCoverView;

    /**
     * 用户简介
     */
    private String userDesc;

    /**
     * 用户登陆密码
     */
    private String userPassword;

    /**
     * 用户微信
     */
    private String userWechat;

    /**
     * 用户qq
     */
    private String userQq;
}
