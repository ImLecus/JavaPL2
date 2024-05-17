package gui;
import poo.javabnb.util.*;
import polaris.DynamicPage;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import poo.javabnb.*;
import javax.swing.*;
import poo.javabnb.exceptions.DataBaseNotFoundException;

public class App {

    public static DataBase db; 
    public static Session session = null;
    public static BuildingDB buildings;

    private static final CardLayout cardLayout = new CardLayout();
    private static final JPanel cards = new JPanel(cardLayout);
    public static Building focusedBuilding;
    public static JFrame frame = new JFrame("JavaB&B");
    
    private static final Map<String, JPanel> pages = new HashMap<>(){{
        put("LOGIN",new LoginPage());
        put("REGISTER", new RegisterPage());
        put("MAIN", new MainPage());
        put("PROFILE", new ProfilePage());
        put("EULA", new EULAPage());
        put("BUILDING", new BuildingPage());
        put("SEARCH", new SearchPage());
        put("COMMUNITY", new CommunityGuidelinesPage());
        put("ADMIN", new AdminPage());
    }};
    public static JPanel currentPanel = pages.get("LOGIN");
    
    public static boolean isAdmin;
    
    public static void main(String[] args) {

        try {
            db = DataBase.from("./src/main/resources/data/data.dat");
            buildings = BuildingDB.from("./src/main/resources/data/b_data.dat");
            System.out.println("La base de datos se ha cargado correctamebte.");
        } 
        catch (DataBaseNotFoundException e) {
            db = new DataBase();
            buildings = new BuildingDB();
            DBExample.setup(db, buildings);
            db.saveData("./src/main/resources/data/data.dat");
            buildings.saveData("./src/main/resources/data/b_data.dat");
        }

        setupFrame();
        redirect("LOGIN");
    }
    
    public static void BDreload(){
       try {
            buildings = BuildingDB.from("./src/main/resources/data/b_data.dat");
            System.out.println("La base de datos se ha recargado correctamebte.");
        } 
        catch (DataBaseNotFoundException e) {
            db = new DataBase();
            buildings = new BuildingDB();
            DBExample.setup(db, buildings);
            db.saveData("./src/main/resources/data/data.dat");
            buildings.saveData("./src/main/resources/data/b_data.dat");
        } 
    }



    /**
     * Pages are inside a CardLayout. Inside the page's procedure, they can
     * call the App.redirect() method to change the view.
     * @param page A string with the page name.
     * @param args
     */
    public static void redirect(String page){
        
        JPanel p = pages.get(page);
        cards.add(p, page);
        if(p instanceof DynamicPage){
            ((DynamicPage) p).reload();
        }
        cardLayout.show(cards, page);
        if(currentPanel != p){
            cards.remove(currentPanel);
        }
        currentPanel = p;
    }

    
    public static void setupFrame(){
        frame.setContentPane(cards);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1200, 810));
        frame.setMaximumSize(new Dimension(1920, 1080));
        frame.setVisible(true);
    }    
}
