package com.javaee.homework_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by IntelliJ IDEA.
 * User.xml: FAuditore
 * Date: 2020/6/15
 * Time: 23:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Teacher {
    private int teacherId;
    private String password;
    private String teacherName;

    public Teacher(String teacherName,String password){
        this.password=password;
        this.teacherName=teacherName;
    }
}
