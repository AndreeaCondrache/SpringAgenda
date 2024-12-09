package com.andreeacondrache.studentsystem.controler;
import com.andreeacondrache.studentsystem.model.Student;
import com.andreeacondrache.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//gestionează cererile HTTP pentru operațiile legate de studenți.
//Interacționează cu serviciul pentru a efectua operațiile necesare.
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentControler {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Ați adăugat un student nou.";
    }

    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }
}