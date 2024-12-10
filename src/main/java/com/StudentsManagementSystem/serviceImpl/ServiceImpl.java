package com.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.service.StudentService;

@Service
public class ServiceImpl implements StudentService{
	
	@Autowired
	com.StudentsManagementSystem.repository.Studentrepository Studentrepository;

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list= Studentrepository.findAll ();
		
		return list;
	}
	
	public Student saveStudent(Student student) {
		return Studentrepository.save(student);
	}
	
	public Student getById(int id) {
		return Studentrepository.findById(id).get();
	}
	
	public void deleteById(int id) {
		Studentrepository.deleteById(id);
	}
	

}
