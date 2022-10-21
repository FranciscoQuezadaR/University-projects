package fundamentos;

/*
    @author fcoqr
    Aplicacion en consola para la captura de dos numeros enteros, la app realizara
    la suma de los numeros ingresados mostrara el total.
*/

import java.util.Scanner;

public class sumaNumerosEnteros {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner leer = new Scanner ( System.in );
        int suma, num1, num2;
        
        //Datos de entrada
        System.out.print ( "Introduzca el primer número: " );
        num1 = leer.nextInt(); // Lectura
        
        System.out.print ( "Introduzca el segundo número: " );
        num2 = leer.nextInt(); // Lectura
        
        //Proceso
        suma = num1 + num2;
        
        //Datos de salida
        System.out.println ( "El resultado de la suma de los números es: " + suma );
    }
}
