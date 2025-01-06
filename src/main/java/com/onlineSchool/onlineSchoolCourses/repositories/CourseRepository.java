package com.onlineSchool.onlineSchoolCourses.repositories;

import com.onlineSchool.onlineSchoolCourses.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
