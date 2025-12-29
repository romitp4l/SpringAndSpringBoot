package com.example.compositeprimarykey.entity;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_course")
public class StudentCourse {

    @EmbeddedId
    private StudentCourseId id;
    private LocalDate enrollmentDate;
    private String grade;
}
