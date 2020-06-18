package com.javaee.homework_system.dao;

import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.Student;
import com.javaee.homework_system.model.SubmitHomework;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/15
 * Time: 23:32
 */
@Repository
public interface StudentDAO {

    //查询所有作业
    List<SubmitHomework> findAll(Student student);

    //查看老师布置的作业
    List<Homework> listHomework();

    //获取作业
    Homework getHomework(Integer id);

    //修改提交作业
    void editHomework(SubmitHomework submitHomework);

    //查询提交作业
    SubmitHomework getSubmitHomework(@Param("id") Integer id,@Param("studentName")String studentName);

    //提交作业
    void createSubmit(SubmitHomework submitHomework);
}
