package poo.javabnb;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bill {
    public void generateBill(Client c, Building b, String fechaEntrada, String fechaSalida) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateEntrada = null;
        Date dateSalida = null;
        try {
            dateEntrada = sdf.parse(fechaEntrada);
            dateSalida = sdf.parse(fechaSalida);
        } catch (ParseException e) {
            e.printStackTrace();
        }

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
            writer.println("Fecha de entrada: " + fechaEntrada);
            writer.println("Fecha de salida: " + fechaSalida);
            writer.println("Precio por noche: " + b.info.price);
            writer.println("Precio total: " + precioTotal);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}