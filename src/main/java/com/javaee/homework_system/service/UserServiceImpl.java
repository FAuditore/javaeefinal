package com.javaee.homework_system.service;


import com.javaee.homework_system.dao.UserDAO;
import com.javaee.homework_system.model.Student;
import com.javaee.homework_system.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/17
 * Time: 10:30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public String login(String username, String password, int usertype, HttpSession session) {
        if (usertype==1){
            Student student= userDAO.findStudent(username,password);
            if (student!=null){
                session.setAttribute("student",student);
                return "redirect:/student/";
            }
        } else {
            Teacher teacher = userDAO.findTeacher(username, password);
            if (teacher!=null){
                session.setAttribute("teacher",teacher);
                return "redirect:/teacher/";
            }
        }
            return "redirect:/";

    }

    public String  register(int userid,String username, String password, int usertype,HttpSession session) {
            if (usertype==1) {
                userDAO.addStudent(new Student(userid,password,username));
            }else {
                userDAO.addTeacher(new Teacher(userid, password, username));
            }
            session.setAttribute("message","Register success");
        return "redirect:/";
    }
}
