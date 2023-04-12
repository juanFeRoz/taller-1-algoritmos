package javaapplication6;

/**
 *
 * @author diego
 */
public class EstudiantePosgrado extends Estudiante{
    protected String carreraEgresada;
    //Constructor
    public EstudiantePosgrado(String nombre, String apellido, int edad, int semestre, float promedio, int numCursos, String progAcademico, String carreraEgresada ){
        super(nombre, apellido, edad, semestre, promedio, numCursos, progAcademico);
        this.carreraEgresada = carreraEgresada;
    }
    
        @Override
    public void saludar() {
        System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "voy en el semestre: " + semestre + "\n" + "promedio: " + promedio + "\n" + "he tomado: " + numCursos + " cursos" +  "\n" + "curso como programa académico: " + progAcademico + "\n" + "egresé de: " + carreraEgresada);
    }
    
}
