package actividad02.ejercicio04;

public class Circulo {
    public int radio;


    public Circulo(int radio) {
        this.radio = radio;
        
    }

    double calcularArea() {

        return Math.PI * Math.pow(radio, 2);
    }

    double calcularPerimetro() {

        return 2 * Math.PI * radio;
    }
}
