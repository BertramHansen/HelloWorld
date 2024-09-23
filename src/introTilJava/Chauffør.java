package introTilJava;

public class Chauffør {
    private String navn;


    public Chauffør(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
