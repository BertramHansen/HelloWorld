package objekterOgKlasser;

public class MystiskeTal {
    public static void main(String[] args) {
        int x = 15;
        udtryk(x, 42);

        int y = x -5;
        udtryk (y, x + y);


    }
    public static void udtryk (int tal1, int tal2){
        System.out.println(tal1 + " " + tal2);
    }
}

