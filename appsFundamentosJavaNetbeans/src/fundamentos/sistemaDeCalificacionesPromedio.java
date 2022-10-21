package fundamentos;

/*
    @author fcoqr
    Aplicacion en consola para la captura de la matricula de un alumno, ademas de
    6 calificaciones correspondientes al mismo alumno, la salida de la app es el
    promedio de las 6 calificaciones ingresadas.
*/

import java.util.Scanner;

public class sistemaDeCalificacionesPromedio {
    public static void main(String[] args) {
        
        // Declaracion de variables
        Scanner leer = new Scanner ( System.in );
        int calif, numcontrol, sumacalif = 0;
        double promedio;
        
        System.out.print ( "Ingrese el número de control del alumno: " );
        numcontrol = leer.nextInt (); // Lectura
        
        for ( int i = 1; i <= 6; i++ ) {
            System.out.print ( "Igrese la calificación " + i + " del alumno: " );
            calif = leer.nextInt(); // Lectura
            sumacalif = sumacalif + calif;
        }
        promedio = sumacalif / 6.0;
        
        System.out.print   ( "El alumno con número de control " + numcontrol );
        System.out.println ( " Tiene un promedio final de: " + promedio      );
    }
}
