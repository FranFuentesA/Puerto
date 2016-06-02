
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public Yate(int camarotes,int potencia,String matricula,float eslora,int anoFab)
    {
        super(potencia,matricula,eslora,anoFab);
        this.camarotes = camarotes;
    }
    
    /**
     *  
     */
    @Override
    public int getCoeficienteBernua()
    {
       int coeficiente = 0;
       return coeficiente = super.getCoeficienteBernua() + camarotes;
    }
    
    /**
     * Metodo to String
     */
    public String toString() 
    {
         String data = super.toString();
        data += "Númeo de camarotes: " + camarotes + "\n";
        return data;
    }
}
