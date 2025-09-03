package encapsulamiento;

public class Clase1 {
    private String Nombre;
    static double Salario;
    
    public Clase1(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }
    public void Cambiar(){
        Nombre="Juanin";
        System.out.println("El nuevo nombre es... "+Nombre);
    }
}
