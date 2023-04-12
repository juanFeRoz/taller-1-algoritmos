package javaapplication6;

/**
 *
 * @author diego
 */
public class Profesor extends Empleado{
    private int numCursosImpartidos;
    //Constructor
    public Profesor(String nombre, String apellido, int edad, int salario, String unidad, int añosTrabajando, boolean trabajando, int numCursosImpartidos){
        super(nombre, apellido, edad, salario, unidad, añosTrabajando, trabajando);
        this.numCursosImpartidos = numCursosImpartidos;
    }
    
        @Override
        public void saludar() {
            System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "gano: " + salario + "\n" + "trabajo en: " + unidad + "\n" + "llevo: " + añosTrabajando + " años trabajando" + "\n" + "imparto: " + numCursosImpartidos + " cursos") ;
            if(trabajando){
                System.out.println("Estoy trabajando en el momento");
                }
            else{
                System.out.println("No trabajo de momento");
            }
        }
}
