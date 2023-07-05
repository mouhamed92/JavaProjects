package machine;

import java.util.Scanner;

import static machine.CoffeeMachine.*;
public class Fill {

    public static void fillMachine(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add: ");
         water += sc.nextInt();

        System.out.println("Write how many ml of milk you want to add: ");
         milk += sc.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += sc.nextInt();

        System.out.println("Write how many disposable cups you want to add: ");
        disposableCups += sc.nextInt();

        Display.dispplayState();
    }




}
