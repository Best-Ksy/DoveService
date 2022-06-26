package com.kj.dove.user.oauth2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName EncodingTest
 * @Description
 * @Author daksy
 * @Date 2022/6/25 17:19
 * @Version 1.0
 **/

public class EncodingTest {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }

}
