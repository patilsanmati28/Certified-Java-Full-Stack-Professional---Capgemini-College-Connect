//instance variables default values
//int 0, float 0.0, double 0.0 , char is blank space String null

package com.edu.encapsulation;

import java.util.Scanner;

class Student{
	int age; //0
	String name; //null
	//Static variable  , class variable
	static String collegename = "Sharad Institute Of TechnologySharad institute of technology college of engineering, yadrav";
	
	
	void inputStudentData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		name=scanner.nextLine();
		
		System.out.println("Enter Age");
		age = scanner.nextInt();
	}
	void displayStudentData() {
		//this refer to present object
		/*System.out.println("Name = "+this.name);  //null
		System.out.println("Age = "+this.age);  //0
		System.out.println("College Name="+this.collegename);
		*/
		
		System.out.println("Name = "+name);  //null
		System.out.println("Age = "+age);  //0
		System.out.println("College Name="+collegename);
	}
	

}
public class StudentMainApp {

	public static void main(String[] args) {
		Student student1 = new Student(); //Object class constructor
		Student student2 = new Student();
		student1.inputStudentData();
		student2.inputStudentData();
		String  n; //local
		
		student1.displayStudentData();
		student2.displayStudentData();
		
		
	/*	
		System.out.println("Name = "+student1.name);  //null
		System.out.println("Age = "+student1.age);  //0
		System.out.println("College Name="+Student.collegename);
		//System.out.println("College Name="+student1.collegename);
		
		
		
		System.out.println("Name = "+student2.name);  //null
		System.out.println("Age = "+student2.age);  //0
		System.out.println("College Name="+Student.collegename);
		//System.out.println("College Name="+student2.collegename);
		
		*/
		//System.out.println("n="+n); //local variables need to initialize
		
	}

}