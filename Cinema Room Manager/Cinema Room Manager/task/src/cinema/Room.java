package cinema;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Room {

    int rows ;
    int seats;
    char [][] arr;

    int tickets = 0 ;

    int income = 0 ;


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

        if (row > rows || seat > seats){
            System.out.println("Wrong input!");
        }
        else if(arr[row-1][seat-1] == 'B'){
            System.out.println("That ticket has already been purchased!");
            buyTicket(InputUtils.inputRow(),InputUtils.inputSeat());
        }
        else{
        arr[row-1][seat-1] = 'B';
            tickets ++ ;
            printPrice(row) ;
        }
        income = income + (rows * seats <= 60 ? 10 : row <= rows / 2 ? 10 : 8);
    }

    void printPrice(int row) {
        System.out.println("Ticket price: $" + getPrice(row));
    }

    int getPrice(int row) {

        return rows * seats <= 60 ? 10 : row <= rows / 2 ? 10 : 8;
    }

    void  statiscs(){

        int total_income = 0 ;

        if(( rows*seats) <= 60){
            total_income = (rows * seats) * 10 ;

        } else {
            total_income = (((rows/2) * seats) * 10 ) + (((rows/2)+1)* seats)*8 ;
        }


          float percentage = ((float) tickets / (seats*rows))*100 ;



           System.out.println("Number of purchased tickets: "+tickets );
           System.out.printf("Percentage: %.2f%s\n", percentage,"%");
           System.out.println("Current income: $"+income);
           System.out.println("Total income: $"+total_income);
    }
}
