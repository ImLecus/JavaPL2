package gui;
import java.awt.CardLayout;
import java.awt.Dimension;
import poo.javabnb.Client;
import poo.javabnb.DataBase;
import poo.javabnb.Session;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class App {

    public static DataBase db; 
    public static Session session = null;

    private static final CardLayout cardLayout = new CardLayout();
    private static final JPanel cards = new JPanel(cardLayout);

    public static JFrame frame = new JFrame("JavaB&B");
    private static final LoginPage login =                   new LoginPage();
    private static final RegisterPage register =             new RegisterPage();
    private static final MainPage main =                     new MainPage();
    private static final ProfilePage profile =               new ProfilePage();
    private static final PinnedPostsPage pinnedPosts =       new PinnedPostsPage();
    private static final EULAPage eula =                     new EULAPage();

    


    public static void main(String[] args){
        
        try{
            db = DataBase.from("data.dat");
        }
        catch(Exception e){
            System.out.println(e.fillInStackTrace());
            db = new DataBase();
            db.add(new Client("00000000E","Example", "example", "example","666666666"));
        }

        cards.add(login, "LOGIN");
        cards.add(register, "REGISTER");
        cards.add(main, "MAIN");
        cards.add(profile, "PROFILE");
        cards.add(pinnedPosts, "PINNED_POSTS");
        cards.add(eula, "EULA");
        setupFrame();
        redirect("LOGIN");
    }

    /**
     * Pages are inside a CardLayout. Inside the page's procedure, they can
     * call the App.redirect() method to change the view.
     * @param page A string with the page name.
     */
    public static void redirect(String page){
        if("PROFILE".equals(page)){profile.reloadInfo();}
        cardLayout.show(cards, page);
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

}
