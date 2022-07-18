
import java.util.Date;

public class Lenguaje {

    private String nombreLenguaje;
    private String versionLenguaje;
    private Date fechaLanzamiento;
    private Date fechaVencimiento;

    public String getNombreLenguaje() {
        return nombreLenguaje;
    }

    public void setNombreLenguaje(String nombreLenguaje) {
        this.nombreLenguaje = nombreLenguaje;
    }

    public String getVersionLenguaje() {
        return versionLenguaje;
    }

    public void setVersionLenguaje(String versionLenguaje) {
        this.versionLenguaje = versionLenguaje;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
