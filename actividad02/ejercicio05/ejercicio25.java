package actividad02.ejercicio05;
// Ejercicio Resuelto No 5
public class ejercicio25 {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Perez", "123456789", tipo.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        
    }
}




