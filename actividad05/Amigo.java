package actividad05;

public class Amigo {

    private String nombre;
    private String telefono;

    public Amigo(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
