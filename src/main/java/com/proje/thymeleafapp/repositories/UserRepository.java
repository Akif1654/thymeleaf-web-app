package com.proje.thymeleafapp.repositories;

import com.proje.thymeleafapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
