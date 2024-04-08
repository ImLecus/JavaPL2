package poo.javabnb;

class Cliente {
    public String DNI;
    public String nombre;
    public String correo;
    private String clave;
    public String telefono;
}

class Particular extends Cliente {
    public Tarjeta tarjeta;
    public boolean VIP;
}

class Anfitrion extends Cliente {
    public String fechaRegistro;
    public boolean superanfitrion;
}
