package programa;
import java.util.Scanner;
public class tarea1 {
    public static void main (String args[]){
    //declaracion de variables
    int n;
    double peso, ppeso, suma=0;        
    Scanner lectura=new Scanner (System.in);
    //entrada de datos
    System.out.print("Ingrese el número de personas: ");
    n=lectura.nextInt();
    double[] pesos = new double[n];
     for (int i = 0; i < n; i++) {
        System.out.print("Ingrese el peso de la persona "+(i+1)+ ": ");
        peso = lectura.nextDouble();
        pesos[i] = peso;
        suma += peso;
     }
    //calculo del peso promedio
        ppeso = suma / n; 
    // Visualizar el peso promedio
        System.out.println("El peso promedio de las "+n+ " personas es: "+ppeso);
    }    
}
