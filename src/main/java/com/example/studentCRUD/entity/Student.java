package com.example.studentCRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String name;
	private int age;
	private int marks;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getMarks()=" + getMarks() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Student(Long id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
