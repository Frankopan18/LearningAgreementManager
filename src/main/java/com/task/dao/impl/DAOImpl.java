package com.task.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.task.dao.DAO;
import com.task.entity.users.Student;

@Repository("dao")
public class DAOImpl implements DAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int createStudent(Student student) {
		int result = (Integer) hibernateTemplate.save(student);
		return result;
	}

	@Transactional
	public Student getStudentByEmail(String email) {
		List<Student> students = hibernateTemplate.loadAll(Student.class);
		for (Student student : students) {
			if (student.getEmail().equals(email)) {
				return student;
			}
		}
		return null;
	}
}
