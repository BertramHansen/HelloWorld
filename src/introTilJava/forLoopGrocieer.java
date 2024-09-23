package introTilJava;

import java.util.Scanner;

public class forLoopGrocieer {
    public static void main(String[] args) {
        //get number of groceries
        System.out.print("How many items would you like to scan? ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;
//create loop iterate through all of the items and accumalate the cost
        for (int i = 0; i < quantity; i++) {
            System.out.print("Please enter the price of the item: ");
            double price = scanner.nextDouble();
            total = total + price;

        }
        scanner.close();
        System.out.println("Your total is $" + total + " Have a good day!");

    }
}
