package lab04;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        GameState g = new GameState(100);
        Scanner userInput = new Scanner(System.in);

        boolean correct = false;
        while(!correct){
            System.out.println("Guess a number between 1 and 100: ");
            int scannerValue = userInput.nextInt();
            int result = g.userGuess(scannerValue);

            if(result == 0){
                correct = true;
            }else if(result > 0){
                System.out.println("number is too large");
            }else{
                System.out.println("number is too low");
            }
        }
        System.out.println("You win! number of tries: " + g.getTries());
    }
}


