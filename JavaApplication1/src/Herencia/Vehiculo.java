package Herencia;

public class Vehiculo {
    protected int modelo;
    private String placa;
    private String ciudad;

    public Vehiculo(int modelo, String placa, String ciudad) {
        this.modelo = modelo;
        this.placa = placa;
        this.ciudad = ciudad;
    } 

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
