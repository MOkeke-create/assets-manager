package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue(){
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;

        double originalCost = getOriginalCost();
        double value;

        if (age <= 3) {
            value = originalCost * (1 - (0.03 * age));
        }
        else if (age <= 6) {
            value = originalCost * (1 - (0.06 * age));
        }
        else if (age <= 10) {
            value = originalCost * (1 - (0.08 * age));
        }
        else {
            value = 1000;
        }
        if (odometer > 100000 &&
                !makeModel.toLowerCase().contains("honda") &&
                !makeModel.toLowerCase().contains("toyota")) {

            value = value * 0.75;
        }

        return value;
    }
}
