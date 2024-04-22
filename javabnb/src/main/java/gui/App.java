package gui;
import polaris.DynamicPage;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import poo.javabnb.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import poo.javabnb.exceptions.DataBaseNotFoundException;

public class App {

    public static DataBase db; 
    public static Session session = null;
    public static BuildingDB buildings = new BuildingDB();

    private static final CardLayout cardLayout = new CardLayout();
    private static final JPanel cards = new JPanel(cardLayout);
    public static Building focusedBuilding;
    public static JFrame frame = new JFrame("JavaB&B");
    
    private static final Map<String, JPanel> pages = new HashMap<>();
    
    
    
    private static final LoginPage login =                   new LoginPage();
    private static final RegisterPage register =             new RegisterPage();
    private static final MainPage main =                     new MainPage();
    private static final ProfilePage profile =               new ProfilePage();
    private static final EULAPage eula =                     new EULAPage();
    private static final BuildingPage building =             new BuildingPage();
    private static final SearchPage search =                 new SearchPage();
    private static final CommunityGuidelinesPage community = new CommunityGuidelinesPage();
    private static JPanel currentPanel = login;
    
    public static void main(String[] args){
        
        try{
            db = DataBase.from("./src/main/resources/data/data.dat");
        }
        catch(DataBaseNotFoundException e){
            db = new DataBase();
            db.add(new Client("00000000E","Example", "example", "3bb12eda3c298db5de25597f54d924f2e17e78a26ad8953ed8218ee682f0bbbe9021e2f3009d152c911bf1f25ec683a902714166767afbd8e5bd0fb0124ecb8a","666666666"));
            db.saveData();      
        }
        setupPages();
        setupFrame();
        redirect("LOGIN");
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
            ((DynamicPage) p).reloadContent();
        }
        cardLayout.show(cards, page);
        if(currentPanel != p){
            cards.remove(currentPanel);
        }
        currentPanel = p;
    }
    /**
     * setupFrame() method prepares the JFrame, making it visible, adding the title and
     * setting the minimum resizeable size.
     */
    public static void setupFrame(){
        ImageIcon img =  new ImageIcon("/images/logo.png");
        frame.setIconImage(img.getImage());
        frame.setContentPane(cards);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1000, 710));
        frame.setVisible(true);
    }
    
    public static void setupPages(){
        pages.put("LOGIN", login);
        pages.put("REGISTER", register);
        pages.put("MAIN", main);
        pages.put("PROFILE", profile);
        pages.put("EULA", eula);
        pages.put("BUILDING", building);
        pages.put("SEARCH",search);
        pages.put("COMMUNITY_GUIDELINES",community);
    }
    
}
