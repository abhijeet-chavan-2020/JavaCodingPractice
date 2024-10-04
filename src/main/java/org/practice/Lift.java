package main.java.org.practice;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;
import java.util.Scanner;

class Lift {
    private int currentFloor;
    private int totalFloors;
    private String direction;
    private Queue<Integer> requestsQueue;

    public Lift(int totalFloors) {
        this.currentFloor = 0; // Assuming ground floor as 0
        this.totalFloors = totalFloors;
        this.direction = "idle";
        this.requestsQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer floor1, Integer floor2) {
                if (direction.equals("up")) {
                    System.out.println("floor1 - floor2 = " + String .valueOf(floor1 - floor2));
                    return floor1 - floor2;
                } else if (direction.equals("down")) {
                    System.out.println("String.valueOf(floor2 - floor1) = " + String.valueOf(floor2 - floor1));
                    return floor2 - floor1;
                }
                return 0;
            }
        });
    }

    public void addRequest(int floor) {
        if (floor >= 0 && floor <= totalFloors) {
            requestsQueue.add(floor);
            moveLift();
        } else {
            System.out.println("Invalid floor request");
        }
    }

    public void moveLift() {
        while (!requestsQueue.isEmpty()) {
            if(currentFloor==requestsQueue.peek()){
                requestsQueue.poll();
                break;
            }
            int nextFloor = requestsQueue.poll();
            if(nextFloor > currentFloor){


                direction = "up";
                moveUp(nextFloor);
            } else if (nextFloor < currentFloor) {
                direction = "down";
                moveDown(nextFloor);
            }
            System.out.println("Lift has arrived at floor: " + currentFloor);
            openDoor();
            closeDoor();
        }
        direction = "idle";
    }

    private void moveUp(int nextFloor) {
        while (currentFloor < nextFloor) {
            currentFloor++;
            System.out.println("Lift moving up, current floor: " + currentFloor);
        }
    }

    private void moveDown(int nextFloor) {
        while (currentFloor > nextFloor) {
            currentFloor--;
            System.out.println("Lift moving down, current floor: " + currentFloor);
        }
    }

    private void openDoor() {
        System.out.println("Lift door opening...");
    }

    private void closeDoor() {
        System.out.println("Lift door closing...");
    }

    public static void main(String[] args) {
        Lift lift = new Lift(10); // Assume a building with 10 floors
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter floor request (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                int floor = Integer.parseInt(input);
                lift.addRequest(floor);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
    }
}
