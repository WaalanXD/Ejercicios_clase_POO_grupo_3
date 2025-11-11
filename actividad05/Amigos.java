package actividad05;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;



public class Amigos  {
    
    File archivo = new File("C:\\Users\\kenny\\Downloads\\Programación\\Java Progrmación Conceptos\\repositorio GitHub\\Ejercicios_clase_POO_grupo_3\\actividad05\\amigos.txt");
    String nombreNumeroString;
    String nombre; //
    Long telefono; //

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

    public void LeerAmigo() {
        
        // Método para leer amigos (por implementar)

        try {

            validacionArchivo();
            RandomAccessFile raf = new RandomAccessFile(archivo, "r");

            StringBuilder amigosList = new StringBuilder();

            while (raf.getFilePointer() < raf.length()) {
                nombreNumeroString = raf.readLine();
                amigosList.append(nombreNumeroString).append("\n");
            }

            JOptionPane.showMessageDialog(null, amigosList.toString());
            raf.close();



        } catch (IOException e) {
            e.printStackTrace();

    
    }
    

}
}