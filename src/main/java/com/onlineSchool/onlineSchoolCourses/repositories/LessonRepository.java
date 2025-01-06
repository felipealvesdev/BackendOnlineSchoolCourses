package com.onlineSchool.onlineSchoolCourses.repositories;

import com.onlineSchool.onlineSchoolCourses.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
