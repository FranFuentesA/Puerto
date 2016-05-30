
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{

    //Coleccion de obj alquiler
    private Alquiler[] alquileres;
    //Guarda el numero de amarres totales
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Metodo que crea un alquiler 
     */
    public int addAlquiler(int numeroDias,Cliente cliente,Barco barco)
    {
        Alquiler alquiler = new Alquiler(numeroDias,cliente,barco);
        int posicion = -1;
        boolean parar = false;
        for(int i = 0; i < alquileres.length && !parar;i++) {        
            if (alquileres[i] == null) {
                //metemos el objeto en la posicion indicada por el contador
                alquileres[i] = alquiler;
                //indicamos la posicion donde se guarda, en la coleccion
                posicion = i;
                parar = true;
            }
        }  
        return posicion;
    }

    /**
     * Metodo que muestra el estado de los amarres
     */
    public void verEstadoAmarres() {
        for(Alquiler alqui : alquileres) {    
            System.out.println(alqui);    
        }
    }
    
    /**
     * Metodo que borra un barco de un amarre y muestra el precio;
     */
    public float liquidarAlquiler(int posicion) {
       //guardamos el barco antes de borrarlo para mostrar el precio
        Alquiler precio = alquileres[posicion];
        
        alquileres[posicion] = null;
        return precio.getCosteAlquiler();    
    }
    

}
