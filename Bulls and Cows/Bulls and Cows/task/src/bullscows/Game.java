package bullscows;

import java.util.Random;

public class Game {


    int n ;
    String str1 ;
    String str2 ;
    Inputs inputs = new Inputs();


    String generateNumber(int n){

        String randomNumber = "";

        while (randomNumber.length() < n) {

            String rand = String.valueOf(System.nanoTime());

            for (int i = 0; i < rand.length(); i++) {

                if (randomNumber.length() < n && !randomNumber.contains(String.valueOf(rand.charAt(i)))) {

                    randomNumber += rand.charAt(i);
                }
            }
        }
           return randomNumber ;
    }


    void guessNumber(String SecrtN){
        int cows = 0 ;
        int bulls = 0 ;
        int turn = 1 ;

        System.out.println("Okay, let's start a game!");

        str2 = SecrtN;

        do {
            cows = 0 ;
            bulls = 0 ;
            System.out.println("Turn "+turn+":");
            n = inputs.inputNumber();
            str1 = Integer.toString(n);

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        if (i == j) {
                            bulls++;
                        }else {
                            cows++ ;
                        }
                    }
                }
            }
            display(cows, bulls);
            turn++;
        }while (bulls < str1.length());
        System.out.println("Congratulations! You guessed the secret code.");

    }

    void display(int cows , int bulls){

        if (cows == 0 && bulls == 0){
            System.out.println("Grade: None" );
        }else if (cows > 0 && bulls == 0){
            System.out.println("Grade: "+ cows +" cow(s).");
        } else if (cows == 0 && bulls > 0) {
            System.out.println("Grade :"+ bulls +" bull(s).");
        }else {
            System.out.println("Grade: "+bulls +" bull(s) and "+ cows +" cow(s)");
        }

    }


}
