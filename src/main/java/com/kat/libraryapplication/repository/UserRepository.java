package com.kat.libraryapplication.repository;

import com.kat.libraryapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
