package actividad02.ejercicio04;

public class TrianguloRectangulo {

    public int base;
    public int altura;

    TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularHipotenusa() {
        return Math.hypot(base, altura);
    }

}
