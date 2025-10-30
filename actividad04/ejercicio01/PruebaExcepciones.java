package actividad04.ejercicio01;

public class PruebaExcepciones {

    public static double calcularDivision(double numerador, double denominador) {
        
        return numerador / denominador;

    }
    //Metodo ObtenerMensaje pendiente (implementación despues de vod Martes 23 de octubre)
    public static String ObtenerMensaje(String mensaje) {
        if (mensaje.isEmpty() == false) {
            return mensaje;
            
        } 

        return "texto vacío";
    }
}