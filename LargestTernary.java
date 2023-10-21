package com.edu.oper;

import java.util.Scanner;

public class LargestTernary {

	public static void main(String[] args) {
		int n1,n2, l;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 2 numbers");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		l = (n1>n2) ?n1:n2;
		System.out.println("The largest of "+n1+ " and "+n2+ " is "+l);
		

	}

}