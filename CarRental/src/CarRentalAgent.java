/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Jan. 17, 2022
 * Description: the CarRentalAgent object class to handle info about CarRentalAgents and Cars in the inventory
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class CarRentalAgent {
    private String companyName, address;//the agent's details
    private ArrayList<Car> CarInventory = new ArrayList<>();//the agent's inventory (collection) of Car objects

    public CarRentalAgent (String name, String address){//constructor sets companyName and address fields for a new instance
        this.companyName = name;
        this.address = address;
    }

    public Boolean addInventory(Car car){//attempts to add a Car object that is passed in the arguments
        if (CarInventory.size() == 0){//the first Car doesn't need to be checked for duplicates
            CarInventory.add(car);
            return true;
        }

        for(Car current : CarInventory)//iterates through CarInventory
            if(!car.isSameCar(current)){//checks if car exists in CarInventory
                CarInventory.add(car);
                return true;
            }
        return false;
    }

    public Boolean rentCar(Car car){//attempts to rent a Car object that is passed in the arguments
        if(!car.isRented()){//checks if car is already not rented
            car.setRented(true);
            return true;
        }
        return false;
    }

    public Boolean returnCar(Car car){//attempts to return a rented Car object that is passed in the arguments
        if(car.isRented()){//checks if car is already rented
            car.setRented(false);
            return true;
        }
        return false;
    }

    public void printInventory(){//prints all the agent's inventory formatted as described in Section 3.3.3
        System.out.println("Agent Name: "+ this.companyName +"\nAgent Address: " + this.address + "\n");
        System.out.printf("%-19s%-12s%-18s%-19s%n", "Car Model and make", "Year-color", "VIN", "Category");
        System.out.printf("%-19s%-12s%-18s%-19s%n", "------------------", "-----------", "-----------------", "------------------");

        ListIterator cars = CarInventory.listIterator();
        while (cars.hasNext())
            System.out.println(cars.next());//calls toString() from Car.java

        System.out.println();
    }
}
