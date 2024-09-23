package objekterOgKlasser;

public class DigitalClockDemo {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay();
        System.out.println(clockDisplay.getDisplayString());

        for (int i = 0; i < 360; i++) {
            clockDisplay.timeTick();

            System.out.println(clockDisplay.getDisplayString());
        }
    }
}
