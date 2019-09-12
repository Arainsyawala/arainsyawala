package com.enigma.model;

public class Mobil {

    Boolean isStart;
    Integer fuel=0;

    public void fillFuel(int fuel) {
        this.fuel =this.fuel+fuel;
    }
    public String engineStart(){
        if(this.fuel>0) {
            isStart = true ;
            return "brum brum";
        }
        return "fail";
    }
    public String engineStop() {
        isStart = false;
        return "Stop";
    }

    public void parking(){
        System.out.println("park");
        if(isStart) {
            System.out.println("not yet");
            return;
        }
        System.out.println("done");
    }
    public String print() {
        return "{ Mobil " +
                "isStart = " + isStart +
                ", fuel = " + fuel+ "}";

    }
}
