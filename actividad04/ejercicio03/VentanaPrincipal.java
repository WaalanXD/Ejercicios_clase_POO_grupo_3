package actividad04.ejercicio03;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton calcular, limpiar;
    private JTextField campoNumero;
    private JLabel labelNumero, labelLogaritmo, labelRaiz, labelError;

    public VentanaPrincipal() {
        inicio();
        setTitle("Cálculos Numéricos");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        labelNumero = new JLabel("Número:");
        labelNumero.setBounds(20, 20, 100, 23);
        contenedor.add(labelNumero);

        campoNumero = new JTextField();
        campoNumero.setBounds(120, 20, 150, 23);
        contenedor.add(campoNumero);

        calcular = new JButton("Calcular");
        calcular.setBounds(50, 70, 100, 30);
        calcular.addActionListener(this);
        contenedor.add(calcular);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(200, 70, 100, 30);
        limpiar.addActionListener(this);
        contenedor.add(limpiar);

        labelLogaritmo = new JLabel("Logaritmo Neperiano: ");
        labelLogaritmo.setBounds(20, 120, 350, 23);
        contenedor.add(labelLogaritmo);

        labelRaiz = new JLabel("Raíz Cuadrada: ");
        labelRaiz.setBounds(20, 150, 350, 23);
        contenedor.add(labelRaiz);

        labelError = new JLabel("");
        labelError.setBounds(20, 180, 350, 23);
        labelError.setForeground(Color.RED);
        contenedor.add(labelError);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == calcular) {
            double numero;
        
            try {
                numero = Double.parseDouble(campoNumero.getText());
          
                if (numero <= 0) {
                    throw new IllegalArgumentException("Error: Ingrese un número positivo.");
                }
            } catch (NumberFormatException ex) {
                labelError.setText("Error: Ingrese un número válido.");
                return;
            } catch (IllegalArgumentException ex) {
                labelError.setText(ex.getMessage());
                return;
            }

            labelLogaritmo.setText("Logaritmo Neperiano: " + CalculosNumericos.calcularLogaritmoNeperiano(numero));
            labelRaiz.setText("Raíz Cuadrada: " + CalculosNumericos.calcularRaizCuadrada(numero));
            labelError.setText("");

        } else if (e.getSource() == limpiar) {
            campoNumero.setText("");
            labelLogaritmo.setText("Logaritmo Neperiano: ");
            labelRaiz.setText("Raíz Cuadrada: ");
            labelError.setText("");
        }
    }

}