/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listagenerica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author plupy
 */

//sacado de https://www.arquitecturajava.com/uso-de-java-generics/
public class Lista<T> implements Iterable<T> {

    private ArrayList<T> lista = new ArrayList<T>();
    private int tope;

    public Lista(int tope) {
        super();
        this.tope = tope;
    }
    
    public void add(T objeto ) {
        if (lista.size()<=tope) {
            lista.add(objeto);
        }
        else {
            throw new RuntimeException("no caben mas");
        }
    }

    //no se para que es esta vaina
    public Iterator<T> iterator() {
        return lista.iterator();
    }
    
    //agregar métodos que se encuentran en otras clases
}
