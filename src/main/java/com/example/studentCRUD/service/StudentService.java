package com.example.studentCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentCRUD.entity.Student;
import com.example.studentCRUD.repository.StudentReository;

@Service
public class StudentService {
	
	  @Autowired
	     private StudentReository studentRepository;
	  
	  
	  public Student addStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    public Optional<Student> getStudentById(int id) {
	        return studentRepository.findById(id);
	    }

	    

	    public void deleteStudent(int id) {
	        studentRepository.deleteById(id);
	    }

	    public Student updateStudent(int id, Student updatedStudent) {
	        Student existingStudent = studentRepository.findById(id).orElse(updatedStudent);
	        if (existingStudent != null) {
	        	
	            existingStudent.setId(updatedStudent.getId());
	            existingStudent.setName(updatedStudent.getName());
	            existingStudent.setAge(updatedStudent.getAge());
	            existingStudent.setMarks(updatedStudent.getMarks());

	            return studentRepository.save(existingStudent);
	        }
	        return updateStudent(id ,updatedStudent);
	    }

}
