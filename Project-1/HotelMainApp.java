package com.edu;

import java.sql.SQLException;
import java.util.Scanner;

public class HotelMainApp {

	public static void main(String[] args)throws SQLException {
		 while(true){
             System.out.println();
             System.out.println("********** HOTEL MANAGEMENT SYSTEM **********");
             Scanner sc = new Scanner(System.in);
             System.out.println("1. Reserve a room");
             System.out.println("2. View Reservations");
             System.out.println("3. Get Room Number");
             System.out.println("4. Update Reservations");
             System.out.println("5. Delete Reservations");
             //System.out.println("0. Exit");
             System.out.print("Choose an option: ");
             int choice = sc.nextInt();
             switch (choice) {
                 case 1:
                    DBOperations.reserveRoom();
                     break;
                 case 2:
                	 DBOperations.viewReservations();
                     break;
                 case 3:
                	 DBOperations.getRoomNumber();
                     break;
                 case 4:
                	 DBOperations.updateReservation();
                     break;
                 case 5:
                	 DBOperations.deleteReservation();
                     break;
                 default:
                     System.out.println("Invalid choice. Try again.");
             }
         }
		

	}

}
