package actividad02.ejercicio04;
//Ejercicio Resuelto No 2.4
public class Ejercicio24 {

    public static void main(String[] args) {


    Circulo figura1 = new Circulo(2);

    Rectangulo figura3 = new Rectangulo(1,2);
    Cuadrado figura2 = new Cuadrado(3); 
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    

    System.out.println("El area del circulo es: " + figura1.calcularArea());
    System.out.println("El perimetro del circulo es: " + figura1.calcularPerimetro());
    System.out.println("-".repeat(50));
    System.out.println("El area del cuadrado es: " + figura2.calcularArea());
    System.out.println("El perimetro del cuadrado es: " + figura2.calcularPerimetro());
    System.out.println("-".repeat(50));
    System.out.println("El area del rectangulo es: " + figura3.calcularArea());
    System.out.println("El perimetro del rectangulo es: " + figura3.calcularPerimetro());
    System.out.println("-".repeat(50));
    System.out.println("El area del triangulo es: " + figura4.calcularArea());
    System.out.println("El perimetro del triangulo es: " + figura4.calcularPerimetro());
    System.out.println("El tipo de triangulo es: " + figura4.determinarTipoTriangulo());


}
}