package com.edu.oper;

import java.util.Scanner;

class large1
{
int n1,n2,n3;
Scanner sc=new Scanner(System.in);

void  inputData()
{
System.out.println("Enter number: ");
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();

}
void Display()
{
	
		if(n1>n2 && n1>n3)
			System.out.println("largest is "+n1);
		else if(n2>n1 && n2>n3)
			System.out.println("largest is "+n2);
		else
			System.out.println("largest is "+n3);
	
	}

}



public class largestof_three {

public static void main(String[] args) {
// TODO Auto-generated method stub

large1 l1=new large1();
l1.inputData();
l1.Display();
}

}
