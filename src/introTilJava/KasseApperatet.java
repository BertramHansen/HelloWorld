package introTilJava;

import java.util.ArrayList;

public class KasseApperatet {
    public static void main(String[] args) {
        Vare mælk = new Vare("mælk", 11);
        Vare sukker = new Vare("sukker", 22);

        ArrayList<Ordrelinje> samletOrdrer = new ArrayList<>();

        Ordrelinje ordrerMælk = new Ordrelinje(mælk, 3);
        Ordrelinje ordrerSukker = new Ordrelinje(sukker, 4);

        samletOrdrer.add(ordrerMælk);
        samletOrdrer.add(ordrerSukker);

        Kurv bon = new Kurv(samletOrdrer);

        System.out.println(bon);
        System.out.println("Koster i alt: " + bon.bonPris());

    }
}
