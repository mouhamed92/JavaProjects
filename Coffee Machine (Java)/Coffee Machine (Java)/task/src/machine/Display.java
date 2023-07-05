package machine;

import java.util.Scanner;

import static machine.CoffeeMachine.*;

public class Display {


    public static void dispplayState(){

        String formattedString = String.format("The coffee machine has:%n" +
                "%d ml of water%n" +
                "%d ml of milk%n" +
                "%d g of coffee beans%n" +
                "%d disposable cups%n" +
                "$%d of money", water, milk, coffeeBeans, disposableCups, money);

        System.out.println(formattedString);
    }

    public static String displayMenu(){
        Scanner sc = new Scanner(System.in);
        String choice ;
        System.out.println("Write action (buy, fill, take,exit): ");
        choice  = sc.nextLine();
        return choice ;

    }
}
