package com.onlineSchool.onlineSchoolCourses.repositories;

import com.onlineSchool.onlineSchoolCourses.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByLogin(String login);
    User findUserRoleByLogin(String login);

}
