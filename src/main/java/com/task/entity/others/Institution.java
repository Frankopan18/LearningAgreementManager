package com.task.entity.others;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Institution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long institutionId;
	private String institutionName;
	private String institutionAddress;
	private String institutionCountry;
	private ContactPerson institutionContactPerson;
	// for example,for poznan was PL POZNAN02
	private String erasmusCode;
	// departments = faculties
	private List<String> institutionDepartments;
	// based on departments, list of available courses will be given
	private List<Course> institutionDepartmentCourses;

	public Long getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(Long institutionId) {
		this.institutionId = institutionId;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getInstitutionAddress() {
		return institutionAddress;
	}

	public void setInstitutionAddress(String institutionAddress) {
		this.institutionAddress = institutionAddress;
	}

	public String getInstitutionCountry() {
		return institutionCountry;
	}

	public void setInstitutionCountry(String institutionCountry) {
		this.institutionCountry = institutionCountry;
	}

	public ContactPerson getInstitutionContactPerson() {
		return institutionContactPerson;
	}

	public void setInstitutionContactPerson(ContactPerson institutionContactPerson) {
		this.institutionContactPerson = institutionContactPerson;
	}

	public String getErasmusCode() {
		return erasmusCode;
	}

	public void setErasmusCode(String erasmusCode) {
		this.erasmusCode = erasmusCode;
	}

	public List<String> getInstitutionDepartments() {
		return institutionDepartments;
	}

	public void setInstitutionDepartments(List<String> institutionDepartments) {
		this.institutionDepartments = institutionDepartments;
	}

	public List<Course> getInstitutionDepartmentCourses() {
		return institutionDepartmentCourses;
	}

	public void setInstitutionDepartmentCourses(List<Course> institutionDepartmentCourses) {
		this.institutionDepartmentCourses = institutionDepartmentCourses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((erasmusCode == null) ? 0 : erasmusCode.hashCode());
		result = prime * result + ((institutionAddress == null) ? 0 : institutionAddress.hashCode());
		result = prime * result + ((institutionContactPerson == null) ? 0 : institutionContactPerson.hashCode());
		result = prime * result + ((institutionCountry == null) ? 0 : institutionCountry.hashCode());
		result = prime * result
				+ ((institutionDepartmentCourses == null) ? 0 : institutionDepartmentCourses.hashCode());
		result = prime * result + ((institutionDepartments == null) ? 0 : institutionDepartments.hashCode());
		result = prime * result + ((institutionId == null) ? 0 : institutionId.hashCode());
		result = prime * result + ((institutionName == null) ? 0 : institutionName.hashCode());
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
		Institution other = (Institution) obj;
		if (erasmusCode == null) {
			if (other.erasmusCode != null)
				return false;
		} else if (!erasmusCode.equals(other.erasmusCode))
			return false;
		if (institutionAddress == null) {
			if (other.institutionAddress != null)
				return false;
		} else if (!institutionAddress.equals(other.institutionAddress))
			return false;
		if (institutionContactPerson == null) {
			if (other.institutionContactPerson != null)
				return false;
		} else if (!institutionContactPerson.equals(other.institutionContactPerson))
			return false;
		if (institutionCountry == null) {
			if (other.institutionCountry != null)
				return false;
		} else if (!institutionCountry.equals(other.institutionCountry))
			return false;
		if (institutionDepartmentCourses == null) {
			if (other.institutionDepartmentCourses != null)
				return false;
		} else if (!institutionDepartmentCourses.equals(other.institutionDepartmentCourses))
			return false;
		if (institutionDepartments == null) {
			if (other.institutionDepartments != null)
				return false;
		} else if (!institutionDepartments.equals(other.institutionDepartments))
			return false;
		if (institutionId == null) {
			if (other.institutionId != null)
				return false;
		} else if (!institutionId.equals(other.institutionId))
			return false;
		if (institutionName == null) {
			if (other.institutionName != null)
				return false;
		} else if (!institutionName.equals(other.institutionName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Institution [institutionName=" + institutionName + ", institutionAddress=" + institutionAddress
				+ ", institutionCountry=" + institutionCountry + ", institutionContactPerson="
				+ institutionContactPerson + ", institutionDepartments=" + institutionDepartments
				+ ", institutionDepartmentCourses=" + institutionDepartmentCourses + "]";
	}

}
