package co.edu.utp.misiontic2022.reto1;

import static java.lang.Math.pow;

public class Exportacion {
    /*
    pCapital: Almacena el capital invertido para la exportación.
    pInteres: Almacena el interés aplicado al capital invertido.
    ptiempo: Almacena el tiempo o periodo de la inversión para las exportaciones
    */

    //Métodos.
    public String compararExportacion(int pTiempo, double pCapital, double pInteres){
        String salida = "";
        if (pTiempo == 0 || pInteres == 0 || pCapital ==0) {
            salida = "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        } else {
            double interesSimple = pCapital*pInteres*pTiempo;
            double interesCompuesto = pCapital * (pow((1 + pInteres), pTiempo) -1);
            double compararImportacion =    interesCompuesto - interesSimple;
            salida = "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + compararImportacion;
        }
        return salida;
    }
}