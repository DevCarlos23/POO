package proyecto29S;

public class Datos {
    int doc;
    String nombres, apellidos, programa, facultad;

    public Datos(int doc, String nombres, String apellidos, String programa, String facultad) {
        this.doc = doc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.programa = programa;
        this.facultad = facultad;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Datos{" + "doc=" + doc + ", nombres=" + nombres + ", apellidos=" + apellidos + ", programa=" + programa + ", facultad=" + facultad + '}';
    }
}
