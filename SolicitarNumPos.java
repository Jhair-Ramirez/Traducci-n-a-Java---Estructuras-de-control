
package solicitarnumpos;

import java.util.Scanner;

//@author Jhair Alfredo Ramirez Aguilar

public class SolicitarNumPos {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        double numero;
        System.out.println("Ingrese un numero positivo (Negativo para finalizar el programa): ");
        while (true){
            numero = sc.nextDouble();
            if(numero<0){
            break;        
            }      
           suma += numero;
           contador++;
        }  
        System.out.println("Cantidad de numeros ingresados: " + contador);
        System.out.println("Suma total: " + suma);
    }
    
   }
    
