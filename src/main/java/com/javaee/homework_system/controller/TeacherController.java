package com.javaee.homework_system.controller;

import com.javaee.homework_system.model.Homework;
import com.javaee.homework_system.model.SubmitHomework;
import com.javaee.homework_system.model.Teacher;
import com.javaee.homework_system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/6/17
 * Time: 15:14
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping()
    public String teacher(){
        return "teacher";
    }

    @GetMapping("/reviewHomework")
    public String findAll(Model model,HttpSession session){
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        List<SubmitHomework> lsh = teacherService.findAll(teacher);
        List<Homework> lh = teacherService.findAll2(teacher);
        model.addAttribute("lh",lh);
        model.addAttribute("lsh",lsh);
        return "reviewHomework";
    }

    @GetMapping("/setHomework")
    public String setHomework(){
        return "setHomework";
    }

    @PostMapping("/setHomework")
    public String createSetHomework(String title,String content,HttpSession session){
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        return teacherService.createSetHomework(teacher.getTeacherName(),title,content);
    }

}
