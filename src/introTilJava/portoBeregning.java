import java.util.Scanner;

public class portoBeregning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dette er en portoberegner der ud fra vægten af dit brev kan regne ud hvad det koster at sende");
        int price = 0;

        System.out.print("\nSkriv venligst dit brevs vægt i gram: ");
        double weight = input.nextDouble();
        boolean ugyldigt = false;
        if (weight <= 0 || weight > 2000) {
            ugyldigt = true;

        } else if (weight < 250) {
            price = 25;
        } else if (weight < 500) {
            price = 50;

        } else {
            price = 75;

        }
        if (ugyldigt == true) {
            System.out.println("Et brev med denne valgt kan vi ikke sende");

        } else {
            System.out.println("Prisen på dit brev er " + price + " kr.");
        }
    }

}







