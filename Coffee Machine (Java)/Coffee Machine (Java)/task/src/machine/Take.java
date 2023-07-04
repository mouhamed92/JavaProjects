package machine;

public class Take {

    Display display = new Display();
    public Take() {
    }

    public void takeMoney(int water,int milk,int coffeeBeans, int disposableCups,int money){
         System.out.println("I gave you $"+money);
         money = 0 ;

         display.dispplayState(water,milk,coffeeBeans,disposableCups,money);

    }
}
