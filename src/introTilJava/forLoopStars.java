package introTilJava;

import java.util.Scanner;

public class forLoopStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvor mange stjerner vil du printe? ");

        int antalStjerner = scanner.nextInt();

        for (int i = 0; i < antalStjerner; i++) {
            System.out.print("* ");
        }
        System.out.println(" Her har du " + antalStjerner + " stjerner!");
    }
}