
package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RazasPerrosServicio {
    private Scanner leer;
    private List<String> razasDePerro;

    public RazasPerrosServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razasDePerro = new ArrayList<>();
    }
    
    public void IngresarNuevaRaza(){
        System.out.println("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.println("Introducir talla: ");
        String talla = leer.next();
        
        System.out.println("Introducir pelaje: ");
        String pelaje = leer.next();
        
        System.out.println("Introducir peso de adulto: ");
        int peso = leer.nextInt();
        
        String nuevaRaza = "nombre: " + nombre + ", talla: " + talla + ", pelaje: " + pelaje + ", peso de adulto: " + peso + " kg.";
        
        razasDePerro.add(nuevaRaza);
    }
    
    public void MostrarRazas(){
        System.out.println("Las razas ingresadas son " + razasDePerro.size());
        for(String raza:razasDePerro){
            System.out.println(raza);
        }
    }
    
    
}
