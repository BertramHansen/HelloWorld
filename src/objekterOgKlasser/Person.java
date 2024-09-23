package objekterOgKlasser;

public class Person {
    private String fornavn;
    private String efternavn;
    private double skostørrelse;

    public Person(String fornavn, String efternavn, double skostørrelse){
        this.fornavn=fornavn;
        this.efternavn= efternavn;
        this.skostørrelse = skostørrelse;
    }

    public String getFornavn(){
        return fornavn;
    }

    public String getEfternavn(){
        return efternavn;
    }

    public double getSkostørrelse(){
        return skostørrelse;
    }
    public void setSkostørrelse(double skostørrelse){
        this.skostørrelse = skostørrelse;
    }

    public void udskrivPerson(){
        System.out.println("navn: " + fornavn + "efternavn: " + efternavn + "skostørrelse: " + skostørrelse);
    }
}
