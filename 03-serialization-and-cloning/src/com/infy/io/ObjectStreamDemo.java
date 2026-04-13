package com.infy.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		
		try(
			ObjectOutputStream objectStreamOut = new ObjectOutputStream(new FileOutputStream("EmployeeData.txt"));
			ObjectInputStream objectStreamIn = new ObjectInputStream(new FileInputStream("EmployeeData.txt"));
			){
			
			EmployeeDTO employeeDTO = new EmployeeDTO("1234", "John", "SE", 3);
			
			objectStreamOut.writeObject(employeeDTO);
			
			
			EmployeeDTO employee = (EmployeeDTO) objectStreamIn.readObject();
			
			System.out.println(employee);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
