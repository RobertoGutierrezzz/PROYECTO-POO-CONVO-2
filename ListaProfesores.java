
package com.mycompany.ccodigo;


import java.util.ArrayList;
import java.util.Iterator;

class ListaProfesores {

    private ArrayList<Profesor> listaProfesor;

    public ListaProfesores() {
        this.listaProfesor = new ArrayList<Profesor>();
    }

    public void AddProfesor(Profesor profesor) {
        listaProfesor.add(profesor);
    }

    public void ImprimirLista() {
        String tmpStr1 = "";
        System.out.println("Datos existentes de los profesores:");
        for (Profesor tmp : listaProfesor) {
            System.out.println(tmp.toString());
            if (tmp instanceof ProfesorInterino) {
                tmpStr1 = "Interino";
            } else {
                tmpStr1 = "Titular";
            }
            System.out.println("Tipo de profesor:" + tmpStr1
                    + "-.Nómina del profesor:" + (tmp.ImporteNomina()));
        }
    }

    public float ImporteNomina() {
        float importeTotal = 0;
        Iterator<Profesor> it = listaProfesor.iterator();
        while (it.hasNext()) {
            importeTotal = importeTotal + it.next().ImporteNomina();
        }
        return importeTotal;
    }
}