package objekterOgKlasser;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;


    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);

        timeTick();
        updateDisplay();
    }

    public void timeTick() {
        minutes.valueIncrease();
        if (minutes.getValue() == 0) {
            hours.setValue(1);
        }
        updateDisplay();
    }

    public String getDisplayString() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    private void updateDisplay() {
        displayString = hours.getValue() + ":" + minutes.getValue();
    }
}
