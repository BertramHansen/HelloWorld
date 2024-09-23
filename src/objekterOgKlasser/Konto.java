package objekterOgKlasser;

public class Konto {
    //
    private int kontoNummer;
    private String ownerName;
    private double saldo;

    //GET SET OWNERNAME
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    //GET SET KONTONUMMER
    public int getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer() {
        this.kontoNummer = kontoNummer;
    }
//GET SET SALDO

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Konto() {
    }

    public Konto(int kontoNummer, String ownerName) {
        saldo = 0;
    }

    public Konto(int kontoNummer, String ownerName, double startSaldo) {
        this.saldo = startSaldo;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            saldo += amount;
        } else {
            System.out.println("The amount needs to be a positive number");
        }
        return saldo;
    }

    public double withdraw(double withDrawAmount) {

        if (withDrawAmount > 0) {
            saldo = saldo - withDrawAmount;
            if (withDrawAmount > saldo) {
                return -1;
            }
        } else {
            System.out.println("Withdraw amount needs to be a positive number");
        }
        return saldo;

    }

    @Override
    public String toString() {
        return "Konto indehaver: " + ownerName + "\nKontonummer: " + kontoNummer + "\nSaldo: " + saldo;
    }
}
