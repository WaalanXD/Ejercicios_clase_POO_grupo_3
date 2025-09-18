package actividad01;

public class Calculos {
    


     // Funciones para ejercicio 3
    static double calcularSalarioBruto(double horas, double valorHora) {
        double resultado = horas * valorHora;
        return resultado;
    }

    static double calcularPorcentajeRetencion(double porcentaje) {
        double resultado = porcentaje / 100;
        return resultado;
    }

    static double calcularRetencionFuente(double salarioBruto, double porcentajeRetencion) {
        double resultado = salarioBruto * porcentajeRetencion;
        return resultado;
    }

    static double calcularSalarioNeto(double salarioBruto, double retencionFuente) {
        double resultado = salarioBruto - retencionFuente;
        return resultado;
    }

    //Funciones ejercicio 1

    static double calcularEdadAlberto(double edadJuan) {
        double edadAlberto = edadJuan * 2.0 / 3.0;
        return edadAlberto;
    }


    static double calcularEdadAna(double edadJuan) {
        double edadAna = edadJuan * 4.0 / 3.0;
        return edadAna;
    }


    static double calcularEdadMama(double edadJuan, double edadAlberto, double edadAna) {
        double edadMama = edadJuan + edadAlberto + edadAna;
        return edadMama;
    }

    //Funciones ejercicio 2
    static double calcularSuma(double suma, double x) {

        double resultado = suma + x;

        return resultado;
    }

    static double calcularX(double x, double y) {


        double resultado = x + Math.pow(y,2);

        return resultado;

    }


    //Funciones ejercicio 4:


    static double calcularCuadrado(double numero) {

        double resultado = Math.pow(numero, 2); 

        return resultado;
    }

    static double calcularCubo(double numero) {

        double resultado = Math.pow(numero, 3); 

        return resultado;
    }
    
    //Ejercicio 5: 
     static double calcularLongitud(double radio) {

        double resultado = 2 * Math.PI * radio;

        return resultado;

    }


    static double calcularArea(double radio) {

        double resultado = Math.PI * Math.pow(radio, 2);

        return resultado;

        
    }


}
