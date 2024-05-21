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
        
        db.add(new Particular(
            "12345678A",
            "Juan", 
            "juan@gmail.com", 
            Hashing.hashInfo("juan123"),
            "612345678",
            new Card("Juan","9876543210987654", "11/25","456"),
            false
        ));
        
        db.add(new Particular(
            "87654321B",
            "Ana", 
            "ana@gmail.com", 
            Hashing.hashInfo("ana456"),
            "698765432",
            new Card("Ana","1234567890123456", "10/24","789"),
            true
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
        HOST = (Host) db.getClientData(5);
        
        db.add(new Host(
                "82649376A",
                "Don Pablo", 
                "dpablo@gmail.com", 
                Hashing.hashInfo("donpablodonpablo"),
                "683736112",
                parse("12/02/2024"),
                true
        ));
        DON_PABLO = (Host) db.getClientData(6);
        
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
        
        buildingDb.add(new Building(
            "Apartamento en París",
            "Rue de Rivoli 75",
            2, 1, PropertyType.APARTMENT,
            250,
            "Apartamento con vista a la Torre Eiffel, ideal para una escapada romántica.",
            Images.getResource("/images/casaparis.png"), DON_PABLO,
            2,
            new String[]{"wifi", "calefacción"}
        ));
        buildingDb.get(4).addComment(new Comment(
            db.getClientData(5), 5, "¡La vista es increíble y la ubicación inmejorable!"
        ));
        
        buildingDb.add(new Building(
            "Villa en Roma",
            "Via Condotti 10",
            4, 3, PropertyType.HOUSE,
            300,
            "Lujosa villa en el corazón de Roma, a pasos de la Plaza de España.",
            Images.getResource("/images/villaroma.jpg"), DON_PABLO,
            4,
            new String[]{"piscina", "garaje"}
        ));
        buildingDb.get(5).addComment(new Comment(
            db.getClientData(6), 4, "Una experiencia maravillosa, aunque algo costosa."
        ));
        
        buildingDb.add(new Building(
            "Casa en San Francisco",
            "Lombard Street 120",
            3, 2, PropertyType.HOUSE,
            180,
            "Casa moderna en la famosa calle Lombard, con vistas panorámicas de la ciudad.",
            Images.getResource("/images/casasf.jpg"), HOST,
            3,
            new String[]{"wifi", "garaje"}
        ));
        buildingDb.get(6).addComment(new Comment(
            db.getClientData(4), 5, "Me encantó la ubicación y la casa es muy cómoda."
        ));
        
        buildingDb.add(new Building(
            "Apartamento en Tokio",
            "Shibuya Crossing 1",
            1, 1, PropertyType.APARTMENT,
            220,
            "Apartamento minimalista en el corazón de Shibuya, ideal para explorar Tokio.",
            Images.getResource("/images/casatokio.png"), DON_PABLO,
            1,
            new String[]{"wifi", "aire acondicionado"}
        ));
        buildingDb.get(7).addComment(new Comment(
            db.getClientData(5), 5, "Perfecto para una inmersión en la vida urbana de Tokio."
        ));
        
        buildingDb.add(new Building(
            "Casa en la Playa",
            "Playa del Sol 5",
            4, 3, PropertyType.HOUSE,
            275,
            "Casa espaciosa con acceso directo a la playa, ideal para vacaciones familiares.",
            Images.getResource("/images/casaplaya.jpg"), HOST,
            4,
            new String[]{"piscina", "wifi"}
        ));
        buildingDb.get(8).addComment(new Comment(
            db.getClientData(6), 5, "La mejor experiencia de playa que he tenido. Muy recomendable."
        ));
        
        buildingDb.add(new Building(
            "Casa Rural en los Alpes",
            "C/Nevisca 3",
            5, 4, PropertyType.HOUSE,
            320,
            "Encantadora casa rural en los Alpes, perfecta para unas vacaciones de invierno.",
            Images.getResource("/images/casaalpes.png"), HOST,
            5,
            new String[]{"chimenea", "sauna"}
        ));
        buildingDb.get(9).addComment(new Comment(
            db.getClientData(4), 5, "Un lugar mágico en invierno, ideal para esquiar y relajarse."
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
        Reservation reservation5 = new Reservation(
            (Particular) db.getClientData(3),
            new Range<>(parse("01/07/2024"), parse("01/08/2024")),
            parse("01/04/2023")
        );


        Reservation reservation6 = new Reservation(
                (Particular) db.getClientData(4),
                new Range<>(parse("01/09/2024"), parse("01/10/2024")),
                parse("01/05/2023")
        );


        Reservation reservation7 = new Reservation(
                (Particular) db.getClientData(0),
                new Range<>(parse("01/11/2024"), parse("01/12/2024")),
                parse("01/06/2023")
        );


        Reservation reservation8 = new Reservation(
                (Particular) db.getClientData(1),
                new Range<>(parse("01/01/2025"), parse("01/02/2025")),
                parse("01/07/2023")
        );


        Reservation reservation9 = new Reservation(
                (Particular) db.getClientData(1),
                new Range<>(parse("01/03/2025"), parse("01/04/2025")),
                parse("01/08/2023")
        );


        Reservation reservation10 = new Reservation(
                (Particular) db.getClientData(2),
                new Range<>(parse("01/05/2025"), parse("01/06/2025")),
                parse("01/09/2023")
        );
        
        
        buildingDb.get(1).reservations.add(reservation1);
        buildingDb.get(0).reservations.add(reservation4);
        buildingDb.get(2).reservations.add(reservation2);
        buildingDb.get(3).reservations.add(reservation3);
        buildingDb.get(4).reservations.add(reservation5);
        buildingDb.get(5).reservations.add(reservation6);
        buildingDb.get(6).reservations.add(reservation7);
        buildingDb.get(7).reservations.add(reservation8);
        buildingDb.get(8).reservations.add(reservation9);
        buildingDb.get(9).reservations.add(reservation10);
    }
}
