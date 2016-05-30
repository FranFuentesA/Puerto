
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
   
    private String nombre;
    
    private String dni;

     /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre,String dni)
    {
        this.dni = dni;
    }

    /**
     * Metodo que devuelve el dni
     */
    public String getDni()
    {
        return dni; 
    }
    
     /**
     * Metodo que devuelve el nombre
     */
    public String getNombre()
    {
        return nombre; 
    }
    
    /**
     * Metodo to String
     */
    public String toString() 
    {
        return "Nombre : " + nombre + " Dni : " +  dni; 
    }
    
}
