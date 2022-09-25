/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Jan. 17, 2022
 * Description: chooses a greeting via java's built-in pseudorandom number generator
 */

import java.util.Random;

public class RandomHello {
    public static void main(String[] args) {
        RandomHello randomHello = new RandomHello();//creates a usable instance of the class to call the sayHello() method below
        System.out.println(randomHello.sayHello());//output
    }

    public String sayHello() {
        String[] greetings = {"How Do You Do?", "Hello There!", "Howdy.", "Ahoy Matey!", "Greetings."};//collection of greetings
        Random randomNumberGenerator = new Random();//java's built-in pseudorandom number generator
        return greetings[randomNumberGenerator.nextInt(5)];//returns a greeting from index 0-4
    }
}
