package programa;
import java.util.Scanner;
public class ejercicio1 {
    public static void main (String args[]){
        //declaracion de variables
        int n, edad;
        double pe,acedad;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresar cantidad de edades: ");
        n=lectura.nextInt();
        int [] aedades=new int [n];
        acedad=0;
        for(int i=0;i<n;i++){
            System.out.print("Ingresar edad "+ (i+1)+":");
            edad=lectura.nextInt();
            aedades[i]=edad;
        }
        //proceso de datos
       for (int i=0;i<n;i++){
           acedad+=aedades[i];
       }
       pe=acedad/n;
        //salida de datos
        System.out.println ("El promedio de edad es: "+pe);
    }
}
