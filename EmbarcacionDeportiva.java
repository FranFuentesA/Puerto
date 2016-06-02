
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
       
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia,String matricula,float eslora,int anoFab)
    {
        super(matricula,eslora,anoFab);
        this.potencia = potencia;
    }
    
    /**
     *  
     */
    @Override
    public int getCoeficienteBernua()
    {
       int coeficiente = 0;
       return coeficiente =potencia;
    }
    
    /**
     * Metodo to String
     */
    public String toString() 
    {
        String data = super.toString();
        data += "Potencia: " + potencia + "\n";
        return data;
    }
}
