package gui;
import java.awt.*;
import javax.swing.ImageIcon;
import poo.javabnb.Building;
import poo.javabnb.FontManager;
import style.RoundedIcon;
import style.RoundedPanel;
import style.Style;

public class BuildingWidget extends javax.swing.JPanel {

    private Building b;
    
    public BuildingWidget() {
        initComponents();
    }

    
    public void init(Building b){
        this.b = b;
        title.setText(b.info.title);
        host.setText(b.info.host.getName());
        price.setText(String.valueOf(b.info.price) + "€ / noche");
        star1.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 1 ? "/images/star_filled.png" : b.info.rating == 0.5f? "/images/star_half.png" : "/images/star.png")));
        star2.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 2 ? "/images/star_filled.png" : b.info.rating == 1.5f? "/images/star_half.png" : "/images/star.png")));
        star3.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 3 ? "/images/star_filled.png" : b.info.rating == 2.5f? "/images/star_half.png" : "/images/star.png")));
        star4.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 4 ? "/images/star_filled.png" : b.info.rating == 3.5f? "/images/star_half.png" : "/images/star.png")));
        star5.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating == 5 ? "/images/star_filled.png" : b.info.rating == 4.5f? "/images/star_half.png" : "/images/star.png")));
    
        };
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new RoundedPanel(20);
        text = new RoundedPanel(20);
        host = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        star1 = new javax.swing.JButton();
        star2 = new javax.swing.JButton();
        star3 = new javax.swing.JButton();
        star4 = new javax.swing.JButton();
        star5 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        pfp = new javax.swing.JButton();
        shadow = new RoundedPanel(20);

        setBackground(Style.TRANSPARENT_COLOR);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(300, 310));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button.setBackground(new java.awt.Color(255, 255, 255));
        button.setForeground(Style.TRANSPARENT_COLOR);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.setMaximumSize(new java.awt.Dimension(300, 300));
        button.setMinimumSize(new java.awt.Dimension(300, 300));
        button.setPreferredSize(new java.awt.Dimension(300, 300));
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(Style.BG_HIGHLIGHT_COLOR);
        text.setForeground(Style.TRANSPARENT_COLOR);
        text.setPreferredSize(new java.awt.Dimension(300, 150));

        host.setFont(FontManager.boldFont);
        host.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        host.setText("Anfitrión");

        jPanel1.setBackground(Style.TRANSPARENT_COLOR);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        star1.setBackground(Style.TRANSPARENT_COLOR);
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star1.setBorder(null);
        star1.setBorderPainted(false);
        star1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star1.setEnabled(false);
        star1.setFocusPainted(false);
        star1.setFocusable(false);
        star1.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(star1);

        star2.setBackground(Style.TRANSPARENT_COLOR);
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star2.setBorder(null);
        star2.setBorderPainted(false);
        star2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star2.setEnabled(false);
        star2.setFocusPainted(false);
        star2.setFocusable(false);
        star2.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(star2);

        star3.setBackground(Style.TRANSPARENT_COLOR);
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star3.setBorder(null);
        star3.setBorderPainted(false);
        star3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star3.setEnabled(false);
        star3.setFocusPainted(false);
        star3.setFocusable(false);
        star3.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(star3);

        star4.setBackground(Style.TRANSPARENT_COLOR);
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star4.setBorder(null);
        star4.setBorderPainted(false);
        star4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star4.setEnabled(false);
        star4.setFocusPainted(false);
        star4.setFocusable(false);
        star4.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(star4);

        star5.setBackground(Style.TRANSPARENT_COLOR);
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star5.setBorder(null);
        star5.setBorderPainted(false);
        star5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star5.setEnabled(false);
        star5.setFocusPainted(false);
        star5.setFocusable(false);
        star5.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(star5);

        title.setFont(FontManager.subtitleFont);
        title.setForeground(Style.TEXT_COLOR);
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Title");

        price.setFont(FontManager.boldFont);
        price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        price.setText("Precio por noche");

        javax.swing.GroupLayout textLayout = new javax.swing.GroupLayout(text);
        text.setLayout(textLayout);
        textLayout.setHorizontalGroup(
            textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price)
                    .addComponent(title)
                    .addComponent(host)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        textLayout.setVerticalGroup(
            textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(host)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price)
                .addGap(34, 34, 34))
        );

        button.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        pfp.setBackground(Style.INPUT_BG_COLOR);
        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/example4.png"))); // NOI18N
        pfp.setBorder(null);
        pfp.setBorderPainted(false);
        pfp.setContentAreaFilled(false);
        pfp.setDefaultCapable(false);
        pfp.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/example4.png"))); // NOI18N
        pfp.setEnabled(false);
        pfp.setFocusPainted(false);
        pfp.setFocusable(false);
        pfp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pfp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pfpMouseClicked(evt);
            }
        });
        button.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, -1));

        shadow.setBackground(Style.SHADOW_COLOR);
        shadow.setOpaque(false);
        shadow.setPreferredSize(new java.awt.Dimension(306, 305));

        javax.swing.GroupLayout shadowLayout = new javax.swing.GroupLayout(shadow);
        shadow.setLayout(shadowLayout);
        shadowLayout.setHorizontalGroup(
            shadowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        shadowLayout.setVerticalGroup(
            shadowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        add(shadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pfpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfpMouseClicked
        App.focusedBuilding = this.b;
        App.redirect("BUILDING");
    }//GEN-LAST:event_pfpMouseClicked

    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        
        
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel button;
    private javax.swing.JLabel host;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pfp;
    private javax.swing.JLabel price;
    private javax.swing.JPanel shadow;
    private javax.swing.JButton star1;
    private javax.swing.JButton star2;
    private javax.swing.JButton star3;
    private javax.swing.JButton star4;
    private javax.swing.JButton star5;
    private javax.swing.JPanel text;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}