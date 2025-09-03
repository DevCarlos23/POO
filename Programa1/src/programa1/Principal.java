package programa1;

public class Principal {

    public static void main(String[] args) {
        Clase1 C1 = new Clase1("Juan", 20);
        System.out.println("El nombre es.. "+C1.getNombre());
        System.out.println("La edad es.. "+C1.getEdad());
        C1.setEdad(50);
        System.out.println("La edad actual es.. "+C1.getEdad());
        
        C1.setNombre("Juanin");
        System.out.println("El nombre actualizado es.. "+C1.getNombre());
        
    }
    
}
