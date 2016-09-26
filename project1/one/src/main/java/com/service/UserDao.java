package com.service;

import com.dao.UserMapper;
import com.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/9/26.
 */
@Component
public class UserDao {
@Resource
    UserMapper userMapper;
    public boolean check(User user){
        return userMapper.check(user)>0;
    }
}
