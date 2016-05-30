
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    //Atributo relacionado a la matricula
    private String matricula;
    //Atributo relacionado a los metros de eslora
    private float eslora;
    //Atributo relacionado a la fecha de fabricacion
    private int anoFabricacion; 
    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula,float eslora,int anoFab)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFab;
    }
    
    /**
     * Metodo que devuelve la matricula 
     */
    public String getMatricula()
    {
        return matricula;
    }
    
    /**
     * Metodo que devuelve la eslora
     */
    public float getEslora()
    {
        return eslora;
    }
    
    /**
     * Metodo que devuelve el año de fabricacion
     */
    public int getFechaFabricacion()
    {
        return anoFabricacion;
    }
    
    /**
     * Metodo que calcula el code
     */
    public abstract int getCoeficienteBernua();  
       
    /**
     * Metodo to String
     */
    public String toString() 
    {
        return "Matricula : " + this.matricula + " Eslora : " + this.eslora +  "Fecha de fabricacion : " + anoFabricacion; 
    }
}
