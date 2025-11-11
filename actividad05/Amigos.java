package actividad05;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;



public class Amigos  {
    
    File archivo = new File("C:\\Users\\kenny\\Downloads\\Programación\\Java Progrmación Conceptos\\repositorio GitHub\\Ejercicios_clase_POO_grupo_3\\actividad05\\amigos.txt");
    String nombreNumeroString;
    String nombre; 
    Long telefono; 

    public void validacionArchivo() {
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarAmigo(String newNombre, Long newTelefono) {
        try {
            validacionArchivo();
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");
            boolean buscar = false;

            while (raf.getFilePointer() < raf.length()) {
                nombreNumeroString = raf.readLine();
                String[] partes = nombreNumeroString.split("!");
                nombre = partes[0];
                telefono = Long.parseLong(partes[1]);

                if (nombre.equalsIgnoreCase(newNombre) || telefono.equals(newTelefono)) {
                    buscar = true;
                    JOptionPane.showMessageDialog(null, "El amigo ya existe.");
                    break;
                }
            }
            if (!buscar) {
                nombreNumeroString = newNombre + "!" + newTelefono;
                raf.writeBytes(nombreNumeroString + "\n");
                JOptionPane.showMessageDialog(null, "Amigo agregado correctamente.");
                raf.close();
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void EliminarAmigo(String delNombre, Long delTelefono) {
        // Método para eliminar un amigo (por implementar)

    
    }

    public void ActualizarAmigo(String actNombre, Long actTelefono) {
        // Método para actualizar un amigo (por implementar)

    
    }

    public void LeerAmigo(String nombreBuscado) {
        
        // Método para leer amigo seleccioando por nombre

        try {

            validacionArchivo();
            RandomAccessFile raf = new RandomAccessFile(archivo, "r");
            boolean encontrado = false;

            while (raf.getFilePointer() < raf.length()) {
                nombreNumeroString = raf.readLine();
                String[] partes = nombreNumeroString.split("!");
                nombre = partes[0];
                telefono = Long.parseLong(partes[1]);

                if (nombre.equalsIgnoreCase(nombreBuscado)) {
                    JOptionPane.showMessageDialog(null, "Amigo encontrado: " + nombre + " - " + telefono);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Amigo no encontrado.");
            }

            raf.close();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
