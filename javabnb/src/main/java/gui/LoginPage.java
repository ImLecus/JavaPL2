package gui;
import java.awt.event.*;
import javax.swing.ImageIcon;
import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Session;
import polaris.Polaris;
import poo.javabnb.Hashing;

public class LoginPage extends javax.swing.JPanel {
    
    private void resetText(){
        mailInput.setText("");
        passwordInput.setText("");
        errorLabel.setVisible(false);
        viewPassword = false;
    }
    
    boolean viewPassword = false;
    
    public LoginPage() {
        initComponents();
        errorLabel.setVisible(false);
        
        
        passwordViewToggle.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                viewPassword = !viewPassword;
                passwordInput.setEchoChar(viewPassword? '\0' : '\u2022');
                passwordViewToggle.setIcon(new ImageIcon(
                        getClass().getResource(viewPassword? "/images/eye_closed.png" : "/images/eye_open.png")
                ));
            }
        });
        
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hashedPassword = Hashing.hashPassword(String.valueOf(passwordInput.getPassword()));
                System.out.println("Hashed password: " + hashedPassword);
                int key = App.db.getUserInDataBase(mailInput.getText(), Hashing.hashPassword(String.valueOf(passwordInput.getPassword())));
                if (key >= 0) {
                    Client user = App.db.getClientData(key);
                    App.session = Session.init(user, key);
                    
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
                    String.valueOf(passwordInput.getPassword()),
                    App.session.ID);
                    
                    System.out.printf("El usuario tiene %s posts guardados", App.session.user.pinnedPosts.size());
                    
                    resetText();
                    App.redirect("MAIN");
                } else {
                    resetText();
                    errorLabel.setVisible(true);
                }
            }
        });
        Polaris.highlightOnHover(loginButton);
        
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetText();
                App.redirect("REGISTER");
            }
        });
        Polaris.highlightOnHover(registerLabel);

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

        rightSide = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        mailInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        noaccountLabel = new javax.swing.JLabel();
        registerLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        passwordInput = new javax.swing.JPasswordField();
        passwordViewToggle = new javax.swing.JButton();
        leftSide = new javax.swing.JPanel();
        logo = new javax.swing.JButton();

        setBackground(Polaris.BG_COLOR);
        setLayout(new java.awt.BorderLayout());

        rightSide.setBackground(new java.awt.Color(255, 248, 249));
        rightSide.setAlignmentX(0.4F);
        rightSide.setMinimumSize(new java.awt.Dimension(600, 710));
        rightSide.setPreferredSize(new java.awt.Dimension(500, 710));
        rightSide.setLayout(new java.awt.GridBagLayout());

        title.setFont(FontManager.titleFont);
        title.setForeground(polaris.Polaris.TEXT_COLOR);
        title.setText("Te damos la bienvenida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        rightSide.add(title, gridBagConstraints);

        mailLabel.setFont(FontManager.regularFont);
        mailLabel.setForeground(polaris.Polaris.TEXT_COLOR);
        mailLabel.setText("Correo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        rightSide.add(mailLabel, gridBagConstraints);

        mailInput.setBackground(Polaris.INPUT_BG_COLOR);
        mailInput.setFont(FontManager.regularFont);
        mailInput.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        rightSide.add(mailInput, gridBagConstraints);

        passwordLabel.setFont(FontManager.regularFont);
        passwordLabel.setForeground(polaris.Polaris.TEXT_COLOR);
        passwordLabel.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        rightSide.add(passwordLabel, gridBagConstraints);

        loginButton.setBackground(polaris.Polaris.MAIN_COLOR);
        loginButton.setFont(FontManager.boldFont);
        loginButton.setForeground(polaris.Polaris.BG_COLOR);
        loginButton.setText("Iniciar sesión");
        loginButton.setAlignmentX(0.5F);
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        rightSide.add(loginButton, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 248, 249));

        noaccountLabel.setFont(FontManager.regularFont);
        noaccountLabel.setForeground(polaris.Polaris.TEXT_COLOR);
        noaccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        noaccountLabel.setText("¿No tienes cuenta?");
        jPanel4.add(noaccountLabel);

        registerLabel.setFont(FontManager.boldFont);
        registerLabel.setForeground(polaris.Polaris.MAIN_COLOR);
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registerLabel.setText("Crea una ahora.");
        registerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(registerLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        rightSide.add(jPanel4, gridBagConstraints);

        errorLabel.setFont(FontManager.regularFont);
        errorLabel.setForeground(polaris.Polaris.SECONDARY_COLOR);
        errorLabel.setText("Usuario o contraseña incorrectos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 7, 0);
        rightSide.add(errorLabel, gridBagConstraints);

        passwordPanel.setLayout(new java.awt.BorderLayout());

        passwordInput.setBackground(Polaris.INPUT_BG_COLOR);
        passwordInput.setFont(FontManager.regularFont);
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordInput.setBorder(null);
        passwordInput.setMinimumSize(new java.awt.Dimension(64, 25));
        passwordPanel.add(passwordInput, java.awt.BorderLayout.CENTER);

        passwordViewToggle.setBackground(Polaris.INPUT_BG_COLOR);
        passwordViewToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye_open.png"))); // NOI18N
        passwordViewToggle.setBorder(null);
        passwordViewToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordViewToggle.setFocusable(false);
        passwordViewToggle.setPreferredSize(new java.awt.Dimension(30, 17));
        passwordPanel.add(passwordViewToggle, java.awt.BorderLayout.EAST);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        rightSide.add(passwordPanel, gridBagConstraints);

        add(rightSide, java.awt.BorderLayout.CENTER);

        leftSide.setBackground(Polaris.MAIN_COLOR);
        leftSide.setPreferredSize(new java.awt.Dimension(500, 500));
        leftSide.setLayout(new java.awt.GridBagLayout());

        logo.setBackground(Polaris.MAIN_COLOR);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logowhite.png"))); // NOI18N
        logo.setBorder(null);
        logo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logowhite.png"))); // NOI18N
        logo.setEnabled(false);
        logo.setFocusPainted(false);
        logo.setFocusable(false);
        logo.setMargin(new java.awt.Insets(200, 200, 200, 200));
        logo.setMaximumSize(new java.awt.Dimension(200, 200));
        logo.setMinimumSize(new java.awt.Dimension(50, 50));
        logo.setPreferredSize(new java.awt.Dimension(375, 375));
        leftSide.add(logo, new java.awt.GridBagConstraints());

        add(leftSide, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel leftSide;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton logo;
    private javax.swing.JTextField mailInput;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel noaccountLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JButton passwordViewToggle;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JPanel rightSide;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
