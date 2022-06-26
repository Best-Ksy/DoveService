package com.kj.dove.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;

/**
 * 注释用户表
 *
 * @author daksy
 * @date 2022-06-26 21:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，加密存储
     */
    private String password;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱
     */
    private String email;

    private Date created;

    private Date updated;
}
