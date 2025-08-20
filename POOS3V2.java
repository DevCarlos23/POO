package poo_1;

import javax.swing.JOptionPane;

public class POOS3V2 {
    
    public static void cuentas(String tit, int num, double sal){
        System.out.println("Titular... "+tit+" ...Numero de Cuenta... "+num+"\n...Saldo... "+sal);
    }
    
    public static void main(String[] args) {
        //POOS3V2 P2=new POOS3V2();
        Clase1 C1= new Clase1();
        String titular=JOptionPane.showInputDialog("Ingrese nombre del titular");
        int ncuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de la cuenta"));
        double saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo de la cuenta"));
        C1.cuenta(titular, ncuenta, saldo);
        cuentas(titular, ncuenta, saldo);
    }
}
