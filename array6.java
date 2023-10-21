//program to add element at last postion
package com.edu.array;
import java.util.Scanner;
public class array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr size of an array");
		int size=sc.nextInt();
		a=new int[size+1];
		System.out.println("Enter " +(a.length-1)+"array elements");
		for(int i=0;i<a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		 System.out.println("Enter the number to be added in an array at last");
		 int num = sc.nextInt();
		 
		 a[a.length-1]= num;
		 
		 //Display all array elements
		 
		 for(int i:a) {
			 System.out.println(i);
		 }
		 sc.close();
		 
	  }
	}
