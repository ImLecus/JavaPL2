package poo.javabnb;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

public class Bill {
    public void generateBill(Client c, Building b, Date dateEntrada, Date dateSalida) {

        Calendar calEntrada = Calendar.getInstance();
        Calendar calSalida = Calendar.getInstance();
        calEntrada.setTime(dateEntrada);
        calSalida.setTime(dateSalida);

        long millisEntrada = calEntrada.getTimeInMillis();
        long millisSalida = calSalida.getTimeInMillis();

        long diff = millisSalida - millisEntrada;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        float precioTotal = diffDays * b.info.price;

        try {
            PrintWriter writer = new PrintWriter("Factura.txt");
            writer.println("Factura");
            writer.println("-----------------------------------");
            writer.println("Nombre: " + c.getName());
            writer.println("Correo: " + c.getMail());
            writer.println("DNI: " + c.getDNI());
            writer.println("Nombre del inmueble: " + b.info.title);
            writer.println("Host del inmueble: " + b.info.host.getName());
            writer.println("Fecha de entrada: " + dateEntrada);
            writer.println("Fecha de salida: " + dateSalida);
            writer.println("Precio por noche: " + b.info.price);
            writer.println("Precio total: " + precioTotal);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}