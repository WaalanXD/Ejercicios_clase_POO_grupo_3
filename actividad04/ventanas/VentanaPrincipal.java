package actividad04.ventanas;
import actividad04.figuras.*;
import actividad04.figuras.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaPrincipal extends Jframe implements ActionListener {

    private Container contenedor;

    private JButton cilindro, esfera, piramide;

    public VentanaPrincipal() {

        inicio();

    }

    private void inicio() {

        contenedor = getContentPane(); 
        contenedor.setLayout(null); 
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);
        esfera = new JButton();
        esfera.setText(“Esfera”);
        esfera.setBounds(125, 50, 80, 23); 
        esfera.addActionListener(this);

        pirámide = new JButton();
        pirámide.setText(“Pirámide”);
        pirámide.setBounds(225, 50, 100, 23); 
        pirámide.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(pirámide);
}
    }





    
}
