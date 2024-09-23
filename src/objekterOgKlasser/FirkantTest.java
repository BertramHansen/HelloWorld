package objekterOgKlasser;
import objekterOgKlasser.firkant.Circle;
import objekterOgKlasser.firkant.Firkant;

public class FirkantTest{
    public static void main(String[] args) {
        Firkant firkantA = new Firkant(4.2, 3.5);
        Firkant firkantB = new Firkant(5.6, 5.6);

        double arealA = firkantA.beregnAreal();
        double arealB = firkantB.beregnAreal();

        System.out.println("areal af firkant A  = " + arealA + " " + firkantA.hvilkenSlagsFirkant());
        System.out.println("areal af firkant B  = "  + arealB + " " + firkantB.hvilkenSlagsFirkant());

        Circle cirkel1 = new Circle(3);
        Circle cirkel2=new Circle(5);
        Circle cirkel3 = new Circle(9); 

        System.out.println("arealet af cirkel 1 er: " + cirkel1.circArea());
        System.out.println("arealet af cirkel 2 er: " + cirkel2.circArea());
        System.out.println("arealet af cirkel 3 er: " + cirkel3.circArea());

    }
}
