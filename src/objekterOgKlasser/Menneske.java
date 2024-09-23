package objekterOgKlasser;

public class Menneske {
    //atributter til klassen menneske
    private String navn;
    private Menneske ægtefælle;


    //cunstroctor
    public Menneske(String navn) {
        this.navn = navn;
        this.ægtefælle = null; //ingen til at starte med

    }
    //så skal vi have en getter og setter for ægtefællen


    public Menneske getÆgtefælle() {
        return ægtefælle;
    }

    public void setÆgtefælle(Menneske ægtefælle) {
        this.ægtefælle = ægtefælle;
    }

    //metode for gifter sig med hvor vi sørger for man ikke kan gifte sig med sig selv
    public void gifterSigMed(Menneske nyPerson) {
        if (this == nyPerson) {
            System.out.println("Du kan ikke blive gift med dig selv!!");

        }
        if (nyPerson.ægtefælle != null) {
            System.out.println(nyPerson.navn + " er allerede gift med " + nyPerson.ægtefælle.navn);
        } else {
            this.setÆgtefælle(nyPerson);
            nyPerson.setÆgtefælle(this);

            System.out.println(this.navn + " og " + nyPerson.navn + " er nu gift");
        }

    }

    public void bliverSkilt() {
        if (this.ægtefælle == null) {
            System.out.println(this.navn + " er ikke gift.");
        }
        Menneske fraSkildtægteFælle = this.ægtefælle;
        this.ægtefælle.setÆgtefælle(null);
        this.setÆgtefælle(null);

        System.out.println(this.navn + " er ikke længere gift med " + fraSkildtægteFælle.navn + ".");
    }

}