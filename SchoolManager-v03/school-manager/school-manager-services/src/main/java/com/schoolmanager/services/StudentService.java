package com.schoolmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolmanager.model.StudentModel;
import com.schoolmanager.repositories.StudentRepository;


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
