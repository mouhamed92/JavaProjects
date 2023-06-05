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
        int ticket_price =0  ;
        Scanner sc = new Scanner(System.in);

        /*                  DISPLAY CINEMA                  */

        System.out.println("Enter the number of rows:");
        row = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = sc.nextInt();

        total_seats = row * seats ;

        String [][] cinema = new String [row+1][seats+1] ;

        System.out.println("Cinema:");

        for (int l = 1; l < row+1 ; l++){
            for (int c = 1; c < seats+1  ; c++) {
                cinema[0][0] = " " ;
                cinema[0][c] = " " +Integer.toString(c);
                cinema[l][0] = Integer.toString(l);
                cinema [l][c] = " S";
            }
        }
        for (int l = 0 ; l < row+1 ; l++){
            for (int c = 0 ; c < seats+1 ; c++) {
              System.out.print(cinema[l][c]);
            }
            System.out.println();
        }


           /*              SELECT A SEAT                    */

        System.out.println("Enter a row number:");
        row_nb = sc.nextInt();

        System.out.println("Enter a seat number in that row:");
        seat_nb = sc.nextInt();

        first_half = (row/2)  ;

        if(total_seats < 60){
            ticket_price = 10 ;
        }else{
            if (row_nb <= first_half){
                ticket_price = ticket_price = 10  ;
            }else{
                ticket_price = 8 ;
            }
        }




        System.out.println("Ticket price: $"+ticket_price);

        cinema[row_nb] [seat_nb]= " B";

        System.out.println("Cinema:");

        for (int l = 0 ; l < row+1 ; l++){
            for (int c = 0 ; c < seats+1 ; c++) {
                System.out.print(cinema[l][c]);
            }
            System.out.println();
        }
}
}