package javaapplication6;

/**
 *
 * @author diego
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido; 
    protected int edad;
    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }    
    /**
     *Este metodo se usa en todo el proyecto para que salude cada uno de las personas
     */
    public abstract void saludar();
    
}
