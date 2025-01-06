package com.onlineSchool.onlineSchoolCourses.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "courses")
@Table(name = "courses")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String category;

    private User instructor;

    private List<Lesson> lessonList;

}
