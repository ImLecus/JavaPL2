/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Validate;
import style.Palette;

/**
 *
 * @author Alumno
 */
public class RegisterPage extends javax.swing.JPanel {
    
    public RegisterPage() {
        initComponents();
        resetErrorLabels();
        submitButton.setEnabled(false);
        submitButton.setBackground(Palette.textColor);

        
        eulaLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetErrorLabels();
                resetText();
                App.redirect("EULA");
            }
        });
        Palette.highlightOnHover(eulaLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetErrorLabels();
                register();
            }
        });
        Palette.highlightOnHover(submitButton);

        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetText();
                resetErrorLabels();
                App.redirect("LOGIN");
            }
        });

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
        if(App.db.contains(mailInput.getText())){
            errorLabel4.setText("Este correo ya está en uso");
            mail = false;
        }
        else{
            errorLabel4.setText("Formato inválido");
        }
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        atrasButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phoneInput = new javax.swing.JTextField();
        DNILabel = new javax.swing.JLabel();
        DNIInput = new javax.swing.JTextField();
        errorLabel1 = new javax.swing.JLabel();
        errorLabel2 = new javax.swing.JLabel();
        errorLabel3 = new javax.swing.JLabel();
        errorLabel4 = new javax.swing.JLabel();
        errorLabel5 = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        mailInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        passwordLabel2 = new javax.swing.JLabel();
        passwordLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        termsCheckbox = new javax.swing.JCheckBox();
        eulaLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 248, 249));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasButton.setBackground(new java.awt.Color(255, 248, 249));
        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        atrasButton.setBorder(null);
        atrasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atrasButton.setFocusable(false);
        atrasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        atrasButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        atrasButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jPanel6.add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 248, 249));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        title.setFont(FontManager.titleFont);
        title.setForeground(Palette.textColor);
        title.setText("Crea tu cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel7.add(title, gridBagConstraints);

        nameInput.setBackground(new java.awt.Color(225, 225, 225));
        nameInput.setFont(FontManager.regularFont);
        nameInput.setForeground(Palette.textColor);
        nameInput.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(nameInput, gridBagConstraints);

        nameLabel.setFont(FontManager.regularFont);
        nameLabel.setForeground(Palette.textColor);
        nameLabel.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(nameLabel, gridBagConstraints);

        phoneLabel.setFont(FontManager.regularFont);
        phoneLabel.setForeground(Palette.textColor);
        phoneLabel.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(phoneLabel, gridBagConstraints);

        phoneInput.setBackground(new java.awt.Color(225, 225, 225));
        phoneInput.setFont(FontManager.regularFont);
        phoneInput.setForeground(Palette.textColor);
        phoneInput.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(phoneInput, gridBagConstraints);

        DNILabel.setFont(FontManager.regularFont);
        DNILabel.setForeground(Palette.textColor);
        DNILabel.setText("DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(DNILabel, gridBagConstraints);

        DNIInput.setBackground(new java.awt.Color(225, 225, 225));
        DNIInput.setFont(FontManager.regularFont);
        DNIInput.setForeground(Palette.textColor);
        DNIInput.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(DNIInput, gridBagConstraints);

        errorLabel1.setFont(FontManager.regularFont);
        errorLabel1.setForeground(Palette.secondaryColor);
        errorLabel1.setText("El formato es inválido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel7.add(errorLabel1, gridBagConstraints);

        errorLabel2.setFont(FontManager.regularFont);
        errorLabel2.setForeground(Palette.secondaryColor);
        errorLabel2.setText("El formato es inválido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel7.add(errorLabel2, gridBagConstraints);

        errorLabel3.setFont(FontManager.regularFont);
        errorLabel3.setForeground(Palette.secondaryColor);
        errorLabel3.setText("El DNI no existe");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        jPanel7.add(errorLabel3, gridBagConstraints);

        errorLabel4.setFont(FontManager.regularFont);
        errorLabel4.setForeground(Palette.secondaryColor);
        errorLabel4.setText("El formato es inválido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        jPanel7.add(errorLabel4, gridBagConstraints);

        errorLabel5.setFont(FontManager.regularFont);
        errorLabel5.setForeground(Palette.secondaryColor);
        errorLabel5.setText("La contraseña no cumple los requisitos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        jPanel7.add(errorLabel5, gridBagConstraints);

        mailLabel.setFont(FontManager.regularFont);
        mailLabel.setForeground(Palette.textColor);
        mailLabel.setText("Mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(mailLabel, gridBagConstraints);

        mailInput.setBackground(new java.awt.Color(225, 225, 225));
        mailInput.setFont(FontManager.regularFont);
        mailInput.setForeground(Palette.textColor);
        mailInput.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(mailInput, gridBagConstraints);

        passwordLabel.setFont(FontManager.regularFont);
        passwordLabel.setForeground(Palette.textColor);
        passwordLabel.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(passwordLabel, gridBagConstraints);

        passwordInput.setBackground(new java.awt.Color(225, 225, 225));
        passwordInput.setFont(FontManager.regularFont);
        passwordInput.setForeground(Palette.textColor);
        passwordInput.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(passwordInput, gridBagConstraints);

        passwordLabel2.setFont(FontManager.subText);
        passwordLabel2.setForeground(Palette.textColor);
        passwordLabel2.setText("La contraseña debe tener como mínimo 8 caracteres,");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel7.add(passwordLabel2, gridBagConstraints);

        passwordLabel3.setFont(FontManager.subText);
        passwordLabel3.setForeground(Palette.textColor);
        passwordLabel3.setText("una mayúscula y un número.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel7.add(passwordLabel3, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 248, 249));

        termsCheckbox.setBackground(new java.awt.Color(255, 248, 249));
        termsCheckbox.setFont(FontManager.regularFont);
        termsCheckbox.setForeground(Palette.textColor);
        termsCheckbox.setText("Acepta los términos de uso");
        jPanel1.add(termsCheckbox);

        eulaLabel.setFont(FontManager.boldFont);
        eulaLabel.setForeground(Palette.mainColor);
        eulaLabel.setText("y el EULA");
        eulaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(eulaLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        jPanel7.add(jPanel1, gridBagConstraints);

        submitButton.setFont(FontManager.boldFont);
        submitButton.setForeground(Palette.bgColor);
        submitButton.setText("Registrarse");
        submitButton.setBorder(null);
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel7.add(submitButton, gridBagConstraints);

        add(jPanel7, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNIInput;
    private javax.swing.JLabel DNILabel;
    private javax.swing.JButton atrasButton;
    private javax.swing.JLabel errorLabel1;
    private javax.swing.JLabel errorLabel2;
    private javax.swing.JLabel errorLabel3;
    private javax.swing.JLabel errorLabel4;
    private javax.swing.JLabel errorLabel5;
    private javax.swing.JLabel eulaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField mailInput;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel passwordLabel3;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JCheckBox termsCheckbox;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
