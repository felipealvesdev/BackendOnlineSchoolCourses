package com.onlineSchool.onlineSchoolCourses.dtos;

import com.onlineSchool.onlineSchoolCourses.domain.Course;

public record LessonDTO(Long id, String title, String content, Long order, Course course) {
}
