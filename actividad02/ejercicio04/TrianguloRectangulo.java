package actividad02.ejercicio04;

public class TrianguloRectangulo {

    public int base;
    public int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return (base * altura) / 2;
        //NOTA: (base * altura) / 2.0 seria mejor. Ejecucion imprecisa en el ejemplo del libro.
    }

    double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    
    }

    double calcularPerimetro() {
        return calcularHipotenusa() + base + altura;

    }

    String determinarTipoTriangulo() {


        if (base == altura && base == calcularHipotenusa()) {
            return "Equilatero";
        }   
    
        else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()) {
            return "Escaleno";
        }

        else {
            return "Isoceles";
        }

}

}