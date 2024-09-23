import static java.lang.Math.exp;
import static java.lang.Math.pow;

public class IterateThroughArray {
    public static void main(String[] args) {
        double[] array = {4.5, 25.3, 12.1, 34.0, 15.5};

        /*for (int i = 0; i <array.length; i++) {
            pow(array[i], 2.0);

            System.out.println(pow(array[i], 2.0));
        }
        */
/*
        double smallest = array[0];

        for (int i = 0; i<array.length; i++) {
            if (array[i] < smallest) smallest = array[i];
        }
        System.out.println(smallest);

        double largest = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > largest) largest = array[i];
        }
        System.out.println(largest);*/

        double luckyNumber = array[2];

        for (int i = 0; i < array.length; i++) {

            if (array[i] == luckyNumber) {

                System.out.println("Hurra jeg fandt 12.1 Det stod på index " + i);
            }

        }
    }
}