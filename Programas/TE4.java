package poo;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TE4 {

    private int[][] mat;
    private int filas, columnas;
    private Random random = new Random();
    private String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public void Dimensiones() {
        Scanner sc = new Scanner(System.in);
        boolean Excep;
        do {
            Excep = true;
            try {
                System.out.print("Por favor ingrese el numero de filas: ");
                filas = sc.nextInt();
                System.out.print("Por favor ingrese el numero de columnas: ");
                columnas = sc.nextInt();
                mat = new int[filas][columnas];

            } catch (NegativeArraySizeException | InputMismatchException ex) {
                System.out.println("Solo se admiten numeros enteros positivos, no ingrese caracteres, numeros negativos ni simbolos");
                sc.nextLine();
                Excep = false;
            }
        } while (!Excep);
    }

    public void Generar() {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                mat[f][c] = random.nextInt(100);
            }
        }
    }

    public void Imprimir() {
        System.out.println("\nMatriz generada con sumas:");
        System.out.print("\t");

        for (int j = 0; j < columnas; j++) {
            System.out.print((2013 + j) + "\t");
        }
        System.out.println();

        int[] sumaColumnas = new int[columnas];
        for (int i = 0; i < filas; i++) {
            System.out.print(meses[i] + "\t");
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                System.out.print(mat[i][j] + "\t");
                sumaFila += mat[i][j];
                sumaColumnas[j] += mat[i][j];
            }
            System.out.println(sumaFila);
        }

        System.out.print("\t");
        for (int j = 0; j < columnas; j++) {
            System.out.print(sumaColumnas[j] + "\t");
        }
        System.out.println();
    }

    public void sumaFilas() {
        System.out.println("Suma de cada fila:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += mat[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }
    }

    public void sumaColumnas() {
        System.out.println("Suma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += mat[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }
    }

    public void hallarMayorVenta() {
        int maxVenta = mat[0][0];
        int filaMax = 0, colMax = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mat[i][j] > maxVenta) {
                    maxVenta = mat[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }
        System.out.println("La mayor venta es: " + maxVenta + " en Fila " + (filaMax + 1) + ", Columna " + (colMax + 1));
    }

    public void hallarMenorVenta() {
        int minVenta = mat[0][0];
        int filaMin = 0, colMin = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mat[i][j] < minVenta) {
                    minVenta = mat[i][j];
                    filaMin = i;
                    colMin = j;
                }
            }
        }
        System.out.println("La menor venta es : " + minVenta + " en Fila " + (filaMin + 1) + ", Columna " + (colMin + 1));
    }

    public static void main(String[] args) {
        TE4 T4 = new TE4();
        T4.Dimensiones();
        T4.Generar();
        T4.Imprimir();
        T4.sumaFilas();
        T4.sumaColumnas();
        T4.hallarMayorVenta();
        T4.hallarMenorVenta();
    }
}
