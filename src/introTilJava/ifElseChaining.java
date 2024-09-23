import java.util.Scanner;

public class ifElseChaining {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();

        if (x<0){
            System.out.println("x is negative");}
        else if (x > 0) {
            System.out.println("x is positive");}
        else {
            System.out.println("x is zero");
        }
    }
}
