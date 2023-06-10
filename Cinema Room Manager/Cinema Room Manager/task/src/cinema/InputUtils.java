package cinema;

import java.util.Scanner;

public interface InputUtils {

    Scanner scanner = new Scanner(System.in);

    static int inputRows(){
        System.out.println("Enter the number of rows:");
        return scanner.nextInt();
    }

    static int inputSeats() {
        System.out.println("Enter the number of seats in each row:");
        return scanner.nextInt();
    }

    static int inputRow() {
        System.out.println("Enter a row number:");
        return scanner.nextInt();
    }

    static int inputSeat() {
        System.out.println("Enter a seat number in that row:");
        return scanner.nextInt();
    }

    static int inputMenuOption() {
        System.out.println("1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "0. Exit");
        return scanner.nextInt();
    }
}
