package com.onlineSchool.onlineSchoolCourses.domain.enums;

public enum ProgressStatus {

    COMPLETED("completed"),
    IN_PROGRESS("in_progress");

    private final String progress;

    ProgressStatus(String progress) {
        this.progress = progress;
    }

    public String getProgress() {
        return this.progress;
    }
}
