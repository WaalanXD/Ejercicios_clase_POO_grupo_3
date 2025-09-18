package actividad02.ejercicio03;

public class EjercicioN23 {

    public static void main(String[] args) {
        
        Automovil a1 = new Automovil("Ford", 2018, 3, tipoCom.DIESEL, tipoA.EJECUTIVO, 5,6,250, tipoColor.NEGRO);

        a1.imprimir();

        a1.setVelocidadActual(100);

        a1.acelerar(20);

        a1.desacelerar(50);

        System.out.println("Velocidad actual: " + a1.velocidadActual);

        a1.frenar();

        System.out.println("Velocidad actual: " + a1.velocidadActual);

        a1.desacelerar(20);

        
        
    }
    
}
