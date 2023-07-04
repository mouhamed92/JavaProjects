package machine;

import java.util.Scanner;

public class Display {

    Scanner sc = new Scanner(System.in);

    public void dispplayState(int water,int milk,int coffeeBeans, int disposableCups,int money){

        String formattedString = String.format("The coffee machine has:%n" +
                "%d ml of water%n" +
                "%d ml of milk%n" +
                "%d g of coffee beans%n" +
                "%d disposable cups%n" +
                "$%d of money", water, milk, coffeeBeans, disposableCups, money);

        System.out.println(formattedString);
    }

    public String displayMenu(){

        String choice ;
        System.out.println("Write action (buy, fill, take): ");
        choice  = sc.nextLine();
        return choice ;

    }
}
