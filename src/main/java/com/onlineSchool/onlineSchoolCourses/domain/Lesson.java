package com.onlineSchool.onlineSchoolCourses.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Lessons")
@Table(name = "lessons")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Long lessonOrder;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "progress_id", nullable = false)
    private Progress progress;

}
