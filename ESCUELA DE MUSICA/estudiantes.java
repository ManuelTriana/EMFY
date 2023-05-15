
/**
 * Write a description of class estudiantes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class estudiantes
{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numeroClientes;
       ClientesPOO[] losClientes = new ClientesPOO[50];
       String identificacion, nombre, enfasisEstudiantes;
       double costo;
       double promedio = 0;
       
       System.out.println("***********************************");
       System.out.println("Digite el numero de estudiantes: ");
       numeroClientes = sc.nextInt();
       for(int i = 0; i < numeroClientes; i++){
           System.out.println("--------------------------------------");
            System.out.println("Digite la identificacion del estudiante");
            identificacion = sc.next();
            System.out.println("--------------------------------------");
            System.out.println("Digite el nombre del estudiante");
            nombre = sc.next();
            System.out.println("--------------------------------------");
            System.out.println("Digite el enfasis instrumental del estudiante: ");
            enfasisEstudiantes = sc.next();
            System.out.println("--------------------------------------");
            System.out.println("Digite el costo del semestre del estudiante:");
            costo = sc.nextDouble();
           ClientesPOO unCliente = new ClientesPOO();
           unCliente.identificacion = identificacion;
           unCliente.nombre = nombre;
           unCliente.enfasisEstudiantes = enfasisEstudiantes;
           unCliente.costo = costo;
           losClientes[i] = unCliente;
        }
         for(int i = 0; i < numeroClientes; i++){
             promedio = promedio + (losClientes[i].costo / numeroClientes);
            }
            
            for(int i = 0; i < numeroClientes; i++){
                System.out.println("***********************************");
             System.out.println("C.C: " +losClientes[i].identificacion);
             System.out.println("Nombres: "+ losClientes[i].nombre);
            System.out.println("Reparacion: "+ losClientes[i].enfasisEstudiantes);
            System.out.println("Costo: "+ losClientes[i].costo+"$");
            }
            
            System.out.println("El promedio general de ingresos es de: " + promedio+"$");
         }
}
