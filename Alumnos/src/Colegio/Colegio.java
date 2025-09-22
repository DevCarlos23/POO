package Colegio;

public class Colegio {
    private String nombre;
    private String direccion;
    private int numEstudiantes;
    private String rector;

    public Colegio(String nombre, String direccion, int numEstudiantes, String rector) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numEstudiantes = numEstudiantes;
        this.rector = rector;
    }
    
    public String Mostrar(){
        return"Nombre: "+nombre+
                "\nDireccion: "+direccion+
                "\nNumero de estudiantes: "+numEstudiantes+
                "\nRector: "+rector+"\n";
    }
}
