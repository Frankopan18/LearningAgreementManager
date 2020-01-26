package com.task.entity.others;

public class SingleCourse {

	private String name;
	private int ECTS;

	public SingleCourse(String name, int eCTS) {
		super();
		this.name = name;
		ECTS = eCTS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getECTS() {
		return ECTS;
	}

	public void setECTS(int eCTS) {
		ECTS = eCTS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ECTS;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		SingleCourse other = (SingleCourse) obj;
		if (ECTS != other.ECTS)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SingleCourse [name=" + name + ", ECTS=" + ECTS + "]";
	}

}
