package actividad04.ventanas;
import actividad04.figuras.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class VentanaCilindro extends Jframe implements ActionListener {
    
    private Container contenedor;

    private JLabel radio, altura, volumen, superficie;

    private JTextField campoRadio, campoAltura;

    private JButton calcular;

    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro"); 
        setSize(280,210); 
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {

        contenedor = getContentPane();
        contenedor = setLayout(null);
        

    }
}
