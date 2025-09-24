package poos4;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {
        int anioAc = Calendar.getInstance().get(Calendar.YEAR);
        int Fecha=Calendar.getInstance().get(Calendar.DATE);
        System.out.println("este es el año actual"+anioAc);
        System.out.println("La fecha es: "+Fecha);
    }
    
}
