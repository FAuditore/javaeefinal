package com.javaee.homework_system.service;

import com.javaee.homework_system.dao.StudentDAO;
import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.Student;
import com.javaee.homework_system.model.SubmitHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/6/17
 * Time: 16:37
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<SubmitHomework> findAll(Student student) {
        return studentDAO.findAll(student);
    }

    public List<Homework> listHomework() {
        return studentDAO.listHomework();
    }

    @Override
    public Homework getHomework(Integer id) {
        return studentDAO.getHomework(id);
    }

    @Override
    public void editHomework(Integer id, Student student, String homeworkContent, HttpSession session) {
        Homework homework=studentDAO.getHomework(id);
        SubmitHomework submitHomework=studentDAO.getSubmitHomework(id,student.getStudentName());
        Date now = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(now);
        submitHomework.setSubmitContent(homeworkContent).setSubmitTime(date);
        studentDAO.editHomework(submitHomework);
        session.setAttribute("message","edit success");
    }

    @Override
    public SubmitHomework getSubmitHomework(Integer id, String studentName) {

        return studentDAO.getSubmitHomework(id,studentName);
    }

    @Override
    public void createSubmit(Integer id, Student student, String homeworkContent, HttpSession session) {
        Homework homework=studentDAO.getHomework(id);
        SubmitHomework submitHomework = new SubmitHomework();
        Date now = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(now);
        submitHomework.setSubmitContent(homeworkContent).setSubmitTime(date).setHomeworkId(homework.getHomeworkId()).setHomeworkTitle(homework.getHomeworkTitle()).setStudentName(student.getStudentName()).setSubmitTime(date);
        studentDAO.createSubmit(submitHomework);
        session.setAttribute("message","submit success");
    }
}
