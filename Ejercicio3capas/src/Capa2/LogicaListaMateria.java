/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa2;

import Capa3.ListaMateria;
import Capa3.Materia;
import Capa3.Profesor;

/**
 *
 * @author Estudiante
 */
public class LogicaListaMateria {

  private ListaMateria listam;
    
    public LogicaListaMateria() {
        listam=new ListaMateria();
    }
       public void add(LogicaMateria m) {
       listam.add(m.getMateria());
    }

    @Override
    public String toString() {
       
        return listam.toString();
    }
    
}
