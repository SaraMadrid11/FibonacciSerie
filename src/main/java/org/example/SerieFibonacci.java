package org.example;
import java.util.Scanner;
public class SerieFibonacci {

    /**
     * @param args argumentos linea de comandos
     */
    public static void main(String[] args) {

        //Leer desde el teclado
        Scanner Entry = new Scanner(System.in);

        System.out.println("Ingrese el numero de la serie Fibonacci: ");
        //variable para guardar el número digitado por teclado
        long Number = Entry.nextLong();
        System.out.print("----------------RESULTADO--------------------");

        //Dejar un espacio entre la cantidad digitada para la serie y el inicio
        System.out.println(" ");


        //Muestra el resultado y/o la serie
        for (int i = 0; i < Number; i++) {

            if (PrimeNumber(FibonacciSerie(i))) {
                System.out.println(FibonacciSerie(i) + " - " + " El Número Primo");
            } else {
                System.out.println(FibonacciSerie(i) + " - El numero no es Primo");
            }
        }
    }

    //Método que calcula la secuencia hasta llegar a N numeros

    public static long FibonacciSerie(long NumberEntry) {

        if (NumberEntry > 1) {
            //Funcion Recursiva
            return FibonacciSerie(NumberEntry - 1) + FibonacciSerie(NumberEntry - 2);
        } else if (NumberEntry == 1) {
            //Caso base
            return 1;
        } else if (NumberEntry == 0) {
            //Caso base
            return 0;
        } else {
            //Error
            System.out.println("Ingrese un tamaño igual o mayor a 1");
            return -1;
        }
    }

    //Método que define si el numero de la serie es primo o no
    public static boolean PrimeNumber(long NumberValidation) {
        //Variable para guardar si el número a validar es primo o no
        boolean ValidationPrime = false;
        //Variable contadora de cantidad de divisibles que tiene el número ingresado
        int Divisibles = 0;

        //for para saber cuantos numeros divisibles tiene el valor ingresado
        for (int i = 1; i <= NumberValidation; i++) {
            if (NumberValidation % i == 0) {
                Divisibles++;
            }
        }

        //Saber si el valor solo tiene 2 números divisibles/ primo
        if (Divisibles == 2) {
            ValidationPrime = true;
        }
        return ValidationPrime;
    }
}
