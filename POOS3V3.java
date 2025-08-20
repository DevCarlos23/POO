package poo_1;

import javax.swing.JOptionPane;

public class POOS3V3 {
    //metodo con retorno
    public String procesarDatos(String Apellidos, String Nombres, String fechaNacimiento, double nota1, double nota2){
        double promedio=((nota1+nota2)/2);
        String mensaje = " Datos del estudiante:\n"
                       +"Apellidos: "+Apellidos+"\n"
                       +"Nombres: "+Nombres+"\n"
                       +"Fecha de nacimiento: "+fechaNacimiento+"\n"
                       +"nota 1: "+nota1+"\n"
                       +"nota 2: "+nota2+"\n"
                       +"promedio: "+promedio;
        return mensaje;
    }
            
            
            
    public static void main(String[] args) {
        POOS3V3 P3 = new POOS3V3();
        
        //Variables
        String Apellidos=JOptionPane.showInputDialog("Ingrese sus apellidos");
        String Nombres=JOptionPane.showInputDialog("Ingrese sus nombre");
        String fechaNacimiento=JOptionPane.showInputDialog("Ingrese su fecha de nacimiento");
        double nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota"));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota"));
        
        String mensajeFinal = P3.procesarDatos(Apellidos, Nombres, fechaNacimiento, nota1, nota2);
        JOptionPane.showMessageDialog(null, mensajeFinal);
    } 
}
