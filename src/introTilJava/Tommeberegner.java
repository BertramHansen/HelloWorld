import java.util.Scanner;

public class Tommeberegner {
    public static void main(String[] args) {
        System.out.println("Velkommen til Tommeregneren.\nDette er en udregner der kan omdanne måleenheden tommer til Cm!\n");

        final Double TOMME_I_CM = 2.54;

        Scanner input = new Scanner(System.in);

        System.out.print("Hvor mange tommer vil du omregne til cencimeter?:");

        double tommer = input.nextDouble();

        System.out.println(tommer + " tommer er = " + tommer * TOMME_I_CM + "cm.");



    }
}
