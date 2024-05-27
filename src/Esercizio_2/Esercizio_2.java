package Esercizio_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Inserisci il numero di km percorsi:");
            double kmPercorsi = scanner.nextDouble();

            System.out.println("Inserisci il numero di litri di carburante consumati:");
            double litriConsumati = scanner.nextDouble();

            double kmPerLitro = calcolaKmPerLitro(kmPercorsi, litriConsumati);

            System.out.println("km/litro percorsi: " + kmPerLitro);
        } catch (InputMismatchException e) {
            System.out.println(e + "Errore: input non valido");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }


    //metodo per calcolare km/litro
    private static double calcolaKmPerLitro(double km, double litri) {
        //check litri è 0
        if (litri == 0) {
            throw new ArithmeticException("diviso 0 non fattibile");
        }
        if (km == 0) {
            throw new ArithmeticException("Inserisci un numero valido di km");
        }
        return km / litri;
    }
}
