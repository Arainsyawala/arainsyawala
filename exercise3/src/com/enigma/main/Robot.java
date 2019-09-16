package com.enigma.main;

import java.util.Arrays;

public class Robot {
    Integer posX;
    Integer posY;
    Integer fuel = 0;
    private final String F = "F";
    private final String R = "R";
    private final String L = "L";
    private final String B = "B";
    private char[] command;

    Direction direction;

    public Robot(Integer posX, Integer posY, Direction direction) {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
    }

    public Integer fillFuel(Integer fuel) {
        this.fuel = this.fuel - fuel;
        return fuel;
    }

    public String setCommand(String comman) {
        this.command = comman.toCharArray();
        return "";
    }

    public void turnLeft() {
        this.direction = this.direction.left();
    }

    public void turnRight() {
        this.direction = this.direction.right();
    }

    public String move(String movement) {
        if (movement.equals(R)) {
            turnRight();
        } else if (movement.equals(L)) {
            turnLeft();
        } else if (movement.equals(F)) {
            moveForward();
        } else if (movement.equals(B)) {
            moveBackward();
        }
        return "Wrong way sir !";
    }

    public void moveForward() {
        if (direction.equals(Direction.NORTH)) {
            this.posY++;
        } else if (direction.equals(Direction.EAST)) {
            this.posX++;
        } else if (direction.equals(Direction.SOUTH)) {
            this.posY--;
        } else if (direction.equals(Direction.SOUTH)) {
            this.posX--;
        } else {
            System.out.println("WRONG WAY SIR !");
        }
    }

    public void moveBackward() {
        if (direction.equals(Direction.NORTH)) {
            posY--;
            this.direction = Direction.NORTH;
        } else if (direction.equals(Direction.SOUTH)) {
            posY--;
            this.direction = Direction.SOUTH;
        } else if (direction.equals(Direction.EAST)) {
            posX--;
            this.direction = Direction.EAST;
        } else if (direction.equals(Direction.WEST)) {
            posX++;
            this.direction = Direction.WEST;
        } else {
            System.out.println("Wrong way Sir !");
        }
    }
    public void run() {
        for (int i = 0; i < this.command.length; i++) {
            move(String.valueOf(this.command[i]));
            System.out.println(this.command[i] + getPos() + this.direction);
        }
    }
        public String getPos () {
            return "(" + posX + "," +posY+ ")";
        }



//    public String run() {
//        for (int i = 0; i < this.command.length; i++) {
//            if ((i + 1) % 3 == 0) {
//                this.fuel--;
//            }
//
//            if (this.fuel == 0) {
//                System.out.println("Your Fuel is Empty!");
//            } else {
//                System.out.println("Your Move Left : " +
//                move(String.valueOf(this.command[i])));
//            }
//            this.fuel = 0;
//        }
//        return "";
//    }
    public String print() {
        return "Robot{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", fuel=" + fuel +
                ", F='" + F + '\'' +
                ", R='" + R + '\'' +
                ", L='" + L + '\'' +
                ", B='" + B + '\'' +
                ", command=" + Arrays.toString(command) +
                ", direction=" + direction +
                '}';
    }
}
