package javaapplication6;

/**
 *
 * @author diego
 */
public class Empleado extends Persona{
    protected int salario;
    protected String unidad;
    protected int aņosTrabajando;
    protected boolean trabajando;
    //Constructor
    public Empleado(String nombre, String apellido, int edad, int salario, String unidad, int aņosTrabajando, boolean trabajando){
        super(nombre, apellido, edad);
        this.salario = salario;
        this.unidad = unidad;
        this.aņosTrabajando = aņosTrabajando;
        this.trabajando = trabajando;
    }
    
        @Override
        public void saludar() {
            System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "gano: " + salario + "\n" + "trabajo en: " + unidad + "\n" + "llevo: " + aņosTrabajando + "aņos trabajando") ;
            if(trabajando){
                System.out.println("Estoy trabajando en el momento");
                }
            else{
                System.out.println("No trabajo de momento");
            }
        
    }
    
}
