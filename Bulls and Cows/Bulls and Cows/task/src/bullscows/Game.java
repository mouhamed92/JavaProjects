package bullscows;

import java.util.Random;

public class Game {

    int secretN = 0 ;
    int n = 0 ;
    String str1 ;
    String str2 ;
    Inputs inputs = new Inputs();


    public Game(int secretN) {
        this.secretN = secretN ;
    }


    void guessNumber(){
        int cows = 0 ;
        int bulls = 0 ;
        n = inputs.inputNumber();
        str1 = Integer.toString(n);
        str2 = Integer.toString(secretN);

        for (int i = 0 ; i < str1.length() ; i++){
            for (int j = 0 ; j < str2.length() ; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                   cows++ ;
                   if(i==j){
                       cows-- ;
                       bulls++;
                   }
                }
            }
        }

         display(cows , bulls);
    }

    void display(int cows , int bulls){

        if (cows == 0 && bulls == 0){
            System.out.println("Grade: None. The secret code is "+secretN+ "." );
        }else if (cows > 0 && bulls == 0){
            System.out.println("Grade: "+ cows +" cow(s). The secret code is "+ secretN+".");
        } else if (cows == 0 && bulls > 0) {
            System.out.println("Grade :"+ bulls +" bull(s). The secret code is "+ secretN+".");
        }else {
            System.out.println("Grade: "+ cows +" bull(s) and "+ bulls +" cow(s). The secret code is "+ secretN+".");
        }

    }


}
