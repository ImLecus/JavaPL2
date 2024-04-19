package poo.javabnb;

import java.util.ArrayList;
import java.util.Date;
import poo.javabnb.Building;

public class BuildingDB {
    public ArrayList<Building> entries;
    
    public BuildingDB(){
        this.entries = new ArrayList<>();
        add(
                new Building(
                "Chalet en Madrid",
                "C/Los Rosales 12",
                3, 3, PropertyType.HOUSE,
                125, new String[]{"madrid", "chalet"},
                "Un chalet alejado de la zona urbanísica de la ciudad de Madrid",
                new String[]{}, new Host(
                "00000000E", "Dueño", "dueño@tuyo.me", "contraseña", "666666666", new Date(), true),
                3,
                new String[]{},
                5.0f  
            ));
        
        add(new Building(
            "Apartamento en Barcelona",
            "C/Passeig de Gràcia 123",
            2, 1, PropertyType.APARTMENT,
            200, new String[]{"barcelona", "apartamento"},
            "Este encantador apartamento se encuentra en una ubicación privilegiada en el prestigioso Passeig de Gràcia, conocido por sus tiendas de diseño y arquitectura modernista. El apartamento cuenta con dos dormitorios luminosos, un baño completo y una cocina totalmente equipada. Desde el salón, puedes disfrutar de unas vistas impresionantes de la ciudad y del emblemático edificio de La Pedrera. Además, estarás a pocos pasos de las principales atracciones turísticas, restaurantes de renombre y excelentes conexiones de transporte público. ¡Una oportunidad única para experimentar el estilo de vida vibrante de Barcelona!",
            new String[]{}, new Host(
            "12345678F", "Anfitrión", "anfitrion@ejemplo.com", "contraseña", "987654321", new Date(), false),
            2,
            new String[]{"wifi", "aire acondicionado"},
            4.5f
        ));
        
        add(new Building(
            "Casa Rural en Valencia",
            "C/Camino del Bosque s/n",
            4, 2, PropertyType.HOUSE,
            150, new String[]{"valencia", "casa rural"},
            "Disfruta de la tranquilidad y naturaleza en esta encantadora casa rural en las afueras de Valencia.",
            new String[]{}, new Host(
            "87654321G", "Propietario", "propietario@ejemplo.com", "contraseña", "654321987", new Date(), true),
            3,
            new String[]{"piscina", "jardín"},
            4.0f
        ));
        
    }
    
    public void add(Building b){
        entries.add(b);
        entries.getLast().setID(entries.size());
    }
}
 