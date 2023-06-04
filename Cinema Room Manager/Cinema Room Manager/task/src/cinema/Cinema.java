package cinema;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        int i = 1 ;
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int c = 1 ; c <9 ; c++){
           System.out.print(" "+c);
        }
        System.out.println();

        do {
            System.out.print(i);
            for (int l = 1; l < 9; l++) {
                System.out.print(" S");
            }
            System.out.println();
            i++ ;
        }while (i <8);
    }
}