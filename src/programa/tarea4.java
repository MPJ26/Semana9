package programa;
import java.util.Scanner;
public class tarea4 {
    public static void main (String args[]){
        //declaracion de variables
        int n=5;
        String[] nombre = new String[n];
        String nombreb;      
        boolean encontrado = false;
        Scanner lectura=new Scanner (System.in);
        // entrada de datos

        System.out.println("Ingrese los nombres de " + n + " personas:");       
        for (int i = 0; i < n; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            nombre[i] = lectura.nextLine(); // almacenar nombre en el arreglo
        }
        System.out.print("Ingrese el nombre a buscar: ");
        nombreb = lectura.nextLine();
        for (int i = 0; i < n; i++) {
            if (nombre[i].equalsIgnoreCase(nombreb)) {
                encontrado = true;
                System.out.println("La persona " + nombreb + " existe en la posición " + (i+1)+".");
                break; 
            }
        }
        //salida de datos     
        if (!encontrado) {
            System.out.println("La persona " + nombreb + " no existe en el arreglo.");
        }
    }    
}