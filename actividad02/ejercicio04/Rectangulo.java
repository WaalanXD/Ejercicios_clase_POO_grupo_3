package actividad02.ejercicio04;

public class Rectangulo {
    public int base;
    public int altura;

    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }

}
