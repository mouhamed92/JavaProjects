import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        int index_1 ;
        int index_2 ;

        do{
             index_1 = scanner.nextInt();
             index_2 = scanner.nextInt();
        }while ((index_1> str.length() && index_2 >str.length()) && (index_1 >=0 && index_2 >=0));

        str = str.substring(index_1,index_2+1);
        System.out.println(str);
    }
}