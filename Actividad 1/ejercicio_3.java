import java.util.Scanner;

// EJERCICIO PROPUESTO No 12
public class ejercicio_3 {

    public static void main(String[] args) {
        

        double horas, valor_hora, salario_bruto,porcentaje_retencion, retencion_fuente,  retencion, salario_neto;


        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una cantidad para las horas trabajadas: ");
        horas = input.nextDouble();

        System.out.println("Ingrese un valor para la hora de trabajo: ");

        valor_hora = input.nextDouble();

        System.out.println("Ingrese un valor para la retencion: ");

        retencion = input.nextDouble();

        salario_bruto = Calculos.calcularSalarioBruto(horas, valor_hora);



    
        porcentaje_retencion = Calculos.calcularPorcentajeRetencion(retencion);


        retencion_fuente = Calculos.calcularSalarioNeto(salario_bruto, porcentaje_retencion);

        salario_neto = Calculos.calcularSalarioNeto(salario_bruto, retencion_fuente);


        System.out.println("El salario bruto es: " + salario_bruto);
        System.out.println("la retencion a la fuente es: " + retencion_fuente);
        System.out.println("El salario neto es: " + salario_neto);










        



    }
    
}
