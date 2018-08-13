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
public class Materia {

    private String nombre;
    private String condigoNRC;
    private String periodo;
    private String aula;
    private String profesor;

    public Materia(String nombre, String condigoNRC, String periodo, String aula, String profesor) {
        this.nombre = nombre;
        this.condigoNRC = condigoNRC;
        this.periodo = periodo;
        this.aula = aula;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondigoNRC() {
        return condigoNRC;
    }

    public void setCondigoNRC(String condigoNRC) {
        this.condigoNRC = condigoNRC;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String materia) {
        this.profesor = materia;
    }

    @Override
    public String toString() {
        return "Materia:" +
                "\nnombre=" + nombre +
                "\n condigoNRC=" + condigoNRC + 
                "\n periodo=" + periodo + 
                "\n aula=" + aula +
                "\n profesor=" + profesor;
    }
    

}
