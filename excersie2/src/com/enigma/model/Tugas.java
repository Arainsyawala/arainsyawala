package com.enigma.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tugas {

    Integer posX;
    Integer posY;
    Integer fuel = 0;
    char[] command;

    private final String ruleR = "R";
    private final String ruleL = "L";
    private final String ruleF = "F";
    private final String ruleB = "B";

    public void move(String movement) {
        if (movement.equals(ruleR)) {
            this.posX++;
        } else if (movement.equals(ruleL)) {
            this.posX--;
        } else if (movement.equals(ruleF)) {
            this.posY++;
        } else if (movement.equals(ruleB)) {
            this.posY--;
        }
    }

    public Tugas(Integer x, Integer y) {
        this.posX = x;
        this.posY = y;
    }

    public void setCommand(String command) {
        this.command = command.toCharArray();
    }

    public void getFuel(Integer fuel) {
        this.fuel = this.fuel + fuel;
        return;
    }

    public void setRun(){
        for (int i=0; i<this.command.length;i++){
            if (fuel == 0) {
                System.out.println("Mobil mogok gan !");
                break;
            }
            move(String.valueOf(this.command[i]));
            System.out.println(command[i] +getPosition());
            if ((i+1)%3 == 0) {
                fuel --;
            }
        }
    }
    public String getPosition() {
        return "(" + this.posX + "," + this.posY + ")";

    }
    public void print() {
        System.out.print("Mobil posisi X = "
                + posX + "\ndan \nY = "
                + posY + "\nsisa bensin = "
                + fuel+ "\nJalan yang telah anda lalui ="
                + Arrays.toString(command));
    }
//        }
//        public Integer sisaBensin() {
////            if (int i(i+1))
//        }


}


