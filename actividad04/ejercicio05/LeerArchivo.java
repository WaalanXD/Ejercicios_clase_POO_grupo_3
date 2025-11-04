package actividad04.ejercicio05;
import java.io.*;


public class LeerArchivo {
    private String nombreArchivo = "actividad04/ejercicio05/txtPrueba.txt";
    private FileInputStream archivo; // Definición de flujo de datos
    private InputStreamReader conversor; // Definición del flujo de lectura
    private BufferedReader filtro; // Definición del buffer
    private String línea;
    private String contenido = "";
    // Método para leer un archivo de texto y mostrar su contenido no en consola

    public String LeerArchivo() {
        
        try {
            // Crea los objetos FileInputStream, BufferedReader y BufferedReader
            archivo = new FileInputStream(nombreArchivo);
            conversor = new InputStreamReader(archivo);
            filtro = new BufferedReader(conversor);
            línea = filtro.readLine();
            while (línea != null) {
                contenido += línea + "\n";
                línea = filtro.readLine(); // Lee la siguiente línea
            }
            filtro.close(); // Cierra el archivo
        } catch (IOException e) { // En caso que se genere una excepción
            e.printStackTrace(); //no se que poner aca xD
        
        }
        return contenido;
    }
}



/*
 
   public String LeerArchivoTexto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
         try {
         
            /*  Crea los objetos FileInputStream, BufferedReader y BufferedReader
BufferedReader 
            archivo = new FileInputStream(nombreArchivo);
            conversor = new InputStreamReader(archivo);
            filtro = new BufferedReader(conversor);
            línea = filtro.readLine();
            while (línea != null) {
            contenido += línea + "\n";
            línea = filtro.readLine(); // Lee la siguiente línea
        }
        filtro.close(); // Cierra el archivo
    } catch (IOException e) { // En caso que se genere una excepción
        e.printStackTrace(); //no se que poner aca xD
    }
    return contenido;


    }
    
*/