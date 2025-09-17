

public class Main {
    public static void main(String[] args) {
        
    }
}


public class Planeta {
    
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    boolean esObservable = false;
    tipoPlaneta tipo = null;
    
    
    Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean esObservable;) {
        
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol;
        this.tipo = tipo;
        this.esOberservable = esObersevable;
        
    }
    void imprimir() {
        
        System.out.println(“Nombre del planeta = “ + nombre);
    System.out.println(“Cantidad de satélites = “ + cantidadSatelites);
    System.out.println(“Masa del planeta = “ + masa);
    System.out.println(“Volumen del planeta = “ + volumen);
    System.out.println(“Diámetro del planeta = “ + diametro);
    System.out.println(“Distancia al sol = “ + distanciaSol);
    System.out.println(“Tipo de planeta = “ + tipo);
    System.out.println(“Es observable = “ + esObservable);
    }
        
    

}

public enum tipoPlaneta {
    
    GASEOSO;
    TERRESTRE;
    ENANO;
}
