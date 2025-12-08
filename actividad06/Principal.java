package actividad06;

/**
 * Punto de entrada al programa de nómina de empleados.
 */
public class Principal {
    public static void main(String[] args) {
        ListaEmpleados lista = new ListaEmpleados();
        VentanaAgregarEmpleado ventana = new VentanaAgregarEmpleado(lista);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }
}