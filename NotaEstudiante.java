
package notaestudiante;

import java.util.Scanner;

// Jhair Alfredo Ramirez Aguilar

public class NotaEstudiante {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Ingrese la nota del estudiante: ");
        nota = sc.nextDouble();
        
        if (nota >=7){
            System.out.println("APROBADO!!");     
    } else {
            System.out.println("REPROBADO!!");
        }
        
        
    }
    
}
