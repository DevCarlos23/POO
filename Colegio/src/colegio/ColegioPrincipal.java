package colegio;

public class ColegioPrincipal {

    public static void main(String[] args) {
        Colegio Co = new Colegio("Liceo San BErnardo", "Cll 31 sur # 50 a 65", 200, 15);
        System.out.println("El nombre del colegio es.. "+Co.getNombreInsitucion());
        System.out.println("La direccion del colegio es.. "+Co.getDireccion());
        System.out.println("El numero de estudiantes es.. "+Co.getNumEstudiantes());
        System.out.println("El numero de salones  disponibles es.. "+Co.getNumeroSalones());
        Co.setNombreInsitucion("Liceo San Bernardo");
        Co.setDireccion("Calle 28 sur # 12 f 68");
        Co.setNumEstudiantes(50);
        Co.setNumeroSalones(12);
        System.out.println("El nuevo nombre del colegio es.. "+Co.getNombreInsitucion());
        System.out.println("La nueva direccion del colegio es.. "+Co.getDireccion());
        System.out.println("El nuevo numero de estudiantes es.. "+Co.getNumEstudiantes());
        System.out.println("El numero de salones  disponibles es.. "+Co.getNumeroSalones());
    }
    
}
