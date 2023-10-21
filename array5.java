package com.edu.array;
import java.util.Scanner;
public class array5 {
       public static void main(String[] args) {
		        int count, i, index;
		        int input[] = new int[100];
		    Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter Number of Elements in Array");
		        count = scanner.nextInt();
		      System.out.println("Enter " + count + " Numbers");
		        for (i = 0; i < count; i++) {
		            input[i] = scanner.nextInt();
		        }
		 
		        System.out.println("Enter Index of Element to be Deleted");
		        index = scanner.nextInt();
		        for (i = index; i < count - 1; i++) {
		            input[i] = input[i + 1];
		        }
		 
		        count--;
		 
		        System.out.println("Final Array");
		        for (i = 0; i < count; i++) {
		            System.out.print(input[i] + " ");
		        }
		    
		
         }

}
