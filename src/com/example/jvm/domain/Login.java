package com.example.jvm.domain;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Login implements Externalizable {
	
	private String username;
	private transient String password;
	
	public Login(){
	}
	
	public Login(String name, String passwd){
		this.username = name;
		this.password = passwd;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "([Login] " + username + " : " + password + ")";	
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(username);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, 
		ClassNotFoundException {
		
		username = (String) in.readObject();
	}

}
