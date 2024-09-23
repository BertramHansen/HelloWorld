package objekterOgKlasser;

public class Værelse {
    public static void main(String[] args) {
        Lampe stueLampe = new Lampe();
        Lampe væresesLampe = new Lampe();


        System.out.println(væresesLampe.geterSlukket());

        stueLampe.trykPåKontakt();
        System.out.println(stueLampe.geterSlukket());
        System.out.println(stueLampe.getAntalLamper());

        System.out.println(stueLampe);
        System.out.println(væresesLampe);

    }
}
