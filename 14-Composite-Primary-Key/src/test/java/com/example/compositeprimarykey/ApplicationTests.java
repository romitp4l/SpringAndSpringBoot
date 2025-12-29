package com.example.compositeprimarykey;

import com.example.compositeprimarykey.entity.StudentCourse;
import com.example.compositeprimarykey.entity.StudentCourseId;
import com.example.compositeprimarykey.repository.StudentCourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void saveCompositePrimarykeyData(){
        // create composite key
        StudentCourseId id = new StudentCourseId(1, "Java By AshokIt.");

        // creating entity
        StudentCourse course = new StudentCourse();
        course.setId(id);
        course.setGrade("A");
        course.setEnrollmentDate(LocalDate.now());


        studentCourseRepository.save(course);

    }


}
