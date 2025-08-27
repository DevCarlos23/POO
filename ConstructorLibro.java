package poos4;

public class ConstructorLibro {

    public static void main(String[] args) {
        Libros L1 = new Libros("Tom Sayer", "Mark twain",1876);
        Libros L2 = new Libros("La Divina Comedia", "Dante Alighieri",1324);
        L1.mostrarInfo();
        L1.publicacion();
        L2.mostrarInfo();
        L2.publicacion();
    }
}
