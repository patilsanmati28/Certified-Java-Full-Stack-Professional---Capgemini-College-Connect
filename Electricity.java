package com.edu.oper;

import java.util.Scanner;

class ElectricityBill{
	String n;
	int units;
	double bill;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("name of customer");
		n=sc.next();
		System.out.println("no of units consumed");
		units=sc.nextInt();
		
		
	}
	
	void calculate() {
		if (units <= 100)
            bill = units * 2;
        else if (units <= 300)
            bill = 200 + (units - 100) * 3;
        else {
            double amt = 200 + 600 + (units - 300) * 5;
            double surcharge = (amt * 2.5) / 100.0;
            bill = amt + surcharge;
        }
		
	}
	public void print() {
        System.out.println("Name of the customer\t\t: " + n);
        System.out.println("Number of units consumed\t: " + units);
        System.out.println("Bill amount\t\t\t: " + bill);
    }
}




public class Electricity {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ElectricityBill obj = new ElectricityBill();
        obj.accept();
        obj.calculate();
        obj.print();

	}

}
