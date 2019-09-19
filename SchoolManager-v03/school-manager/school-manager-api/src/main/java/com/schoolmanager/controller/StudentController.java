package com.schoolmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.schoolmanager.model.StudentModel;
import com.schoolmanager.services.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudents")
	public String getStudents()
	{
		List<StudentModel> studentModelList = studentService.getAllStudents();
		System.out.println(studentModelList.size());
		
		for (StudentModel student : studentService.getAllStudents()) {
			System.out.println(student.getName());
		}	
		return "OK";
	}
	
	
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public StudentModel saveStudent(@RequestBody StudentModel studentModel) {
		StudentModel student =  studentService.saveStudentInfo(studentModel);
		System.out.println(student.getName() + "  " + student.getStudentNo());
		return student;
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public StudentModel editStudent(@RequestBody StudentModel studentModel) {
		StudentModel student =  studentService.editStudentInfo(studentModel);
		System.out.println(student.getName() + "  " + student.getStudentNo());
		return student;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void editStudent(@PathVariable int id) {
		studentService.deleteStudentInfo(id);
		System.out.println("Delete successfully!");
		//System.out.println(student.getName() + "  " + student.getStudentNo());
		//return student;
	}
	
	
}
