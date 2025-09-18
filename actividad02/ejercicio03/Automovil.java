package actividad02.ejercicio03;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    int puertas;
    tipoCom tipoCombustible;
    tipoA tipoAutomovil;
    tipoColor color;
    int cantidadAsientos;
    int velocidadMaxima;
    int velocidadActual = 0;


    public Automovil(String marca, int modelo, int motor, int puertas, tipoCom tipoCombustible, tipoA tipoAutomovil, tipoColor color, int cantidadAsientos, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.puertas = puertas;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.color = color;
        this.tipoAutomovil = tipoAutomovil;
        this.color = color;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;

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
            System.out.println("La velocidad actual no puede ser mayor que la velocidad máxima.");
        }
    }

    void acelerar(int incremento) {

        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }

    void desacelerar(int decremento) {

        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa");
        }
    }

}
