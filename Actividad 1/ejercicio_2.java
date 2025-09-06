// Ejercicio Resuelto No 5

import java.util.Scanner;
public class ejercicio_2 {
    
    public static void main(String[] args) {
      
        
    double x,y,suma;

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un valor para x: ");
    x = input.nextDouble();

    System.out.println("Ingrese un valor para y: ");
    y = input.nextDouble();

    System.out.println("Ingrese un valor para suma: ");
    suma = input.nextDouble();


    input.close();


    suma = Calculos.calcularSuma(suma, x);


    x = Calculos.calcularX(x, y);

    suma = suma + (x/y);


    System.out.println("El valor de la suma es: " + suma);














    }

    
}
