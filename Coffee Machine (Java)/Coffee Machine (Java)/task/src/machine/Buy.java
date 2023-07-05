package machine;

import java.util.Scanner;
import static machine.CoffeeMachine.*;
public class Buy {


    public static void buyCoffe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int coffeType = sc.nextInt();

        switch (coffeType){
            case 1: // espresso
                water -= 250;
                coffeeBeans -= 16;
                disposableCups-= 1;
                money += 4;
                break;
            case 2: // latte
                water -= 350;
                milk -= 75;
                coffeeBeans -= 20;
                disposableCups -= 1;
                money += 7;
                break;
            case 3: // cappuccino
                water -= 200;
                milk -= 100;
                coffeeBeans -= 12;
                disposableCups -= 1;
                money += 6;
                break;
            default:
                System.out.println("Unknown coffee type");
                break;
        }

       Display.dispplayState();
    }
}
