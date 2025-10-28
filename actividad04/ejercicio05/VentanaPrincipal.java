package actividad04.ejercicio05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    private JButton botonCargar;
    private JTextArea areaTexto;
    private JScrollPane scrollPane;

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

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        scrollPane = new JScrollPane(areaTexto);
        scrollPane.setBounds(20, 70, 450, 280);
        contenedor.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCargar) {
            JFileChooser selectorArchivo = new JFileChooser();
            int resultado = selectorArchivo.showOpenDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                String rutaArchivo = selectorArchivo.getSelectedFile().getAbsolutePath();
                LeerArchivo lector = new LeerArchivo();
                String contenido = lector.LeerArchivoTexto(rutaArchivo);
                areaTexto.setText(contenido);
            }
        }
    }





    
}
