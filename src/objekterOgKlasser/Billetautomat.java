package objekterOgKlasser;

public class Billetautomat {
    //atribut
    private int pris;
    //atribut
    private int saldo;
    //aner ikke rigtigt hvad jeg bruger den her til?
    private int total;

//cunstructor
    public Billetautomat(int billetpris) {
        this.saldo = 0;
        this.total = 0;
        pris = billetpris;

    }
//Metode der gør vi kan få fat i prisen
    public int getPris() {
        return pris;
    }
// metode der gør vi kan få fat i saldoen
    public int getSaldo() {
        return saldo;
    }
//en metode der gør det muligt at indbetale da den tager saldo og lægger kroner til som er variablen for det indbetalte beløb
    public void inbetal(int kroner){
        if (kroner > 0 ){
            saldo = saldo + kroner;
        }else{
            System.out.println("Beløbet skal være større end " + kroner);
        }



    }
    //Printer billetten hvis prisen er mødt i indbetalingen ellers siger den man har indbetalt for lidt.
    public void printBillet(){

        if(saldo >= pris) {
            System.out.println("########################");
            System.out.println("### TogBillet###");
            System.out.println("########################");
            System.out.println("## Billet:" + pris + "kr." + "##");
            System.out.println();
            total += saldo;
            saldo = 0;
        } else {
            System.out.println("Der skal som minimum indbetales " + (pris - saldo) + "kr. for at billetten kan betales");
        }
    }
}

