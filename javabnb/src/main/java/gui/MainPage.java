package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JComboBox;
import poo.javabnb.Building;
import polaris.Polaris;
import poo.javabnb.FontManager;
import poo.javabnb.Host;
import poo.javabnb.PropertyType;
import poo.javabnb.SearchEngine;

public class MainPage extends javax.swing.JPanel {

    public MainPage() {
        initComponents();
        
        searchBar.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Buscando: " + searchBar.getText());
                }
        });

        buildingWidget1.init(App.buildings.entries.get(0));
        buildingWidget2.init(App.buildings.entries.get(1));
        
        
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

        header = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        atrasButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        locationInput = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        searchBar = new javax.swing.JButton();
        peopleInput = new javax.swing.JFormattedTextField();
        jPanel10 = new javax.swing.JPanel();
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

        header.setBackground(polaris.Polaris.MAIN_COLOR);
        header.setMaximumSize(new java.awt.Dimension(32767, 100));
        header.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 25));

        atrasButton.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        atrasButton.setBorder(null);
        atrasButton.setBorderPainted(false);
        atrasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        atrasButton.setEnabled(false);
        atrasButton.setFocusable(false);
        atrasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        atrasButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        atrasButton.setMargin(new java.awt.Insets(2, 0, 2, 0));
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });
        jPanel7.add(atrasButton);

        header.add(jPanel7);

        jPanel8.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jPanel9.setBackground(polaris.Polaris.INPUT_BG_COLOR);
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jTextField4.setBackground(polaris.Polaris.INPUT_BG_COLOR);
        jTextField4.setFont(FontManager.regularFont);
        jTextField4.setText("Fecha vuelta");
        jTextField4.setBorder(null);
        jTextField4.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 15);
        jPanel9.add(jTextField4, gridBagConstraints);

        locationInput.setBackground(polaris.Polaris.INPUT_BG_COLOR);
        locationInput.setFont(FontManager.regularFont);
        locationInput.setText("Destino");
        locationInput.setBorder(null);
        locationInput.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel9.add(locationInput, gridBagConstraints);

        jTextField6.setBackground(polaris.Polaris.INPUT_BG_COLOR);
        jTextField6.setFont(FontManager.regularFont);
        jTextField6.setText("Fecha ida");
        jTextField6.setBorder(null);
        jTextField6.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 5);
        jPanel9.add(jTextField6, gridBagConstraints);

        searchBar.setText("Buscar");
        searchBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel9.add(searchBar, gridBagConstraints);

        peopleInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 8;
        jPanel9.add(peopleInput, gridBagConstraints);

        jPanel8.add(jPanel9);

        header.add(jPanel8);

        jPanel10.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 25, 25));

        comboBox.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Perfil", "Community Guidelines", "Cerrar sesión" }));
        comboBox.setToolTipText("");
        comboBox.setBorder(null);
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel10.add(comboBox);

        header.add(jPanel10);

        add(header, java.awt.BorderLayout.NORTH);

        muroScroll.setBackground(polaris.Polaris.BG_COLOR);
        muroScroll.setBorder(null);
        muroScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        muroScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(polaris.Polaris.BG_COLOR);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(FontManager.titleFont);
        jLabel1.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel1.setText("Para ti");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 0, 10, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(FontManager.titleFont);
        jLabel2.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel2.setText("Destinos frecuentes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jPanel3.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jButton9.setText("Paris");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setFocusable(false);
        jButton9.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel3.add(jButton9);

        jButton2.setText("Roma");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel3.add(jButton2);

        jButton3.setText("California");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel3.add(jButton3);

        jButton4.setText("Tokio");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel4.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jButton5.setText("Montaña");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel4.add(jButton6);

        jButton7.setText("Rural");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel4.add(jButton7);

        jButton8.setText("Turístico");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jLabel4.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel4.setText("¿Buscas algo más específico? Puedes utilizar la barra de búsqueda para encontrar inmuebles a tu gusto.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 50, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(FontManager.titleFont);
        jLabel5.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel5.setText("Vivir nuevas experiencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jScrollPane1.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        App.redirect("MAIN");
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        JComboBox cb = (JComboBox) evt.getSource();
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

    }//GEN-LAST:event_comboBoxActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, locationInput.getText(), Integer.parseInt(peopleInput.getText()));
        App.redirect("SEARCH");
    }//GEN-LAST:event_searchBarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private gui.BuildingWidget buildingWidget1;
    private gui.BuildingWidget buildingWidget2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel header;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField locationInput;
    private javax.swing.JScrollPane muroScroll;
    private javax.swing.JFormattedTextField peopleInput;
    private javax.swing.JButton searchBar;
    // End of variables declaration//GEN-END:variables
}
