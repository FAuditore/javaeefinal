package com.javaee.homework_system.service;

import com.javaee.homework_system.dao.TeacherDAO;
import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.SubmitHomework;
import com.javaee.homework_system.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/6/17
 * Time: 15:43
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDAO teacherDAO;

    @Override
    public List<SubmitHomework> findAll(Teacher teacher) {
        return teacherDAO.findAll(teacher);
    }

    @Override
    public List<Homework> findAll2(Teacher teacher) {
        return teacherDAO.findAll2(teacher);
    }

    @Override
    public String createSetHomework(String teacherName,String homeworkTitle, String homeworkContent) {
       Date now = new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String date=sdf.format(now);
       Homework homework = new Homework();
       homework.setTeacherName(teacherName).setHomeworkTitle(homeworkTitle).setCreateTime(date).setHomeworkContent(homeworkContent);
       teacherDAO.setHomework(homework);
       return "redirect:/teacher/";
    }
}
