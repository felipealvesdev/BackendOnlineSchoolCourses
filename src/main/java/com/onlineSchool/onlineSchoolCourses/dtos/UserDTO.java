package com.onlineSchool.onlineSchoolCourses.dtos;

import com.onlineSchool.onlineSchoolCourses.domain.enums.UserRole;

public record UserDTO(Long id, String email, String password, UserRole userRole) {
}
