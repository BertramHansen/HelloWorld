package SøgningIKlasse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Studerende stud1 = new Studerende("Bertram Hansen", "bert2002.bh@gmail.com");
        Studerende stud2 = new Studerende("Nikolaj Jensen", "Nikolaj@gmail.com");
        Studerende stud3 = new Studerende("Jens Mathiasen", "jens.20@icloud.com");

        Hold hold1 = new Hold();

        hold1.tilføjStuderende(stud1);
        hold1.tilføjStuderende(stud2);
        hold1.tilføjStuderende(stud3);

        System.out.println(hold1);
        System.out.print("Skriv navn på den du gerne vil finde: ");
        String søgenavn = sc.next();
        if( hold1.findStuderende(søgenavn)==null){
            System.out.println("Personen er ikke på holdet");
        }else{
            System.out.println("Den studerende er på holdet :) " + hold1.findStuderende(søgenavn));
            Studerende temp = hold1.findStuderende(søgenavn);
            System.out.println("Redigering af studerendes info: ");
            System.out.println("Rediger data og tryk ENTER. Hvis ikke der skal ændres noget tryk ENTER!");


            //HVORFOR NY SCANNER??????
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Navn: " + temp.getNavn());
            String nytNavn = sc1.nextLine();
            if(!nytNavn.isEmpty()){
                temp.setNavn(nytNavn);
            }

            System.out.println("Email: " + temp.getEmail());
            String nyEmail = sc1.nextLine();
            if(!nyEmail.isEmpty()){
                temp.setEmail(nyEmail);
            }

            System.out.println("Studerende med ny information: " + temp);

            System.out.println("Holdets nye klasseliste:\n" + hold1);
        }

//        System.out.println(hold1);
//
//        System.out.println(hold1.findStuderende("Jens"));

    }
}
