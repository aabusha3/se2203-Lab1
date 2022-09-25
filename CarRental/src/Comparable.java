/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Jan. 17, 2022
 * Description: Comparable interface to compare Car objects
 */

public interface Comparable {
    Boolean isSameCar(Car car);//checks whether the current instance and another instance have the same VIN value

    String getCategory();//returns the category of the car based on the values of the fields noOfDoors, noOfSeats, noOfSuitcases, noOfBags

    Boolean isRented();//returns the value of rented field in Car.java
}
