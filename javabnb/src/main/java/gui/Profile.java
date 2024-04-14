package gui;

import poo.javabnb.FontManager;
import style.Palette;

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
      FontManager.useFont(tittleLabel, FontManager.titleFont, Palette.textColor);
      FontManager.useFont(usuarioLabel, FontManager.regularFont, Palette.textColor);
      FontManager.useFont(mailLabel, FontManager.regularFont, Palette.textColor);
      FontManager.useFont(dniLabel, FontManager.regularFont, Palette.textColor);
      FontManager.useFont(passLabel, FontManager.regularFont, Palette.textColor);
      FontManager.useFont(forgotpassLabel, FontManager.boldFont, Palette.mainColor);
      forgotpassLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
      forgotpassLabel.addMouseListener(new MouseAdapter() {
         public void mouseEntered (MouseEvent e) {forgotpassLabel.setForeground(Palette.highlightColor);}

         public void mouseExited (MouseEvent e) {forgotpassLabel.setForeground(Palette.mainColor);}
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

