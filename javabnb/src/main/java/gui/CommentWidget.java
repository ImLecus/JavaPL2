package gui;

import javax.swing.ImageIcon;
import polaris.Polaris;
import poo.javabnb.Comment;
import poo.javabnb.FontManager;

public class CommentWidget extends javax.swing.JPanel {

    public CommentWidget() {
        initComponents();
    }
    
    public void init(Comment c){
        name.setText(c.client.getName());
        star1.setDisabledIcon( new ImageIcon(getClass().getResource( c.rating >= 1 ? "/images/star_filled.png" : c.rating == 0.5f? "/images/star_half.png" : "/images/star.png")));
        star2.setDisabledIcon( new ImageIcon(getClass().getResource( c.rating >= 2 ? "/images/star_filled.png" : c.rating == 1.5f? "/images/star_half.png" : "/images/star.png")));
        star3.setDisabledIcon( new ImageIcon(getClass().getResource( c.rating >= 3 ? "/images/star_filled.png" : c.rating == 2.5f? "/images/star_half.png" : "/images/star.png")));
        star4.setDisabledIcon( new ImageIcon(getClass().getResource( c.rating >= 4 ? "/images/star_filled.png" : c.rating == 3.5f? "/images/star_half.png" : "/images/star.png")));
        star5.setDisabledIcon( new ImageIcon(getClass().getResource( c.rating == 5 ? "/images/star_filled.png" : c.rating == 4.5f? "/images/star_half.png" : "/images/star.png")));
        msg.setText(c.message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        starsPanel = new javax.swing.JPanel();
        star1 = new javax.swing.JButton();
        star2 = new javax.swing.JButton();
        star3 = new javax.swing.JButton();
        star4 = new javax.swing.JButton();
        star5 = new javax.swing.JButton();
        msg = new javax.swing.JTextArea();

        setBackground(Polaris.INPUT_BG_COLOR);

        name.setBackground(polaris.Polaris.TEXT_COLOR);
        name.setFont(FontManager.boldFont);
        name.setText("Nombre");

        starsPanel.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        starsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        star1.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star1.setBorder(null);
        star1.setBorderPainted(false);
        star1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star1.setEnabled(false);
        star1.setFocusPainted(false);
        star1.setFocusable(false);
        star1.setPreferredSize(new java.awt.Dimension(20, 20));
        starsPanel.add(star1);

        star2.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star2.setBorder(null);
        star2.setBorderPainted(false);
        star2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star2.setEnabled(false);
        star2.setFocusPainted(false);
        star2.setFocusable(false);
        star2.setPreferredSize(new java.awt.Dimension(20, 20));
        starsPanel.add(star2);

        star3.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star3.setBorder(null);
        star3.setBorderPainted(false);
        star3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star3.setEnabled(false);
        star3.setFocusPainted(false);
        star3.setFocusable(false);
        star3.setPreferredSize(new java.awt.Dimension(20, 20));
        starsPanel.add(star3);

        star4.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star4.setBorder(null);
        star4.setBorderPainted(false);
        star4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star4.setEnabled(false);
        star4.setFocusPainted(false);
        star4.setFocusable(false);
        star4.setPreferredSize(new java.awt.Dimension(20, 20));
        starsPanel.add(star4);

        star5.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star5.setBorder(null);
        star5.setBorderPainted(false);
        star5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        star5.setEnabled(false);
        star5.setFocusPainted(false);
        star5.setFocusable(false);
        star5.setPreferredSize(new java.awt.Dimension(20, 20));
        starsPanel.add(star5);

        msg.setEditable(false);
        msg.setBackground(Polaris.BG_COLOR);
        msg.setColumns(20);
        msg.setFont(FontManager.regularFont);
        msg.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(starsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name)
                    .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea msg;
    private javax.swing.JLabel name;
    private javax.swing.JButton star1;
    private javax.swing.JButton star2;
    private javax.swing.JButton star3;
    private javax.swing.JButton star4;
    private javax.swing.JButton star5;
    private javax.swing.JPanel starsPanel;
    // End of variables declaration//GEN-END:variables
}
