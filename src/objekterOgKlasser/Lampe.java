package objekterOgKlasser;

public class Lampe {
    //true er lyset er slukket. false er lyset er ikke slukket
    private boolean erSlukket;
    private static int antalLamper;

    public Lampe(boolean erSlukket) {
        this.erSlukket = erSlukket;
    }
    public Lampe() {
        erSlukket = false;
        antalLamper++;

    }
    public void trykPåKontakt(){

        if (erSlukket){
            erSlukket=false;
        }else{
            erSlukket=true;
        }


    }
    public boolean geterSlukket(){
        return erSlukket;
    }
    public int getAntalLamper(){
        return antalLamper;

    }


    @Override
    public String toString() {
        if(erSlukket == true) {
            return "er slukket";
        }else{
            return "er tændt";

        }
    }
}

