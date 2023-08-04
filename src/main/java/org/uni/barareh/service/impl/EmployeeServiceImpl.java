package org.uni.barareh.service.impl;

import org.uni.barareh.entity.*;
import org.uni.barareh.service.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {
    Set<Course> course;
    Set<Student> students;
    Set<Professor> professors;
    Set<Employee> employees;

    public EmployeeServiceImpl(Set<Course> course, Set<Student> students, Set<Professor> professors, Set<Employee> employees) {
        this.course = course;
        this.students = students;
        this.professors = professors;
        this.employees = employees;
    }

    @Override
    public Boolean addCourse(Course course) {
        return null;
    }

    @Override
    public Boolean findCourse(String id) {
        return null;
    }

    @Override
    public Boolean updateCourse(Course course) {
        return null;
    }

    @Override
    public Boolean deleteCourse(Course course) {
        return null;
    }

    /**
     * تقدم و تاخر در دیدن اینکه کلاس از چه نوعی باشد مهم است مخصوصا برای کارمند و استاد
     * */
    @Override
    public Boolean add(Person person) {
        try {
            if (person instanceof Professor professor)
                professors.add(professor);
            else if (person instanceof Employee employee)
                employees.add(employee);
            else if (person instanceof Student student)
                students.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Person find(String id) {
        return null;
    }

    @Override
    public Boolean delete(Person person) {
        return null;
    }

    @Override
    public Boolean update(Person person) {
        return null;
    }
}
