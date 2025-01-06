package com.onlineSchool.onlineSchoolCourses.repositories;

import com.onlineSchool.onlineSchoolCourses.domain.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
}
