package objekterOgKlasser;

import java.util.Scanner;

public class årstider {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hvilken måned er det? ");

        System.out.println("Tast 1 for januar.");
        System.out.println("Tast 2 for februar.");
        System.out.println("Tast 3 for marts.");
        System.out.println("Tast 4 for april.");
        System.out.println("Tast 5 for maj.");
        System.out.println("Tast 6 for juni.");
        System.out.println("Tast 7 for juli.");
        System.out.println("Tast 8 for august.");
        System.out.println("Tast 9 for september.");
        System.out.println("Tast 10 for oktober.");
        System.out.println("Tast 11 for november.");
        System.out.println("Tast 12 for december.");

        int brugerValg = sc.nextInt();

        while (brugerValg >12 || brugerValg <1){
            System.out.println("Indtast venligst gydlig måned");
            brugerValg= sc.nextInt();
        }
        Måneder måneder=null;

        måneder = switch (brugerValg){
            case 1 -> måneder.JANUAR;
            case 2 -> måneder.FEBRUAR;
            case 3 -> måneder.MARTS;
            case 4 -> måneder.APRIL;
            case 5 -> måneder.MAJ;
            case 6 -> måneder.JUNI;
            case 7 -> måneder.JULI;
            case 8-> måneder.AUGUST;
            case 9 -> måneder.SEPTEMBER;
            case 10 -> måneder.OKTOBER;
            case 11 -> måneder.NOVEMBER;
            case 12 -> måneder.DECEMBER;

            default -> null;

        };
        switch (måneder){
            case MARTS, APRIL, MAJ -> System.out.println("Det er "+ måneder + " Det er forår!!");
            case JUNI, JULI, AUGUST -> System.out.println("Det er "+ måneder + " Det er sommer!!");
            case SEPTEMBER, OKTOBER, NOVEMBER -> System.out.println("Det er "+ måneder + " Det er efterår!!");
            case DECEMBER, JANUAR, FEBRUAR -> System.out.println("Det er "+ måneder + " Det er vinter!!!");
        }
    }
}
