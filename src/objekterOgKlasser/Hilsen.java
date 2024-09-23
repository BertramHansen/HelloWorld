package objekterOgKlasser;

public class Hilsen {

    /* public static String hej(String name) {
         return "Hej " + name + "!";

     } */
    public void hej(String name) {
        //return "Hej " + name + "!";
        System.out.println("Hej " + name + "!");
    }

    public static void main(String[] args) {
        /*hej("Signe");

        String name = "Anne";

        hej(name);

        System.out.println(hej("Signe"));
        System.out.println(hej("Bertram"));
        System.out.println(hej("Jens"));

        Hilsen hi = new Hilsen();

        System.out.println(hi.hej("Bertram"));*/

        Hilsen hi = new Hilsen();
        hi.hej("Bertram");
    }
}