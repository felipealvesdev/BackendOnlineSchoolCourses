package com.onlineSchool.onlineSchoolCourses.dtos;

import com.onlineSchool.onlineSchoolCourses.domain.User;

import java.util.List;

public record CourseDTO(Long id, String title, String description, String category, User instructor, List<Lesson> lessonList) {
}
