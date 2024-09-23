public class fårLoop {
    public static void main(String[] args) {


        int startTal = 2;

        for (int i = 1; i < 5; i++) {
            int result = startTal * i;


            System.out.println(startTal + " gange med " + i + " = " + result);
        }
        for (int i = 1; i < 7; i++) {
            int talrække = (i * 2);

            System.out.print(talrække + " ");
        }
        System.out.println("\nOpgave 2: ");

        for (int i = 0; i < 6; i++) {
            int start = 4;
            int talrække = start + i * 15;
            System.out.print(talrække + " ");
        }
        System.out.println("\nOpgave 3:");
        for (int i = 0; i < 6; i++) {
            int start = 30;
            int talrække = start - 10 * i;

            System.out.print(talrække + " ");
        }
        System.out.println("\nOpgave 4: ");

        for (int i = 0; i < 6; i++) {
            int start = -7;
            int talrække = start + i * 4;

            System.out.print(talrække + " ");

        }
        System.out.println("\nOpgave 5: ");
        for (int i = 0; i < 6; i++) {
            int start = 97;
            int talrække = start - 3 * i;

            System.out.print(talrække + " ");
        }
    }
}