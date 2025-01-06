package com.onlineSchool.onlineSchoolCourses.repositories;

import com.onlineSchool.onlineSchoolCourses.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
