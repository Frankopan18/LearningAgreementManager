package com.task.entity.users;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStudent;
	private String firstName;
	private String lastName;
	// hash of password is stored in a SQL table --> hashcode()
	private int studentPassword;
	private String email;
	private LocalDate dateOfBirth;
	private String nationality;
	private String sex;
	private String studyCycle;
	private String fieldOfEducation;
	private String semesterType; // --> can be autumn/spring
	// dodaj 6 polja jos
	private String universityName;
	private String FacultyorDepartment;
	private String ErasmusCode;
	private String facultyAddress;
	private String country;
	private String contactPersonInfo;

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(int studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStudyCycle() {
		return studyCycle;
	}

	public void setStudyCycle(String studyCycle) {
		this.studyCycle = studyCycle;
	}

	public String getFieldOfEducation() {
		return fieldOfEducation;
	}

	public void setFieldOfEducation(String fieldOfEducation) {
		this.fieldOfEducation = fieldOfEducation;
	}

	public String getSemesterType() {
		return semesterType;
	}

	public void setSemesterType(String semesterType) {
		this.semesterType = semesterType;
	}

	public String getFacultyorDepartment() {
		return FacultyorDepartment;
	}

	public void setFacultyorDepartment(String facultyorDepartment) {
		FacultyorDepartment = facultyorDepartment;
	}

	public String getErasmusCode() {
		return ErasmusCode;
	}

	public void setErasmusCode(String erasmusCode) {
		ErasmusCode = erasmusCode;
	}

	public String getFacultyAddress() {
		return facultyAddress;
	}

	public void setFacultyAddress(String facultyAddress) {
		this.facultyAddress = facultyAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContactPersonInfo() {
		return contactPersonInfo;
	}

	public void setContactPersonInfo(String contactPersonInfo) {
		this.contactPersonInfo = contactPersonInfo;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ErasmusCode == null) ? 0 : ErasmusCode.hashCode());
		result = prime * result + ((FacultyorDepartment == null) ? 0 : FacultyorDepartment.hashCode());
		result = prime * result + ((contactPersonInfo == null) ? 0 : contactPersonInfo.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((facultyAddress == null) ? 0 : facultyAddress.hashCode());
		result = prime * result + ((fieldOfEducation == null) ? 0 : fieldOfEducation.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + idStudent;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((semesterType == null) ? 0 : semesterType.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + studentPassword;
		result = prime * result + ((studyCycle == null) ? 0 : studyCycle.hashCode());
		result = prime * result + ((universityName == null) ? 0 : universityName.hashCode());
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
		Student other = (Student) obj;
		if (ErasmusCode == null) {
			if (other.ErasmusCode != null)
				return false;
		} else if (!ErasmusCode.equals(other.ErasmusCode))
			return false;
		if (FacultyorDepartment == null) {
			if (other.FacultyorDepartment != null)
				return false;
		} else if (!FacultyorDepartment.equals(other.FacultyorDepartment))
			return false;
		if (contactPersonInfo == null) {
			if (other.contactPersonInfo != null)
				return false;
		} else if (!contactPersonInfo.equals(other.contactPersonInfo))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (facultyAddress == null) {
			if (other.facultyAddress != null)
				return false;
		} else if (!facultyAddress.equals(other.facultyAddress))
			return false;
		if (fieldOfEducation == null) {
			if (other.fieldOfEducation != null)
				return false;
		} else if (!fieldOfEducation.equals(other.fieldOfEducation))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (idStudent != other.idStudent)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (semesterType == null) {
			if (other.semesterType != null)
				return false;
		} else if (!semesterType.equals(other.semesterType))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (studentPassword != other.studentPassword)
			return false;
		if (studyCycle == null) {
			if (other.studyCycle != null)
				return false;
		} else if (!studyCycle.equals(other.studyCycle))
			return false;
		if (universityName == null) {
			if (other.universityName != null)
				return false;
		} else if (!universityName.equals(other.universityName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", studentPassword=" + studentPassword + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ ", nationality=" + nationality + ", sex=" + sex + ", studyCycle=" + studyCycle + ", fieldOfEducation="
				+ fieldOfEducation + ", semesterType=" + semesterType + ", universityName=" + universityName
				+ ", FacultyorDepartment=" + FacultyorDepartment + ", ErasmusCode=" + ErasmusCode + ", facultyAddress="
				+ facultyAddress + ", country=" + country + ", contactPersonInfo=" + contactPersonInfo + "]";
	}

}
