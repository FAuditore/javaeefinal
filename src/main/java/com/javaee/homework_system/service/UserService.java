package com.javaee.homework_system.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/6/17
 * Time: 12:47
 */
public interface UserService {

    String login(String username, String password, int usertype, HttpSession session);
    String register(int userId, String username, String password, int usertype,HttpSession session);
}
