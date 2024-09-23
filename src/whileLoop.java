import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("would you like to take this song off of repeat? If so, answer yes");
            String input = scanner.next();
            if ("yes".equals(input)) {
                isOnRepeat = false;

            }
        }
        System.out.println("Playing next song");
    }
}
