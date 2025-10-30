package actividad04.ejercicio01;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
    

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel numeradorLabel;
    private JLabel denominadorLabel;
    private JTextField numeradorField;
    private JTextField denominadorField;
    private JButton calcularButton;
    private JButton limpiarButton;
    private JLabel resultadoLabel;
    private JLabel errorLabel;
    private JLabel mensajeLabel;
    private JTextField mensajeField;
    private JLabel resultadoMensaje;

    public VentanaPrincipal() {

        inicio();
        setTitle("Calculadora de División");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

    }

    private void inicio() {

        contenedor = getContentPane();
        contenedor.setLayout(null);

        numeradorLabel = new JLabel("Numerador:");
        numeradorLabel.setBounds(50, 30, 100, 25);
        contenedor.add(numeradorLabel);

        numeradorField = new JTextField();
        numeradorField.setBounds(150, 30, 150, 25);
        contenedor.add(numeradorField);

        denominadorLabel = new JLabel("Denominador:");
        denominadorLabel.setBounds(50, 70, 100, 25);
        contenedor.add(denominadorLabel);

        denominadorField = new JTextField();
        denominadorField.setBounds(150, 70, 150, 25);
        contenedor.add(denominadorField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(50, 110, 100, 30);
        calcularButton.addActionListener(this);
        contenedor.add(calcularButton);

        limpiarButton = new JButton("Limpiar");
        limpiarButton.setBounds(200, 110, 100, 30);
        limpiarButton.addActionListener(this);
        contenedor.add(limpiarButton);

        resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(50, 160, 300, 25);
        contenedor.add(resultadoLabel);

        errorLabel = new JLabel("");
        errorLabel.setBounds(50, 190, 300, 25);
        contenedor.add(errorLabel);

        mensajeLabel = new JLabel("Mensaje:");
        mensajeLabel.setBounds(50, 220, 100, 25);
        contenedor.add(mensajeLabel);

        mensajeField = new JTextField();
        mensajeField.setBounds(150, 220, 150, 25);
        contenedor.add(mensajeField);

        resultadoMensaje = new JLabel("");
        resultadoMensaje.setBounds(50, 250, 300, 25);
        contenedor.add(resultadoMensaje);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double denominador;
        double numerador;
        String mensaje;

        if (e.getSource() == calcularButton) {
            try {
                denominador = Double.parseDouble(denominadorField.getText());
                numerador = Double.parseDouble(numeradorField.getText());
                mensaje = mensajeField.getText();
                resultadoMensaje.setText(PruebaExcepciones.ObtenerMensaje(mensaje));

                 
                
                if (denominador == 0) {
                    throw new IllegalArgumentException("División por cero no permitida.");
                }

            } catch (NumberFormatException ex) {

                errorLabel.setForeground(Color.RED);
                errorLabel.setText("Error: Ingrese números válidos.");
                return;

            } catch (IllegalArgumentException ex) {
                errorLabel.setForeground(Color.RED);
                errorLabel.setText("Error: " + ex.getMessage());
                return;
            } catch (Exception ex) {
                resultadoMensaje.setText("Error: " + ex.getMessage());
                return;
            }

            resultadoLabel.setText("Resultado: " + PruebaExcepciones.calcularDivision(numerador, denominador));
            errorLabel.setForeground(Color.GREEN);
            errorLabel.setText("Division realizada con éxito.");
        }

        else if (e.getSource() == limpiarButton) {
            numeradorField.setText("");
            denominadorField.setText("");
            resultadoLabel.setText("Resultado: ");
            errorLabel.setText("");
            mensajeField.setText("");
            resultadoMensaje.setText("");
        }
        


       

    }
}