package projectxpert.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase de persistencia para la tabla CASO_ESTADO de la BD
 * @author Victor Gutierrez
 */
public class CasoEstado implements Serializable {
    
    private static long serialVersionUID = 1L;
    
    private long sqCasoEstado;
    
    private Date fechaEstado;
    
    private long sqCaso;
    
    private long sqUsuario;
    
    private int codEstado;
    
    private String dscEstado;
    
    private Date fechaCreacion;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the sqCasoEstado
     */
    public long getSqCasoEstado() {
        return sqCasoEstado;
    }

    /**
     * @param sqCasoEstado the sqCasoEstado to set
     */
    public void setSqCasoEstado(long sqCasoEstado) {
        this.sqCasoEstado = sqCasoEstado;
    }

    /**
     * @return the fechaEstado
     */
    public Date getFechaEstado() {
        return fechaEstado;
    }

    /**
     * @param fechaEstado the fechaEstado to set
     */
    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

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
     * @return the sqUsuario
     */
    public long getSqUsuario() {
        return sqUsuario;
    }

    /**
     * @param sqUsuario the sqUsuario to set
     */
    public void setSqUsuario(long sqUsuario) {
        this.sqUsuario = sqUsuario;
    }

    /**
     * @return the codEstado
     */
    public int getCodEstado() {
        return codEstado;
    }

    /**
     * @param codEstado the codEstado to set
     */
    public void setCodEstado(int codEstado) {
        this.codEstado = codEstado;
    }

    /**
     * @return the dscEstado
     */
    public String getDscEstado() {
        return dscEstado;
    }

    /**
     * @param dscEstado the dscEstado to set
     */
    public void setDscEstado(String dscEstado) {
        this.dscEstado = dscEstado;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
