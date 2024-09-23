import objekterOgKlasser.Konto;

import java.util.Scanner;

public class KontoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Konto minKonto = new Konto(123456789, "Bertram Hansen", 1000);


        System.out.print("Would you like to deposit or withdraw?\nPress 1 for withdraw or 2 for depsoit:");

        if (input.nextInt() == 1) {
            System.out.println("How much money would you like to withdraw?");
            minKonto.withdraw(input.nextDouble());
            System.out.println("the total amount in your account is: " + minKonto.getSaldo());

        } else {
            System.out.println("How much money would you like to deposit?");
            minKonto.deposit(input.nextDouble());
        System.out.println("your total is now: " + minKonto.getSaldo());
        }

        Scanner input2 = new Scanner(System.in);
        Konto dinKonto = new Konto();
        System.out.println("Hvad er dit navn?");
        dinKonto.setOwnerName(input2.nextLine());


        System.out.println(minKonto);
        //System.out.println(dinKonto.getOwnerName());


    }

}
