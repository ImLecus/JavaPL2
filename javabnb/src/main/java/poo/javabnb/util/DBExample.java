package poo.javabnb.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import poo.javabnb.*;

public class DBExample {
    private static Host DON_PABLO;
    private static Host HOST;
    private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    private static Date parse(String str){
        try {
            return df.parse(str);
        }
        catch(Exception e){
            return new Date();
        }
    }
    
    public static void setup(DataBase db, BuildingDB buildingDb){  
        
        db.add(new Particular(
                "00000000E",
                "Example", 
                "example", 
                Hashing.hashInfo("example"),
                "666666666",
                new Card("Example","0000000000000000", "12/99","000"),
                true
        ));
        
        db.add(new Particular(
                "82629144T",
                "Pedro", 
                "pedro@gmail.com", 
                Hashing.hashInfo("pedrito123"),
                "695382122",
                new Card("Pedro","1111222233334444", "12/99","123"),
                false
        ));
        
        db.add(new Particular(
                "98721323W",
                "Sara", 
                "sara@gmail.com", 
                // "sarita321"
                Hashing.hashInfo("sarita321"),
                "682776129",
                new Card("Example","4321432143214321", "12/99","321"),
                false
        ));
        
        db.add(new Host(
                "88734454E",
                "Dueño", 
                "dueño@tuyo.me", 
                Hashing.hashInfo("password"),
                "687332119",
                parse("23/04/2024"),
                false
        ));
        HOST = (Host) db.getClientData(3);
        
        db.add(new Host(
                "82649376A",
                "Don Pablo", 
                "dpablo@gmail.com", 
                Hashing.hashInfo("donpablodonpablo"),
                "683736112",
                parse("12/02/2024"),
                true
        ));
        DON_PABLO = (Host) db.getClientData(4);
        
        buildingDb.add(new Building(
            "Chalet en Madrid",
            "C/Los Rosales 12",
            3, 3, PropertyType.HOUSE,
            125,
            "Un chalet alejado de la zona urbanísica de la ciudad de Madrid",
            Images.getResource("/images/morocco.png"), HOST,
            3,
            new String[]{}
            ));
        buildingDb.get(0).addComment(new Comment(
                db.getClientData(1), 5, "Un lugar genial para pasar las vacaciones! Lo recomiendo mucho."
        ));
        
        buildingDb.add(new Building(
            "Apartamento en Barcelona",
            "C/Passeig de Gràcia 123",
            2, 1, PropertyType.APARTMENT,
            200, 
            "Este encantador apartamento se encuentra en una ubicación privilegiada en el prestigioso Passeig de Gràcia, conocido por sus tiendas de diseño y arquitectura modernista. El apartamento cuenta con dos dormitorios luminosos, un baño completo y una cocina totalmente equipada. Desde el salón, puedes disfrutar de unas vistas impresionantes de la ciudad y del emblemático edificio de La Pedrera. Además, estarás a pocos pasos de las principales atracciones turísticas, restaurantes de renombre y excelentes conexiones de transporte público. ¡Una oportunidad única para experimentar el estilo de vida vibrante de Barcelona!",
            Images.getResource("/images/example1.jpg"), DON_PABLO,
            2,
            new String[]{"wifi", "aire acondicionado"}
            ));
        buildingDb.get(1).addComment(new Comment(
                db.getClientData(2), 1, "Esta en un barrio muy peligroso, me robaron nada mas salir del apartamento"
            ));
        
        buildingDb.add(new Building(
            "Casa Rural en Valencia",
            "C/Camino del Bosque s/n",
            4, 2, PropertyType.HOUSE,
            150, 
            "Disfruta de la tranquilidad y naturaleza en esta encantadora casa rural en las afueras de Valencia.",
            Images.getResource("/images/example2.jpg"), DON_PABLO,
            3,
            new String[]{"piscina", "jardín"}
            ));
        buildingDb.get(2).addComment(new Comment(
                db.getClientData(1), 4, "Estancia muy tranquila, lo recomendaría a cualquiera en busqueda de un retiro"
            ));
        buildingDb.add(new Building(
            "Casa Rural en Madrid",
            "C/Camino del Bosque s/n",
            4, 2, PropertyType.HOUSE,
            150,
            "Disfruta de la tranquilidad y naturaleza en esta encantadora casa rural en las afueras de Madrid.",
           Images.getResource("/images/example3.jpg"), HOST,
            3,
            new String[]{"piscina", "jardín"}
            ));
        buildingDb.get(3).addComment(new Comment(
                db.getClientData(3), 5, "Estancia perfecta, lo mejor fue poder disfrutar del tan afamado agua de Madrid"
            ));
        addReservationsToBuildings(db, buildingDb);
    }
    private static void addReservationsToBuildings(DataBase db, BuildingDB buildingDb) {
        // Crea varias reservas
        Reservation reservation1 = new Reservation(
                (Particular) db.getClientData(1),
                new Range<>(parse("01/01/2024"), parse("01/02/2024")),
                parse("01/01/2023")
        );

        Reservation reservation2 = new Reservation(
                (Particular) db.getClientData(2),
                new Range<>(parse("01/03/2024"), parse("01/04/2024")),
                parse("01/02/2023")
        );

        Reservation reservation3 = new Reservation(
                (Particular) db.getClientData(1),
                new Range<>(parse("01/05/2024"), parse("01/06/2024")),
                parse("01/03/2023")
        );
        Reservation reservation4 = new Reservation(
                (Particular) db.getClientData(0),
                new Range<>(parse("01/05/2024"), parse("01/06/2024")),
                parse("01/03/2023")
        );
        // Añade las reservas a los edificios
        buildingDb.get(1).reservations.add(reservation1);
        buildingDb.get(0).reservations.add(reservation4);
        buildingDb.get(2).reservations.add(reservation2);
        buildingDb.get(3).reservations.add(reservation3);
    }
}
