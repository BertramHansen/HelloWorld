package introTilJava;

public class Vare {
    private String varenavn;
    private double pris;

    public Vare(String varenavn, double pris){
        this.varenavn = varenavn;
        this.pris =pris;
    }

    public double getPris(){
        return pris;
    }

    @Override
    public String toString(){
        return varenavn + " pris: " + pris + "kr.";
    }

}
