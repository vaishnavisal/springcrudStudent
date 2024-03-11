package com.example.studentCRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentCRUD.entity.Student;
import com.example.studentCRUD.service.StudentService;

@RestController
@RequestMapping("/students")

public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}



	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}

	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
		return studentService.updateStudent(id, updatedStudent);
	}

}
