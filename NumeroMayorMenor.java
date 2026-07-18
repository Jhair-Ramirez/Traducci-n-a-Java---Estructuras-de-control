
package numeromayormenor;

import java.util.Scanner;


 // Jhair Alfredo Ramirez Aguilar
 
public class NumeroMayorMenor {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Por favor ingrese 10 números:");
        
        System.out.print("Numero 1: ");
        int numero = sc.nextInt();
        
        
        int mayor = numero;
        int menor = numero;
        
        for (int i = 2; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            numero = sc.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("=== Resultados ===");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
    
}
