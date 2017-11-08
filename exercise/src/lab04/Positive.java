package lab04;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {

        Scanner myPositive = new Scanner(System.in);
        System.out.println("Insert value: ");

        boolean isDouble = myPositive.hasNextDouble();
        if (!isDouble) {
            System.out.println("Letters are not acceptable");
        } else {
            double vInput = myPositive.nextDouble();
            System.out.println("You have entered: " + vInput);

            if (vInput >= 0) {
                System.out.println("Enter second value: ");

                double sPut = myPositive.nextDouble();
                double diff = (vInput - sPut);
                System.out.println(-diff); //makes the result to always be positive!!
            } else if (vInput < 0) {
                System.out.println(-vInput);

            }
        }
    }
}






