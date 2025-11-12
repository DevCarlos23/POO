package registrodevehiculos;

public class Dato {

    private String modelo;
    private String marca;
    private String pais;
    private String tipoVehiculo;
    private String añoDeFabricacion;
    private String estado;// nuevo o usado

    public Dato(String tipoVehiculo, String marca, String añoDeFabricacion, String pais, String modelo, String estado) {
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.añoDeFabricacion = añoDeFabricacion;
        this.pais = pais;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(String añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
