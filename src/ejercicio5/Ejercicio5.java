/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author bhernandezsouto
 */
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantidad_millas, CAMBIO = 1852;
        Scanner ab = new Scanner(System.in);
        System.out.println("Introduzca La cantidad de millas a convertir");
        cantidad_millas = ab.nextDouble();
        System.out.println("La cantidad introducida en metros es: " + (cantidad_millas*CAMBIO));
    }
    
}
