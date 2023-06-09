package org.barareh.entity;

import org.barareh.entity.enumeration.StudentType;

import java.util.Date;
public  class Student extends Person{
    private String studentCode;
    private String major;
    private Date RegisterDate;
    private StudentType studentType;

}
