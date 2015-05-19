package com.example.jvm.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationService {
	
	private String FILE_NAME = "serialized2.object";
	
	public void serializeObject(Object obj){
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream( new FileOutputStream(FILE_NAME) );
			out.writeObject(obj);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object deserializeObject(){
		try {
			ObjectInputStream in =
					new ObjectInputStream( new FileInputStream(FILE_NAME) );
			Object result = in.readObject();
			in.close();
			return result;
		} catch (IOException | ClassNotFoundException  e) {
			e.printStackTrace();
			return null;
		}
	}

}
