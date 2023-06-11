package cinema;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Room room = new Room(InputUtils.inputRows(), InputUtils.inputSeats());
        while (true) {
            switch (InputUtils.inputMenuOption()) {
                case 1:
                    room.printRoom();
                    break;
                case 2:
                    room.buyTicket(InputUtils.inputRow(), InputUtils.inputSeat());
                    break;
                case 3:
                    room.statiscs();

                    break;
                case 0:
                    return;
            }
        }
    }
}

