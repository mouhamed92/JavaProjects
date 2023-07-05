package machine;

import java.util.Scanner;

import static java.lang.System.exit;

public class CoffeeMachine {

    static int  water = 400;
    static int milk = 540;
    static int coffeeBeans =120  ;
    static int disposableCups = 9 ;
    static int money =550 ;
    String choice ;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


               Display.dispplayState();

               while (true){
                   String choice = Display.displayMenu();

                   switch (choice) {
                       case "fill":
                           Fill.fillMachine();
                           break;
                       case "buy":
                           Buy.buyCoffe();
                           break;
                       case "take":
                           Take.takeMoney();

                           break;
                       case "exit":
                             return ;
                       default:
                           System.out.println("wrong choice..!");
                   }

               }



       /* System.out.println("Starting to make a coffee\n" +
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

        coffe.servingNum(water,milk,beans,cups);*/


    }
}
