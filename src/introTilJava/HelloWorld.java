package introTilJava;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'k';
        char studentLastInitial = 'H';
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);

        String studentName = "Karly Harley";
        System.out.println(studentName + " " + "has a GPA of" + " " + studentGPA);
}
}