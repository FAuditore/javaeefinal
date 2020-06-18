package com.javaee.homework_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

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
public class SubmitHomework {
    private int submitHomeworkId;
    private int homeworkId;
    private String homeworkTitle;
    private String studentName;
    private String submitContent;
    private String submitTime;
}
