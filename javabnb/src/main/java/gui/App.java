package gui;
import poo.javabnb.DataBase;
import poo.javabnb.Session;

import javax.swing.*;
import java.awt.*;

public class App {

    public static DataBase db = new DataBase();
    public static Session session = null;

    private static final CardLayout cardLayout = new CardLayout();
    private static final JPanel cards = new JPanel(cardLayout);

    private static final Login login = new Login();
    private static final Register register = new Register();
    private static final Main main = new Main();

    public static void main(String[] args){
        cards.add(login.panel, "LOGIN");
        cards.add(register.panel, "REGISTER");
        cards.add(main.panel, "MAIN");
        setupFrame();
        redirect("LOGIN");
    }

    /**
     * Pages are inside a CardLayout. Inside the page's procedure, they can
     * call the App.redirect() method to change the view.
     * @param page A string with the page name.
     */
    public static void redirect(String page){
        cardLayout.show(cards, page);
    }

    /**
     * setupFrame() method prepares the JFrame, making it visible, adding the title and
     * setting the minimum resizeable size.
     */
    public static void setupFrame(){
        JFrame frame = new JFrame("JavaB&B");
        ImageIcon img =  new ImageIcon("/images/logo.png");
        frame.setIconImage(img.getImage());
        frame.setContentPane(cards);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(320, 550));
        frame.setVisible(true);
    }

}
