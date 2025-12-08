package ejercicio02;

/** Clase con el metodo main que inicia la aplicacion. */
public class Principal {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal(hotel);
        miVentanaPrincipal.setVisible(true);
    }
}
