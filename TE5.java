package poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TE5 {
    private ArrayList<String> Estudiantes;

    // Constructor
    public TE5() {
        Estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante
    public void Agregar(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("⚠️ El nombre no puede estar vacío.");
        } else {
            Estudiantes.add(nombre.trim());
            System.out.println("✅ Estudiante agregado: " + nombre);
        }
    }

    // Método para ordenar de mayor a menor por longitud
    public void Ordenar() {
        Collections.sort(Estudiantes, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length()); // descendente
            }
        });
    }

    // Método para mostrar estudiantes
    public void Mostrar() {
        if (Estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados ");
        } else {
            for (String nombre : Estudiantes) {
                System.out.println(nombre + " (" + nombre.length() + " caracteres)");
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        TE5 grupo = new TE5();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            try {
                System.out.println("\n--- Menú ---");
                System.out.println("1. Agregar estudiante");
                System.out.println("2. Mostrar lista original");
                System.out.println("3. Ordenar por longitud (mayor a menor)");
                System.out.println("4. Mostrar lista ordenada");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del estudiante: ");
                        String nombre = sc.nextLine();
                        grupo.Agregar(nombre);
                        break;
                    case 2:
                        System.out.println("\nLista actual:");
                        grupo.Mostrar();
                        break;
                    case 3:
                        grupo.Ordenar();
                        System.out.println("✅ Lista ordenada de mayor a menor por longitud.");
                        break;
                    case 4:
                        System.out.println("\nLista ordenada:");
                        grupo.Mostrar();
                        break;
                    case 0:
                        System.out.println("👋 Saliendo del programa...");
                        break;
                    default:
                        System.out.println("⚠️ Opción no válida, intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se puede ingresar un número válido.");
                sc.nextLine(); // limpiar el buffer para evitar bucles infinitos
            }
        } while (opcion != 0);
        sc.close();
    }
}
