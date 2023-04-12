package javaapplication6;

/**
 *
 * @author diego
 */
public class Administrativo extends Empleado{
    private int numEscritorio;
    
    public Administrativo(String nombre, String apellido, int edad, int salario, String unidad, int añosTrabajando, boolean trabajando, int numEscritorio){
        super(nombre, apellido, edad, salario, unidad, añosTrabajando, trabajando);
        this.numEscritorio = numEscritorio;
    }    
    
        @Override
        public void saludar() {
            System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "gano: " + salario + "\n" + "trabajo en: " + unidad + "\n" + "llevo: " + añosTrabajando + " años trabajando" + "\n" + "trabajo en el escritorio número: " + numEscritorio) ;
            if(trabajando){
                System.out.println("Estoy trabajando en el momento");
                }
            else{
                System.out.println("No trabajo de momento");
            }
        }
}
