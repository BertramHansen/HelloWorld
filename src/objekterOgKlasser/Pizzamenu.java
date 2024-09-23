package objekterOgKlasser;

import java.util.Scanner;

public class Pizzamenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vælg et nummer fra følgende menu:");

        System.out.println("1. Margherita\n2. Vesuvio\n3. Hawaii\n4. Pepperoni");
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1 -> System.out.println("Du har valgt Margherita. Velbekommen!");
            case 2 -> System.out.println("Du har valgt Vesuvio. Velbekommen!");
            case 3 -> System.out.println("Du har valgt Hawaii. Velbekommen!");
            case 4 -> System.out.println("Du har valgt Pepperoni. Velbekommen!");
            default -> System.out.println("Du har ikke valgt en pizza fra menuen");
        }
    }

}
