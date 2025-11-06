package actividad05;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;



public class AgregarAmigo  {
    
    File archivo = new File("C:\\Users\\kenny\\Downloads\\Programación\\Java Progrmación Conceptos\\repositorio GitHub\\Ejercicios_clase_POO_grupo_3\\actividad05\\amigos.txt");
    String nombreNumeroString;
    String nombre; //
    Long telefono; //

    public void agregarAmigo(String newNombre, Long newTelefono) {
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");
            boolean buscar = false;

            while (raf.getFilePointer() < raf.length()) {
                nombreNumeroString = raf.readLine();
                String[] partes = nombreNumeroString.split("!");
                nombre = partes[0];
                telefono = Long.parseLong(partes[1]);

                if (nombre.equalsIgnoreCase(newNombre) || telefono.equals(newTelefono)) {
                    buscar = true;
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

    
    }
    
