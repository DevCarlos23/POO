package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        Clase1 C1 = new Clase1("Juan", 30000);
        //System.out.println("La persona es "+C1.Nombre);
        System.out.println("Su salario es: "+C1.Salario);
        ///C1.Nombre="Luis"
        System.out.println("Su salario es: "+C1.Salario);
        C1.Cambiar();
    }
}
