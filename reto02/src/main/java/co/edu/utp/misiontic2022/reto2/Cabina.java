package co.edu.utp.misiontic2022.reto2;

public class Cabina extends Equipaje{
    //CONSTANTE
    private static final int TIEMPO = 2;

    //CONSTRUCTORES
    public Cabina(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Cabina(double precioBase) {
        super(precioBase);
    }

    public Cabina() {
    }
    
    //METODO
    public double calcularPrecio(){
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * TIEMPO);
    }
}