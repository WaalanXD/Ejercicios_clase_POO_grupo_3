package actividad05;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;



public class Amigos  {

    File archivo = new File("actividad05\\amigos.txt");
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

    public void agregarAmigo(String newNombre, String telTexto) {
        try {
            validacionArchivo();
            Long newTelefono = Long.parseLong(telTexto);

            
            if (newNombre.matches("\\d+")) {
                throw new IllegalArgumentException("El nombre no puede ser un número.");
            }

            if (String.valueOf(newTelefono).matches("\\D+")) {
                throw new IllegalArgumentException("El teléfono no puede contener letras.");
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
            JOptionPane.showMessageDialog(null, "Error al acceder al archivo.");
            e.printStackTrace();

        } catch (IllegalArgumentException iae) {

            JOptionPane.showMessageDialog(null, iae.getMessage());
        }

    }

    public void EliminarAmigo(String delNombre, String delTelefono) {

        //Solo con el nombre 
       
        try {
            validacionArchivo();
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");
            boolean encontrado = false;
            Long delTelefonoLong = Long.parseLong(delTelefono);

            while (raf.getFilePointer() < raf.length()) {
                nombreNumeroString = raf.readLine();
                String[] partes = nombreNumeroString.split("!");
                nombre = partes[0];
                telefono = Long.parseLong(partes[1]);

                if (nombre.equalsIgnoreCase(delNombre)) {
                    long posicionActual = raf.getFilePointer();
                    long posicionAEliminar = posicionActual - nombreNumeroString.length() - 2; // Ajuste para salto de línea
                    long longitudArchivo = raf.length();

                    // Mover los bytes después del registro a eliminar hacia arriba
                    for (long i = posicionAEliminar; i < longitudArchivo - nombreNumeroString.length() - 2; i++) {
                        raf.seek(i + nombreNumeroString.length() + 2);
                        byte b = raf.readByte();
                        raf.seek(i);
                        raf.writeByte(b);
                    }

                    raf.setLength(longitudArchivo - nombreNumeroString.length() - 2);
                    raf.writeBytes("\n");
                    raf.close();
                    JOptionPane.showMessageDialog(null, "Amigo eliminado correctamente.");
                    encontrado = true;
                    break;
                }

                
            }

            if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Amigo no encontrado.");
                }
                
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ActualizarAmigo(String actNombre, String actTelefono) {

        try {
            validacionArchivo();
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");
        
            boolean encontrado = false;
            Long actTelefonoLong = Long.parseLong(actTelefono);
            
        } catch (Exception e) {
        }
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