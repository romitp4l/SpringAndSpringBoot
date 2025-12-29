package com.example.compositeprimarykey.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class StudentCourseId  implements Serializable {

    private Integer studentId;
    private String courseId;
}
