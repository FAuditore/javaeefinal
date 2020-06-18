package com.javaee.homework_system.controller;


import com.javaee.homework_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/15
 * Time: 23:33
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello(){
        return "redirect:/login";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String createLogin(String username, String password, int usertype, HttpSession session){
        session.removeAttribute("message");
        session.removeAttribute("teacher");
        session.removeAttribute("student");
        return userService.login(username,password,usertype,session);
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String createRegister(Integer userid,String username,String password,int usertype,HttpSession session){
        return userService.register(userid,username,password,usertype,session);
    }

}
