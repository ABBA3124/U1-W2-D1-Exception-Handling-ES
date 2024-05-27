package Esercizio_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //breakpoint
        System.out.println("Benvenuto! scegli un'opzione dal menu:");
        System.out.println("1. Somma due numeri");
        System.out.println("2. Dividi due numeri");
        System.out.println("3. Esci");

        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                sommaDueNumeri(scanner);
                break;
            case 2:
                dividiDueNumeri(scanner);
                break;
            case 3:
                System.out.println("terminato");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
                break;
        }
    }


    //metodo per sommare due numeri
    public static void sommaDueNumeri(Scanner scanner) {
        System.out.println("Inserisci il primo numero da sommare:");
        int numeroSomma1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero da sommare:");
        int numeroSomma2 = scanner.nextInt();
        int somma = numeroSomma1 + numeroSomma2;
        System.out.println("Il risultato della somma è: " + somma);
    }

    //metodo per dividere due numeri
    public static void dividiDueNumeri(Scanner scanner) {
        try {
            System.out.println("Inserisci il primo numero da dividere:");
            int numeroDiv1 = scanner.nextInt();
            System.out.println("Inserisci il secondo numero da dividere:");
            int numeroDiv2 = scanner.nextInt();
            int divisione = numeroDiv1 / numeroDiv2;
            System.out.println("Il risultato della divisione è: " + divisione);
        } catch (ArithmeticException e) {
            System.out.println("Errore: non si può dividere per zero.");
        } catch (InputMismatchException e) {
            System.out.println("Errore: Inserisci un numero intero.");
        }
    }
}
