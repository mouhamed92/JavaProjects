package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(9000)+ 1000 ;
        Game game = new Game(number) ;
        game.guessNumber();
    }
}
