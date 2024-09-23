import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class stenSaksPapir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Velkommen til sten saks papir. Vælg dit håndtegn:");

        //få håndtegn fra pc og bruger !
        String brugerHåndtegn = scanner.next();
        String pcHåndtegn = "";
        int choicePc = rand.nextInt(1, 3);

        final String STEN = "sten";
        final String SAKS = "saks";
        final String PAPIR = "papir";

        //pc random valg
        if (choicePc == 1) {
            pcHåndtegn = "Sten";
        } else if (choicePc == 2) {
            pcHåndtegn = "Saks";
        } else {
            pcHåndtegn = "Papir";
        }

        while (!brugerHåndtegn.equalsIgnoreCase(STEN) && !brugerHåndtegn.equalsIgnoreCase(SAKS) && !brugerHåndtegn.equalsIgnoreCase(PAPIR)) {
            System.out.println("indtast venligst gyldigt håndtegn:");
            brugerHåndtegn = scanner.next();
        }
        /*while (brugerHåndtegn.equalsIgnoreCase(pcHåndtegn)) {
            System.out.println("uafgjort. vælg igen:");
            brugerHåndtegn = scanner.next();
}*/

            System.out.println("computerens valg: " + pcHåndtegn + "\nDit valg: " + brugerHåndtegn + "\nResultat: ");
            if (brugerHåndtegn.equalsIgnoreCase(STEN)) {
                if (pcHåndtegn.equalsIgnoreCase(STEN)) {
                    System.out.print("uafgjort");
                } else if (pcHåndtegn.equalsIgnoreCase(SAKS)) {
                    System.out.print("Du vinder");
                } else if (pcHåndtegn.equalsIgnoreCase(PAPIR)) {
                    System.out.print("Computeren vinder");
                }
            }
            if (brugerHåndtegn.equalsIgnoreCase(SAKS)) {
                if (pcHåndtegn.equalsIgnoreCase(SAKS)) {
                    System.out.print("Uafgjort");
                } else if (pcHåndtegn.equalsIgnoreCase(PAPIR)) {
                    System.out.print("Du vinder");
                } else if (pcHåndtegn.equalsIgnoreCase(STEN)) {
                    System.out.print("Computeren vinder");
                }
            }
            if (brugerHåndtegn.equalsIgnoreCase(PAPIR)) {
                if (pcHåndtegn.equalsIgnoreCase(PAPIR)) {
                    System.out.print("Uafgjort");
                } else if (pcHåndtegn.equalsIgnoreCase(STEN)) {
                    System.out.print("Du vinder!!");
                } else if (pcHåndtegn.equalsIgnoreCase(SAKS)) {
                    System.out.print("Computeren vinder");
                }
            }


        }
    }

