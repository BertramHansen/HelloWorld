import java.util.Random;

public class terningKast {
    public static void main(String[] args) {
        int sumOfRoll = -1;
        int antalKast = 0;
        Random rand = new Random();

        // while loop så terningerne slår indtil summen er 7

        while (sumOfRoll != 7) {
            int dice1 = rand.nextInt(1, 7);
            int dice2 = rand.nextInt(1, 7);
            sumOfRoll = dice1 + dice2;
            antalKast++;
            System.out.println(dice1 + " + " + dice2 + " = " + sumOfRoll);
        }
        System.out.println("Du brugte " + antalKast + " kast");

    }
}
