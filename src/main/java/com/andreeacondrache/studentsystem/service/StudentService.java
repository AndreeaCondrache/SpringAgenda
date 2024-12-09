package com.andreeacondrache.studentsystem.service;

import com.andreeacondrache.studentsystem.model.Student;

import java.util.List;
//Interfața care definește operațiile logice pentru manipularea datelor despre studenți.
public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}