package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    public Dealership getDealership(){
        Dealership dealership=new Dealership("Fevzi","Atlanta","999-999-9999");

        try{
            FileReader fileReader=new FileReader("inventory.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String line;
            bufferedReader.readLine();

            while((line= bufferedReader.readLine())!=null){
                String[] datas=line.split("\\|");
                int vin= Integer.parseInt(datas[0]);
                int year=Integer.parseInt(datas[1]);
                int odometer=Integer.parseInt(datas[6]);
                double price= Double.parseDouble(datas[7]);
                Vehicle vehicle=new Vehicle(vin,year,datas[2],datas[3],datas[4],datas[5],odometer,price);

                dealership.addVehicle(vehicle);
            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership){

    }




}
