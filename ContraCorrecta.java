
package contracorrecta;

import java.util.Scanner;

// Jhair Alfredo Ramirez Aguilar
public class ContraCorrecta {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "java2026";
        String intento;
        do{
            System.out.println("Ingrese la contrasenia: ");
            intento = sc.nextLine();
            if (!intento.equals(claveCorrecta)){
            System.out.println("Contrasenia Incorrecta. Intente otra vez");            
            }
        } while (!intento.equals(claveCorrecta));
        System.out.println("Acceso concedido.");
    }
}    
