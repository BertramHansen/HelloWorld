

import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {

        System.out.println("Welcome! I am the FortuneTeller please pick a number from 1 to 10 and i will tell you a fortune :)");
        System.out.print("\nPick a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();

        if (inputtedNum <= 5) {
            System.out.println("You will drink water today");
        } else {
            System.out.println("You will drink soda today");
    }

}


}
