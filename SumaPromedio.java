
package sumapromedio;

import java.util.Scanner;


 // Jhair Alfredo Ramirez Aguilar

public class SumaPromedio {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num;
        double promedio;
        System.out.println("Ingrese 10 numeros: ");
        for (int i = 1; i<=10; i++){
            num = sc.nextInt();
            suma += num; 
        }
        promedio = suma/10;
        System.out.println("=== Resultado===");
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);
    }
    
}
