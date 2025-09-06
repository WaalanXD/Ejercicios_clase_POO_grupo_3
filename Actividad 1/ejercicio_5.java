// EJERCICIO PROPUESTO 17 3

import java.util.Scanner;


public class ejercicio_5 {

    public static void main(String[] args) {

        double radio, longitudCircunferencia, areaCirculo;

        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese el numero del radio");

        radio = input.nextDouble();


        longitudCircunferencia = Calculos.calcularLongitud(radio);

        areaCirculo = Calculos.calcularArea(radio);

        System.out.println("La longitud del Circulo es: " + longitudCircunferencia);

        System.out.println("El area del circulo es: " + areaCirculo);
        
    }

}

