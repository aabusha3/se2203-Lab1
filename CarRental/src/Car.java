/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Jan. 17, 2022
 * Description: the Car object class to handle info about Cars
 */


public class Car implements Comparable{
    private String make, model, color, year, VIN;//qualitative properties of Car
    private int noOfDoors, noOfSeats, noOfSuitcases, noOfBags;//quantitative properties of Car
    private Boolean rented = false;//false by default

    public Car(String make, String model, String color, String year){//constructor sets make, model, color, and year fields for a new instance
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void setVIN(String VIN) {//sets the VIN field for the current instance
        this.VIN = VIN;
    }

    public void setSize(int door, int seat){//sets the noOfDoors and noOfSeats fields for the current instance
        this.noOfDoors = door;
        this.noOfSeats = seat;
    }

    public void setLuggage(int suitcase, int bag){//sets the noOfSuitcases and noOfBags fields for the current instance
        this.noOfSuitcases = suitcase;
        this.noOfBags = bag;
    }

    public void setRented(Boolean status){//sets the rented field for the current instance
        this.rented = status;
    }

    public String getCarInfo(){//prints relevant info to the current instance in the format <make, model year-color>
        return this.make + ", " + this.model + " " + this.year + "-" + this.color;
    }

    @Override
    public Boolean isSameCar(Car car) {//returns true if the current instance's VIN and the provided object's VIN
        return this.VIN.equals(car.VIN);
    }

    @Override
    public String getCategory() {//determines and returns the category of the current instance based on noOfDoors, noOfSeats, noOfSuitcases, and noOfBags fields
        if(noOfDoors==4 && noOfSeats==5 && noOfSuitcases==1 && noOfBags==1)
            return "Economy";
        else if(noOfDoors==4 && noOfSeats==5 && noOfSuitcases==1 && noOfBags==2)
            return "Compact";
        else if(noOfDoors==4 && noOfSeats==5 && noOfSuitcases==2 && noOfBags==1)
            return "Mid-size(Standard)";
        else if(noOfDoors==4 && noOfSeats==5 && noOfSuitcases==2 && noOfBags==2)
            return "Full-size(Premium)";
        else if(noOfDoors==2 && noOfSeats==4 && noOfSuitcases==1 && noOfBags==1)
            return "Convertible";

        return "Not Specified";//in-case an entered combination of noOfDoors, noOfSeats, noOfSuitcases, and noOfBags isn't accounted for
    }

    @Override
    public Boolean isRented() {//gets the value of the rented field
        return this.rented;
    }

    @Override
    public String toString(){//prints all details related to the current instance formatted as described in Section 3.3.3
        return String.format("%-19s%-12s%-18s%-19s", this.make + ", " + this.model, this.year + "-" + this.color, this.VIN, this.getCategory());
    }
}
