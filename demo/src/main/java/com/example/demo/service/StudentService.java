package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    CourseRepo courseRepo;

    public void addCourse(String courseName){
        Course course = Course.builder().courseName(courseName).build();
        courseRepo.save(course);
    }
}
