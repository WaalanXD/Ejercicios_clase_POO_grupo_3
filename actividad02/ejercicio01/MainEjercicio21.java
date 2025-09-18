package actividad02.ejercicio01;
import java.util.Scanner;
public class MainEjercicio21 {
//comentario: es un poco diferente al del libro porque estaba practicando arrays, perdon.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Persona p1 = null;
        Persona p2 = null;
        int contador = 0;

        System.out.println("\n---INICIO EJERCICIO CLASE PERSONAS--- \n");
        while (contador < 2) {


        String[] array = {"nombre", "apellido", "numero de identidad" ,"año de nacimiento"} ;

    

        for (int i = 0; i < 4; i++) {

            System.out.print("Ingrese el "+ array[i]+" de la persona "+(contador+1)+": ");

            array[i] = input.nextLine();

        }

        int num = Integer.parseInt(array[3]);

        if (contador == 0) {

            p1 = new Persona(array[0], array[1], array[2], num);
            System.out.println("\n---Persona 1 agregada con exito---\n");
            contador += 1;

        }

        else {

            p2 = new Persona(array[0], array[1], array[2], num);
            System.out.println("\n---Persona 2 agregada con exito---\n");
            contador += 1;
        }


        }

        input.close();
        System.out.println("\n---Datos de la persona 1---\n");
        p1.imprimir();
        System.out.println("\n---Datos de la persona 2---\n");
        p2.imprimir();



    }
    
}
