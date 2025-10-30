package com.pluralsight;

public class LeaseContract extends Contract {

    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(Vehicle vehicleSold, String date, String customerName, String customerEmail) {

        super(vehicleSold, date, customerName, customerEmail);

        this.expectedEndingValue=vehicleSold.getPrice()/2;
        this.leaseFee=vehicleSold.getPrice()*0.07;
    }

    @Override
    public double getTotalPrice() {
        return super.getVehicleSold().getPrice()-expectedEndingValue;
    }

    @Override
    public double getMonthlyPayment() {

        return (getTotalPrice()*1.04)/36;
    }
}
