package com.pluralsight;

public class SalesContract extends Contract{


    private double salesTax=0.05;
    private double recordingFee=100.00;
    private double processingFee;
    private boolean financed;

    public SalesContract(Vehicle vehicleSold,String date, String customerName, String customerEmail,boolean financed) {



        super(vehicleSold, date, customerName, customerEmail);
        this.financed = financed;
        this.processingFee=(vehicleSold.getPrice()<10000 ? 295 : 495);
    }

    public boolean isFinance() {
        return financed;
    }

    public void setFinance(boolean finance) {
        this.financed = finance;
    }

    @Override
    public double getTotalPrice() {
        if(financed){
            if(super.getVehicleSold().getPrice()>10000){
                return super.getVehicleSold().getPrice()*1.0425;
            }
            return super.getVehicleSold().getPrice()*1.0525;
        }
        return super.getVehicleSold().getPrice();
    }

    @Override
    public double getMonthlyPayment() {
        if(financed){
            if(super.getVehicleSold().getPrice()>10000){
                return getTotalPrice()/48;
            }
            return getTotalPrice()/24;
        }

        return 0;
    }
}
