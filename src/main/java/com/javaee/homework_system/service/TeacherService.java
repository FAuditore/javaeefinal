package com.javaee.homework_system.service;

import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.SubmitHomework;
import com.javaee.homework_system.model.Teacher;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/15
 * Time: 23:28
 */
public interface TeacherService {

    //查询学生作业
    List<SubmitHomework> findAll(Teacher teacher);
    //查询所有布置的作业
    List<Homework> findAll2(Teacher teacher);
    //布置作业
    String createSetHomework(String teacherName,String homeworkTitle, String homeworkContent);
}
