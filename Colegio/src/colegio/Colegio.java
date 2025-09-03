package colegio;

public class Colegio {
    private String NombreInsitucion;
    private String Direccion;
    private int NumEstudiantes;
    private int NumeroSalones;

    public Colegio(String NombreInsitucion, String Direccion, int NumEstudiantes, int NumeroSalones) {
        this.NombreInsitucion = NombreInsitucion;
        this.Direccion = Direccion;
        this.NumEstudiantes = NumEstudiantes;
        this.NumeroSalones = NumeroSalones;
        
    }

    public String getNombreInsitucion() {
        return NombreInsitucion;
    }

    public void setNombreInsitucion(String NombreInsitucion) {
        this.NombreInsitucion = NombreInsitucion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNumEstudiantes() {
        return NumEstudiantes;
    }

    public void setNumEstudiantes(int NumEstudiantes) {
        this.NumEstudiantes = NumEstudiantes;
    }

    public int getNumeroSalones() {
        return NumeroSalones;
    }

    public void setNumeroSalones(int NumeroSalones) {
        this.NumeroSalones = NumeroSalones;
    }
}
