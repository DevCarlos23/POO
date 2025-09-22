package Colegio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Colegio> listaColegios=new ArrayList<>();
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos colegios desea registrar?"));
        
        for(int i=0; i < n; i++){
            String nombre=JOptionPane.showInputDialog("Ingrese el nombre del colegio");
            String direccion=JOptionPane.showInputDialog("Ingrese la direccion del colegio");
            int numEstudiantes= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes del colegio"));
            String rector=JOptionPane.showInputDialog("Ingrese el rector del colegio");
            
            Colegio c = new Colegio(nombre, direccion, numEstudiantes, rector);
            listaColegios.add(c);
        }
        
        StringBuilder resultado= new StringBuilder("Lista de colegios\n\n");
        for(Colegio c : listaColegios){
            resultado.append(c.Mostrar()).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
        
        System.out.println("Lista de Colegios: ,\n");
        for(Colegio c : listaColegios){
            resultado.append(c.Mostrar());
        }
        /*
        String resultado="Lista de Colegios: \n";
        for(Colegio c: listaColegios){
            resultado2+=c.Mostrar()+"\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
        */
    }
}
