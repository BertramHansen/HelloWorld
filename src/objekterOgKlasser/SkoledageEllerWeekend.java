package objekterOgKlasser;

import java.time.MonthDay;
import java.util.Scanner;

public class SkoledageEllerWeekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvilken dag er det?");
        System.out.println("Tast 1 for Mandag!");
        System.out.println("Tast 2 for Tirsdag!");
        System.out.println("Tast 3 for Onsdag!");
        System.out.println("Tast 4 for Torsdag!");
        System.out.println("Tast 5 for Fredag!");
        System.out.println("Tast 6 for Lørdag!");
        System.out.println("Tast 7 for Søndag!");

        int brugerValg = input.nextInt();

        while (brugerValg > 7 || brugerValg < 1) {
            System.out.println("Dette er ikke en valid dag. Tast igen!");
            brugerValg = input.nextInt();
        }
        Ugedag dag = null;


       /* switch (dag){

            case MONDAY -> System.out.println("Det er mandag");
            case TUESDAY -> System.out.println("Det er tirsdag");
            case WEDNESDAY -> System.out.println("Det er onsdag");
            case THURSDAY -> System.out.println("Det er torsdag");
            case FRIDAY -> System.out.println("Det er fredag");
            case SATURDAY -> System.out.println("Det er lørdag");
            case SUNDAY -> System.out.println("Det er søndag");
        }
*/
        dag = switch (brugerValg) {
            case 1 -> dag.MONDAY;
            case 2 -> dag.TUESDAY;
            case 3 -> dag.WEDNESDAY;
            case 4 -> dag.THURSDAY;
            case 5 -> dag.FRIDAY;
            case 6 -> dag.SATURDAY;
            case 7 -> dag.SUNDAY;
            default -> null;
        };
/*
       switch (dag){
           case SATURDAY, SUNDAY -> System.out.println("Det er weekend");
           default -> System.out.println("Det er hverdag");
       }
*/

        /*if (brugerValg >= 1 && brugerValg <= 5) {
            System.out.println("Du skal i skole. ");
            if (brugerValg == 1) {
                System.out.print("Det er mandag igen....");
            }
            if (brugerValg == 5) {
                System.out.print("Men du har weekend når du har fri");

            }
        } else {
            System.out.println("Det er weekend sov du bare videre");
        }
*/

        if (dag == dag.MONDAY || dag == dag.TUESDAY || dag == dag.WEDNESDAY ||
                dag == dag.THURSDAY || dag == dag.FRIDAY) {
            System.out.println("DU skal i skole...");
            if (dag == dag.MONDAY) {
                System.out.println("Det er mandag igen...");
            }
            if (dag == dag.FRIDAY){
                System.out.println("Men du har weekend når du har fri");
            }
        }else{
            System.out.println("Det er weekend sov du bare videre");
        }

    }
}
