package com.example.compositeprimarykey.repository;

import com.example.compositeprimarykey.entity.StudentCourse;
import com.example.compositeprimarykey.entity.StudentCourseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository  extends JpaRepository<StudentCourse, StudentCourseId> {
}
