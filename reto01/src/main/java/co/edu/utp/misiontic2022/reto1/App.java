package co.edu.utp.misiontic2022.reto1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Exportacion exportacion = new Exportacion();
        System.out.println(exportacion.compararExportacion(12, 1000, 0.10));
        System.out.println(exportacion.compararExportacion(24, 2000, 0));
    }
}
