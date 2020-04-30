package listagenerica;

import Grafo.Arco;
import java.util.ArrayList;

/**
 *
 * @author plupy
 */
public class Lista {
    private ArrayList<Arco> listita = new ArrayList<Arco>();

    public Lista() {
    }
    
    //insertar arco 
    public void insertarCabezaLista(Arco unArco){
        this.listita.add(unArco);
    }
    
    //eliminar arco coincidente
    public void eliminar(Arco unArco){
        this.listita.remove(unArco);
    }
    
    //busqueda dentro de la lista
    public Arco buscarLista(Arco unArco){
        Arco encontrado = null;
        for(int i=0; i< this.listita.size(); i++){
            if(unArco == this.listita.get(i)){
                encontrado = this.listita.get(i);
                return encontrado;
            }
        }
        return encontrado;
    }
    
    
    //imprimir los arcos en la lista
    @Override
    public String toString() {
        String cadena = " ";
        for(int i=0; i<listita.size(); i++){
            cadena += " -> " + listita.get(i).getDestino();
        }
        return cadena;
    }
}
