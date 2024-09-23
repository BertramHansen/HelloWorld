import java.util.Scanner;

public class ifSætninger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hvilken farve har lyset?");
        String color = input.next();

        if (color.equals("rød")) {
            System.out.println("Rødt lys");
        } else if (color.equals("gul")){
            System.out.println("Gult lys");
        } else {
            System.out.println("Grønt lys");
        }
    }
}




