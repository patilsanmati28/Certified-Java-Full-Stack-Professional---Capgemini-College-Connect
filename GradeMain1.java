package com.edu.constmt;

import java.util.Scanner;

public class GradeMain1 {
	char grade;
	void inputgrade() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr garde");
		grade=sc.next().toUpperCase().charAt(0);
	}
	void displaymarks() {
		if(grade=='A') {
			System.out.println("Marks range is in between 80 to 100");
		}
		else if(grade=='B') {
			
			System.out.println("Marks range is in between 60 to 79");
		}	
		else if(grade=='C') {
			
			System.out.println("Marks range is in between 40 to 59");
		}
		else if(grade=='F') {
			System.out.println("Marks range is in between 0 to 39");
		}
		else {
			System.out.println("invalid input");
		}
		
		} 
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeMain1 g1=new GradeMain1();
		g1.inputgrade();
		g1.displaymarks();
	}

}
