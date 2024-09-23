package objekterOgKlasser;

public class BilletautomatDemo {
    public static void main(String[] args) {
        Billetautomat billetDemo = new Billetautomat(100);

        billetDemo.inbetal(99 + 1);
        System.out.println("pris er: " + billetDemo.getPris());
        System.out.println("Der er indbetalt: " +  billetDemo.getSaldo());

        billetDemo.printBillet();
        System.out.println("Billetprisen er: " + billetDemo.getPris());
        System.out.println("Din saldo er " + billetDemo.getSaldo());

    }
}
