package com.controller;

import com.entity.User;
import com.service.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/9/26.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserDao userDao;
    @RequestMapping("/add")
    public String  add(User user,HttpSession session){
        String path = "/welcome.jsp";
        System.out.println("姓名:"+user.getUsername());
        if(userDao.check(user)){
            path = "/one.jsp";
            session.setAttribute("user", user);
        }
        return path;
    }

}
