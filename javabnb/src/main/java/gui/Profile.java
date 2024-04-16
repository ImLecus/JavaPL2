package gui;

import poo.javabnb.FontManager;
import style.Style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


public class Profile {
   public JPanel panel;
   private JLabel title;
   private JButton atrasButton;
   private JLabel iconoLabel;
   private JLabel tittleLabel;
   private JLabel usuarioLabel;
   private JLabel mailLabel;
   private JLabel dniLabel;
   private JButton editarButton;
   private JLabel passLabel;
   private JLabel forgotpassLabel;
   private JLabel tuuserLAbel;
   private JLabel tudniLabel;
   private JLabel tumailLabel;

   public Profile(){
      //FontManager.useFont(tittleLabel, FontManager.titleFont, Style.TEXT_COLOR);
      //FontManager.useFont(usuarioLabel, FontManager.regularFont, Style.TEXT_COLOR);
      //FontManager.useFont(mailLabel, FontManager.regularFont, Style.TEXT_COLOR);
      //FontManager.useFont(dniLabel, FontManager.regularFont, Style.TEXT_COLOR);
      //FontManager.useFont(passLabel, FontManager.regularFont, Style.TEXT_COLOR);
      //FontManager.useFont(forgotpassLabel, FontManager.boldFont, Style.MAIN_COLOR);
      forgotpassLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
      forgotpassLabel.addMouseListener(new MouseAdapter() {
         public void mouseEntered (MouseEvent e) {forgotpassLabel.setForeground(Style.HIGHLIGHT_COLOR);}

         public void mouseExited (MouseEvent e) {forgotpassLabel.setForeground(Style.MAIN_COLOR);}
         public void mouseClicked (MouseEvent e) {
            //To be implemented
         }
      });
      atrasButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      atrasButton.setBorder(null);
      editarButton.setBorder(null);
      atrasButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            App.redirect("MAIN");
         }
      });
   }
}

