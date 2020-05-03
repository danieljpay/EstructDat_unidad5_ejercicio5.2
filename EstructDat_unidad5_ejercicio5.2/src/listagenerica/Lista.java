package listagenerica;

import Grafo.Arco;
import Grafo.VerticeAdy;
import java.util.ArrayList;

/**
 *
 * @author plupy
 */
public class Lista {
    private ArrayList<Arco> listita = new ArrayList<Arco>();

    public Lista() {
    }

    public ArrayList<Arco> getListita() {
        return listita;
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
    public String toString(VerticeAdy[] vertis) {
        String cadena = " ";
        for(int i=0; i<listita.size(); i++){
            cadena += " -> " + vertis[listita.get(i).getDestino()].nomVertice(); //se suma uno para que no empiece a contar desde 0
        }
        return cadena;
    }
}
