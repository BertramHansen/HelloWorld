package introTilJava;

import java.util.Scanner;

public class WhileLoopForLoopStars {
//Main metode
        public static void main(String[] args) {
//opretter en scanner så vi kan få brugerens input
            Scanner scan = new Scanner(System.in);
            //spørger om hvor mange stjerner brugeren vil skrive ud
            System.out.println("Hvor mange stjerner vil du udskrive?");
            // definere variablen antalStjerner til en int (helt tal) og giver det værdien så det er brugerens input der assigner værdien
            int antalStjerner = scan.nextInt();
            //opretter et count der starter på 0 da loopet ikke er kørt endnu
            int count = 0;
            //while/ imens count er mindre end antalstjerner kører loopet
            while (count < antalStjerner) {
                //printer stjerner
                System.out.print("*");
                //gør at countet stiger for hver gang loopet kører
                count++;
            }

        /*OPGAVE
        Udkommenter al koden i -metoden, og skriv programmet om sådan at det bruger et for-loop i stedet for et while-loop.

        Skriv din kode herunder: ----------------------------------------------------------------------------------------------------
         */








            //-----------------------------------------------------------------------------------------------------------------------
        }
    }

