package poo.javabnb;

/**
 * Las tarjetas son usadas por los clientes para pagar
 * los inmuebles en los que se alojan.
 */
class Card {
    private String titular;
    private String numero;
    private String endDate;
    private String cvv;

    // Constructor
    public Card(String titular, String numero, String endDate, String cvv) {
        this.titular = titular;
        this.numero = numero;
        this.endDate = endDate;
        this.cvv = cvv;
    }

    // Método para obtener la información de la tarjeta
    public String getInfo() {
        return "Titular: " + titular + ", Numero: " + numero + ", Fecha de vencimiento: " + endDate + ", CVV: " + cvv;
    }
}
