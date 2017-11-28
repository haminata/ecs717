package lab07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by haminata on 28/11/2017.
 */
public class AverageNTest {

    public static void main(String[] args) {

        Integer input = null;
        int sum = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Insert value of N: ");

        while (input == null || input < 0) {

            try {
                input = sc.nextInt();

                if (input < 0) {
                    throw new RuntimeException("invalid number");
                }

                System.out.println("Value of N: " + input);

            } catch (RuntimeException ex) {
                System.out.println("N must be positive.");

            }
        }


        for (int i = 0; i < input; i++) {
            Integer input2 = null;

            while (input2 == null || input2 < 0) {
                System.out.println("Insert value for N (" + i + "): ");
                try {
                    input2 = sc.nextInt();

                    if (input2 < 0) {
                        throw new RuntimeException("invalid number");
                    }

                } catch (RuntimeException ex1) {
                    System.out.println("Element for N (" + i + ") must be positive.");
                }

            }
            sum += input2;
        }

        System.out.println("Average number for N: " + sum / input);


    }
}
