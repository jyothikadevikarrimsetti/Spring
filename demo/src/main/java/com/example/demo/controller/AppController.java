package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.CourseRepo;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AppController {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    CourseRepo courseRepo;
    @GetMapping("addStudent")
    public void addStudent(@RequestParam("name") String studentName, @RequestParam("id") int id){
        Course course = courseRepo.findById(id).orElse(null);
        Student student = Student.builder().studentName(studentName).course(course).build();
        studentRepo.save(student);
    }

    @GetMapping("allStudents")
    public List<Student> allStudents(){
        return   studentRepo.findAll();
    }

    @GetMapping("getStudent")
    public Student getStudent(@RequestParam int id){
        Student student = studentRepo.findById(id).orElse(null);
        return student;
    }

//    @GetMapping("listStuds")
//    public List<String> studentList(){
////        return studentRepo.selectColumnStudent();
//    }

}
