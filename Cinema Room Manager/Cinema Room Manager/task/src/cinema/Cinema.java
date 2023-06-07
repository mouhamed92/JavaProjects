package cinema;

import java.util.Scanner;

import static java.lang.System.exit;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here

             /*           Declaration             */
        int row = 0 ;
        int seats = 0 ;
        int count = 0 ;
        int total_seats = 0 ;

        Scanner sc = new Scanner(System.in);

        /*                  DISPLAY CINEMA                  */

        System.out.println("Enter the number of rows:");
        row = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = sc.nextInt();

        total_seats = row * seats ;

        String [][] cinema = new String [row+1][seats+1] ;


        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");

            int choice = sc.nextInt();


             switch (choice){

                 case 1 :
                          displayRoom(cinema,row,seats,count);
                           count++;
                    break;
                 case 2 :
                          buyTicket(cinema,total_seats,row);
                         
                     break;
                 case 0 :
                     return  ;
             }

         }while (true);

}

    private static void buyTicket(String[][] cinema ,int total_seats , int row) {

        Scanner sc = new Scanner(System.in);

        int first_half = 0;
        int ticket_price =0  ;
        int row_nb =0 ;
        int seat_nb =0 ;

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
    }

 /*   private static void displaySeats(String [][] cinema , int row , int seats) {

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
    }*/

    private static void displayRoom(String [][] cinema , int row , int seats, int count) {


        if(count == 0) {

            System.out.println("Cinema:");

            for (int l = 1; l < row + 1; l++) {
                for (int c = 1; c < seats + 1; c++) {
                    cinema[0][0] = " ";
                    cinema[0][c] = " " + Integer.toString(c);
                    cinema[l][0] = Integer.toString(l);
                    cinema[l][c] = " S";
                }
            }
            for (int l = 0; l < row + 1; l++) {
                for (int c = 0; c < seats + 1; c++) {
                    System.out.print(cinema[l][c]);
                }
                System.out.println();
            }
                     count ++ ;
        }else{

            System.out.println("Cinema:");

            for (int l = 0; l < row + 1; l++) {
                for (int c = 0; c < seats + 1; c++) {
                    System.out.print(cinema[l][c]);
                }
                System.out.println();

            }
        }
    }
}



















 /*  System.out.println("Cinema:");

        for (int l = 0 ; l < row+1 ; l++){
            for (int c = 0 ; c < seats+1 ; c++) {
                System.out.print(cinema[l][c]);
            }
            System.out.println();
        }*/