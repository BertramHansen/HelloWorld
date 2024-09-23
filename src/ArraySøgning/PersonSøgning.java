package ArraySøgning;

import objekterOgKlasser.firkant.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonSøgning {
    public static void main(String[] args) {
        Person p1 = new Person("Bertram", "Hansen", 22, 187, 86);
        Person p2 = new Person("Magnus", "Linnebjerg", 21, 180, 82);
        Person p3 = new Person("August", "Prühs", 22, 178, 85);
        Person p4 = new Person("Morten", "Jensen", 44, 159, 130);
        Person p5 = new Person("John", "Hansen", 57, 165, 75);

        Scanner sc = new Scanner(System.in);

        ArrayList<Person> personDatabase = new ArrayList<>(List.of(p1, p2, p3, p4, p5));

        ArrayList<Person> søgeResultatEfternavn = new ArrayList<Person>();

        String søgeNavn = "john";
        String søgehøjde = "170.0";
        String søgeEfternavn = "Hansen";

        boolean fundetHøjde = false;
        boolean fundet = false;

        //for loop der finder person med søgenavn
        for (Person p : personDatabase) {
            if (p.getFornavn().equalsIgnoreCase(søgeNavn)) {
                System.out.println("Person fundet " + p.getFornavn() + " " + p.getEfternavn());
                fundet = true;
            }
        }
        if (!fundet) {
            System.out.println("Kunne ikke finde: " + søgeNavn + " i listen.");
        }
        //forloop der finder personer med højden over 170.0

        for (Person p : personDatabase) {
            if (p.getHøjde() > Double.parseDouble(søgehøjde)) {
                System.out.println("Person over 170.0 cm høj: " + p.getFornavn() + " " + p.getEfternavn());
                fundetHøjde = true;
            }

        }
        if (!fundetHøjde) {
            System.out.println("Ingen af personerne er over 170.0 cm høj");
        }

        //forloop til søgeefternavn
        for (Person p : personDatabase) {
            if (p.getEfternavn().contains(søgeEfternavn)) {
                søgeResultatEfternavn.add(p);
            }
        }
        if (!søgeResultatEfternavn.isEmpty()) {
            for (Person p : søgeResultatEfternavn)
                System.out.println("Person med efternavnen Hansen: " + p.getFornavn() + " " + p.getEfternavn());
        } else {
            System.out.println("Der findes ikke nogen med efternavnet: " + søgeEfternavn);
        }
        //hvis brugeren vil ændre noget:

        for (int i = 0; i < søgeResultatEfternavn.size(); i++) {
            System.out.println(i + 1 + ":" + søgeResultatEfternavn.get(i));
        }

        System.out.println("Indtast nummer på den person der skal redigeres: ");
        int nr = sc.nextInt();
        sc.nextLine();

        Person editPerson = søgeResultatEfternavn.get(nr - 1); //index starter ved 0 :)
        System.out.println("Editperson: " + editPerson);

        System.out.println("Rediger data og tryk ENTER. Hvis der ikke skal redigeres noget tryk ENTER ");

        System.out.println("Fornavn: " + editPerson.getFornavn());
        String nytFornavn = sc.nextLine();
        if (!nytFornavn.isEmpty()) {
            editPerson.setFornavn(nytFornavn);
        }

        System.out.println("Efternavn: " + editPerson.getEfternavn());
        String nytEfternavn = sc.nextLine();
        if (!nytEfternavn.isEmpty()) {
            editPerson.setEfternavn(nytEfternavn);
        }

        System.out.println("Alder: " + editPerson.getAlder());
        String nyAlder = sc.nextLine();
        if (!nyAlder.isEmpty()) {
            editPerson.setAlder(Integer.parseInt(nyAlder));
        }

        System.out.println("Højde: " + editPerson.getHøjde());
        String nyHøjde = sc.nextLine();
        if (!nyHøjde.isEmpty()) {
            editPerson.setHøjde(Double.parseDouble(nyHøjde));
        }

        System.out.println("Vægt: " + editPerson.getVægt());
        String nyVægt = sc.nextLine();
        if (!nyVægt.isEmpty()) {
            editPerson.setVægt(Double.parseDouble(nyVægt));
        }
        System.out.println(editPerson);

    }
}
