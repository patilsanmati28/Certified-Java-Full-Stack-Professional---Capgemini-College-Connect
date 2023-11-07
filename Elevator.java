package com.edu;
import java.util.Scanner;

public class Elevator {
    private int currentFloor;

    public Elevator() {
        currentFloor = 1;
    }

    public void selectFloor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\nOptions: (s)elect a floor, (f)ire alarm, (q)uit");
                System.out.print("Enter s, f, or q => ");
                char choice = scanner.next().charAt(0);

                if (choice == 's') {
                    System.out.print("Enter the floor that you'd like to go to ==> ");
                    int floor = scanner.nextInt();
                    if (floor >= 1 && floor <= 10) {
                        moveElevator(floor);
                    } else {
                        throw new IllegalArgumentException("Invalid floor selection. Please choose a floor between 1 and 10.");
                    }
                } else if (choice == 'f') {
                	System.out.println("going to 1 st floor");
                    System.out.println("Danger! You must exit the building now!");
                    break;
                } else if (choice == 'q') {
                    System.out.println("Exiting the elevator simulation.");
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid selection. Please enter s, f, or q.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); // Clear the input buffer
            }
        }
        scanner.close();
    }

    public void moveElevator(int targetFloor) {
        if (targetFloor > currentFloor) {
            System.out.print("Going up..");
            for (int floor = currentFloor + 1; floor <= targetFloor; floor++) {
                System.out.print(floor + "..");
            }
            currentFloor = targetFloor;
        } else if (targetFloor < currentFloor) {
            System.out.print("Going down..");
            for (int floor = currentFloor - 1; floor >= targetFloor; floor--) {
                System.out.print(floor + "..");
            }
            currentFloor = targetFloor;
        }
        System.out.println("Ding!");
    }

    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.selectFloor();
    }
}
