package programa;
import java.util.Scanner;
public class tarea2 {
    public static void main (String args[]){
    //declaracion de variables
    int n;
    double ingreso, pingreso, ingresom=Double.NEGATIVE_INFINITY, suma=0;        
    Scanner lectura=new Scanner (System.in);
    
    //entrada de datos
    System.out.print("Ingrese el número de personas: ");
    n = lectura.nextInt();
    double[] ingresos = new double[n];
    //proceso de datos
    for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingreso = lectura.nextDouble();
            ingresos[i] = ingreso;
            suma += ingreso;
    // Verificar si el ingreso actual es mayor que el ingresom
        if (ingreso > ingresom) {
            ingresom = ingreso; 
        }   
    }
    // Cálculo del ingreso promedio
        pingreso = suma / n;
    
    //salida de datos
        System.out.println("El ingreso promedio de las "+n+" personas es: "+pingreso);
        System.out.println("El ingreso mayor de las " +n+" personas es: "+ingresom);
    }
}