package com.javaee.homework_system.service;

import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.Student;
import com.javaee.homework_system.model.SubmitHomework;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/15
 * Time: 23:28
 */
public interface StudentService {
    //查询该学生所交的作业
    List<SubmitHomework> findAll(Student student);
    //查询老师布置的作业
    List<Homework> listHomework();
    //查看作业
    Homework getHomework(Integer id);
    //修改作业
    void editHomework(Integer id, Student student, String homeworkContent, HttpSession session);
    //获取提交的作业
    SubmitHomework getSubmitHomework(Integer id,String studentName);
    //创建提交
    void createSubmit(Integer id, Student student, String homeworkContent, HttpSession session);
}
