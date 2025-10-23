package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;


    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> foundVehicle=new ArrayList<>();
        return foundVehicle;
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String Model){
        ArrayList<Vehicle> foundVehicle=new ArrayList<>();
        return foundVehicle;
    } public ArrayList<Vehicle> getVehiclesByYear(int min,  int max){
        ArrayList<Vehicle> foundVehicle=new ArrayList<>();
        return foundVehicle;
    } public ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> foundVehicle=new ArrayList<>();
        return foundVehicle;
    }
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> foundVehicle=new ArrayList<>();
        return foundVehicle;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        ArrayList<Vehicle> foundVehicle=new ArrayList<>();
        return foundVehicle;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        ArrayList<Vehicle> foundVehicle=new ArrayList<>();
        return foundVehicle;
    }

    public void addVehicle(Vehicle vehicle){

    }
    public void removeVehicle(Vehicle vehicle){

    }
}
