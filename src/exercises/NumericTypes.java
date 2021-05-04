package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Integer length = input.nextInt();
        System.out.println("What is the width of the rectangle?");
        Integer width =  input.nextInt();
        input.close();
        System.out.println("The area of your rectangle is: " + length*width );
    }
}
