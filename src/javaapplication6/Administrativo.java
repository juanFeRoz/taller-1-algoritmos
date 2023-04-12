package javaapplication6;

/**
 *
 * @author diego
 */
public class Administrativo extends Empleado{
    private int numEscritorio;
    
    public Administrativo(String nombre, String apellido, int edad, int salario, String unidad, int a�osTrabajando, boolean trabajando, int numEscritorio){
        super(nombre, apellido, edad, salario, unidad, a�osTrabajando, trabajando);
        this.numEscritorio = numEscritorio;
    }    
    
        @Override
        public void saludar() {
            System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "gano: " + salario + "\n" + "trabajo en: " + unidad + "\n" + "llevo: " + a�osTrabajando + " a�os trabajando" + "\n" + "trabajo en el escritorio n�mero: " + numEscritorio) ;
            if(trabajando){
                System.out.println("Estoy trabajando en el momento");
                }
            else{
                System.out.println("No trabajo de momento");
            }
        }
}
