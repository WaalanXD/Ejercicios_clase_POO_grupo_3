package actividad02.ejercicio02;
// Ejercicio Resuelto No 2.2
public class EjercicioN22 {
    public static void main(String[] args) {
        
        Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,tipoPlaneta.TERRESTRE,true);
        System.out.println("\nDatos del planeta 1:");
        p1.imprimir();
        
        System.out.println("Densidad del planeta: "+p1.calcularDensidad());
        
        System.out.println("¿Es planeta exterior?: "+p1.esPlanetaExterior());
        System.out.println("\nDatos del planeta 2:");
        Planeta p2 = new Planeta("Jupiter",79,1.899E27,1.4313E15,139820,750000000,tipoPlaneta.GASEOSO,true);
        
        p2.imprimir();
        
        System.out.println("Densidad del planeta: "+p2.calcularDensidad());
        
        System.out.println("¿Es planeta exterior?: "+p2.esPlanetaExterior());
    
    }
}
