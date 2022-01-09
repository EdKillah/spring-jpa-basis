package com.spring.jparelations.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id")Long id){
        return studentRepository.getById(id);
    }

    @PostMapping
    public void saveStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

}
