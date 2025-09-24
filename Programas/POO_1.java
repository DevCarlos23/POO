package poo_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class POO_1 {

    public static void main(String[] args) {
        //Declarar variables
        Scanner sc = new Scanner(System.in);
        int num1;
        
        //Excepciones
        try {
            System.out.println("Ingrese un numero entero");
            num1=sc.nextInt();
            int resultado=num1*num1;
            System.out.println("El cuadrado del numero ingresado es: "+resultado);
        }catch (InputMismatchException ex){
            System.out.println("Solo se admiten numeros enteros, no ingrese caracteres ");
        }
    }
}
