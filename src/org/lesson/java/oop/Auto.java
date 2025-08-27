package org.lesson.java.oop;

public class Auto {

    //attributi della classe    
    public String brand ;
    public String model;
    public String color;
    public int hp;
    public int numberOfDoors;
    public boolean hasStarted;
    public boolean inWorkshop;


    //metodi della classe

    public Auto (String brand, String model,String color,int hp,int numberOfDoors ){ 
        
        this.brand = brand ;
        this.model = model ;
        this.color = color ;
        this.hp = hp ;
        this.numberOfDoors = numberOfDoors ;
        this.hasStarted = false ;
        this.inWorkshop = false ;
    }

    public void startUp(){
        
        this.hasStarted = true;

    }

    public void turnOff(){
        
        this.hasStarted = false;

    }




}
