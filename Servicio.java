public class Servicio{
    private String tipo;
    private int monto;

    public Servicio(String tipo, int monto){
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getTipo(){
        return tipo;
    }

    public int getMonto(){
        return monto;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setMonto(int monto){
        this.monto = monto;
    }
}  