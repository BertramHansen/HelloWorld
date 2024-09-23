package ArraySøgning;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySøgning {
    public static void main(String[] args) {
//opretter en simpel array med en masse tal :)
        int[] tabel = {2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5};
        int søgetal = 5;
        boolean fundet = false;
//opretter en rom arrayList der med et for each loop får talene fra tabel ind i arraylisten tabel 2
        ArrayList<Integer> tabel2 = new ArrayList<>();
        for(int tal : tabel) {
            tabel2.add(tal);
        }

        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] == søgetal) {
                System.out.println("Fundet på position: " + i);
                fundet = true;
                //break bliver sat ind hvis man kun vil finde 1/ den første forekomst af tallet
                break;
            }
        }

        if (!fundet) {
            System.out.println("Elementet blev ikke fundet");
        }

    }
}