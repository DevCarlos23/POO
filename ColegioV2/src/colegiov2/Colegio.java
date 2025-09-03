package colegiov2;

public class Colegio {
    private String nombre;
    private String direccion;
    private int estudiantes;

    public Colegio(String nombre, String direccion, int estudiantes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = estudiantes;
    }
    
    public void Mostrarinfo(){
        System.out.println("Colegio: \n"+nombre+
                " Direccion: \n"+direccion+
                " Estudiantes: \n"+estudiantes);
    }
}
