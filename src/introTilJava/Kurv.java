package introTilJava;

import java.util.ArrayList;

public class Kurv {
    private ArrayList<Ordrelinje> ordre = new ArrayList();

    public Kurv(ArrayList<Ordrelinje> ordrelinje){
        this.ordre.addAll(ordrelinje);
    }

    public double bonPris(){
        double samletPris=0;

        for(Ordrelinje item : ordre){
           samletPris += item.samletPris();
        }
        return samletPris;
    }

    @Override
    public String toString(){
        String vareNavn = "";
        for(Ordrelinje item : ordre){
            vareNavn += item + " \n";

        }
        return vareNavn;
    }
}
