package com.app.authLogin.repository;

import com.app.authLogin.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
