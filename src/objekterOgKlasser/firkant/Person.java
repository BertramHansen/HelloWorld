package objekterOgKlasser.firkant;

public class Person {

    String fornavn;
    String efternavn;
    int alder;
    double højde;
    double vægt;

    public Person(String fornavn, String efternavn, int alder, double højde, double vægt) {

        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
        this.højde = højde;
        this.vægt = vægt;
    }

    public void udskrivPerson() {
        System.out.println("Fornavn: " + fornavn + "\nEfternavn: " + efternavn + "\nSkostørrelse: " + vægt);

    }

    public String setFornavn(String nytNavn) {
        fornavn = nytNavn;
        return fornavn;
    }

    public String setEfternavn(String nytNavn) {
        efternavn = nytNavn;
        return efternavn;
    }
    public String getEfternavn() {
        return efternavn;
    }

    public String getFornavn() {
        return fornavn;
    }



    public double getHøjde() {
        return højde;
    }

    public void setHøjde(double højde) {
        this.højde = højde;
    }

    public double getVægt() {
        return vægt;
    }
    public void setVægt(double vægt){
        this.vægt = vægt;
    }

    public int getAlder(){
        return alder;
    }
public void setAlder(int age){
        this.alder = age;
}
    @Override
    public String toString(){
        return "Fornavn: " + fornavn + ". Efternavn: " + efternavn + " Alder: " + alder + " Højde: " + højde + " Vægt: " + vægt;
    }
}
