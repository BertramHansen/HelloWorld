package introTilJava;

import java.util.Scanner;

public class RepresentAStudent2 {
    public static void main(String[]args) {
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Harler";
        String studentName = studentFirstName + " " + studentLastName;
        System.out.println(studentName + " " + "has a GPA of " + studentGPA );

        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentName + " now has a GPA of " + studentGPA);


    }
}
