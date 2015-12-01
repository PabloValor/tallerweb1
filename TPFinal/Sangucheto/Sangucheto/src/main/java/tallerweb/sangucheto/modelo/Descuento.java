package tallerweb.sangucheto.modelo;

public class Descuento {
    
    private Double porcentaje;
    private Double monto;
    
    public Double getPorcentaje() {
        return porcentaje;
    }
    public Double getMonto() {
        return monto;
    }
    public void setPorcentaje(Double porcentaje) {
        this.monto = null;
        this.porcentaje = porcentaje;
    }
    public void setMonto(Double monto) {
        this.porcentaje = null;
        this.monto = monto;
    }
    
    

}