package com.spring.jparelations.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable("id")Long id){
        return teacherRepository.getById(id);
    }

    @PostMapping
    public void saveTeacher(@RequestBody Teacher teacher){
        teacherRepository.save(teacher);
    }


}
