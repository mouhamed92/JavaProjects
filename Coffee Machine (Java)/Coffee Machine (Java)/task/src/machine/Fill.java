package machine;

import java.util.Scanner;

public class Fill {
    Scanner sc = new Scanner(System.in);
    Display display = new Display();
    public Fill() {

    }
    public void fillMachine(int water,int milk,int coffeeBeans,int disposableCups,int money){

        System.out.println("Write how many ml of water you want to add: ");
        water += sc.nextInt();

        System.out.println("Write how many ml of milk you want to add: ");
        milk += sc.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += sc.nextInt();

        System.out.println("Write how many disposable cups you want to add: ");
        disposableCups += sc.nextInt();

        display.dispplayState(water,milk,coffeeBeans,disposableCups,money);
    }




}
