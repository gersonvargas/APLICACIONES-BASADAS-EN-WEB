/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa1;

import Capa2.LogicaListaMateria;
import Capa2.LogicaListaProfesor;
import Capa2.LogicaMateria;
import Capa2.LogicaProfesor;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {

        LogicaMateria logmateria01 = new LogicaMateria("test", "test", "test", "test", "test");
        LogicaMateria logmateria02 = new LogicaMateria("test02", "test02", "test02", "test02", "test02");

        LogicaProfesor logprofe01 = new LogicaProfesor("profe01", "profe01", "profe01", "profe01", "profe01", "profe01");
        LogicaProfesor logprofe02 = new LogicaProfesor("profe02", "profe02", "profe02", "profe02", "profe02", "profe02");

        LogicaListaMateria loglistmateria = new LogicaListaMateria();
        loglistmateria.add(logmateria01);
        loglistmateria.add(logmateria02);

        LogicaListaProfesor loglistprofesor = new LogicaListaProfesor();
        loglistprofesor.add(logprofe01);
        loglistprofesor.add(logprofe02);

        System.out.println(loglistmateria.toString());
        System.out.println(loglistprofesor.toString());

    }
}
