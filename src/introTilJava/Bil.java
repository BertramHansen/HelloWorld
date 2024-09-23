package introTilJava;

public class Bil {
    private String farve;
    private int antalKm;
    private double pris;
    private Chauffør chauffør;

    public Bil(String farve, int antalKm, double nyPris) {
        this.farve = farve;
        this.antalKm = antalKm;
        this.pris = nyPris;
    }

    public void kør(int antalKm) {
        antalKm += antalKm;
    }

    public double nyPris() {
        return pris;
    }

    public double getPris() {
        return pris;
    }

    public Chauffør getChauffør() {
        return chauffør;
    }

    public void setChauffør(Chauffør chauffør) {
        this.chauffør = chauffør;
    }

    public boolean enChaufførSætterSigInd(Chauffør c) {
        if (chauffør == null) {
            setChauffør(c);
            return true;
        } else {
            return false;
        }
    }

    public Chauffør hvemKørerBilen() {
        return getChauffør();
    }

    public Chauffør chaufførenStigerUd() {
        if (chauffør != null) {
            Chauffør c = chauffør;
            chauffør = null;
            return c;
        } else {
            return null;
        }
    }



    @Override
    public String toString() {
        return "Bilen har farven " + farve + ". Har kørt " + antalKm + "Den koster: " + pris;
    }
}

