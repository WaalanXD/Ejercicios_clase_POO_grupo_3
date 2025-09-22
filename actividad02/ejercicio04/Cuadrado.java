package actividad02.ejercicio04;

public class Cuadrado {
    public int lado;
    public Cuadrado(int lado) {
        this.lado = lado;
        
    }

    double calcularArea() {
        return Math.pow(lado, 2);
    }

    double calcularPerimetro() {
        return 4 * lado;
    }

}