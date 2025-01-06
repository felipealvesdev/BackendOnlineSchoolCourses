package com.onlineSchool.onlineSchoolCourses.dtos;

import com.onlineSchool.onlineSchoolCourses.domain.Lesson;
import com.onlineSchool.onlineSchoolCourses.domain.User;
import com.onlineSchool.onlineSchoolCourses.domain.enums.ProgressStatus;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

public record ProgressDTO(Long id, User student, List<Lesson> lessonList, ProgressStatus progressStatus, LocalDateTime startedAt, LocalDateTime finishedAt) {
}
