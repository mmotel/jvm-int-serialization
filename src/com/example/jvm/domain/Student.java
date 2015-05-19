package com.example.jvm.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student extends Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String studentsBookId;
	Login login;
	
	public Student(){
		super();
	}
	
	public Student(String firstName, String lastName, String bookId, Login login){
		super(firstName, lastName);
		this.studentsBookId = bookId;
		this.login = login;
	}
	
	public String getStudentsBookId() {
		return studentsBookId;
	}
	public void setStudentsBookId(String studentsBookId) {
		this.studentsBookId = studentsBookId;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public String toString(){
		return "([Student] " + super.toString() + ", bookId: " + 
				this.studentsBookId + ", login: " + this.login.toString() + ")";
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException, 
		ClassNotFoundException {
		
		try {
			os.defaultWriteObject();
			os.writeObject(getFirstName());
			os.writeObject(getLastName());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is) throws IOException, 
		ClassNotFoundException {
		
		try {
			is.defaultReadObject();
			String firstName = (String) is.readObject();
			String lastName = (String) is.readObject();
			setFirstName(firstName);
			setLastName(lastName);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
