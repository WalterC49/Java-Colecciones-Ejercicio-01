/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
*/
package ejercicio_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa guarda razas de perros en un ArrayList y luego las muestra.");
        Scanner leer = new Scanner(System.in);
        ArrayList<String> RazaPerro = new ArrayList();
        String respuesta;
        boolean continuar = false;
        
        do{
            System.out.print("Ingrese una raza de perro: ");
            RazaPerro.add(leer.next());
            
            do{
                System.out.print("¿Desea agregar otra raza?(s/n) ");
                respuesta = leer.next().toLowerCase();
                switch(respuesta){
                    case "s":
                        continuar=true;
                        break;
                    case "n":
                        continuar=false;
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            }while(!(respuesta.equals("s")||respuesta.equals("n")));
            
        }while(continuar==true);
        
        System.out.println("\nMostrando ArrayList(Raza de PerrosDogo): ");
        
        for(String i: RazaPerro){
            System.out.println(i);
        }
    }
    
}
