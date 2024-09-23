import java.util.Scanner;

public class bmiUdregner {
    public static void main(String[] args) {
        System.out.println("Dette er en BMI-Beregner. Den kan ud fra din højde i meter og vægt i kilo, udregne din BMI.\n\nIndtats venligst din højde og vægt.");

        Scanner input = new Scanner(System.in);
        System.out.print("Vægt i kilo:");
        double vægt = input.nextDouble();

        System.out.print("Højde i meter:");
        double højde = input.nextDouble();
        double bmiFormel = vægt / (højde * højde);

        System.out.println("Din BMI er: " + bmiFormel);
//KODE med ifstatements

        if (bmiFormel < 18.5) {
            System.out.println("Du er undervægtig");
        }
        if (bmiFormel > 18.5 && bmiFormel < 25.0) {
            System.out.println("Du er normalvægtig");
        }
        if (bmiFormel > 25 && bmiFormel < 30) {
            System.out.println(" Du er overvægtig");
        } else {
            System.out.println("Du er svært overvægtig");
        }
    }


}

