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
public class ListaProfesor {
    private ArrayList listaProfes;
    //private Profesor[] listaProfes;
    private int posicion;

    public void add(Profesor p){
        listaProfes.add(p);
    }
    public ListaProfesor() {
        listaProfes=new ArrayList();
        posicion=0;
       // listaProfes = new Profesor[10];
    }

    @Override
    public String toString() {
        String res = "Lista de profesores:";
        for (int i = 0; i < listaProfes.size(); i++) {
            res += listaProfes.get(i).toString();
        }
        return res;
    }
}
