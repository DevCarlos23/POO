package Herencia;

import javax.swing.JOptionPane;

public class Herencia {

    public static void main(String[] args) {
        String placa= JOptionPane.showInputDialog("Digite la placa: ");
        String ciudad= JOptionPane.showInputDialog("Digite la ciudad: ");
        int modelo= Integer.parseInt(JOptionPane.showInputDialog("Digite el modelo: "));
        String color= JOptionPane.showInputDialog("Digite el color: ");
        //int npuestos= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de puestos: "));
        //Autobus aut= new Autobus(npuestos,modelo, placa, ciudad);
    }
}
