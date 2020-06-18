package com.javaee.homework_system.dao;


import com.javaee.homework_system.model.Student;
import com.javaee.homework_system.model.Teacher;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/17
 * Time: 10:34
 */
@Repository
public interface UserDAO {

    //获取学生对象
    Student findStudent(String username, String password);

    //获取教师对象
    Teacher findTeacher(String username, String password);

    //添加学生
    void addStudent(Student student);

    //添加老师
    void addTeacher(Teacher teacher);
}
