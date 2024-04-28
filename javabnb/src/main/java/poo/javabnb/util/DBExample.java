package poo.javabnb.util;
import java.util.ArrayList;
import java.util.Date;
import poo.javabnb.*;

public class DBExample {
    private static Host DON_PABLO;
    private static Host HOST;
    public static void setup(DataBase db, BuildingDB buildingDb){
        //TO-DO: Convert client to particular
        
        db.add(new Particular(
                "00000000E",
                "Example", 
                "example", 
                // "example"
                "3bb12eda3c298db5de25597f54d924f2e17e78a26ad8953ed8218ee682f0bbbe9021e2f3009d152c911bf1f25ec683a902714166767afbd8e5bd0fb0124ecb8a",
                "666666666",
                new Card("Example","0000 0000 0000 0000", "12/99","000"),
                false,
                new PreferencesManager(new String[]{""})
        ));
        
        db.add(new Particular(
                "82629144T",
                "Pedro", 
                "pedro@gmail.com", 
                // "pedrito123"
                "af41c7be53e2eec50da54441b1ac4eb574d3b362a0f05e26066cbf404dd2968c30f47f09d200c7e82ea3bd35382ff8a09e151bd5dccda6d7dfbf62ae6de20b22",
                "695382122",
                new Card("Pedro","1111 2222 3333 4444", "12/99","123"),
                false,
                new PreferencesManager(new String[]{""})
        ));
        
        db.add(new Particular(
                "98721323W",
                "Sara", 
                "sara@gmail.com", 
                // "sarita321"
                "dcfa87120fcd738c87d93fc4188b3461adf198a8dff577b9c4ba99e7540a1b296b590cf3ec73cd75383ca9d4e85669dd46f3156be6120a7945e928e42ebcca76",
                "682776129",
                new Card("Example","4321 4321 4321 4321", "12/99","321"),
                false,
                new PreferencesManager(new String[]{""})
        ));
        
        db.add(new Host(
                "88734454E",
                "Dueño", 
                "dueño@tuyo.me", 
                // "password"
                "b109f3bbbc244eb82441917ed06d618b9008dd09b3befd1b5e07394c706a8bb980b1d7785e5976ec049b46df5f1326af5a2ea6d103fd07c95385ffab0cacbc86",
                "687332119",
                new Date("23/04/2024"),
                false
        ));
        HOST = (Host) db.getClientData(3);
        
        db.add(new Host(
                "82649376A",
                "Don Pablo", 
                "dpablo@gmail.com", 
                // "donpablodonpablo"
                "4b599a99d59d6fb4716f3440b0462ced06270478160f458ba4492f4460bc0bd9f8b4da608e787ef984478bd945fec7ef80412267227a2bacd6598bb7ace47233",
                "683736112",
                new Date("10/04/2024"),
                true
        ));
        DON_PABLO = (Host) db.getClientData(4);
        
        buildingDb.add(new Building(
            "Chalet en Madrid",
            "C/Los Rosales 12",
            3, 3, PropertyType.HOUSE,
            125, new String[]{"madrid", "chalet"},
            "Un chalet alejado de la zona urbanísica de la ciudad de Madrid",
            "", HOST,
            3,
            new String[]{},
            new ArrayList<>()
            ));
        buildingDb.get(0).addComment(new Comment(
                db.getClientData(1), 5, "Un lugar genial para pasar las vacaciones! Lo recomiendo mucho."
        ));
        
        buildingDb.add(new Building(
            "Apartamento en Barcelona",
            "C/Passeig de Gràcia 123",
            2, 1, PropertyType.APARTMENT,
            200, new String[]{"barcelona", "apartamento"},
            "Este encantador apartamento se encuentra en una ubicación privilegiada en el prestigioso Passeig de Gràcia, conocido por sus tiendas de diseño y arquitectura modernista. El apartamento cuenta con dos dormitorios luminosos, un baño completo y una cocina totalmente equipada. Desde el salón, puedes disfrutar de unas vistas impresionantes de la ciudad y del emblemático edificio de La Pedrera. Además, estarás a pocos pasos de las principales atracciones turísticas, restaurantes de renombre y excelentes conexiones de transporte público. ¡Una oportunidad única para experimentar el estilo de vida vibrante de Barcelona!",
            "", DON_PABLO,
            2,
            new String[]{"wifi", "aire acondicionado"},
            new ArrayList<Comment>()
            ));
        buildingDb.add(new Building(
            "Casa Rural en Valencia",
            "C/Camino del Bosque s/n",
            4, 2, PropertyType.HOUSE,
            150, new String[]{"valencia", "casa rural"},
            "Disfruta de la tranquilidad y naturaleza en esta encantadora casa rural en las afueras de Valencia.",
            "", DON_PABLO,
            3,
            new String[]{"piscina", "jardín"},
            new ArrayList<Comment>()
            ));
        buildingDb.add(new Building(
            "Casa Rural en Madrid",
            "C/Camino del Bosque s/n",
            4, 2, PropertyType.HOUSE,
            150, new String[]{"valencia", "casa rural"},
            "Disfruta de la tranquilidad y naturaleza en esta encantadora casa rural en las afueras de Madrid.",
            "", HOST,
            3,
            new String[]{"piscina", "jardín"},
            new ArrayList<Comment>()
            ));
    }
}
