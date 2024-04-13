package gui;

import poo.javabnb.FontManager;
import style.Palette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile {
   public JPanel panel;
   private JButton editarButton;
   private JLabel title;
   private JButton atrasButton;

   public Profile(){
      FontManager.useFont(title, FontManager.titleFont, Palette.textColor);

      atrasButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      atrasButton.setBorder(null);
      atrasButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            App.redirect("MAIN");
         }
      });
   }
}

