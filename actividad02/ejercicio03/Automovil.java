package actividad02.ejercicio03;

public class Automovil {
    public String marca;
    public int modelo;
    public int motor;
    public tipoCom tipoCombustible;
    public tipoA tipoAutomovil;
    public int puertas;
    public int cantidadAsientos;
    public int velocidadMaxima;
    public tipoColor color;
    public int velocidadActual = 0;


    Automovil(String marca,int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int puertas, int cantidadAsientos, int velocidadMaxima, tipoColor color) {

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.puertas = puertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;

    }

    String getMarca() {
        return marca;
    }  
    int getModelo() {
        return modelo;
    }
    int getMotor() {
        return motor;
    }
    int getPuertas() {
        return puertas;
    }
    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }
    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }
    tipoColor getColor() {
        return color;
    }
    int getCantidadAsientos() {
        return cantidadAsientos;
    }
    int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    int getVelocidadActual() {
        return velocidadActual;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }
    void setModelo(int modelo) {
        this.modelo = modelo;}
    void setMotor(int motor) {
        this.motor = motor;
    }
    void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;}
    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    void setColor(tipoColor color) {
        this.color = color;
    }
    void setCantidadAsientos(int cantidadAsientos) {    
        this.cantidadAsientos = cantidadAsientos;
    }
    void setVelocidadMaxima(int velocidadMaxima) {      
        this.velocidadMaxima = velocidadMaxima;
    }
    void setVelocidadActual(int velocidadActual) {
        if (velocidadActual <= this.velocidadMaxima) {
            this.velocidadActual = velocidadActual;
        } else {
            System.out.println("\nLa velocidad actual no puede ser mayor que la velocidad máxima.\n");
        }
    }

    void acelerar(int incremento) {

        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
        } else {
            System.out.println("\nNo se puede incrementar a una velocidad superior a la máxima del automóvil.\n");
        }
    }

    void desacelerar(int decremento) {

        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
        } else {
            System.out.println("\nNo se pudo decrementar " + decremento + " km/h a " + velocidadActual + " km/h");
            System.out.println("Razón: La velocidad no puede ser negativa.\n");
        }
    }

    void frenar() {
        if (velocidadActual > 0) {
            velocidadActual = 0;
        } else {
            System.out.println("\nEl automóvil ya está detenido.\n");
        }

    }

    int tiempoLlegada(int distancia) {
        if (velocidadActual > 0) {
            return distancia / velocidadActual;
        } else {
            System.out.println("\nEl automóvil está detenido. No se puede calcular el tiempo de llegada.\n");
            return 0;
        }
    }


    void imprimir() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + puertas);
        System.out.println("Cantidad de Asientos: " + cantidadAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Color: " + color + "\n");
    }   
}
