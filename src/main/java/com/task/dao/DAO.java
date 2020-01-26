package com.task.dao;

import com.task.entity.users.Student;

public interface DAO {
	
	int createStudent(Student student);
	
	Student getStudentByEmail(String email);

}
