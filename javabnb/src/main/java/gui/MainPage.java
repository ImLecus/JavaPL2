package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComboBox;
import polaris.DynamicPage;
import polaris.Polaris;
import poo.javabnb.util.FontManager;
import poo.javabnb.SearchEngine;
import poo.javabnb.SortType;

public class MainPage extends javax.swing.JPanel implements DynamicPage {

    public ArrayList<BuildingWidget> widgets;
    
    public MainPage() {
        initComponents();
        widgets = new ArrayList<>();
         
        searchBar.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Buscando: " + searchBar.getText());
                }
        });
    
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
    
    public void deleteDynamicContent(){
        for(BuildingWidget bw : widgets){
            content.remove(bw);
        }
    }
    public void createDynamicContent(){
        int max = App.buildings.entries.size();
        int i = 0;
        int rows = 0;
        
        while(i < max){
            for(int x = 0; x < App.frame.getWidth() && i < max; x += 330){
                BuildingWidget bw = new BuildingWidget();
                widgets.add(bw);
                content.add(bw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160 + x, 520 + 330*rows, -1, -1));
                bw.init(App.buildings.entries.get(i));
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
        java.awt.GridBagConstraints gridBagConstraints;

        header = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        atrasButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        dateTo = new javax.swing.JTextField();
        locationInput = new javax.swing.JTextField();
        searchBar = new javax.swing.JButton();
        peopleInput = new javax.swing.JFormattedTextField();
        dateFrom = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox<>();
        muroScroll = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
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

        setBackground(new java.awt.Color(255, 248, 249));
        setLayout(new java.awt.BorderLayout());

        header.setBackground(polaris.Polaris.MAIN_COLOR);
        header.setMaximumSize(new java.awt.Dimension(32767, 100));
        header.setLayout(new java.awt.BorderLayout());

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
        atrasButton.setPreferredSize(new java.awt.Dimension(30, 30));
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });
        jPanel7.add(atrasButton);

        header.add(jPanel7, java.awt.BorderLayout.WEST);

        jPanel8.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jPanel9.setBackground(polaris.Polaris.MAIN_COLOR);
        jPanel9.setLayout(new java.awt.GridBagLayout());

        dateTo.setBackground(Polaris.BG_COLOR);
        dateTo.setFont(FontManager.regularFont);
        dateTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        dateTo.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 20;
        jPanel9.add(dateTo, gridBagConstraints);

        locationInput.setBackground(polaris.Polaris.BG_COLOR);
        locationInput.setFont(FontManager.regularFont);
        locationInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        locationInput.setMinimumSize(new java.awt.Dimension(80, 19));
        locationInput.setPreferredSize(new java.awt.Dimension(80, 17));
        locationInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationInputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 20;
        jPanel9.add(locationInput, gridBagConstraints);

        searchBar.setBackground(Polaris.INPUT_BG_COLOR);
        searchBar.setFont(FontManager.boldFont);
        searchBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBar.setText("Buscar");
        searchBar.setBorder(null);
        searchBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchBar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel9.add(searchBar, gridBagConstraints);

        peopleInput.setBackground(Polaris.BG_COLOR);
        peopleInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        peopleInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        peopleInput.setFont(FontManager.regularFont);
        peopleInput.setMinimumSize(new java.awt.Dimension(80, 17));
        peopleInput.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel9.add(peopleInput, gridBagConstraints);

        dateFrom.setBackground(Polaris.BG_COLOR);
        dateFrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        dateFrom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateFrom.setFont(FontManager.regularFont);
        dateFrom.setMinimumSize(new java.awt.Dimension(80, 17));
        dateFrom.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel9.add(dateFrom, gridBagConstraints);

        jLabel6.setFont(FontManager.boldFont);
        jLabel6.setForeground(Polaris.BG_COLOR);
        jLabel6.setText("¿Dónde?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel9.add(jLabel6, gridBagConstraints);

        jLabel8.setFont(FontManager.boldFont);
        jLabel8.setForeground(Polaris.BG_COLOR);
        jLabel8.setText("¿Cuántos?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel9.add(jLabel8, gridBagConstraints);

        jLabel7.setFont(FontManager.boldFont);
        jLabel7.setForeground(Polaris.BG_COLOR);
        jLabel7.setText("Desde el...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel9.add(jLabel7, gridBagConstraints);

        jLabel3.setFont(FontManager.boldFont);
        jLabel3.setForeground(Polaris.BG_COLOR);
        jLabel3.setText("Hasta el...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel9.add(jLabel3, gridBagConstraints);

        jPanel8.add(jPanel9);

        header.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel10.setForeground(Polaris.TRANSPARENT_COLOR);
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 25, 25));

        comboBox.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        comboBox.setMaximumRowCount(5);
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Perfil", "Community Guidelines", "Cerrar sesión" }));
        comboBox.setToolTipText("");
        comboBox.setBorder(null);
        comboBox.setMinimumSize(new java.awt.Dimension(150, 150));
        comboBox.setPreferredSize(new java.awt.Dimension(80, 80));
        comboBox.setVerifyInputWhenFocusTarget(false);
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel10.add(comboBox);

        header.add(jPanel10, java.awt.BorderLayout.EAST);

        add(header, java.awt.BorderLayout.NORTH);

        muroScroll.setBackground(polaris.Polaris.BG_COLOR);
        muroScroll.setBorder(null);
        muroScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        muroScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        content.setBackground(polaris.Polaris.BG_COLOR);
        content.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(FontManager.titleFont);
        jLabel1.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel1.setText("Para ti");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 0, 10, 0);
        content.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(FontManager.titleFont);
        jLabel2.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel2.setText("Destinos frecuentes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 25, 0);
        content.add(jLabel2, gridBagConstraints);

        jPanel3.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paris.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rome.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sanfrancisco.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tokio.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        content.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mountain.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beach.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rural.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/snow.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        content.add(jPanel4, gridBagConstraints);

        jLabel4.setFont(FontManager.regularFont);
        jLabel4.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel4.setText("¿Buscas algo más específico? Puedes utilizar la barra de búsqueda para encontrar inmuebles a tu gusto.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 50, 0);
        content.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(FontManager.titleFont);
        jLabel5.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel5.setText("Vivir nuevas experiencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 25, 0);
        content.add(jLabel5, gridBagConstraints);

        jScrollPane1.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 20, 0));
        jScrollPane1.setViewportView(jPanel6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        content.add(jScrollPane1, gridBagConstraints);

        muroScroll.setViewportView(content);

        add(muroScroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "montaña", Integer.MAX_VALUE);
        App.redirect("SEARCH");
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
        SearchEngine.sortBy = SortType.PRICE;
        SearchEngine.results = SearchEngine.sortSearch(SearchEngine.search(
                App.buildings.entries, 
                locationInput.getText(), 
                peopleInput.getText().length() == 0? Integer.MAX_VALUE: Integer.parseInt(peopleInput.getText())
                
                ));
        App.redirect("SEARCH");
    }//GEN-LAST:event_searchBarActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "Paris", Integer.MAX_VALUE);
        App.redirect("SEARCH");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "Roma", Integer.MAX_VALUE);
        App.redirect("SEARCH");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "San Francisco", Integer.MAX_VALUE);
        App.redirect("SEARCH");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "Tokio", Integer.MAX_VALUE);
        App.redirect("SEARCH");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "playa", Integer.MAX_VALUE);
        App.redirect("SEARCH");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "rural", Integer.MAX_VALUE);
        App.redirect("SEARCH");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SearchEngine.results = SearchEngine.search(App.buildings.entries, "nieve", Integer.MAX_VALUE);
        App.redirect("SEARCH");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void locationInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel content;
    private javax.swing.JFormattedTextField dateFrom;
    private javax.swing.JTextField dateTo;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationInput;
    private javax.swing.JScrollPane muroScroll;
    private javax.swing.JFormattedTextField peopleInput;
    private javax.swing.JButton searchBar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void reloadContent() {
       locationInput.setText("");
       peopleInput.setText("");
       dateFrom.setText("");
       dateTo.setText("");
       comboBox.setSelectedItem("");
        
    }
}
