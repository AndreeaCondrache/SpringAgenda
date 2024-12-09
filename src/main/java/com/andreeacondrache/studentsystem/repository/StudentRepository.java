package com.andreeacondrache.studentsystem.repository;

import com.andreeacondrache.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Interfață care extinde JpaRepository și definește operațiile de bază pentru accesul la datele din baza de date.
//Metode precum save, findById, delete, etc
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}