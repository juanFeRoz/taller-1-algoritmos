package javaapplication6;

/**
 *
 * @author diego
 */
public class EstudiantePregrado extends Estudiante{
    private int numContextos;
    //Constructor
    public EstudiantePregrado(String nombre, String apellido, int edad, int semestre, float promedio, int numCursos, String progAcademico, int numContextos){
        super(nombre, apellido, edad, semestre, promedio, numCursos, progAcademico);
        this.numContextos = numContextos;
    }
    
    @Override
    public void saludar() {
        System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "voy en el semestre: " + semestre + "\n" + "promedio: " + promedio + "\n" + "he tomado: " + numCursos + " cursos" +  "\n" + "curso com programa académico: " + progAcademico + "\n" + "tengo: " + numContextos + " contextos");
    }
    
}
