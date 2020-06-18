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
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Student {
    private int studentId;
    private String password;
    private String studentName;
}
