package exercises;

import java.util.Scanner;

public class NumericTypesTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        Double numMiles = input.nextDouble();
        System.out.println("How many gallons of gas did you use?");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("Your Miles Per Gallon is: " + mpg);
        input.close();
    }
}
