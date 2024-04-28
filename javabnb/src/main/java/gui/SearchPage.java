package gui;
import java.util.ArrayList;
import javax.swing.*;
import polaris.DynamicPage;
import polaris.Polaris;
import poo.javabnb.Building;
import poo.javabnb.util.FontManager;
import poo.javabnb.SearchEngine;
import poo.javabnb.SortType;

public class SearchPage extends javax.swing.JPanel implements DynamicPage {

    ArrayList<BuildingWidget> widgets;
    public SearchPage() {
        initComponents();
        widgets = new ArrayList<>();
        muroScroll.getVerticalScrollBar().setUnitIncrement(20);
    }
    
    @Override
    public void reloadContent(){
        deleteDynamicContent();
        createDynamicContent();
    }
    
    @Override
    public void createDynamicContent(){
        
        int i = 0;
        int rows = 0;
        
        ArrayList<Building> array = SearchEngine.results; 
        int max = array.size();
        while(i < max){
            for(int x = 0; x < App.frame.getWidth() && i < max; x += 330){
                BuildingWidget bw = new BuildingWidget();
                widgets.add(bw);
                result.add(bw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160 + x, 120 + 330*rows, -1, -1));
                bw.init(
                array.get(i));
                ++i;
            }
            ++rows;
        }
    }
    
    @Override
    public void deleteDynamicContent(){
        for(BuildingWidget bw: widgets){
            result.remove(bw);
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
        jButton1 = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        muroScroll = new javax.swing.JScrollPane();
        result = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(Polaris.BG_COLOR);
        setLayout(new java.awt.BorderLayout());

        header.setBackground(polaris.Polaris.MAIN_COLOR);
        header.setMaximumSize(new java.awt.Dimension(32767, 100));
        header.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 25));

        atrasButton.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        atrasButton.setBorder(null);
        atrasButton.setBorderPainted(false);
        atrasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(Polaris.MAIN_COLOR);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile_default_mini.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 110));

        comboBox.setBackground(polaris.Polaris.INPUT_BG_COLOR);
        comboBox.setFont(FontManager.subText);
        comboBox.setForeground(Polaris.TEXT_COLOR);
        comboBox.setMaximumRowCount(3);
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perfil", "Community Guidelines", "Cerrar sesión" }));
        comboBox.setToolTipText("");
        comboBox.setBorder(null);
        comboBox.setMinimumSize(new java.awt.Dimension(150, 150));
        comboBox.setPreferredSize(new java.awt.Dimension(150, 50));
        comboBox.setVerifyInputWhenFocusTarget(false);
        comboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboBoxMouseReleased(evt);
            }
        });
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel10.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 100));

        header.add(jPanel10, java.awt.BorderLayout.EAST);

        add(header, java.awt.BorderLayout.NORTH);

        muroScroll.setBackground(polaris.Polaris.BG_COLOR);
        muroScroll.setBorder(null);
        muroScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        muroScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        result.setBackground(polaris.Polaris.BG_COLOR);
        result.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(FontManager.titleFont);
        jLabel1.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel1.setText("Resultados de tu búsqueda");
        result.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        muroScroll.setViewportView(result);

        add(muroScroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        App.redirect("MAIN");
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void locationInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationInputActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        SearchEngine.sortBy = SortType.PRICE;
        SearchEngine.results = SearchEngine.sortSearch(SearchEngine.search(
            App.buildings.entries,
            locationInput.getText(),
            peopleInput.getText().length() == 0? Integer.MAX_VALUE: Integer.parseInt(peopleInput.getText())

        ));
        App.redirect("SEARCH");
    }//GEN-LAST:event_searchBarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        comboBox.setPopupVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxMouseReleased
        repaint();
    }//GEN-LAST:event_comboBoxMouseReleased

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JFormattedTextField dateFrom;
    private javax.swing.JTextField dateTo;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField locationInput;
    private javax.swing.JScrollPane muroScroll;
    private javax.swing.JFormattedTextField peopleInput;
    private javax.swing.JPanel result;
    private javax.swing.JButton searchBar;
    // End of variables declaration//GEN-END:variables
}
