package com.example.student.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path="student")
public class StudentController {

    public final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return this.studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
    @DeleteMapping
    public void deleteExtStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }
    @RequestMapping(path="{id}")
    public void deleteStudent(@PathVariable("id") Long id){
    studentService.deleteStudentByPath(id);
    }

}
