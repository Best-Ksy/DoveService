package com.kj.dove.user.oauth2;

import com.kj.dove.model.dao.UserInfoMapper;
import com.kj.dove.model.entity.UserInfo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName Test
 * @Description
 * @Author daksy
 * @Date 2022/6/25 18:03
 * @Version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @org.junit.Test
    public  void test1(){
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        System.out.println(userInfos.size());
    }

}
