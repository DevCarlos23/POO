package poo_1;

import javax.swing.JOptionPane;

public class POO_Semana3 {
    public void datos(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellidos=JOptionPane.showInputDialog("Ingrese su apellido");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        double estatura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura del empleado"));
        System.out.println("Apellidos.... "+apellidos+" ....Nombre.. "+nombre+"\n..edad.. "+edad+" ..estatura.. "+estatura);
    }
    
    public static void main(String[] args) {
        POO_Semana3 POOS3= new POO_Semana3(); //Metodo Constructor
        POOS3.datos();
    } 
}
