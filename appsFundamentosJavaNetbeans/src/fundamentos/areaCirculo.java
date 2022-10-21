package fundamentos;

/*
    @author fcoqr
    App en consola para calcular el area y el perimetro de un circulo, la app
    recibe del usuario el radio, la salida de app es el area y perimetro.
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaración de variables
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("####.##",simbolos);
        Scanner leer = new Scanner(System.in);
        double radio, area, perimetro;
        
        //Datos de entrada
        System.out.print("Ingrese la radio del circulo: ");
        radio = leer.nextDouble();
        
        //Proceso
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        
        //Datos de salida
        System.out.println("El area es de: " + formateador.format (area));
        System.out.println("El perimetro es de: " + formateador.format(perimetro));
    }
}
