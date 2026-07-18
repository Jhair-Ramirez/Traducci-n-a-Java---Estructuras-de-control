
package tablademulti;

import java.util.Scanner;


 //@author Jhair Alfredo Ramirez Aguilar

public class TablaDeMulti {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        System.out.println("Tabla de multiplicar del "+ numero);
        for (int i =1; i<=12; i++){
            System.out.println(numero+"x"+i+"="+(numero*i));
        }
    }
    
}
