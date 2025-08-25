/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TE2 {

    public void Aleatorio(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(50) * 2; 
        }
    }

  
    public void imprimirVector(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TE2 T2 = new TE2();

        int n = 0;

     
        while (true) {
            try {
                System.out.print("Ingrese el tamaño del vector: ");
                n = sc.nextInt();
                if (n <= 0) {
                    throw new IllegalArgumentException(" El tamaño debe ser mayor que 0.");
                }
                break; 
            } catch (InputMismatchException e) {
                System.out.println(" Error: Debe ingresar un número entero válido.");
                sc.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int[] vector = new int[n];
        T2.Aleatorio(vector);

        System.out.println("\n Vector generado aleatoriamente:");
        T2.imprimirVector(vector);

    
    }
}