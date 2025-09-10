package Herencia;

public class Autobus extends Vehiculo {
    private int npuestos;
    private String color;

    public Autobus(int npuestos, String color, int modelo, String placa, String ciudad) {
        super(modelo, placa, ciudad);
        this.npuestos = npuestos;
        this.color = color;
    }
}
