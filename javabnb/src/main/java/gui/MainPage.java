package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JComboBox;
import poo.javabnb.Building;
import style.Style;
import poo.javabnb.FontManager;
import poo.javabnb.Host;
import poo.javabnb.PropertyType;

public class MainPage extends javax.swing.JPanel {

    public MainPage() {
        initComponents();
        
        searchBar.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Buscando: " + searchBar.getText());
                }
        });
        
         Building b = new Building(
            "Casa en la playa", 
            "direccion", 
            1,
            1, 
            PropertyType.HOUSE, 
            12, 
            new String[]{"playa"}, 
            "Una descripción",
            new String[]{},
            new Host("00000000E", "Dueño", "dueño@tuyo.me", "password", "666666666",new Date() ,false),
            new String[]{},
            new String[]{},
            5.0f
        );
        
        buildingWidget1.init(b);
        buildingWidget2.init(b);
        
        
        comboBox.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    JComboBox cb = (JComboBox) e.getSource();
                    String selectedItem = (String) cb.getSelectedItem();
                    System.out.println("Item seleccionado: " + selectedItem);
                    switch (selectedItem) {
                        case "Perfil":
                            App.redirect("PROFILE");
                            break;
                        case "Post guardados":
                            App.redirect("PINNED_POSTS");
                            break;
                        case "Cerrar sesión":
                            App.session.endSession();
                            App.redirect("LOGIN");
                        break;
                    case "Community Guidelines":
                        App.redirect("COMMUNITY_GUIDELINES");
                        break;
                    default:
                        break;
                    }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        muroScroll = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        buildingWidget1 = new gui.BuildingWidget();
        buildingWidget2 = new gui.BuildingWidget();

        setBackground(new java.awt.Color(255, 248, 249));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(Style.MAIN_COLOR);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel5.setLayout(new java.awt.GridLayout());

        searchBar.setBackground(Style.INPUT_BG_COLOR);
        searchBar.setText("Destino");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        jPanel5.add(searchBar);

        jTextField1.setBackground(Style.INPUT_BG_COLOR);
        jTextField1.setText("Fecha ida");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField1);

        jTextField2.setEditable(false);
        jTextField2.setBackground(Style.INPUT_BG_COLOR);
        jTextField2.setText("Fecha vuelta");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2);

        jTextField3.setBackground(Style.INPUT_BG_COLOR);
        jTextField3.setText("nº Personas");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3);

        comboBox.setBackground(new java.awt.Color(255, 248, 249));
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perfil", "Community Guidelines", "Cerrar sesión" }));
        comboBox.setToolTipText("");
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel5.add(comboBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanel1.add(jPanel5, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        muroScroll.setBackground(Style.BG_COLOR);
        muroScroll.setBorder(null);
        muroScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        muroScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(Style.BG_COLOR);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(FontManager.titleFont);
        jLabel1.setForeground(Style.TEXT_COLOR);
        jLabel1.setText("Para ti");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 0, 10, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(FontManager.titleFont);
        jLabel2.setForeground(Style.TEXT_COLOR);
        jLabel2.setText("Destinos frecuentes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jPanel3.setBackground(Style.TRANSPARENT_COLOR);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jButton9.setText("Paris");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusable(false);
        jButton9.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel3.add(jButton9);

        jButton2.setText("Roma");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel3.add(jButton2);

        jButton3.setText("California");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel3.add(jButton3);

        jButton4.setText("Tokio");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel3.add(jButton4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(Style.TRANSPARENT_COLOR);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jButton5.setText("Montaña");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setPreferredSize(new java.awt.Dimension(150, 200));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);

        jButton6.setText("Playa");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel4.add(jButton6);

        jButton7.setText("Rural");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel4.add(jButton7);

        jButton8.setText("Turístico");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusable(false);
        jButton8.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel4.add(jButton8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanel2.add(jPanel4, gridBagConstraints);

        jLabel4.setFont(FontManager.regularFont);
        jLabel4.setForeground(Style.TEXT_COLOR);
        jLabel4.setText("¿Buscas algo más específico? Puedes utilizar la barra de búsqueda para encontrar inmuebles a tu gusto.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 50, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(FontManager.titleFont);
        jLabel5.setForeground(Style.TEXT_COLOR);
        jLabel5.setText("Vivir nuevas experiencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jScrollPane1.setBackground(Style.TRANSPARENT_COLOR);
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(Style.TRANSPARENT_COLOR);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 20, 0));
        jPanel6.add(buildingWidget1);
        jPanel6.add(buildingWidget2);

        jScrollPane1.setViewportView(jPanel6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        muroScroll.setViewportView(jPanel2);

        add(muroScroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.BuildingWidget buildingWidget1;
    private gui.BuildingWidget buildingWidget2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JScrollPane muroScroll;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables
}
