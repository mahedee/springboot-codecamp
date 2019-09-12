package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
	
}
