package introTilJava;

public class Dato {
    public static void main(String[] args) {
        int year = 2024;
                String month = "August";
                int date = 28;
                String day = "Wednesday";

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(day);

        System.out.println("Amerikansk format = " + day + ", " + month + " " + date + ", " + year);
        System.out.println("Europæisk format = " + day + " " + date + " " + month + " " + year);

    }
}
