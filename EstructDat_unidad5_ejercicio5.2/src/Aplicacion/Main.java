package Aplicacion;

import Grafo.GrafoAdcia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author plupy
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int verticesGrafo;
        int numArcos;
        String nombre = "";
        String nombreDos = "";
        ArrayList<String> nombresArco = new ArrayList<String>();
                
        //se establece número de vértices
        System.out.println("Ingresa el número de vértices que tendrá el grafo: ");
        verticesGrafo = entrada.nextInt();
        System.out.println("número de vértices ingresados: " + verticesGrafo);
        
        //se crea el grafo con el número de vertices ingresados
        GrafoAdcia grafito = new GrafoAdcia(verticesGrafo);
        
        //se nombran los vértices en la lista principal
        System.out.println("Ponle nombre a los vértices:");
        for(int i=1; i<=verticesGrafo; i++){
            System.out.println("Ingresa el nombre del grafo: " + i);
            nombre = entrada.next();
            grafito.nuevoVertice(nombre);
        }
        
        //se establece el número de arcos que desean agregarse
        System.out.println("Ingresa el número de arcos que deseas agregar: ");
        numArcos = entrada.nextInt();
        //se establecen el origen y destino del número de arcos ingresado
        for(int j=0; j<numArcos; j++){
            System.out.println("Ingresa el nombre del vértice del que partirá el arco");
            nombre = entrada.next();
            System.out.println("Ingresa el nombre del vértice destino");
            nombreDos = entrada.next();
            grafito.nuevoArco(nombre, nombreDos);
        }
        
        //se imprime la lista principal con sus arcos
        grafito.imprimir();
    }
    
}
