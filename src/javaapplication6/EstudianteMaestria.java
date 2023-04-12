package javaapplication6;

/**
 *
 * @author diego
 */
public class EstudianteMaestria extends EstudiantePosgrado{
    private String temaTesisMaestria;
    //Constructor
    public EstudianteMaestria(String nombre, String apellido, int edad, int semestre, float promedio, int numCursos, String progAcademico, String carreraEgresada, String temaTesisMaestria){
        super(nombre, apellido, edad, semestre, promedio, numCursos, progAcademico, carreraEgresada);
        this.temaTesisMaestria = temaTesisMaestria;
    }
    
        @Override
    public void saludar() {
        System.out.println("Buenas estos son mis datos:  \n" + "nombre: " + nombre + "\n" + "apellido: " + apellido + "\n" + "edad: " + edad + "\n" + "voy en el semestre: " + semestre + "\n" + "promedio: " + promedio + "\n" + "he tomado: " + numCursos + " cursos" +  "\n" + "curso como programa académico: " + progAcademico + "\n" + "egresé de: " + carreraEgresada + "\n" + "el tema de mi tesis fue: " + temaTesisMaestria);
    }
    
}
