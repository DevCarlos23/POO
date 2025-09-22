package alumnos;

public class Alumnos {
    private String nombre="";
    private String apellido="";
    private int curso=0;

    public Alumnos(String nombre, String apellido, int curso) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.curso=curso;
    }
    
    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + '}';
    }
}
