
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles,String matricula,float eslora,int anoFab)
    {
        
        super(matricula,eslora,anoFab);   
        this.numeroMastiles = numeroMastiles;
    }

    /**
     *  
     */
    @Override
    public int getCoeficienteBernua()
    {
       int coeficiente;
       return coeficiente = numeroMastiles;
    }
    
    /**
     * Metodo to String
     */
    public String toString() 
    {
        return "Numero de mastiles : " + this.numeroMastiles; 
    }
    
}
