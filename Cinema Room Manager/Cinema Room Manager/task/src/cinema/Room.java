package cinema;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Room {

    int rows ;
    int seats;
    char [][] arr;

    public Room(int rows,int seats){
        this.rows = rows ;
        this.seats = seats ;
        this.arr = new char[rows][seats];
        Arrays.stream(arr).forEach(rowArr->Arrays.fill(rowArr,'S'));
    }

    void printRoom() {
        int rowsWithNum = rows + 1;
        int seatsWithNum = seats + 1;
        System.out.print("\nCinema:\n ");
        IntStream.range(1, rowsWithNum * seatsWithNum)
                .forEach(i -> System.out.printf(" %s",
                        i < seatsWithNum ? i : (i % seatsWithNum == 0 ? "\n" + i / seatsWithNum : arr[i / seatsWithNum - 1][i % seatsWithNum - 1])));
        System.out.println("\n");
    }



    void buyTicket(int row,int seat){
        arr[row-1][seat-1] = 'B';
        printPrice(row) ;
    }

    void printPrice(int row) {
        System.out.println("Ticket price: $" + getPrice(row));
    }

    int getPrice(int row) {
        return rows * seats <= 60 ? 10 : row <= row/2 ? 10 : 8 ;
    }
}
