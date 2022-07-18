
public class DetalleArticulosLn {
    private String articuloCodigo;
    private String componenteCodigo;
    private float cantidad;

    public DetalleArticulosLn() {
    }

    public DetalleArticulosLn(String articuloCodigo) {
        this.articuloCodigo = articuloCodigo;
    }

    public DetalleArticulosLn(String articuloCodigo, String componenteCodigo) {
        this.articuloCodigo = articuloCodigo;
        this.componenteCodigo = componenteCodigo;
    }
    
    public DetalleArticulosLn(String articuloCodigo, String componenteCodigo, float cantidad) {
        this.articuloCodigo = articuloCodigo;
        this.componenteCodigo = componenteCodigo;
        this.cantidad = cantidad;
    }

    public String getArticuloCodigo() {
        return articuloCodigo;
    }

    public void setArticuloCodigo(String articuloCodigo) {
        this.articuloCodigo = articuloCodigo;
    }

    public String getComponenteCodigo() {
        return componenteCodigo;
    }

    public void setComponenteCodigo(String componenteCodigo) {
        this.componenteCodigo = componenteCodigo;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleArticulosLn{" + "articuloCodigo=" + articuloCodigo + ", componenteCodigo=" + componenteCodigo + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
