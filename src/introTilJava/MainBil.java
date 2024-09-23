package introTilJava;

public class MainBil {
    public static void main(String[] args) {


        Bil bil1 = new Bil("rød", 100, 100);
        Bil bil2 = new Bil("blå", 42341, 1000);
        Bil bil3 = new Bil("lyserød", 402, 100);
        Bil bil4 = new Bil("sort", 444, 900);


        Garage g = new Garage();

        g.tilføjBiler(bil1);
        g.tilføjBiler(bil2);
        g.tilføjBiler(bil3);
        g.tilføjBiler(bil4);

        System.out.println("Pris for bil 1: " +
                bil1.getPris() + "\nPris for bil 2: " + bil2.getPris() +
                "\nPris for bil 3: " + bil3.getPris() +
                "\nPris for bil 4: " + bil4.getPris() + "\nDen samlede pris for bilerne i garagen er: " +
                g.beregnPrisForAlleBiler());

        System.out.println("Den samlede pris fra garagen er: " + g.beregnPrisForAlleBiler());


//        Chauffør bertram = new Chauffør("Bertram");
//        Chauffør mathias = new Chauffør("Mathias");
//
//        Bil bil = new Bil("rød", 100, 199.95);
//
//        boolean kanVæreDer = bil.enChaufførSætterSigInd(bertram);
//
//        bil.setChauffør(bertram);
//        System.out.println(kanVæreDer);
//
//        System.out.println(bil.getChauffør());
//        System.out.println("Hvem kører bilen: " + bil.hvemKørerBilen());
//        System.out.println(bil);
//        System.out.println("Hvem stiger ud af bilen? " + bil.chaufførenStigerUd());
//
//        System.out.println(bil.getChauffør());


    }
}
