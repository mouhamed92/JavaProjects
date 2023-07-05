/*
package machine;

import java.util.*;

public class Coffe {

    int water;
    int milk;
    int beans;
    int cups ;
    Scanner sc = new Scanner(System.in);

    public Coffe(int water, int milk, int beans, int cups) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
    }

    public  Coffe(){}

    public int water(){
       System.out.println("Write how many ml of water the coffee machine has:");
       return water = sc.nextInt();}
    public int milk(){
       System.out.println(" Write how many ml of milk the coffee machine has:");
       return milk = sc.nextInt();}

    public int beans(){
       System.out.println("Write how many grams of coffee beans the coffee machine has:");
       return beans = sc.nextInt() ;}

    public int cups(){
       System.out.println("Write how many cups of coffee you will need:");
       return  cups = sc.nextInt();}


    public void servingNum(int w, int m, int b, int c){

        int waterP = w  / 200 ;
        int milkP = m /  50;
        int beansP = b / 15 ;
        int min = Math.min(waterP, Math.min(milkP, beansP));

            if (min == 0 ){
            System.out.println("No, I can make only 0 cup(s) of coffee");
        }
            if (min == c){
            System.out.println("Yes, I can make that amount of coffee");
        }
            if (min<c){
                System.out.println("No, I can make only "+ min +" cup(s) of coffee");
            }
            if (min>c){
                System.out.println("Yes, I can make that amount of coffee (and even "+(min - cups)+" more than that)");
            }
    }

}
*/
