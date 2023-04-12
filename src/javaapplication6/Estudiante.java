package javaapplication6;

/**
 *
 * @author diego
 */
public class Estudiante extends Persona{
    protected int semestre;
    protected float promedio;
    protected int numCursos;
    protected String progAcademico;
    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int semestre, float promedio, int numCursos, String progAcademico){
        super(nombre, apellido, edad);
        this.semestre = semestre;
        this.promedio = promedio;
        this.numCursos = numCursos;
        this.progAcademico = progAcademico;
    }

    @Override
    public void saludar() {
        System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "voy en el semestre: " + semestre + "\n" + "promedio :" + promedio + "\n" + "he tomado: " + numCursos + "\n" + "curso: " + progAcademico);
    }
    
}
