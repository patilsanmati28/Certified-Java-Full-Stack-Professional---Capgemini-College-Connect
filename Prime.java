package com.edu.oper;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
	   int flag=0;
	    for (int i = 2; i <num ; ++i) {
	      // condition for non prime number
	      if (num % i == 0) {
	        flag = 1;
	        break;
	      }
	    }

	    if (flag==1)
	      System.out.println(num + " is not  a prime number.");
	    else
	      System.out.println(num + " is  a prime number.");
	  }
	}