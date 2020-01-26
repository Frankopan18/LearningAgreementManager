package com.task.entity.others;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOfCourse;
	private String courseName;
	private String semesterType;
	private int numOfECTS;

	public Long getIdOfCourse() {
		return idOfCourse;
	}

	public void setIdOfCourse(Long idOfCourse) {
		this.idOfCourse = idOfCourse;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSemesterType() {
		return semesterType;
	}

	public void setSemesterType(String semesterType) {
		this.semesterType = semesterType;
	}

	public int getNumOfECTS() {
		return numOfECTS;
	}

	public void setNumOfECTS(int numOfECTS) {
		this.numOfECTS = numOfECTS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((idOfCourse == null) ? 0 : idOfCourse.hashCode());
		result = prime * result + numOfECTS;
		result = prime * result + ((semesterType == null) ? 0 : semesterType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (idOfCourse == null) {
			if (other.idOfCourse != null)
				return false;
		} else if (!idOfCourse.equals(other.idOfCourse))
			return false;
		if (numOfECTS != other.numOfECTS)
			return false;
		if (semesterType == null) {
			if (other.semesterType != null)
				return false;
		} else if (!semesterType.equals(other.semesterType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [idOfCourse=" + idOfCourse + ", courseName=" + courseName + ", semesterType=" + semesterType
				+ ", numOfECTS=" + numOfECTS + "]";
	}

}
