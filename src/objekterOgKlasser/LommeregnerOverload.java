package objekterOgKlasser;

import java.sql.SQLOutput;

public class LommeregnerOverload {
    public void add(double dec1, double dec2) {
        System.out.println("Addition of two integers: " + dec1 + " + " + dec2 + " = " + (dec1+dec2));
    }

    public void add(int hel1, int hel2) {
        System.out.println("Addition of two integers: " + hel1 + " + " + hel2 + " = " + (hel1+hel2));

    }

    public void add(int hel1, int hel2, int hel3) {
        System.out.println("Addition of three integers: " + hel1 + " + " + hel2 + " + " + hel3 + " = " + (hel1+hel2+hel3));
    }

    public void add(double dec, int hel1) {
        double sum = dec + hel1;
        System.out.println("Addition of a double and an integer: " + dec + " * " + hel1 + " = " + (dec * hel1));

    }

    public int add (String tal1, String tal2){
        int sum = Integer.parseInt(tal1) + Integer.parseInt(tal2);
        return sum;
    }

    public void multiply(double deci1, double deci2) {
        System.out.println("Multiplication of two doubles: " + deci1 + " * " + deci2 + " = " + (deci1 * deci2));
    }

    public void multiply(int helt1, int helt2) {
        System.out.println("Multiplication of two integers: " + helt1 + " * " + helt2 + " = " + (helt1 * helt2));
    }

    public void division(int div1, int div2) {

        System.out.println("Division of two integers: " + div1 + " / " + div2 + " = " + (div1 / div2));
    }

    public static void main(String[] args) {
        LommeregnerOverload lommeregner = new LommeregnerOverload();
        //add med 2 ints
        lommeregner.add(5, 10);
        //add med 2 doubles
        lommeregner.add(3.5,4.7);
        //add med 3 ints
        lommeregner.add(1,2,3);
        //multiplikation af 2 integers
        lommeregner.multiply(5,6);
        //multiplikation af 2 doubles
        lommeregner.multiply(3.5,2.0);
        //division af 2 integers
        lommeregner.division(10,2);
        //add med to strings
        System.out.println(lommeregner.add("2","4"));
    }
}

