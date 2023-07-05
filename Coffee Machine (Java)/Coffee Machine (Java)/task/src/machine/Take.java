package machine;

import static machine.CoffeeMachine.money;

public class Take {


    public static void takeMoney(){
         System.out.println("I gave you $"+money);
         money = 0 ;

         Display.dispplayState();

    }
}
