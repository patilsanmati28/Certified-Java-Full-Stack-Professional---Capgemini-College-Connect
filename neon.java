package com.edu.loops;

import java.util.Scanner;

public class neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,square;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check");
		int n=sc.nextInt();
		
		square=n*n;
		while(square!=0) {
			r=square%10;
			sum=sum+r;
			square=square/10;
		}
		
		if(n==sum) {
			System.out.println("Given no is neon");
			
		}
		else {
			System.out.println("Given no is not neon");
			
			
		}
		
		

	}

}
