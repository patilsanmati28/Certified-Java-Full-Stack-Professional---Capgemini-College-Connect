package com.edu.constmt;

import java.util.Scanner;

class Calculator{
	double n1,n2,ans;
	static Scanner sc = new Scanner(System.in);
	void inputData() {
		
		System.out.println("Enter 2 numbers");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
	}
	
	void addition() {
		ans = n1+n2;
		System.out.println("The sum of "+n1+" and "+n2+" is "+ans);
	}
	
	void subtraction() {
		ans = n1-n2;
		System.out.println("The difference of "+n1+" and "+n2+" is "+ans);
	}

	public void multiplication() {
		ans = n1*n2;
		System.out.println("Product of "+n1+ " and "+n2+" is "+ans);
		
	}

	public void division() {
		
		if(n2==0) {
			System.out.println("Divide by zero error");
	    }
		else {
			ans=n1/n2;
			System.out.println("Quotient ="+ans);
		}
		
	}
	
}
public class SwitchExample {

	public static void main(String[] args) {
		
		Calculator calobj = new Calculator();
		
		System.out.println("*********MY MENU**************");
		System.out.println("Enter your choice");
		System.out.println("1.for Addition");
		System.out.println("2.for Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int choice = Calculator.sc.nextInt();
		calobj.inputData();
		switch(choice) {
		case 1: calobj.addition();
		        break;
		case 2: calobj.subtraction();
		         break;
		case 3: calobj.multiplication();
		         break;
		case 4: calobj.division();
		          break;
		default: System.out.println("Invalid Choice");
		}
	}
}