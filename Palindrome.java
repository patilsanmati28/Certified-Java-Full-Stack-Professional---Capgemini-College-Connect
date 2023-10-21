package com.edu.loops;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(sum==temp) {
			System.out.println("Given no is palindrome");
			
		}
		else {
			System.out.println("Given no is not palindrome");
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
