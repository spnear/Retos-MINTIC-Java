package co.edu.utp.misiontic2022.reto2;

public class Equipaje {
    ///Atributos

    //CONSTANTES
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;

    ///
    private double peso;
    private double tamanio;
    private double precioBase;


    ///Constructor
    
    //Constructor cuando recibe
    public Equipaje(double peso, double tamanio) {
        this.peso = peso;
        this.tamanio = tamanio;
        this.precioBase = PRECIO_BASE;
    }

    //Cuando no recibe peso y tamanio
    public Equipaje(double precioBase) {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = precioBase;
    }

    //Cuando no recibe nada
    public Equipaje() {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = PRECIO_BASE;
    }

    ////Métodos
    
    //GETTERS
    public double getPeso() {
        return peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public double getPrecioBase() {
        return precioBase;    
    }


    // Metodo Calcular
    public double calcularPrecio(){
        return 0.0; /*Al ser clase padre, retorna 0.0 , en clases heredadas se cambia valor*/
    }


}