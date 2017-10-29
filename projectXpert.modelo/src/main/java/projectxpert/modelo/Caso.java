package projectxpert.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase de persistencia para la tabla CASO de la BD
 * @author Victor Gutierrez
 */
public class Caso implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long sqCaso;
    
    private String nombreCaso;
    
    private Date fechaCasoApertura;
    
    private Date fechaCasoCierre;
    
    private String dscCaso;
    
    private int usuarioApertura;
    
    private int usuarioCierre;
    
    private Date fechaActualizacion;

    /**
     * @return the sqCaso
     */
    public long getSqCaso() {
        return sqCaso;
    }

    /**
     * @param sqCaso the sqCaso to set
     */
    public void setSqCaso(long sqCaso) {
        this.sqCaso = sqCaso;
    }

    /**
     * @return the nombreCaso
     */
    public String getNombreCaso() {
        return nombreCaso;
    }

    /**
     * @param nombreCaso the nombreCaso to set
     */
    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    /**
     * @return the fechaCasoApertura
     */
    public Date getFechaCasoApertura() {
        return fechaCasoApertura;
    }

    /**
     * @param fechaCasoApertura the fechaCasoApertura to set
     */
    public void setFechaCasoApertura(Date fechaCasoApertura) {
        this.fechaCasoApertura = fechaCasoApertura;
    }

    /**
     * @return the fechaCasoCierre
     */
    public Date getFechaCasoCierre() {
        return fechaCasoCierre;
    }

    /**
     * @param fechaCasoCierre the fechaCasoCierre to set
     */
    public void setFechaCasoCierre(Date fechaCasoCierre) {
        this.fechaCasoCierre = fechaCasoCierre;
    }

    /**
     * @return the dscCaso
     */
    public String getDscCaso() {
        return dscCaso;
    }

    /**
     * @param dscCaso the dscCaso to set
     */
    public void setDscCaso(String dscCaso) {
        this.dscCaso = dscCaso;
    }

    /**
     * @return the usuarioApertura
     */
    public int getUsuarioApertura() {
        return usuarioApertura;
    }

    /**
     * @param usuarioApertura the usuarioApertura to set
     */
    public void setUsuarioApertura(int usuarioApertura) {
        this.usuarioApertura = usuarioApertura;
    }

    /**
     * @return the usuarioCierre
     */
    public int getUsuarioCierre() {
        return usuarioCierre;
    }

    /**
     * @param usuarioCierre the usuarioCierre to set
     */
    public void setUsuarioCierre(int usuarioCierre) {
        this.usuarioCierre = usuarioCierre;
    }

    /**
     * @return the fechaActualizacion
     */
    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * @param fechaActualizacion the fechaActualizacion to set
     */
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    
}
