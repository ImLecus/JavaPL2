/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Validate;
import style.Palette;

/**
 *
 * @author Alumno
 */
public class RegisterPage extends javax.swing.JPanel {
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
    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
        initComponents();
        resetErrorLabels();
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
        atrasButton.setFocusable(false);
        atrasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        atrasButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        atrasButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });
        jPanel6.add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 248, 249));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        title.setText("Crea tu cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel7.add(title, gridBagConstraints);

        nameInput.setBackground(new java.awt.Color(225, 225, 225));
        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(nameInput, gridBagConstraints);

        nameLabel.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(nameLabel, gridBagConstraints);

        phoneLabel.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(phoneLabel, gridBagConstraints);

        phoneInput.setBackground(new java.awt.Color(225, 225, 225));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(phoneInput, gridBagConstraints);

        DNILabel.setText("DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(DNILabel, gridBagConstraints);

        DNIInput.setBackground(new java.awt.Color(225, 225, 225));
        DNIInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIInputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(DNIInput, gridBagConstraints);

        errorLabel1.setText("El formato es inválido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel7.add(errorLabel1, gridBagConstraints);

        errorLabel2.setText("El formato es inválido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel7.add(errorLabel2, gridBagConstraints);

        errorLabel3.setText("El DNI no existe");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        jPanel7.add(errorLabel3, gridBagConstraints);

        errorLabel4.setText("El formato es inválido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        jPanel7.add(errorLabel4, gridBagConstraints);

        errorLabel5.setText("La contraseña no cumple los requisitos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        jPanel7.add(errorLabel5, gridBagConstraints);

        mailLabel.setText("Mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(mailLabel, gridBagConstraints);

        mailInput.setBackground(new java.awt.Color(225, 225, 225));
        mailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailInputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(mailInput, gridBagConstraints);

        passwordLabel.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(passwordLabel, gridBagConstraints);

        passwordInput.setBackground(new java.awt.Color(225, 225, 225));
        passwordInput.setText("jPasswordField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel7.add(passwordInput, gridBagConstraints);

        passwordLabel2.setText("La contraseña debe tener como mínimo 8 caracteres,");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel7.add(passwordLabel2, gridBagConstraints);

        passwordLabel3.setText("una mayúscula y un número.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel7.add(passwordLabel3, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 248, 249));

        termsCheckbox.setBackground(new java.awt.Color(255, 248, 249));
        termsCheckbox.setText("Acepta los términos de uso");
        termsCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsCheckboxActionPerformed(evt);
            }
        });
        jPanel1.add(termsCheckbox);

        eulaLabel.setText("y el EULA");
        jPanel1.add(eulaLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        jPanel7.add(jPanel1, gridBagConstraints);

        submitButton.setText("Registrarse");
        submitButton.setFocusable(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel7.add(submitButton, gridBagConstraints);

        add(jPanel7, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void DNIInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIInputActionPerformed

    private void mailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailInputActionPerformed

    private void termsCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termsCheckboxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasButtonActionPerformed


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
