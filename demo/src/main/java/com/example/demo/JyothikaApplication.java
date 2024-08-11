package com.example.demo;

import com.example.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JyothikaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JyothikaApplication.class, args);
		StudentService service = context.getBean(StudentService.class);
//		service.addCourse("ECE");
//		service.addCourse("MECH");
	}


}
