package com.schoolmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolmanager.model.StudentModel;


public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
	
}
