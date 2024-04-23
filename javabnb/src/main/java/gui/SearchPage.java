package gui;
import java.util.ArrayList;
import javax.swing.*;
import polaris.DynamicPage;
import polaris.Polaris;
import poo.javabnb.Building;
import poo.javabnb.FontManager;
import poo.javabnb.SearchEngine;

public class SearchPage extends javax.swing.JPanel implements DynamicPage {

    ArrayList<BuildingWidget> widgets;
    public SearchPage() {
        initComponents();
        widgets = new ArrayList<>();
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
                result.add(bw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160 + x, 90 + 330*rows, -1, -1));
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
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        searchBar1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        searchBar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox<>();
        muroScroll = new javax.swing.JScrollPane();
        result = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(Polaris.BG_COLOR);
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

        jTextField5.setBackground(polaris.Polaris.INPUT_BG_COLOR);
        jTextField5.setFont(FontManager.regularFont);
        jTextField5.setText("nº Personas");
        jTextField5.setBorder(null);
        jTextField5.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel9.add(jTextField5, gridBagConstraints);

        searchBar1.setBackground(polaris.Polaris.INPUT_BG_COLOR);
        searchBar1.setFont(FontManager.regularFont);
        searchBar1.setText("Destino");
        searchBar1.setBorder(null);
        searchBar1.setPreferredSize(new java.awt.Dimension(80, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel9.add(searchBar1, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel9.add(searchBar, gridBagConstraints);

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

        result.setBackground(polaris.Polaris.BG_COLOR);
        result.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(FontManager.titleFont);
        jLabel1.setForeground(polaris.Polaris.TEXT_COLOR);
        jLabel1.setText("Resultados de tu búsqueda");
        result.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        muroScroll.setViewportView(result);

        add(muroScroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JScrollPane muroScroll;
    private javax.swing.JPanel result;
    private javax.swing.JButton searchBar;
    private javax.swing.JTextField searchBar1;
    // End of variables declaration//GEN-END:variables
}
