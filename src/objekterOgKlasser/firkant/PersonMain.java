package objekterOgKlasser.firkant;
public class PersonMain {
    public static void main(String[] args) {

        Person bertram = new Person("Bertram", "Hansen", 22, 187.0, 90.2);
        bertram.udskrivPerson();

        Person mathias = new Person("Mathias", "Clausen",26, 185.0, 85.8);
        mathias.udskrivPerson();

        Person nicolai = new Person("Nicolai", "Jensen",28, 180, 85);
        nicolai.udskrivPerson();
    }
}
