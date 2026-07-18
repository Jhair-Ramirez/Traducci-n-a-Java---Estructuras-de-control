
package edadpersona;

import java.util.Scanner;

// Jhair Alfredo Ramirez Aguilar
public class EdadPersona {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad de la persona: ");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Es mayor de edad.");
        }
        
    }
    
}
