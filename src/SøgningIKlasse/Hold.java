package SøgningIKlasse;

import java.util.ArrayList;

public class Hold {


    private ArrayList<Studerende> holdStuderende = new ArrayList<>();


    public void tilføjStuderende(Studerende elev) {
        holdStuderende.add(elev);
    }


    public Studerende findStuderende(String søgeNavn){
        for(Studerende stud : holdStuderende){
            if(stud.getNavn().contains(søgeNavn)){
                return stud;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String elevInfo = "";
        int counter = 1;
        for (Studerende stud : holdStuderende) {
            elevInfo += counter++ + ". " + "Navn på studerende: " + stud.getNavn() + " Email: " + stud.getEmail() + "\n";
        }
        return elevInfo;
    }
}
