/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import style.Style;
import poo.javabnb.FontManager;
/**
 *
 * @author Alumno
 */
public class MainPage extends javax.swing.JPanel {

    /**
     * Creates new form MainPageç
     */
    public MainPage() {
        initComponents();
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        muroScroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 248, 249));
        setLayout(new java.awt.BorderLayout());

        muroScroll.setBackground(new java.awt.Color(255, 248, 249));
        muroScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        muroScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        add(muroScroll, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 248, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBar.setBackground(Style.INPUT_BG_COLOR);
        searchBar.setText("Barra de busqueda");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 580, 30));

        comboBox.setBackground(new java.awt.Color(255, 248, 249));
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Perfil", "Post guardados", "Community Guidelines", "Cerrar sesión" }));
        comboBox.setToolTipText("");
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 12, 230, 30));

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane muroScroll;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables
}
