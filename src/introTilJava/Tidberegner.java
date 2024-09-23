import java.sql.SQLOutput;
import java.util.Scanner;

public class Tidberegner {
    public static void main(String[] args) {
        /*int sekund = 30;
          int minut = 55;
          int time = 9;*/

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor mange timer er der gået siden midnat?");
        int timer = input.nextInt();
        System.out.println("Der er gået " + timer + " siden midnat.");


        System.out.println("Hvor mange minutter? ");
        int minutter = input.nextInt();
        System.out.println(minutter + " minutter");


        System.out.println("Hvor mange sekunder? ");
        int sekunder = input.nextInt();
        System.out.println(sekunder + " sekunder.");

        int secondsSinceMidnight = timer * 60 * 60 + sekunder + (minutter * 60);

        System.out.println("Der er gået " + secondsSinceMidnight + " sekunder siden midnat.");

    }
}
