package com.edu.oper;

import java.util.Scanner;

class oddeven{
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
	}
	void displayResult() {
		if(num==0) {
			System.out.println("neither even nor odd");
			
		}
		else {
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}}

}

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddeven i=new oddeven();
		i.inputData();
		i.displayResult();

	}

}
