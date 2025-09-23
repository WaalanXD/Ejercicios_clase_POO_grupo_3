package actividad02.ejercicio05;

public class CuentaBancaria {
    
    String nombresTitular;
    String apellidosTitular;
    String numeroCuenta;

    tipo tipoCuenta;
    double saldo = 0;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, String numeroCuenta, tipo tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    void imprimir() {
        System.out.println("Titular: " + nombresTitular + " " + apellidosTitular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
    }

    void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }   


    boolean consignar(int valor) {

        if (valor > 0) {

            saldo += valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirar(int valor) {

        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Se ha retirado $" + valor + " de la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual y mayor que cero.");
            return false;
        }
    }
}
