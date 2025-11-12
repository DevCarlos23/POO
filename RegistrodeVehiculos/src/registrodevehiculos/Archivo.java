package registrodevehiculos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {

    public void crearArchivo() {
        //String ruta = "C:\\Ucompensar\\Archivos\\salida.txt";
        String ruta = "C:\\Users\\Carlo\\Documents\\salida.txt";
        File archivo = new File(ruta);

        try {
            archivo.getParentFile().mkdirs();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
                writer.write("Este archivo contiene los datos del JTable");
                writer.newLine();
                writer.write("Fecha: " + java.time.LocalDate.now());
                writer.newLine();
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Archivo creado (o verificado) en:\n" + ruta);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error al crear el archivo:\n" + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void guardarEnArchivo(ArrayList<Dato> lista) {
        //String ruta = "C:\\Ucompensar\\Archivos\\salida.txt";
        String ruta = "C:\\Users\\Carlo\\Documents\\salida.txt";
        File archivo = new File(ruta);

        if (lista == null || lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. Nada para guardar.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write("===== LISTA DE VEHÍCULOS =====");
            writer.newLine();

            // Aquí está el for correcto: por cada Dato d en lista
            for (Dato d : lista) {
                // Usamos los getters de tu clase Dato
                writer.write("Tipo de vehículo: " + d.getTipoVehiculo());
                writer.newLine();
                writer.write("Marca: " + d.getMarca());
                writer.newLine();
                writer.write("Año de fabricación: " + d.getAñoDeFabricacion());
                writer.newLine();
                writer.write("País: " + d.getPais());
                writer.newLine();
                writer.write("Modelo: " + d.getModelo());
                writer.newLine();
                writer.write("Estado: " + d.getEstado());
                writer.newLine();
                writer.write("--------------------------------------");
                writer.newLine();
            }

            writer.newLine();
            JOptionPane.showMessageDialog(null, "Datos guardados en:\n" + ruta);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error al guardar los datos:\n" + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public ArrayList<Dato> leerDesdeArchivo() {
        //String ruta = "C:\\Ucompensar\\Archivos\\salida.txt";
        String ruta = "C:\\Users\\Carlo\\Documents\\salida.txt";
        ArrayList<Dato> listaLeida = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            Dato actual = null;

            // Variables temporales
            String tipo = "", marca = "", anio = "", pais = "", modelo = "", estado = "";

            while ((linea = reader.readLine()) != null) {

                if (linea.startsWith("Tipo de vehículo:")) {
                    tipo = linea.substring(linea.indexOf(":") + 2).trim();
                } else if (linea.startsWith("Marca:")) {
                    marca = linea.substring(linea.indexOf(":") + 2).trim();
                } else if (linea.startsWith("Año de fabricación:")) {
                    anio = linea.substring(linea.indexOf(":") + 2).trim();
                } else if (linea.startsWith("País:")) {
                    pais = linea.substring(linea.indexOf(":") + 2).trim();
                } else if (linea.startsWith("Modelo:")) {
                    modelo = linea.substring(linea.indexOf(":") + 2).trim();
                } else if (linea.startsWith("Estado:")) {
                    estado = linea.substring(linea.indexOf(":") + 2).trim();
                } else if (linea.startsWith("--------------------------------------")) {
                    actual = new Dato(modelo, marca, pais, tipo, anio, estado);
                    listaLeida.add(actual);
                    tipo = marca = anio = pais = modelo = estado = "";
                }
            }

            reader.close();
            JOptionPane.showMessageDialog(null, "Datos cargados desde:\n" + ruta);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error al leer el archivo:\n" + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return listaLeida;
    }

    public void eliminarArchivo() {
        String ruta = "C:\\Ucompensar\\Archivos\\salida.txt"; // Usa la misma ruta que en crearArchivo()
        File archivo = new File(ruta);

        if (archivo.exists()) {
            if (archivo.delete()) {
                JOptionPane.showMessageDialog(null,
                        "El archivo fue eliminado correctamente:\n" + ruta,
                        "Archivo eliminado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se pudo eliminar el archivo.\nVerifica que no esté abierto o en uso.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "El archivo no existe en la ruta especificada:\n" + ruta,
                    "Archivo no encontrado",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
