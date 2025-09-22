package alumnos;

import java.util.ArrayList;

public class Alumnosmain {

    public static void main(String[] args) {
        ArrayList<Alumnos> obj1 = new  ArrayList<Alumnos>();
        Alumnos a1=new Alumnos("Juan","Cely",101);
        Alumnos a2=new Alumnos("Pedro","Mancipe",102);
        Alumnos a3=new Alumnos("Luis","Motta",103);
        obj1.add(a1);
        obj1.add(a2);
        obj1.add(a3);
        for (int i=0; i<obj1.size(); i++){
            System.out.println("Estudiante "+(i+1)+" "+ obj1.get(i));
        }
    }
}
