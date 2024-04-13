package gui;

import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Validate;
import style.Palette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register {
    public JPanel panel;
    private JTextField mailInput;
    public JPanel pane1;
    private JPasswordField passwordInput;
    private JCheckBox termsCheckbox;
    private JButton submitButton;
    private JTextField nameInput;
    private JTextField DNIInput;
    private JTextField phoneInput;
    private JButton atrasButton;
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JLabel DNILabel;
    private JLabel mailLabel;
    private JLabel passwordLabel;
    private JLabel title;
    private JLabel eulaLabel;
    private JLabel passwordLabel2;
    private JLabel passwordLabel3;
    private JLabel errorLabel1;
    private JLabel errorLabel2;
    private JLabel errorLabel3;
    private JLabel errorLabel4;
    private JLabel errorLabel5;

    public Register() {

        submitButton.setEnabled(false);
        submitButton.setBackground(Palette.textColor);

        eulaLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eulaLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetErrorLabels();
                resetText();
                App.redirect("EULA");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                eulaLabel.setForeground(Palette.highlightColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                eulaLabel.setForeground(Palette.mainColor);
            }
        });

        FontManager.useFont(submitButton, FontManager.boldFont, Color.WHITE);
        submitButton.setBorder(null);
        submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetErrorLabels();
                register();
            }
        });
        submitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if(submitButton.isEnabled()){
                    submitButton.setBackground(Palette.highlightColor);
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(submitButton.isEnabled()) {
                    submitButton.setBackground(Palette.mainColor);
                }
            }
        });

        atrasButton.setBorder(null);
        atrasButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetText();
                resetErrorLabels();
                App.redirect("LOGIN");
            }

        });

        nameInput.setBorder(null);
        mailInput.setBorder(null);
        DNIInput.setBorder(null);
        phoneInput.setBorder(null);
        passwordInput.setBorder(null);

        FontManager.setRegularFont(new JComponent[]{
                termsCheckbox,
                nameLabel,
                mailLabel,
                DNILabel,
                phoneLabel,
                passwordLabel,
                nameInput,
                mailInput,
                DNIInput,
                mailInput,
                passwordInput
        });
        FontManager.setErrorFont(new JComponent[]{
                errorLabel1,
                errorLabel2,
                errorLabel3,
                errorLabel4,
                errorLabel5
        });
        FontManager.setSubTextFont(new JComponent[]{
                passwordLabel2, passwordLabel3
        });
        FontManager.setAnchorFont(new JComponent[]{
                eulaLabel
        });

        FontManager.useFont(title, FontManager.titleFont, Palette.textColor);

        termsCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButton.setEnabled(termsCheckbox.isSelected());
                submitButton.setBackground(submitButton.isEnabled() ? Palette.mainColor : Palette.textColor);
            }
        });
    }

    private void register() {
        boolean name = Validate.validateName(nameInput.getText());
        errorLabel1.setVisible(!name);
        boolean phone = Validate.validatePhone(phoneInput.getText());
        errorLabel2.setVisible(!phone);
        boolean dni = Validate.validateDNI(DNIInput.getText().toCharArray());
        errorLabel3.setVisible(!dni);
        boolean mail = Validate.validateMail(mailInput.getText());
        errorLabel4.setVisible(!mail);
        boolean password = Validate.validatePassword(passwordInput.getPassword());
        errorLabel5.setVisible(!password);

        if(name && phone && dni && mail && password){
            Client client = new Client(
                    DNIInput.getText(),
                    nameInput.getText(),
                    mailInput.getText(),
                    String.valueOf(passwordInput.getPassword()),
                    phoneInput.getText()
            );
            App.db.add(client);
            App.redirect("LOGIN");
        }
        resetText();
    }


    private void resetText(){

        mailInput.setText("example@example.com");
        passwordInput.setText("");
        DNIInput.setText("");
        nameInput.setText("");
        phoneInput.setText("");
    }

    private void resetErrorLabels(){
        errorLabel1.setVisible(false);
        errorLabel2.setVisible(false);
        errorLabel3.setVisible(false);
        errorLabel4.setVisible(false);
        errorLabel5.setVisible(false);
    }
}
