package com.javaee.homework_system.dao;

import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.SubmitHomework;
import com.javaee.homework_system.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/15
 * Time: 23:32
 */
@Repository
public interface TeacherDAO {

    //查询所有学生作业
    List<SubmitHomework> findAll(Teacher teacher);

    //查询所有布置的作业
    List<Homework> findAll2(Teacher teacher);

    //布置作业
    void setHomework(Homework homework);
}
