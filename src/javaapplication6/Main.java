package javaapplication6;
/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudiantePregrado estudiantePregrado = new EstudiantePregrado("José", "Alvarez", 21, 4, (float)3.3, 5, "Ingeniería industial", 1);
        EstudianteMaestria estudianteMaestria = new EstudianteMaestria("Daniel", "Juarez", 23, 6, (float)3.7, 2, "cementos", "Ingeniería civil", "como hacer cemento");
        EstudianteDoctorado estudianteDoctorado = new EstudianteDoctorado("Alicia", "Beneviento", 45, 2, (float)4.5, 3, "contaminación", "Ingeniería ecológica", "disminuir resudios");
        Profesor profesor = new Profesor("Adolf", "Hitler", 134, 5000000, "Artes", 50, false, 2);
        Administrativo administrativo = new Administrativo("Juana", "Armenda", 45, 1000000, "Admisiones", 10, true, 4);
        
        estudiantePregrado.saludar();
        System.out.println("\n");
        estudianteMaestria.saludar();
        System.out.println("\n");
        estudianteDoctorado.saludar();
        System.out.println("\n");
        profesor.saludar();
        System.out.println("\n");
        administrativo.saludar();
        
    }
    
}
