package objekterOgKlasser;

public class TerningSpil {
    public static void main(String[] args) {
        boolean snakeEyes = false;
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        while (!snakeEyes) {
            terning1.roll();
            terning2.roll();
            System.out.println("Værdien af ternin 1 er: " + terning1.getFaceValue() + "\nVærdien af teerning 2 er: " + terning2.getFaceValue());
            if (terning1.getFaceValue() == 1 && terning2.getFaceValue() == 1) ;
            snakeEyes = true;
            System.out.println("SNAKEEYES!");
        }


    }
}

