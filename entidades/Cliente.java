/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDateTime;

/**
 *
 * @author Harry
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String contrasena;
    private String tipoDocumento;
    private String numeroDocumento;
    private String departamento;
    private boolean esSocio;
    private String tokenRecuperacion;
    private LocalDateTime expiracionToken;

    //CREAR UN CONSTRUCTOR PARA NO SOCIO
    
        
    public Cliente(int idCliente, String nombre, String apellido, int edad, String correo, String contrasena, String tipoDocumento, String numeroDocumento, String departamento, boolean esSocio, String tokenRecuperacion, LocalDateTime expiracionToken) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.departamento = departamento;
        this.esSocio = esSocio;
        this.tokenRecuperacion = tokenRecuperacion;
        this.expiracionToken = expiracionToken;
    }

    public Cliente(int idCliente, String nombre, String apellido, int edad, String correo, String contrasena, String tipoDocumento, String numeroDocumento, String departamento, boolean esSocio) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.departamento = departamento;
        this.esSocio = esSocio;
    }
    
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }

    public String getTokenRecuperacion() {
        return tokenRecuperacion;
    }

    public void setTokenRecuperacion(String tokenRecuperacion) {
        this.tokenRecuperacion = tokenRecuperacion;
    }

    public LocalDateTime getExpiracionToken() {
        return expiracionToken;
    }

    public void setExpiracionToken(LocalDateTime expiracionToken) {
        this.expiracionToken = expiracionToken;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo + ", contrasena=" + contrasena + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", departamento=" + departamento + ", esSocio=" + esSocio + ", tokenRecuperacion=" + tokenRecuperacion + ", expiracionToken=" + expiracionToken + '}';
    }

    
    
    
    
}
