/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa2;

import Capa3.Profesor;

/**
 *
 * @author Estudiante
 */
public class LogicaProfesor {
    private Profesor profe;
   
    public LogicaProfesor(String nombre, String apellido, String departamento, String fechaNacimiento, String usuario, String clave) {
        profe= new Profesor(nombre, apellido, departamento, fechaNacimiento, usuario, clave);
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
    
}
