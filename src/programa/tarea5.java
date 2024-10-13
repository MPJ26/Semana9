package programa;
import java.util.Scanner;
public class tarea5 {
    public static void main (String args[]){
        //declaracion de variables
        int n=5;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n * 2];
        Scanner lectura = new Scanner(System.in);        
         // Entrada de datos para el arreglo a
        System.out.println("Ingrese " + n + " números para el arreglo a:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = lectura.nextInt();
        }
        // Entrada de datos para el arreglo b
        System.out.println("Ingrese " + n + " números para el arreglo b:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            b[i] = lectura.nextInt(); 
        }
        // Llenar el arreglo c 
        for (int i = 0; i < n; i++) {
            c[i * 2] = a[i]; 
            c[i * 2 + 1] = b[i]; 
        }
        // Salida de datos
        System.out.print("El arreglo c es: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " "); 
        }
    }    
}
