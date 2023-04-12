package javaapplication6;

/**
 *
 * @author diego
 */
public class Empleado extends Persona{
    protected int salario;
    protected String unidad;
    protected int a�osTrabajando;
    protected boolean trabajando;
    //Constructor
    public Empleado(String nombre, String apellido, int edad, int salario, String unidad, int a�osTrabajando, boolean trabajando){
        super(nombre, apellido, edad);
        this.salario = salario;
        this.unidad = unidad;
        this.a�osTrabajando = a�osTrabajando;
        this.trabajando = trabajando;
    }
    
        @Override
        public void saludar() {
            System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "gano: " + salario + "\n" + "trabajo en: " + unidad + "\n" + "llevo: " + a�osTrabajando + "a�os trabajando") ;
            if(trabajando){
                System.out.println("Estoy trabajando en el momento");
                }
            else{
                System.out.println("No trabajo de momento");
            }
        
    }
    
}
