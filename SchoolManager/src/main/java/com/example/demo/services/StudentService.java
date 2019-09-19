package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<StudentModel> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public StudentModel saveStudentInfo(StudentModel studentModel) {
		return studentRepository.save(studentModel);
	}
	
	public StudentModel editStudentInfo(StudentModel studentModel) {
		return studentRepository.save(studentModel);
	}
	
	public void deleteStudentInfo(int id) {
		studentRepository.deleteById(id);
	}
}
