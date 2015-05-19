package com.example.jvm.main;

import java.util.ArrayList;
import java.util.List;

import com.example.jvm.domain.Classes;
import com.example.jvm.domain.Login;
import com.example.jvm.domain.Student;
import com.example.jvm.service.SerializationService;

public class Main {
	
	public static void main(String [ ] args)
	{
	      Login login1 = new Login("Seba1","TypoweHaslo1");
	      Login login2 = new Login("Seba2","TypoweHaslo2");
	      
	      Student s1 = new Student("Seba1", "Typowy1", "TS1", login1);
	      Student s2 = new Student("Seba2", "Typowy2", "TS2", login2);
	      
	      List<Student> attendees = new ArrayList<Student>();
	      
	      attendees.add(s1);
	      attendees.add(s2);
	      
	      Classes classez = new Classes(attendees);
	      
	      System.out.print(classez.toString());
	      
	      SerializationService ss = new SerializationService();
	      
	      ss.serializeObject(classez);
	      
	      Object deserializedObj = ss.deserializeObject();
	      
	      System.out.print( ((Classes) deserializedObj).toString() );
	      
	      
	}

}
