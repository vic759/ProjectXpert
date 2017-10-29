package projectxpert.modelo;

import java.io.Serializable;

/**
 * Clase de persistencia para la tabla EVIDENCIA de la BD
 * @author Victor Gutierrez
 */
public class Evidencia implements Serializable {
    
    private static long serialVersionUID = 1L;
    
    private long sqEvidencia;
    
    private String archivoAdjunto;
    
    private String nombreArchivo;
    
    private long sqCasoEstado;
    
    private int codTipoEvidencia;
    
    private String dscTipoEvidencia;

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
     * @return the sqEvidencia
     */
    public long getSqEvidencia() {
        return sqEvidencia;
    }

    /**
     * @param sqEvidencia the sqEvidencia to set
     */
    public void setSqEvidencia(long sqEvidencia) {
        this.sqEvidencia = sqEvidencia;
    }

    /**
     * @return the archivoAdjunto
     */
    public String getArchivoAdjunto() {
        return archivoAdjunto;
    }

    /**
     * @param archivoAdjunto the archivoAdjunto to set
     */
    public void setArchivoAdjunto(String archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    /**
     * @return the nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @param nombreArchivo the nombreArchivo to set
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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
     * @return the codTipoEvidencia
     */
    public int getCodTipoEvidencia() {
        return codTipoEvidencia;
    }

    /**
     * @param codTipoEvidencia the codTipoEvidencia to set
     */
    public void setCodTipoEvidencia(int codTipoEvidencia) {
        this.codTipoEvidencia = codTipoEvidencia;
    }

    /**
     * @return the dscTipoEvidencia
     */
    public String getDscTipoEvidencia() {
        return dscTipoEvidencia;
    }

    /**
     * @param dscTipoEvidencia the dscTipoEvidencia to set
     */
    public void setDscTipoEvidencia(String dscTipoEvidencia) {
        this.dscTipoEvidencia = dscTipoEvidencia;
    }
    
}
