package projectxpert.modelo;

import java.io.Serializable;

/**
 * Clase de persistencia para la tabla USUARIO de la BD
 * @author Victor Gutierrez
 */
public class Usuario implements Serializable {
    
    private static long serialVersionUID = 1L;
    
    private long sqUsuario;
    
    private String primerNombre;
    
    private String segundoNombre;
    
    private String primerApellido;
    
    private String segundoApellido;
    
    private String genero;
    
    private String username;
    
    private String password;
    
    private String email;
    
    private String codRol;
    
    private String dscRol;
    
    private String telefono;

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
     * @return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * @param segundoNombre the segundoNombre to set
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the codRol
     */
    public String getCodRol() {
        return codRol;
    }

    /**
     * @param codRol the codRol to set
     */
    public void setCodRol(String codRol) {
        this.codRol = codRol;
    }

    /**
     * @return the dscRol
     */
    public String getDscRol() {
        return dscRol;
    }

    /**
     * @param dscRol the dscRol to set
     */
    public void setDscRol(String dscRol) {
        this.dscRol = dscRol;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
