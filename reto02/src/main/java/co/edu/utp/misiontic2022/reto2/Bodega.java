package co.edu.utp.misiontic2022.reto2;

public class Bodega extends Equipaje{
    //CONSTANTE
    private static final double CAPACIDAD = 8.0;

    //CONSTRUCTORES
    public Bodega(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Bodega(double precioBase) {
        super(precioBase);
    }

    public Bodega() {
    }


    //METODOS

    @Override
    public double calcularPrecio() {
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * CAPACIDAD);
    }

    
}
