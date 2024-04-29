package gui;
import polaris.DynamicPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import polaris.Polaris;
import poo.javabnb.Building;
import poo.javabnb.Host;
import poo.javabnb.util.FontManager;
import poo.javabnb.util.ImageResizer;

public class ProfilePage extends javax.swing.JPanel implements DynamicPage {
    
    private boolean isEditing = false;
    
    public ArrayList<BuildingWidget> widgets;
    
    public ProfilePage() {
        initComponents();
        widgets = new ArrayList<>();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        backButton.addActionListener((ActionEvent e) -> {
            App.redirect("MAIN");
        });
        
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                isEditing = true;
                userPhoneLabel.setEditable(isEditing);
                userMailLabel.setEditable(isEditing);
            }
        });
        
    }
    
    @Override
    public void reloadContent(){
        deleteDynamicContent();
        pinnedPostsLabel.setText(App.session.isHost? "Mis inmuebles" : "Inmuebles guardados");
        userNameLabel.setText(App.session == null? "null" : App.session.user.getName());
        //userDNILabel.setText(App.session == null? "null" : App.session.user.getDNI());
        userMailLabel.setText(App.session == null? "null" : App.session.user.getMail());
        userPhoneLabel.setText(App.session == null? "null" : App.session.user.getNumber());
        
        try{
            ImageIcon pfpIcon = new ImageIcon(getClass().getResource("/images/" + App.session.user.getDNI() + "1.png"));
            pfpIcon.getImage().flush();
            pfp.setIcon(pfpIcon);
        }
        catch(Exception e){
           pfp.setIcon(new ImageIcon(getClass().getResource("/images/profile_default.png")));
        }
        
        
        try{           
            ImageIcon bannerIcon = new ImageIcon(getClass().getResource("/images/" + App.session.user.getDNI() + "3.png"));
            bannerIcon.getImage().flush();
            banner.setIcon(bannerIcon);
        }
        catch(Exception e){
           banner.setIcon(new ImageIcon(getClass().getResource("/images/banner.png")));
        }

        
        App.session.updateSession();
        createDynamicContent();
    }
    
    @Override
    public void deleteDynamicContent(){
        for(BuildingWidget bw : widgets){
            content.remove(bw);
        }
    }
    
    @Override
    public void createDynamicContent(){
        ArrayList<Building> array = App.session.isHost ? ((Host) App.session.user).getAllBuildings() : App.buildings.entries;
        
        int max = App.session.isHost? array.size() : App.session.user.pinnedPosts.size();

        int i = 0;
        int rows = 0;
        
        while(i < max){
            for(int x = 0; x < App.frame.getWidth() && i < max; x += 330){
                BuildingWidget bw = new BuildingWidget();
                widgets.add(bw);
                content.add(bw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160 + x, 520 + 330*rows, -1, -1));
                bw.init(
                App.session.isHost ? 
                App.buildings.entries.get(App.session.user.pinnedPosts.get(i) - 1) :
                array.get(i)
                );
                ++i;
            }
            ++rows;
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        pfp = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        userMailLabel = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        userPhoneLabel = new javax.swing.JTextField();
        banner = new javax.swing.JButton();
        pinnedPostsLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(polaris.Polaris.BG_COLOR);
        setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backButton.setFocusable(false);
        content.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pfp.setBackground(polaris.Polaris.BG_COLOR);
        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile_default.png"))); // NOI18N
        pfp.setBorder(null);
        pfp.setBorderPainted(false);
        pfp.setContentAreaFilled(false);
        pfp.setDefaultCapable(false);
        pfp.setFocusPainted(false);
        pfp.setFocusable(false);
        pfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfpActionPerformed(evt);
            }
        });
        content.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        editButton.setText("Editar perfil");
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        content.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        userNameLabel.setFont(FontManager.titleFont);
        userNameLabel.setText("Nombre");
        content.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        mailLabel.setFont(FontManager.boldFont);
        mailLabel.setText("Correo");
        content.add(mailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        userMailLabel.setEditable(false);
        userMailLabel.setText("****");
        content.add(userMailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        phoneLabel.setFont(FontManager.boldFont);
        phoneLabel.setText("Teléfono");
        content.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        userPhoneLabel.setEditable(false);
        userPhoneLabel.setText("****");
        content.add(userPhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.png"))); // NOI18N
        banner.setBorder(null);
        banner.setBorderPainted(false);
        banner.setDisabledIcon(null);
        banner.setFocusPainted(false);
        banner.setFocusable(false);
        banner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        banner.setRequestFocusEnabled(false);
        banner.setRolloverEnabled(false);
        banner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bannerActionPerformed(evt);
            }
        });
        content.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, -1, -1));

        pinnedPostsLabel.setFont(FontManager.titleFont);
        pinnedPostsLabel.setForeground(polaris.Polaris.TEXT_COLOR);
        pinnedPostsLabel.setText("Inmuebles guardados");
        content.add(pinnedPostsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jButton2.setText("Crear inmueble...");
        content.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, -1, -1));

        jScrollPane1.setViewportView(content);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void pfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfpActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG (*.png)", "png"));
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            ImageResizer.resizeImage(file, "./src/main/resources/images/" + App.session.user.getDNI() + "1.png", 150, 150);
            ImageResizer.resizeImage(file, "./src/main/resources/images/" + App.session.user.getDNI() + "2.png", 80, 80);
            App.redirect("PROFILE");
        }
    }//GEN-LAST:event_pfpActionPerformed

    private void bannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bannerActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG (*.png)", "png"));
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            ImageResizer.resizeImage(file, "./src/main/resources/images/" + App.session.user.getDNI() + "3.png", 1920, 250);
            App.redirect("PROFILE");
        }
    }//GEN-LAST:event_bannerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton banner;
    private javax.swing.JPanel content;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JButton pfp;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel pinnedPostsLabel;
    private javax.swing.JTextField userMailLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userPhoneLabel;
    // End of variables declaration//GEN-END:variables

}
