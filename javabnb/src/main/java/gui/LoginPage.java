package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Session;
import style.Palette;

public class LoginPage extends javax.swing.JPanel {
    
    private void resetText(){
        mailInput.setText("");
        passwordInput.setText("");
        errorLabel.setVisible(false);
    }
    
    public LoginPage() {
        initComponents();
        errorLabel.setVisible(false);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int key = App.db.getUserInDataBase(mailInput.getText(), String.valueOf(passwordInput.getPassword()));
                if (key >= 0) {
                    Client user = App.db.getClientData(key);
                    App.session = Session.init(user);
                    
                    System.out.printf(
                    """
                    SESIÓN INICIADA
                    ---------------
                    Nombre: %s
                    Correo: %s
                    Contraseña: %s
                    ID: %s
                    %n""", 
                    App.session.user.getName(), 
                    App.session.user.getMail(), 
                    App.session.user.getPassword(),
                    App.session.ID);
                    
                    resetText();
                    App.redirect("MAIN");
                } else {
                    resetText();
                    errorLabel.setVisible(true);
                }
            }
        });
        Palette.highlightOnHover(loginButton);
        
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetText();
                App.redirect("REGISTER");
            }
        });
        Palette.highlightOnHover(registerLabel);

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

        title = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        mailInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        noaccountLabel = new javax.swing.JLabel();
        registerLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 248, 249));
        setLayout(new java.awt.GridBagLayout());

        title.setFont(FontManager.titleFont);
        title.setForeground(Palette.textColor);
        title.setText("Te damos la bienvenida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        add(title, gridBagConstraints);

        mailLabel.setFont(FontManager.regularFont);
        mailLabel.setForeground(Palette.textColor);
        mailLabel.setText("Correo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(mailLabel, gridBagConstraints);

        mailInput.setBackground(new java.awt.Color(225, 225, 225));
        mailInput.setBorder(null);
        mailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailInputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        add(mailInput, gridBagConstraints);

        passwordLabel.setFont(FontManager.regularFont);
        passwordLabel.setForeground(Palette.textColor);
        passwordLabel.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(passwordLabel, gridBagConstraints);

        passwordInput.setBackground(new java.awt.Color(225, 225, 225));
        passwordInput.setBorder(null);
        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 17, 0);
        add(passwordInput, gridBagConstraints);

        loginButton.setBackground(Palette.mainColor);
        loginButton.setFont(FontManager.boldFont);
        loginButton.setForeground(Palette.bgColor);
        loginButton.setText("Iniciar sesión");
        loginButton.setAlignmentX(0.5F);
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        add(loginButton, gridBagConstraints);
        loginButton.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setBackground(new java.awt.Color(255, 248, 249));

        noaccountLabel.setFont(FontManager.regularFont);
        noaccountLabel.setForeground(Palette.textColor);
        noaccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        noaccountLabel.setText("¿No tienes cuenta?");
        jPanel1.add(noaccountLabel);

        registerLabel.setFont(FontManager.boldFont);
        registerLabel.setForeground(Palette.mainColor);
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registerLabel.setText("Crea una ahora.");
        registerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(registerLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        add(jPanel1, gridBagConstraints);

        errorLabel.setFont(FontManager.regularFont);
        errorLabel.setForeground(Palette.secondaryColor);
        errorLabel.setText("Usuario o contraseña incorrectos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 7, 0);
        add(errorLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void mailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailInputActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField mailInput;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel noaccountLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
