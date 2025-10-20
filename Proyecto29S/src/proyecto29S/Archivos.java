package proyecto29S;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivos {
    public void crearArchivo(){
        String ruta="C:\\Users\\CarlosIvanBonillaBel\\Documents\\salida.txt";
        File archivo= new File(ruta);
        
        try{
            archivo.getParentFile().mkdirs();
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            writer.write("Este archivo contiene los datos del JTable");
            writer.newLine();
            writer.write("Fecha: "+java.time.LocalDate.now());
            writer.close();
            JOptionPane.showMessageDialog(null, "Archivo creado en:\n"+ruta);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Error al crear el archivo:\n"+ ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void guardarEnArchivo(){
    
    }
}
