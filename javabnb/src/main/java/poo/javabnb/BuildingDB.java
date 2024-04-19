package poo.javabnb;

import java.util.ArrayList;
import java.util.Date;
import poo.javabnb.Building;

public class BuildingDB {
    public ArrayList<Building> entries;
    
    public BuildingDB(){
        this.entries = new ArrayList<>();
        
        entries.add(
                new Building(
                "Chalet en Madrid",
                "C/Los Rosales 12",
                3, 3, PropertyType.HOUSE,
                125, new String[]{"madrid", "chalet"},
                "Un chalet alejado de la zona urbanísica de la ciudad de Madrid",
                new String[]{}, new Host(
                "00000000E", "Dueño", "dueño@tuyo.me", "contraseña", "666666666", new Date(), true),
                new String[]{},
                new String[]{},
                5.0f
            ));
        
        entries.add(new Building(
            "Apartamento en Barcelona",
            "C/Passeig de Gràcia 123",
            2, 1, PropertyType.APARTMENT,
            200, new String[]{"barcelona", "apartamento"},
            "Acogedor apartamento en el corazón de Barcelona, cerca de tiendas y transporte público.",
            new String[]{}, new Host(
            "12345678F", "Anfitrión", "anfitrion@ejemplo.com", "contraseña", "987654321", new Date(), false),
            new String[]{"visitante1", "visitante2"},
            new String[]{"wifi", "aire acondicionado"},
            4.5f
        ));
        
        entries.add(new Building(
            "Casa Rural en Valencia",
            "C/Camino del Bosque s/n",
            4, 2, PropertyType.HOUSE,
            150, new String[]{"valencia", "casa rural"},
            "Disfruta de la tranquilidad y naturaleza en esta encantadora casa rural en las afueras de Valencia.",
            new String[]{}, new Host(
            "87654321G", "Propietario", "propietario@ejemplo.com", "contraseña", "654321987", new Date(), true),
            new String[]{"visitante3", "visitante4", "visitante5"},
            new String[]{"piscina", "jardín"},
            4.0f
        ));
        
    }
}
