/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa3;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class ListaMateria {

    private ArrayList listaMateria;
    //private Profesor[] listaProfes;
    private int posicion;

    public ListaMateria() {
        listaMateria = new ArrayList();
        posicion = 0;
        // listaProfes = new Profesor[10];
    }

    public void add(Materia m) {
        listaMateria.add(m);
    }

    @Override
    public String toString() {
        String res = "Lista de profesores:";
        for (int i = 0; i < listaMateria.size(); i++) {
            res += listaMateria.get(i).toString();
        }
        return res;
    }
//   // private ArrayList materias;
//    private Materia[] listaMateria;
//    private int posicion;
//
//    public ListaMateria() {
//        listaMateria = new Materia[10];
//    }
//
//    @Override
//    public String toString() {
//        String res = "";
//        for (int i = 0; i < 10; i++) {
//            res += listaMateria[i].toString();
//        }
//        return res;
//    }
}
