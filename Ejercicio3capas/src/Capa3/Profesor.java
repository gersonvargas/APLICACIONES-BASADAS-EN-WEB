/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa3;

/**
 *
 * @author Estudiante
 */
public class Profesor {
     
    private String nombre;
    private String apellido;
    private String departamento;
    private String fechaNacimiento;
    private String usuario;
    private String clave;

     public Profesor(String nombre, String apellido, String departamento, String fechaNacimiento, String usuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.clave = clave;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Profesor\n" 
                + "Nombre " + nombre +
                "\n Apellido=" + apellido +
                "\n departamento=" + departamento + 
                "\n fechaNacimiento=" + fechaNacimiento + 
                "\n usuario=" + usuario +
                "\n clave=" + clave;
    }
    
}
