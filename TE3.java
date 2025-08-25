package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TE3 {

    private int[][] matriz;

    public void generar(int m, int n) {
        matriz = new int[m][n];
        int contador = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (contador % 2 == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                contador++;
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Excep;
        do {
            Excep = true;
            try {
                System.out.print("Digite el numero de filas: ");
                int m = sc.nextInt();
                System.out.print("Digite el numero de columnas: ");
                int n = sc.nextInt();
                TE3 T3 = new TE3();
                T3.generar(m, n);
                System.out.println("La matriz generada es:");
                T3.imprimir();

            } catch (InputMismatchException ex) {
                System.out.println("Solo se admiten numeros enteros positivos, no ingrese caracteres, numeros negativos ni simbolos");
                sc.nextLine();
                Excep = false;
            }
        } while (!Excep);
    }
}
