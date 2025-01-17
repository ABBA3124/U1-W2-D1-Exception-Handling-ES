package Esercizio_3.entities;

public class Banca {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
        System.out.println("Saldo conto: " + conto1.getSaldo());
        try {
            conto1.preleva(1750.5);
            System.out.println("Saldo conto: " + conto1.getSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        conto2.stampaSaldo();
        try {
            conto2.preleva(1000);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
