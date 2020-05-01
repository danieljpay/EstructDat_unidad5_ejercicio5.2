package Grafo;
import listagenerica.*;

//NOTA: REQUIERE CODIGO DE LISTA GENERICA
public class GrafoAdcia{
    int numVerts;
    static int maxVerts = 20;            
    VerticeAdy [] tablAdc;

    public GrafoAdcia(int mx){
        tablAdc = new VerticeAdy[mx];
        numVerts = 0;
        maxVerts = mx;
    }

    public GrafoAdcia(){       
        this(maxVerts);
    }

    public int numeroDeVertices(){
        return numVerts;
    }      

    public VerticeAdy[] vertices(){ 
        return tablAdc;
    }     

    //La operación listaAdyc()devuelve la lista de adyacencia del vértice v.
    public Lista listaAdyc(int v)throws Exception{
        if (v < 0 || v >= numVerts){ 
            throw new Exception(" Vértice fuera de rango ");
        }
        return tablAdc[v].lad;
    }
    
    public void nuevoVertice (String nom){
        boolean esta = numVertice(nom) >= 0;
        if (!esta){
            VerticeAdy v = new VerticeAdy(nom); 
            v.asigVert(numVerts);
            tablAdc [numVerts++] = v;
        }
    } 

    // numVertice() busca el vértice en la tabla. 
    // Devuelve -1 si no lo encuentra:
    public int numVertice(String nm){
        VerticeAdy v = new VerticeAdy(nm);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado; ){
            encontrado = tablAdc [i].equals(v);
            if (!encontrado){
                i++ ;
            } 
        }
        return (i < numVerts) ? i : -1 ;
    }
    
    public void nuevoArco(String a, String b) throws Exception{

        if (!adyacente(a, b)){
            int va = numVertice(a);
            int vb = numVertice(b);
            if (va < 0 || vb < 0){
                throw new Exception("Vértice no existe");
            }
            Arco ab = new Arco(vb);
            Arco cd = new Arco(va);
            tablAdc[va].lad.insertarCabezaLista(ab);
            tablAdc[vb].lad.insertarCabezaLista(cd);
        }     
    }
    
    public void borrarArco(String a, String b)throws Exception{
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0){
            throw new Exception ("Vértice no existe");
        }
        Arco ab = new Arco(vb);
        tablAdc[va].lad.eliminar(ab);
    }
    
    boolean adyacente(String a, String b)throws Exception{
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0){
            throw new Exception ("Vértice no existe");
        }
        if (tablAdc[va].lad.buscarLista(new Arco(vb)) != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean adyacente(int va, int vb)throws Exception {
        if (va < 0 || vb < 0){
            throw new Exception ("Vértice no existe");
        }
        if (tablAdc[va].lad.buscarLista(new Arco(vb)) != null){  
            return true;
        }
        else{
            return false;
        }
    }

    
    public void imprimir() {
        for(int i=0; i < this.numVerts; i++){
            System.out.println(tablAdc[i].nombre + tablAdc[i].lad.toString(tablAdc));
        }
    }
    
 }  //fin clase





