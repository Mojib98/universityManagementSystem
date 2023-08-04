package org.uni.barareh.service;

import org.uni.barareh.entity.Course;
import org.uni.barareh.entity.Person;

public interface EmployeeService<T extends Course> extends ServiceBase<Person>{
    Boolean addCourse(T t);
    Boolean findCourse(String id);
    Boolean updateCourse(T t);
    Boolean deleteCourse(T t);
}
