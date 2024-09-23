package SøgningIKlasse;

public class Studerende {
    private String navn;
    private String email;

    public Studerende (String navn, String email){
        this.navn = navn;
        this.email = email;
    }

    public String getNavn(){
        return navn;
    }
    public void setNavn(String navnNy){
        this.navn = navnNy;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String mail){
        this.email=mail;
    }

    @Override
    public String toString(){
        return "Studerende navn: " + navn + " Email: " + email;
    }
}
