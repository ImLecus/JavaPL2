package gui;
import poo.javabnb.Client;
import poo.javabnb.DataBase;
import poo.javabnb.Session;

import javax.swing.*;
import java.awt.*;

public class App {

    public static DataBase db = new DataBase();
    public static Session session = null;

    private static CardLayout cardLayout = new CardLayout();
    private static JPanel cards = new JPanel(cardLayout);

    private static Login login = new Login();
    private static Register register = new Register();
    private static Main main = new Main();

    public static void main(String[] args){
        cards.add(login.panel, "LOGIN");
        cards.add(register.panel, "REGISTER");
        cards.add(main.panel, "MAIN");

        Client juan = new Client("003333030E", "Juan", "juan@gmail.com", "juanito123", "696696696");
        Client dani = new Client("003333030E", "Dani", "dani@gmail.com", "jdd123", "696696696");
        db.add(juan);
        db.add(dani);

        JFrame frame = new JFrame("App");
        frame.setContentPane(cards);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        redirect("LOGIN");
    }

    /**
     * Pages are inside a CardLayout. Inside the page's procedure, they can
     * call the App.redirect() function to change the view.
     * @param page A string with the page name.
     */
    public static void redirect(String page){
        cardLayout.show(cards, page);
    }
}
