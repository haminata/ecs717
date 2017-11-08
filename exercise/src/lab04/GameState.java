package lab04;

import java.util.Random;

class GameState{
    int tries;
    int bound;
    int secret;

    public GameState(int bound){
        this.bound = bound;
        tries = 0;
        Random gen = new Random();
        secret = gen.nextInt(bound);
    }

    public int getTries(){
        return tries;
    }

    public int userGuess(int guessNum){
        tries = tries + 1;

        if (guessNum == secret){
            return 0;
        }else if(guessNum > secret){
            return 1;
        }else {
            return -1;
        }
    }
}
