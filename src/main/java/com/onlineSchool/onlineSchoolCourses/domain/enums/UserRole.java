package com.onlineSchool.onlineSchoolCourses.domain.enums;

public enum UserRole {

    INSTRUCTOR("instructor"),
    STUDENT("student");

    private final String role;
    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
