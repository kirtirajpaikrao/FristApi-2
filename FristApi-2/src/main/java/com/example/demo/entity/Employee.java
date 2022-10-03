package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employee14")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private  Long id;
 private String Name;
 
 private String Email;
 
 private String Department;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Department=" + Department + ", getId()="
			+ getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getDepartment()="
			+ getDepartment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
 
}
