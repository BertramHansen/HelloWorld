public class Tid {
    public static void main(String[] args) {
        int sekund = 30;
        int minut = 55;
        int time = 9;

        int sekundFærdig = 20;
        int minutFærdig = 16;
        int timeFærdig = 10;

        System.out.println("Sekunder: " + sekund);
        System.out.println("Minut: " + minut);
        System.out.println("Time: " + time);
        int sekunderSidenMidnat = minut * 60 + time * 60 * 60 + sekund;
        System.out.println("Sekunder siden midnat: " + sekunderSidenMidnat);

        int sekunderPåEtDøgn = 24 * 60 * 60;

        System.out.println("sekunder på et døgn:" + sekunderPåEtDøgn);
        int sekunderTilbageIdag = sekunderPåEtDøgn - sekunderSidenMidnat;

        System.out.println("Sekunder tilbage i dag: " + sekunderTilbageIdag);
        int tidFærdigSekund = timeFærdig * 60 * 60 + minutFærdig * 60 + sekundFærdig;

        System.out.println("Tid når færdig sekunder: " + tidFærdigSekund);
        int tidBrugtSekunder = tidFærdigSekund - sekunderSidenMidnat;

        System.out.println("Tid brugt på opgaven i sekunder:" + tidBrugtSekunder);
        System.out.println("brøkdel af timen der er gået = " + minut / 60);

        System.out.print("Procentdel af timen der er gået: ");
        System.out.println(minut * 100 / 60);

        double minutter = 55.0;
        System.out.print("Brøkdel af timen der er gået: ");
        System.out.println(minutter / 60);

        System.out.print("Brøkdel af timen der er gået: ");
        System.out.println((double) minut/(60));

        final int MINUTTER_PER_TIME = 60;

        System.out.print("Brøkdel af timen der er gået: ");
        System.out.println(minutter/MINUTTER_PER_TIME);
        
    }
}
