package com.edu.oper;

import java.util.Scanner;

class CheckNumber{
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
	}
	
	void displayResult() {
		
		if(num==0) {
			System.out.println("neither negative nor positive");
		}
		else {
		if(num>0) {
			System.out.println(num +"positive number");
		}
		else {
			System.out.println(num+"negative number");
		}
	}}
}

public class NegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumber checkNumber=new CheckNumber();
		checkNumber.inputData();
		checkNumber.displayResult();
		

	}

}
