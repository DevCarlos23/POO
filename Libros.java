package poos4;

import java.util.Calendar;

public class Libros {
    //titulo autor año de publicacion
    public String Titulo;
    public String Autor;
    public int AnioPubli;
    public int anioActual;
    
    /*
    public Libros(String Titulov, String Autorv, int AnioPubliv) {
        Titulo = Titulov;
        Autor = Autorv;
        AnioPubli = AnioPubliv;
    }*/
    
    public Libros(String Titulov, String Autorv, int AnioPubliv) {
        this.Titulo = Titulov;
        this.Autor = Autorv;
        this.AnioPubli = AnioPubliv;
    }
 
    public void mostrarInfo() {
        
        System.out.println("Titulo del libro: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Anio de publicacion: " + AnioPubli);
        
    }
    public int publicacion(){
        anioActual=Calendar.getInstance().get(Calendar.YEAR);
        int DiferenciaAnios=anioActual-AnioPubli;
        System.out.println("El libro fue publicado hace: "+DiferenciaAnios+ " anios");
        return DiferenciaAnios;
    }
}
