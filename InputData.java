/*
 * package
 * import
 * class
 */

/*
 * Methods of Scanner class
 * nextByte(), nextShort(), nextDouble(),nextInt(), nextFloat()
 * next(),nextLine(),
 */



package com.edu.datatypes;



import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		int age;
		String name;
		float salary;
		char gen;
		
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
		
		System.out.println("Employee Details ");
        System.out.println("Name = "+name);	
        System.out.println("Age ="+age);
        System.out.println("Salary ="+salary);
        System.out.println("Gender ="+gen);
	}

}