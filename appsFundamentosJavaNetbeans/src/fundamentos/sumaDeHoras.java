package fundamentos;

/*
    @author fcoqr
    Aplicacion en consola para la captura de horas y minutos, la salida de la app 
    dara como resultado la suma de las horas y minutos por aparte (sin conversion
    de minutos - horas), la otra salida tomara en cuenta si minutos >= 60 lo que
    hara que se sume un hora mas y el resto de minutos si la condicion no se 
    cumple se mostraran normalmente. (si ciclos)
*/

import java.util.Scanner;

public class sumaDeHoras {
    public static void main(String[] args) {
        
        //Declaraión de variables
        Scanner leer = new Scanner(System.in);
        int horas1, horas2, minutos1, minutos2, horast, minutost, horaajuste, minutosajuste;
        
        //Datos de entrada
        System.out.print("Ingrese las primeras horas: ");
        horas1 = leer.nextInt();
        
        System.out.print("Ingrese las primeros minutos: ");
        minutos1 = leer.nextInt();
        
        System.out.print("Ingrese las segundas horas: ");
        horas2 = leer.nextInt();
        
        System.out.print("Ingrese las segundos minutos: ");
        minutos2 = leer.nextInt();
        
        //Proceso
        horast = horas1 + horas2;
        minutost = minutos1 + minutos2;
        
        horaajuste = horast + 1;
        minutosajuste = minutost - 60;
        
        //Datos de salida
        System.out.println("Las horas totales son: " + horast);
        System.out.println("Los minutos totales son: " + minutost);
        
        System.out.println("***************OTRA OPCION***************");
        System.out.println("Las horas totales son: " + horaajuste);
        System.out.println("Los minutos totales son: " + minutosajuste);
           
    }
}
