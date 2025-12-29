package com.example._3assignmentjacksonlibrary;

import com.example._3assignmentjacksonlibrary.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Application {

    public static void main(String[] args)  throws Exception {
        SpringApplication.run(Application.class, args);


        Student student = new Student();
        student.setStudent_id("201");
        student.setFirst_name("John");
        student.setLast_name("Doe");
        student.setMobile_number("123456789");
        student.setEmail("abc@gmail.com");


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("student.json"),student);


        System.out.println("student.json has been saved");


        ObjectMapper objectMapper1 = new ObjectMapper();
        objectMapper1.readValue(new File("student.json"),Student.class);
        System.out.println(student.toString());



    }

}
