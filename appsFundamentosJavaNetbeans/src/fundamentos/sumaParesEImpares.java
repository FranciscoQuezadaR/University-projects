package fundamentos;

import java.util.Scanner;

/*
    @author fcoqr
    Aplicacion en consola para la captura de n numeros enteros, la app realizara
    la suma de los numeros impares ingresados, al igual que los numeros pares, al
    final mostrara el total de numeros ingresados de ambos tipos (pares e impares).
*/

public class sumaParesEImpares {
    public static void main(String[] args) {
 
        // Declaración de variables
        Scanner leer = new Scanner ( System.in );
        int num, total = 0, total2 = 0, contador = 0, prom;
        double par;
        
        //Datos de entrada
        for ( int i = 1; i <= 20; i++ ) {
            System.out.print ( "Ingrese el " + i + " número: " );
            num = leer.nextInt(); // Lectura
            par = num % 2;
            
            if ( par != 0 ) {
                total = total + num;
            } 
            else {
                if ( par == 0 ) {
                    contador = contador + 1;
                    total2 = total2 + num;
                }
            }
        }
        
        prom = total2 / contador;
        System.out.println ( "La suma de numeros impares es: " + total       );
        System.out.println ("La suma de los numeros pares es: " + total2     );
        System.out.print   ( "Sen ingresaron " + contador + " numeros pares" );
        System.out.println ( " y su promedio es " + prom                     );
       
    }
}