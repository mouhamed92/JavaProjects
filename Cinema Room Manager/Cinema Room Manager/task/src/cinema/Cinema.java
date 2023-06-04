package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here

             /*           Declaration             */

        int i = 1 ;
        int row = 0 ;
        int seats = 0 ;
        int row_nb = 0 ;
        int seat_nb = 0 ;
        int income = 0 ;
        int first_half = 0;
        int last_half = 0 ;
        int total_seats = 0 ;

        Scanner sc = new Scanner(System.in);

        /*                  DISPLAY CINEMA                  */

        System.out.println("Enter the number of rows:");
        row = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = sc.nextInt();

        System.out.println("Cinema:");
        System.out.print(" ");

        for (int c = 1 ; c < seats+1 ; c++){
           System.out.print(" "+c);
        }
        System.out.println();

        do {
            System.out.print(i);
            for (int l = 1; l <= row+1 ; l++) {
                System.out.print(" S");
            }
            System.out.println();
            i++ ;
        }while (i <row+1);

           /*              SELECT A SEAT                    */

        System.out.println("Enter a row number:");
        row_nb = sc.nextInt();

        System.out.println("Enter a seat number in that row:");
        seat_nb = sc.nextInt();



         total_seats =  row*seats ;

        if(total_seats < 60){
            income = total_seats * 10 ;
        }else {
            if ( row % 2 == 0){
                 first_half = ((row/2) * seats) * 10 ;
                 last_half = ((row/2) * seats) * 8 ;
                 income = first_half + last_half ;
            }else {
                 first_half = ((row/2) * seats) * 10 ;
                 last_half = (((row/2)+1 ) * seats) * 8 ;
                 income = first_half + last_half ;
            }
        }

        System.out.println("Total income:");
        System.out.println("$"+income);
}
}