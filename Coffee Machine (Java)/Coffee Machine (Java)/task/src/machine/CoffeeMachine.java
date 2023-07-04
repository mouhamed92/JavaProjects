package machine;

import java.util.Scanner;

public class CoffeeMachine {

    String choice ;

    public static void main(String[] args) {

        int water = 400;
        int milk = 540;
        int coffeeBeans =120  ;
        int disposableCups = 9 ;
        int money =550 ;
        Scanner sc = new Scanner(System.in);

        Display display = new Display();
        Fill fill = new Fill();
        Buy buy = new Buy();
        Take take  = new Take();

               display.dispplayState(water,milk,coffeeBeans,disposableCups ,money);

               String  choice = display.displayMenu();

            switch (choice){
                case "fill" : fill.fillMachine(water,milk,coffeeBeans,disposableCups,money);
                    break;
                case "buy"   : buy.buyCoffe(water,milk,coffeeBeans,disposableCups,money);               ;
                    break;
                case "take" :  take.takeMoney(water,milk,coffeeBeans,disposableCups,money);               ;
                    break;
                default:
                     System.out.println("wrong choice..!");
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
