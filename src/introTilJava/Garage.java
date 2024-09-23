package introTilJava;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> bilerne = new ArrayList<Bil>();


    public void tilføjBiler(Bil bil) {
        bilerne.add(bil);
    }

    public double beregnPrisForAlleBiler() {
        double samletPris = 0;

        for (Bil bil : bilerne) {
            samletPris += bil.getPris();
        }
        return samletPris;
    }
}
