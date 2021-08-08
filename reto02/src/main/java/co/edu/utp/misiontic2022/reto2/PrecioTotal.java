package co.edu.utp.misiontic2022.reto2;

public class PrecioTotal {
    //ATRIBUTOS
    private double totalPrecios;
    private double totalBodega;
    private double totalCabina;

    private Equipaje equipaje[];


    //CONSTRUCTOR
    public PrecioTotal(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }

    //METODOS.
    public void calcularTotales(){

        for(int i = 0; i <= equipaje.length-1; i++){
            totalPrecios += equipaje[i].calcularPrecio();

            if(equipaje[i].getClass() == Bodega.class){
                totalBodega += equipaje[i].calcularPrecio();
            }
            else if(equipaje[i].getClass() == Cabina.class){
                totalCabina += equipaje[i].calcularPrecio();
            }
            else{
                continue;
            }
        }

    }

    public void mostrarTotales(){
        calcularTotales();
        System.out.println("Total Equipaje " + totalPrecios);
        System.out.println("Total Bodega " + totalBodega);
        System.out.println("Total Cabina " + totalCabina);
    }
    

    
}
