package com.proje.thymeleafapp.repositories;

import com.proje.thymeleafapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByDepartment(String department);

}
