package machine;

import java.util.Scanner;

public class CoffeeMachine {



    public static void main(String[] args) {

        int water;
        int milk;
        int beans;
        int cups ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

        Coffe coffe = new Coffe();

        water = coffe.water();
        milk = coffe.milk();
        beans = coffe.beans();
        cups = coffe.cups() ;

        coffe.servingNum(water,milk,beans,cups);


    }
}
