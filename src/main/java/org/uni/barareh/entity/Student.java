package org.uni.barareh.entity;

import org.uni.barareh.entity.enumeration.StudentType;

import java.util.Date;
public  class Student extends Person{
    private String studentCode;
    private String major;
    private Date RegisterDate;
    private StudentType studentType;

}
