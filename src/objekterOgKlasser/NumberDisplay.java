package objekterOgKlasser;

public class NumberDisplay {

    //atributter
    private int value;
    private int limit;

    //number display skal retunere int
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit; //definere grænsen for hvonrå value skal rulle
        value = 0; //startværdi
    }

    //getter metode til at tage aktuelle værdi
    public int getValue() {
        return value; //returnere værdien.
    }

    // en getter der returnere en string som er værdien hvis værdien er større end nul.
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    //en setter der returnere en int som er replacement value for den nuværende value. hvis den er i mellem nul og limit
    // er den nye værdi replacement value.
    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue <= limit) {
            value += replacementValue;
        }

    }

    //en increaser der gør at value stiger med 1 og at hvis value er større end limit returnere den restværdien.
    public void valueIncrease() {
            value = ++value % limit;
        }
}
