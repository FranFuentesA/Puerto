import java.util.ArrayList;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private ArrayList<Alquiler> alquileres;    
    //Guarda el numero de amarres totales
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<Alquiler>();
    }

    public int addAlquiler(int posicionA,int numeroDias,Cliente cliente,Barco barco){
        int posicion = -1;
        if (posicionA - 1 >= 0 && posicionA - 1 < NUMERO_AMARRES) {
            if (alquileres.size() != 0) {                
                for (int i = 0; i < alquileres.size(); i++) {
                    if (alquileres.get(i).getAmarre() != posicionA) {                    
                        alquileres.add(new Alquiler(posicionA, numeroDias, cliente, barco));
                        posicion = posicionA;                    
                    }                
                }
            }
            else {                
                alquileres.add(new Alquiler(posicionA, numeroDias, cliente, barco));
                posicion = posicionA;               
            }
        }
        else {
            System.out.println("El amarre selecionado no existe preube otro numero");
        }
        return posicion;
    }

    /**
     * Metodo que muestra el estado de los amarres
     */
    public void verEstadoAmarres() {
        for(int i = 0 ;i < NUMERO_AMARRES;i++) {
            for (int i2 = 0; i2 < alquileres.size();i++) {
                if (alquileres.get(i).getAmarre() == 1 + i2 ) {
                    System.out.println("Amarre" + (1 + i2) + "Libre");
                } else{
                    System.out.println("Amarre" + (1 + i2 ) +  "ocupado" + alquileres.get(i));                
                }                              
            }   
        }
    }

    /**
     * Metodo que borra un barco de un amarre y muestra el precio;
     */
    public float liquidarAlquiler(int posicion) {
        float valor = -1;
        if(posicion < NUMERO_AMARRES && posicion >= 0){
            for(int i = 0;i < alquileres.size();i++) {
                if (alquileres.get(i).getAmarre() == posicion) {                    
                    valor = alquileres.get(i - 1).getCosteAlquiler();
                    alquileres.remove(posicion - 1);                                   
                } 
            }
        } else {
            System.out.println("El amarre selecionado no existe preube otro numero");
        }
        return valor;
    }

}

