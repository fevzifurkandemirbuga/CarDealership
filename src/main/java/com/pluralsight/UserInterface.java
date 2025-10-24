package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;



    private void init(){
        dealership=new DealershipFileManager().getDealership();


    }
    public void display(){
        Scanner scan = new Scanner(System.in);
        boolean running=true;
        while (running){
            System.out.println("""
                MENU
                1) Find vehicles within a price range
                2) Find vehicles by make / model
                3) Find vehicles by year range
                4) Find vehicles by color
                5) Find vehicles by mileage range
                6) Find vehicles by type (car, truck, SUV, van)
                7) List ALL vehicles
                8) Add a vehicle
                9) Remove a vehicle
                99) Quit
                """);
            String command=scan.nextLine();
            switch (command){
                case "1" -> processGetByPriceRequest();
                case "2" -> processGetByMakeModelRequest();
                case "3" -> processGetByYearRequest();
                case "4" -> processGetByColorRequest();
                case "5" -> processGetByMileageRequest();
                case "6" -> processGetByVehicleTypeRequest();
                case "7" -> processGetAllVehicles();
                case "8" -> addVehicleRequest();
                case "9" -> removeVehicleRequest();
                case "99" -> running=false;
                default -> System.out.println("invalid choice please try again");
            }
        }


    }

    public void processGetByPriceRequest(){

    }

    public void processGetByMakeModelRequest() {

    }
    public void processGetByYearRequest() {

    }
    public void processGetByColorRequest() {

    }
    public void processGetByMileageRequest() {

    }
    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehicles() {

    }

    public void addVehicleRequest() {

    }
    public void removeVehicleRequest() {

    }





}
