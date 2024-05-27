package Esercizio_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[5];

        //inserisce dentro array numeri interi casuali compresi tra 1 e 10 in maniera randomica grazie al Random
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }


        stampaArray(array);

        while (true) {
            try {
                System.out.println("Per terminare il programma inserisci 0:");
                System.out.println("Inserisci un numero:");
                int numero = scanner.nextInt();

                //se utente inserisce 0 termina il codice
                if (numero == 0) {
                    break;
                }

                System.out.println("Inserisci la posizione (0-4):");
                int posizione = scanner.nextInt();

                //modifica array nella posizione specificata
                array[posizione] = numero;

                //stampa array con il nuovo numero nella posizione fornita
                stampaArray(array);
            } catch (InputMismatchException e) {
                System.out.println("Errore: Inserisci un intero.");
                scanner.next(); //cancella input non valido
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: Inserisci un valore tra 0 e 4.");
            }

        }

        System.out.println("Programma terminato.");
    }

    //metodo per stampare lo stato dell'array
    private static void stampaArray(int[] array) {
        System.out.print("Array attuale: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
