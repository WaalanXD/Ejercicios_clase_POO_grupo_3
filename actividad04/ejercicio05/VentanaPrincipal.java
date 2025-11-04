package actividad04.ejercicio05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    private JButton botonCargar;
    private JTextArea areaTexto;
    private JScrollPane scrollPane;
    private JButton limpiarButton;
    private JLabel mensajeLabel;

    public VentanaPrincipal() {
        inicio();
        setTitle("Contenido del Archivo de Texto");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        botonCargar = new JButton("Cargar Archivo");
        botonCargar.setBounds(180, 20, 140, 30);
        botonCargar.addActionListener(this);
        contenedor.add(botonCargar);

        limpiarButton = new JButton("Limpiar");
        limpiarButton.setBounds(330, 20, 140, 30);
        limpiarButton.addActionListener(this);
        contenedor.add(limpiarButton);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        contenedor.add(areaTexto);
        scrollPane = new JScrollPane(areaTexto);
        scrollPane.setBounds(20, 70, 450, 280);
        contenedor.add(scrollPane);

        mensajeLabel = new JLabel("");
        mensajeLabel.setBounds(20, 360, 450, 25);
        contenedor.add(mensajeLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
        if (e.getSource() == botonCargar) {
            LeerArchivo lector = new LeerArchivo();
            String contenido = lector.LeerArchivo();
            areaTexto.setText(contenido);
            mensajeLabel.setForeground(Color.GREEN);
            mensajeLabel.setText("Archivo cargado correctamente.");
        } else if (e.getSource() == limpiarButton) {
            areaTexto.setText("");
        }
    } catch (Exception ex) {
        mensajeLabel.setForeground(Color.RED);
        mensajeLabel.setText("Error al cargar el archivo: " + ex.getMessage());
    }


}

}

