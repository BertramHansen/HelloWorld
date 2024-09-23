import java.util.Scanner;

public class whileLoopSentinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Please enter the price of your grocieries one by one, when you want to stop, type '-1': ");
        int price = 0;
        int sum = 0;

        while ( price != SENTINEL) {

            System.out.print("\nItem price: ");
            sum += price;
            price = scanner.nextInt();
        }


        if (price == SENTINEL) ;
        {
            System.out.println("you total is: $" + sum);
        }
        scanner.close();
    }
}
