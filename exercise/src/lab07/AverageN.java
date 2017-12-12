package lab07;

import java.util.Scanner;

/**
 * Created by haminata on 28/11/2017.
 */
public class AverageN {

    public static void main(String[] args) {
        double sum = 0;
        int valueN;
        System.out.println("Insert value of N: ");
        try{
            valueN = askNumber();//calling method to give N a value from scanner

        }catch (Exception e1){
            System.out.println("N must be a positive number");
            return;
        }

        System.out.println("Enter values for N");
        for (int i = 0; i < valueN; i++) {
            int inputsN;

            try{
                inputsN = askNumber();
            }

            catch (Exception e){
                inputsN =0;
                i--; //to run back to the loop and enter a new number
                System.out.println("This is not a positive number, enter a positive number");
            }

            sum+= inputsN;//calculate average

        }
        System.out.println("Average number for N: " + sum/valueN);
    }

    public static int askNumber() throws Exception{
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input < 0) {
            throw new Exception("Invalid number");
        }
        else{
            return input;
        }
    }

}