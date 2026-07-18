
package SolicitarDatos;

import java.util.Scanner;


public class SolicitarDatos {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String nombre;
     int edad;
     String carrera;
     double estatura;
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su carrera: ");
        carrera = sc.nextLine();
        System.out.println("Ingrese su estatura: ");
        estatura = sc.nextDouble();
        
        System.out.println("=====RESUKTADOS=====");
        System.out.println("Su nombres es: " + nombre);
        System.out.println("Su edad es: "+ edad);
        System.out.println("Su carrera es: "+ carrera);
        System.out.println("Su estatura es: "+ estatura);
        
}
   }
   