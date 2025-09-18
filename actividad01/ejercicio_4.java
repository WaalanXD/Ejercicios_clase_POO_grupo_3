package actividad01;

//Ejercicio Propuesto No 14


import java.util.Scanner;



public class ejercicio_4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double num;
        int eleccion;
        System.out.println("Ingrese el numero que quiere evaluar: ");
        num = input.nextDouble();

       


        while (true) {

            System.out.println("Seleccione la operacion que quiera realizar: \n 1. Elevar al cuadrado \n 2. Elevar al cubo \n 3. Salir");
            eleccion = input.nextInt();




            if (eleccion == 1) {

                double resultado = Calculos.calcularCuadrado(num);

                System.out.println("El cuadrado del numero es: " + resultado);
        }

            else if (eleccion == 2) {

                double resultado = Calculos.calcularCubo(num);

                System.out.println("El cubo del numero es: " + resultado);
        }

            else if (eleccion == 3) {


                System.out.println("Fin del programa. Muchas gracias por usar");
                break;
        }


            else {



                System.out.println("Por favor ingrese una opcion valida... \n--------------------------------");
        }




        }
        
        
    }
    
}
