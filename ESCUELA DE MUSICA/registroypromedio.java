
/**
 * Programa que calcule el registro de estudiantes y el promedio de un periodo para una escuela de Musica. 
 * 
 * Autor: Manuel David Triana Latorre 
 * 1.0
 */
 import java.util.Scanner;
public class registroypromedio

{
    
    public static void main(String[] args) {
        int tamaño = 50;
        int[] identificaciones = new int[tamaño];
        String[] nombres = new String[tamaño];
        String[] enfasismusical = new String[tamaño];
        double[] costos = new double[tamaño];
        
        System.out.println("--------------------------------------");
        System.out.println("Digite el numero de estudiantes");
        Scanner scanner = new Scanner(System.in);
        int numeroEstudiantes = scanner.nextInt();
        
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("--------------------------------------");
            System.out.println("Digite la identificacion del estudiante");
            int identificacion = scanner.nextInt();
            System.out.println("--------------------------------------");
            System.out.println("Digite el nombre del estudiante");
            String nombre = scanner.next();
            System.out.println("--------------------------------------");
            System.out.println("Digite el enfasis instrumental del estudiante: ");
            String enfasisEstudiante = scanner.next();
            System.out.println("--------------------------------------");
            System.out.println("Digite el costo del semestre del estudiante:");
            double costo = scanner.nextDouble();
            
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            enfasismusical[i] = enfasisEstudiante;
            costos[i] = costo;
        }
        
        double promedio = 0;
        for (int i = 0; i < numeroEstudiantes; i++) {
            promedio = promedio + (costos[i] / numeroEstudiantes);
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Los estudiantes son:");
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("--------------------------------------");
            System.out.println("C.C: " + identificaciones[i]);
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Enfasis: " + enfasismusical[i]);
            System.out.println("Costo: $" + costos[i]);
        }
        
        System.out.println("**********************************");
        System.out.println("El promedio de ingresos es de: $" + promedio);
        
        scanner.close();
    }
}


