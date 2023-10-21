//DEMONSTRATE ENCAPSULATION CONCEPT
package com.edu.encapsulation;

import java.util.Scanner;

class Employee{
	//variables declared in class is called instance variables
	String name;
	int age;
	float salary;
	char gen;
	
	void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		//name = scanner.next(); //string single word
		name = scanner.nextLine(); //with the space more than one word
		
		System.out.println("Enter age");
		age = scanner.nextInt(); //int datatype
		
		System.out.println("Enter salary");
		salary = scanner.nextFloat();
System.out.println("Enter gender (M/F)");
		gen = scanner.next().charAt(0); //read char
		
	}
	
	void displayData() {
		
		System.out.println("Employee Details ");
        System.out.println("Name = "+name);	
        System.out.println("Age ="+age);
        System.out.println("Salary ="+salary);
        System.out.println("Gender ="+gen);
	}
	
}


public class MainAppEncapsulation {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Employee e=new Employee();
		e.inputData();
		e.displayData();
		
	}

}