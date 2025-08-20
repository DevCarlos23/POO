package poo_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {
        
        //Declarar variables
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        //Excepciones
        try {
            System.out.println("Ingrese un numero entero");
            num1 = sc.nextInt();
            System.out.println("Ingrese un numero entero");
            num2 = sc.nextInt();
            int resultado = num1 / num2;
            System.out.println("El resultado de la division  de " + num1 + " Sobre " + num2 + " es: " + resultado);
            //Excepcion de tipo formato
        } catch (InputMismatchException ex) {
            System.out.println("Solo se admiten numeros enteros, no ingrese caracteres " + ex);
            //Excepcion Aritmetica
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir por cero " + ex);
        }
    }
}
