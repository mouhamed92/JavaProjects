package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Game game = new Game();

        System.out.println("Please, enter the secret code's length:");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("Error: can't generate a secret number with a length of" + n
                    + " because there aren't enough unique digits.");
        } else {

         String secretNumber =  game.generateNumber(n);

         System.out.println(secretNumber);

         game.guessNumber(secretNumber);

        }



      /*  Random random = new Random();
        int number = random.nextInt(9000) + 1000;
        Game game = new Game(number);
        game.guessNumber();*/
    }

}
