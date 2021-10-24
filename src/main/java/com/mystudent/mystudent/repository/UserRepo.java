package com.mystudent.mystudent.repository;

import com.mystudent.mystudent.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user, Long> {
}
