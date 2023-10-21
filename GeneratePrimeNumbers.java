package com.edu.nestedloop;

public class GeneratePrimeNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int counter=0;
		// TODO Auto-generated method stub
		for(int i=100;i>1;i--) {
			 count=0;
			for(int j=1 ;j<=i;j++ ) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				counter++;
				System.out.println(i);
				if(counter==5) {
					break;
				}
			}
		}
	}

}