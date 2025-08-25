package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TE1 {

     public void generar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100); // Genera números entre 0 y 99
        }
    }

    // Método para imprimir un vector
    public void imprimir(int[] vector, int numeroVector) {
        System.out.println("Vector " + numeroVector + ":");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
    
     public int[] concatenar(int[] v1, int[] v2) {
        int[] resultado = new int[v1.length + v2.length];

        // Copiar elementos del primer vector
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i];
        }

        // Copiar elementos del segundo vector
        for (int i = 0; i < v2.length; i++) {
            resultado[v1.length + i] = v2[i];
        }

        return resultado;
    }

     
    public static void main(String[] args) {
      Scanner inn = new Scanner(System.in);
        TE1 T1 = new TE1(); 

     try {
            // Leer tamaño del primer vector
            System.out.print("Digite el numero de elementos del vector 1: ");
            int m = inn.nextInt();
            if (m <= 0) throw new IllegalArgumentException("El tamaño del vector debe ser mayor a 0.");
            int[] vector1 = new int[m];

            // Leer tamaño del segundo vector
            System.out.print("Digite el numero de elementos del vector 2: ");
            int n = inn.nextInt();
            if (n <= 0) throw new IllegalArgumentException("El tamaño del vector debe ser mayor a 0.");
            int[] vector2 = new int[n];

            // Generar valores aleatorios en ambos vectores
            T1.generar(vector1);
            T1.generar(vector2);

            // Imprimir ambos vectores
            T1.imprimir(vector1, 1);
            T1.imprimir(vector2, 2);

            // Concatenar
            int[] vectorConcatenado = T1.concatenar(vector1, vector2);

            // Imprimir el vector resultante
            T1.imprimir(vectorConcatenado, 3);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un numero entero va5"
                    + "lido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado: " + e.getMessage());
        } finally {
            inn.close();
        }
    }
}
