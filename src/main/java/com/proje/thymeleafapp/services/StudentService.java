package com.proje.thymeleafapp.services;

import com.proje.thymeleafapp.models.Student;
import com.proje.thymeleafapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> getOne(Integer id) {
        return studentRepository.findById(id);
    }

    public List<Student> getAllByDepartment(String department) {
        return studentRepository.findAllByDepartment(department);
    }

    public void addNew(Student student) {
        studentRepository.save(student);
    }

    public void update(Student student) {
        studentRepository.save(student);
    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
