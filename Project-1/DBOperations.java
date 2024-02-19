package com.edu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement pst;
	private static String sql;
	private static ResultSet rs;
	private static Scanner sc=new Scanner(System.in);
	
	private static int reservationId;
	private static  String guestName;
	private static  int roomNumber;
	private static String contactNumber ;
	private static  String reservationDate;
	
	
	 
	public static void  reserveRoom() throws SQLException  {
		conn=DBconnection.getConnection();
		
		 System.out.print("Enter room number: ");
	        roomNumber = sc.nextInt();
	      String s1="select * from reservations where  room_number="+roomNumber;
	      stmt=conn.createStatement();
	      rs =stmt.executeQuery(s1);
		if(!rs.next()) {
			
		System.out.println("Room is available you can book");
		System.out.print("Enter guest name: ");
         guestName = sc.next();
        sc.nextLine();
       
        System.out.print("Enter contact number: ");
        contactNumber = sc.next();
        
        
        
         sql = "INSERT INTO reservations (guest_name, room_number, contact_number) " +
                "VALUES ('" + guestName + "', " + roomNumber + ", '" + contactNumber + "')";
         
        
             int affectedRows = stmt.executeUpdate(sql);

             if (affectedRows > 0) {
                 System.out.println("Reservation successful!");
             } 
		}
		else {
			System.out.println("Room is not available");
			
		}
         }
         
      
	
	 public static void viewReservations() throws SQLException{
		 conn=DBconnection.getConnection();
		 
		 sql = "SELECT reservation_id, guest_name, room_number, contact_number, reservation_date FROM reservations";
		 stmt = conn.createStatement();
		 rs = stmt.executeQuery(sql);
		 
		 

	        

		 System.out.println("Current Reservations:");
         System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
         System.out.println("| Reservation ID | Guest           | Room Number   | Contact Number      | Reservation Date        |");
         System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");


	            while (rs.next()) {
	                int reservationId = rs.getInt("reservation_id");
	                String guestName = rs.getString("guest_name");
	                int roomNumber = rs.getInt("room_number");
	                String contactNumber = rs.getString("contact_number");
	                String reservationDate = rs.getTimestamp("reservation_date").toString();

	                System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-19s   |\n",
	                        reservationId, guestName, roomNumber, contactNumber, reservationDate);
	            }

	            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
	        }
		 
	 
	 
	 public static void getRoomNumber() throws SQLException {
		 
		 conn=DBconnection.getConnection();
		 
		 System.out.print("Enter reservation ID: ");
        reservationId = sc.nextInt();
         System.out.print("Enter guest name: ");
         guestName = sc.next();
         
       
        sql = "SELECT room_number FROM reservations " +
                 "WHERE reservation_id = " + reservationId +
                 " AND guest_name = '" + guestName + "'";
        pst=conn.prepareStatement(sql);
 		rs=pst.executeQuery();

        
        if (rs.next()) {
            int roomNumber = rs.getInt("room_number");
            System.out.println("Room number for Reservation ID " + reservationId +
                    " and Guest " + guestName + " is: " + roomNumber);
        } else {
            System.out.println("Reservation not found for the given ID and guest name.");
        }
      }
	 
	  public static void updateReservation() throws SQLException{
		  
		  conn=DBconnection.getConnection();
	        
	            System.out.print("Enter reservation ID to update: ");
	             reservationId = sc.nextInt();
	            sc.nextLine(); // Consume the newline character

	            if (!reservationExists(reservationId)) {
	                System.out.println("Reservation not found for the given ID.");
	                return;
	            }

	            System.out.print("Enter new guest name: ");
	            String newGuestName = sc.nextLine();
	            System.out.print("Enter new room number: ");
	            int newRoomNumber = sc.nextInt();
	            System.out.print("Enter new contact number: ");
	            String newContactNumber = sc.next();
	            
	           

	            String sql = "UPDATE reservations SET guest_name = '" + newGuestName + "', " +
	                    "room_number = " + newRoomNumber + ", " +
	                    "contact_number = '" + newContactNumber + "' " +
	                    "WHERE reservation_id = " + reservationId;
	            
	            stmt = conn.createStatement();

	           
	                int affectedRows = stmt.executeUpdate(sql);

	                if (affectedRows > 0) {
	                    System.out.println("Reservation updated successfully!");
	                } else {
	                    System.out.println("Reservation update failed.");
	                }
	            }
	  
	  
	  public static void deleteReservation()throws SQLException {
		  conn=DBconnection.getConnection();
	        
	            System.out.print("Enter reservation ID to delete: ");
	            int reservationId = sc.nextInt();

	            if (!reservationExists(reservationId)) {
	                System.out.println("Reservation not found for the given ID.");
	                return;
	            }
	          
	            String sql = "DELETE FROM reservations WHERE reservation_id = " + reservationId;
	            
	            stmt = conn.createStatement();

	           
	                int affectedRows = stmt.executeUpdate(sql);

	                if (affectedRows > 0) {
	                    System.out.println("Reservation deleted successfully!");
	                } else {
	                    System.out.println("Reservation deletion failed.");
	                }
	            }
	        
	    

	         
	  public static boolean reservationExists( int reservationId) throws SQLException {
		
			conn=DBconnection.getConnection();
		 
			
			
		
		  
		  
	    
	      sql = "SELECT reservation_id FROM reservations WHERE reservation_id = " + reservationId;

	      Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
		  
	                return rs.next(); // If there's a result, the reservation exists
	            
	         
	    }
	  
	  


	 
	 
	 

}
