
package operaciones;

import java.util.Scanner;

// Jhair Alfredo Ramirez Aguilar

public class Operaciones {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;   
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        
        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
       
        System.out.println("===Resultados===");
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        
        if (num2 != 0) {
            double division = (double) num1 / num2;
            int residuo = num1 % num2;
            System.out.println("Division: " + division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("División: No se puede dividir por cero.");
            System.out.println("Residuo: No se puede calcular.");
        }
       
    }
    
}
