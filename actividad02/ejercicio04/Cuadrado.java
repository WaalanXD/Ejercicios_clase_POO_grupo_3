package actividad02.ejercicio04;

public class Cuadrado {
    public int lado;
    Cuadrado(int lado) {
        this.lado = lado;
        
    }

    public int calcularArea() {
        return lado * lado;
    }

    public int calcularPerimetro() {
        return 4 * lado;
    }

    
}