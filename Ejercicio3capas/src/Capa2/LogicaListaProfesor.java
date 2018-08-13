/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa2;

import Capa3.ListaProfesor;
import Capa3.Profesor;

/**
 *
 * @author Estudiante
 */
public class LogicaListaProfesor {

    private ListaProfesor listp;

    public LogicaListaProfesor() {
        listp = new ListaProfesor();
    }

    public void add(LogicaProfesor m) {
        listp.add(m.getProfe());
    }

    @Override
    public String toString() {

        return listp.toString();
    }
}
