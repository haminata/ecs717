package lab04;

/**
 * Created by haminata on 06/11/2017.
 */
import java.util.Scanner;

public class TestSentence {
    public static void main (String [] args){

        Scanner myScanner1 = new Scanner(System.in);
        System.out.println("Enter new Sentence: ");
        String inputO = myScanner1.nextLine();
        System.out.println("You have entered: " +inputO);

        String nonLetters = inputO.replaceAll("[^a-zA-Z]","");
        System.out.println(nonLetters);

        char[] senInput = nonLetters.toCharArray();
        int begin = 0;
        int end = senInput.length-1;

        char revSentence;

        while (end>begin){
            revSentence = senInput[begin];

            senInput[begin] = senInput[end];
            senInput[end] = revSentence;

            end--;
            begin++;
        }
        System.out.println(senInput);

        for(int i = 0; i < senInput.length; i++){
            char car;
            car = senInput[i];

            if (Character.isUpperCase(car))
                System.out.print(Character.toLowerCase(car));

            else if(Character.isLowerCase(car))
                System.out.print(Character.toUpperCase(car));
            else
                System.out.print(car);

        }

    }


}