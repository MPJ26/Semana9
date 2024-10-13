package programa;
import java.util.Scanner;
public class tarea3 {
    public static void main (String args[]){
        //declaracion de variables
        int n;
        double total, promedio, mayor, menor;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingrese el número de personas: ");
        n = lectura.nextInt();
        double[] compras = new double[n];
        total=0;
        mayor = Double.NEGATIVE_INFINITY;
        menor = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
        System.out.print("Ingrese la monto de compra de la persona " + (i + 1) + ": ");
        compras[i] = lectura.nextDouble();
        //proceso de datos
        total += compras[i];
        if (compras[i] > mayor) {
            mayor = compras[i];
        }
        if (compras[i] < menor) {
            menor = compras[i];
            }
        }
        promedio = total / n;
        //salida de datos     
        System.out.println("Total de compras: " + total);
        System.out.println("Promedio de compras: " + promedio);
        System.out.println("Compra mayor: " + mayor);
        System.out.println("Compra menor: " + menor);
}
}
