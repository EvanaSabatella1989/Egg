
package ejercicio1;

import Servicios.RazasPerrosServicio;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RazasPerrosServicio rps = new RazasPerrosServicio();
        
        String salir = "NO";
        
        do { 
            rps.IngresarNuevaRaza();
            System.out.println("¿Desea salir?");
            salir = leer.next().toUpperCase();
            System.out.println(salir);
            
        } while (salir.equals("NO"));
        
        rps.MostrarRazas();
    }
    
}
