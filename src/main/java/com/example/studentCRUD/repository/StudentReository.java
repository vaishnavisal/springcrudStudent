package com.example.studentCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentCRUD.entity.Student;

@Repository
public interface StudentReository extends JpaRepository<Student, Integer>{

}
