package objekterOgKlasser;

public class MenneskeMain {
    public static void main(String[] args) {

        Menneske person1 = new Menneske("John");
        Menneske person2 = new Menneske("Brian");


        person1.gifterSigMed(person2);

        person1.bliverSkilt();
        person2.gifterSigMed(person1);

    }
}
