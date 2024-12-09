package com.andreeacondrache.studentsystem.service;

import com.andreeacondrache.studentsystem.model.Student;
import com.andreeacondrache.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
//Implementarea concretă a interfeței StudentService,
//care utilizează StudentRepository pentru a interacționa cu baza de date.
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}