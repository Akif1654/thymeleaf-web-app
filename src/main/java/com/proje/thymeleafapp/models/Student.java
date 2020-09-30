package com.proje.thymeleafapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer Id;

    @Column
    private String name;

    @Column
    private String department;

    @Column
    private String updatedBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column
    private Date updatedOn;

    public Student() {

    }

    public Student(Integer id, String name, String department, String updatedBy, Date updatedOn) {
        Id = id;
        this.name = name;
        this.department = department;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
