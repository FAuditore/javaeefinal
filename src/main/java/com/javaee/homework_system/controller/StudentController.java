package com.javaee.homework_system.controller;

import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.Student;
import com.javaee.homework_system.model.SubmitHomework;
import com.javaee.homework_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/6/17
 * Time: 15:15
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping()
    public String student(Model model, HttpSession session){
        Student student = (Student) session.getAttribute("student");
        List<SubmitHomework> lsh = studentService.findAll(student);
        List<Homework> lh = studentService.listHomework();
        model.addAttribute("lsh",lsh);
        model.addAttribute("lh",lh);
        return "student";
    }

    @GetMapping("/editHomework/{id}")
    public String getHomework(@PathVariable Integer id,Model model,HttpSession session){
        Student student= (Student) session.getAttribute("student");
        Homework homework=studentService.getHomework(id);
        SubmitHomework submitHomework = studentService.getSubmitHomework(id,student.getStudentName());
        if (submitHomework!=null){
            model.addAttribute("content",submitHomework.getSubmitContent());
        }
        model.addAttribute("homework",homework);
        return "editHomework";
    }

    @PostMapping("/editHomework/{id}")
    public String editHomework(@PathVariable Integer id,HttpSession session,String content){
        Student student= (Student) session.getAttribute("student");
        SubmitHomework submitHomework = studentService.getSubmitHomework(id,student.getStudentName());
        if (submitHomework!=null){
        studentService.editHomework(id,student,content,session);
        }else {
            studentService.createSubmit(id, student, content, session);
        }
        return "redirect:/student/";
    }
}
