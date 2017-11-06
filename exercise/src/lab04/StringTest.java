package lab04;


/**
 * Created by Haminata
 */
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner (System.in);
        System.out.println("Input new string: ");

        String input = myScanner.nextLine();
        System.out.println("You have entered: " +input);

        System.out.println(input.length());

        System.out.println(input.toUpperCase());

        System.out.println(input.toLowerCase());

        System.out.println(input.charAt(0));

        char lastLetter = input.charAt(input.length()-1);
        System.out.println(lastLetter);

        String whiteSpaces = input.replaceAll("\\s","");
        System.out.println(whiteSpaces);

    }
}




    }
}
