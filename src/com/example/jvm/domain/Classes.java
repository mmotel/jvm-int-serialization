package com.example.jvm.domain;

import java.io.Serializable;
import java.util.List;

public class Classes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	List<Student> attendeesList;
	
	public Classes() {
		this.attendeesList = null;
	}
	
	public Classes(List<Student> attendess){
		this.attendeesList = attendess;
	}

	public List<Student> getAttendeesList() {
		return attendeesList;
	}

	public void setAttendeesList(List<Student> attendeesList) {
		this.attendeesList = attendeesList;
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder();
		for (Student student : attendeesList){
			result.append(student.toString() + "\n");
		}
		return result.toString();
	}

}
