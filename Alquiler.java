import java.util.ArrayList;
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numeroDias;

    private Cliente cliente;

    private Barco barco; 

    private  int posicion;

    private static final float VALOR_FIJO_ALQUILER = 300;

    private static final float MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int posicion,int numeroDias,Cliente cliente,Barco barco)
    {
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.barco = barco;
        this.posicion = posicion;
    }

    /**
     * Calcula el precio total del alquiler 
     */
    public float getCosteAlquiler()
    {
        float total = 0;
        total =  (float) numeroDias * (MULTIPLICADOR_ESLORA * barco.getEslora()) + (VALOR_FIJO_ALQUILER * (float) barco.getCoeficienteBernua());
        return total;
    }
    
    /**
     * Devuelve el atributo posicion
     */
    public int getAmarre() {
        return posicion;    
    }

    /**
     * Metodo to String
     */
    public String toString() 
    {
        return "Numero dias : " + this.numeroDias + " Precio total " +  getCosteAlquiler() + "Cliente : " + cliente + "Barco : " + barco; 
    }
}
