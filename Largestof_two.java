package com.edu.oper;

import java.util.Scanner;

class large
{
int n1,n2;
Scanner sc=new Scanner(System.in);

void  inputData()
{
System.out.println("Enter two numbers: ");
n1=sc.nextInt();
n2=sc.nextInt();
}
void Display()
{
if(n1>n2)
System.out.println(n1+" is large");
else
System.out.println(n2+" is large");
}
}


public class Largestof_two {

public static void main(String[] args) {
// TODO Auto-generated method stub
large l=new large();
l.inputData();
l.Display();


}

}
