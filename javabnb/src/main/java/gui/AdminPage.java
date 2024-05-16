package gui;

import java.util.ArrayList;
import javax.swing.JPanel;
import poo.javabnb.util.FontManager;
import polaris.*;
import poo.javabnb.Building;
import poo.javabnb.Client;
import poo.javabnb.Reservation;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class AdminPage extends javax.swing.JPanel implements DynamicPage {

    public ArrayList<JPanel> widgets;
    public AdminPage() {
        initComponents();
        widgets = new ArrayList<>();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(20);
    }
    
    @Override
    public void reloadContent(){
        repaint();
    }
    
    @Override
    public void createDynamicContent(){
        int max = App.db.getAllUsers().size();
        int i = 0;
        int rows = 0;
        
        while(i < max){
            for(int x = 0; x + 380 < App.frame.getWidth()/2 && i < max; x += 400){
                Client c = App.db.getClientData(i);
                UserWidget uw = new UserWidget();
                widgets.add(uw);
                users.add(uw, new AbsoluteConstraints(40 + x, 60 + uw.getHeight()*rows, -1, -1));
                uw.init(c, i);
                ++i;
            }
            ++rows;
        }
        
        max = App.buildings.entries.size();
        i = 0;
        rows = 0;
        
        while(i < max){
            for(int x = 0; x + 300 < App.frame.getWidth()/2 && i < max; x += 330){
                Building b = App.buildings.entries.get(i);
                BuildingWidget bw = new BuildingWidget();
                widgets.add(bw);
                buildings.add(bw, new AbsoluteConstraints(40 + x , 60 + bw.getHeight()*rows, -1, -1));
                bw.init(b);
                ++i;
            }
            ++rows;
        }
        
        /*max = App.buildings.entries.size();
        i = 0;
        rows = 0;
        
        while(i < max){
            for(int x = 0; x + 300 < App.frame.getWidth()/2 && i < max; x += 330){
                Reservation r = null;//App.buildings.entries.get(i);
                ReservationWidget rw = new ReservationWidget();
                widgets.add(rw);
                reservations.add(rw, new AbsoluteConstraints(40 + x , 60 + rw.getHeight()*rows, -1, -1));
                rw.init(r);
                ++i;
            }
            ++rows;
        }
        */
    }

    @Override
    public void deleteDynamicContent(){
        for(JPanel w : widgets){
            if(w instanceof UserWidget){
                users.remove(w);
            }
            else if(w instanceof BuildingWidget){
                buildings.remove(w);
            }
            else {
                reservations.remove(w);
            }
        }
        widgets.clear();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        users = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        buildings = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reservations = new javax.swing.JPanel();

        setBackground(Polaris.MAIN_COLOR);
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(Polaris.MAIN_COLOR);
        jPanel2.setLayout(new java.awt.BorderLayout());

        title.setFont(FontManager.titleFont);
        title.setForeground(polaris.Polaris.BG_COLOR);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Panel de administrador");
        jPanel2.add(title, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(polaris.Polaris.MAIN_COLOR);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jButton2.setBackground(polaris.Polaris.MAIN_COLOR);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jPanel6.add(jButton2);

        jPanel2.add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel5.setBackground(Polaris.TRANSPARENT_COLOR);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        Salir.setBackground(Polaris.TRANSPARENT_COLOR);
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        Salir.setBorder(null);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir.setFocusPainted(false);
        Salir.setFocusable(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel5.add(Salir);

        jPanel2.add(jPanel5, java.awt.BorderLayout.WEST);

        add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(Polaris.BG_COLOR);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(Polaris.INPUT_BG_COLOR);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(Polaris.INPUT_BG_COLOR);
        jLabel1.setFont(FontManager.subtitleFont);
        jLabel1.setForeground(Polaris.TEXT_COLOR);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1, java.awt.BorderLayout.NORTH);

        jScrollPane1.setBackground(Polaris.TRANSPARENT_COLOR);
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        users.setBackground(Polaris.BG_COLOR);
        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(users);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(Polaris.INPUT_BG_COLOR);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(Polaris.INPUT_BG_COLOR);
        jLabel3.setFont(FontManager.subtitleFont);
        jLabel3.setForeground(Polaris.TEXT_COLOR);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inmuebles");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel3, java.awt.BorderLayout.NORTH);

        jScrollPane2.setBackground(Polaris.TRANSPARENT_COLOR);
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        buildings.setBackground(Polaris.BG_COLOR);
        buildings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane2.setViewportView(buildings);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel7.setBackground(Polaris.INPUT_BG_COLOR);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(Polaris.INPUT_BG_COLOR);
        jLabel4.setFont(FontManager.subtitleFont);
        jLabel4.setForeground(Polaris.TEXT_COLOR);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Reservas");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel4, java.awt.BorderLayout.NORTH);

        jScrollPane3.setBackground(Polaris.TRANSPARENT_COLOR);
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        reservations.setBackground(Polaris.BG_COLOR);
        reservations.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane3.setViewportView(reservations);

        jPanel7.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        App.isAdmin = false;
        App.redirect("LOGIN");
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JPanel buildings;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel reservations;
    private javax.swing.JLabel title;
    private javax.swing.JPanel users;
    // End of variables declaration//GEN-END:variables
}
