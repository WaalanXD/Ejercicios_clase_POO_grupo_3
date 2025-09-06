import java.util.Scanner;
public class ejercicio_1 {
    public static void main(String[] args) {
        
    // Nombre de ejercicio: Ejercicio resuelto No 4
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la edad de Juan: ");
    double edadJuan = input.nextDouble();
    
    
    double edadAlberto = Calculos.calcularEdadAlberto(edadJuan);
    
    double edadAna = Calculos.calcularEdadAna(edadJuan);
    
    double edadMama = Calculos.calcularEdadMama(edadJuan,edadAlberto, edadAna);
    
    input.close();
    System.out.println("Las edades son: ");
    System.out.println("Alberto: " + edadAlberto);
    System.out.println("Juan: " + edadJuan);
    System.out.println("Ana: " + edadAna);
    System.out.println("Mama: " + edadMama);
    
    
    
    
    
}

}