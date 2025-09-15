package actividad02.ejercicio01;
public class Persona {
    
    public String nombre;

    public String apellidos;

    public String numeroDocumentoIdentidad;

    public int anoNacimiento;


    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anoNacimiento) {

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;

        this.anoNacimiento = anoNacimiento;
    }


    void imprimir() {


        System.out.println("Nombre: "+ nombre);

        System.out.println("Apellidos: "+ apellidos);

        System.out.println("Numero de documento de identidad: "+ numeroDocumentoIdentidad);

        System.out.println("Año de nacimiento: "+ anoNacimiento);
    }

    
    
}
