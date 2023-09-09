import java.time.LocalDate;

public class Carro{
    private String marca;
    private String placa;
    private String linea;
    private String modelo;
    private LocalDate fecha;
    private String nombre;

    public Carro(String marca, String placa, String linea, String modelo, LocalDate fecha, String nombre) {
        this.marca = marca;
        this.placa = placa;
        this.linea = linea;
        this.modelo = modelo;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getLinea() {
        return linea;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}