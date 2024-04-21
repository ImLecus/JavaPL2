package gui;

import polaris.Polaris;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicScrollBarUI;
import poo.javabnb.FontManager;

class ScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            thumbColor = Polaris.MAIN_COLOR; 
            trackColor = Polaris.INPUT_BG_COLOR; 
        }
        
        /*
        @Override 
        protected JButton createIncreaseButton(int orientation){return null;}
        @Override 
        protected JButton createDecreaseButton(int orientation){return null;}
        */
    }


public class EULAPage extends javax.swing.JPanel {

    public EULAPage() {
        initComponents();
        scroll.getVerticalScrollBar().setUI(new ScrollBarUI());
        scroll.getVerticalScrollBar().setBorder(null);
        scroll.getVerticalScrollBar().setPreferredSize(new Dimension(12, Integer.MAX_VALUE));
        leidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.redirect("REGISTER");
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

        titleEula = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        eulaText = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        leidoButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

        setLayout(new java.awt.BorderLayout());

        titleEula.setBackground(Polaris.BG_COLOR);
        titleEula.setFont(FontManager.titleFont);
        titleEula.setForeground(Polaris.TEXT_COLOR);
        titleEula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleEula.setText("Acuerdo de Licencia de Usuario Final");
        titleEula.setFocusable(false);
        titleEula.setOpaque(true);
        titleEula.setRequestFocusEnabled(false);
        add(titleEula, java.awt.BorderLayout.PAGE_START);

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        eulaText.setEditable(false);
        eulaText.setBackground(Polaris.BG_COLOR);
        eulaText.setColumns(20);
        eulaText.setFont(FontManager.regularFont);
        eulaText.setLineWrap(true);
        eulaText.setRows(5);
        eulaText.setText("Por favor, lea atentamente este Acuerdo de Licencia de Usuario Final (EULA) antes de utilizar esta aplicación. Al utilizar la aplicación, usted acepta estar sujeto a los términos y condiciones de este acuerdo.\n\n1. Licencia de Uso\n\n1.1. Concesión de Licencia: El titular de los derechos de autor de esta aplicación (\"Licenciante\") le otorga una licencia limitada, no exclusiva, intransferible y revocable para utilizar la aplicación únicamente para fines personales y no comerciales.\n\n1.2. Restricciones: Usted no puede sublicenciar, transferir, distribuir ni vender la aplicación ni su contenido. Tampoco puede modificar, adaptar, realizar ingeniería inversa, descompilar o desensamblar la aplicación, ni intentar crear trabajos derivados basados en la misma.\n\n2. Propiedad\n\n2.1. Derechos de Propiedad: Usted reconoce y acepta que la aplicación y todos los derechos de propiedad intelectual asociados son propiedad exclusiva del Licenciante. Este acuerdo no le otorga ningún derecho de propiedad sobre la aplicación, excepto por la licencia limitada expresamente concedida aquí.\n\n3. Uso Aceptable\n\n3.1. Cumplimiento de las Leyes: Usted se compromete a utilizar la aplicación de conformidad con todas las leyes, normativas y regulaciones aplicables.\n\n3.2. Contenido del Usuario: Al utilizar la aplicación, usted acepta ser el único responsable del contenido que comparta a través de la misma, y garantiza que dicho contenido cumple con estos términos y condiciones, así como con cualquier ley aplicable.\n\n4. Exclusión de Garantías\n\n4.1. La aplicación se proporciona \"tal cual\" y \"según disponibilidad\", sin garantías de ningún tipo, ya sean expresas o implícitas. El Licenciante no garantiza la exactitud, fiabilidad ni la disponibilidad continua de la aplicación.\n\n5. Limitación de Responsabilidad\n\n5.1. En ningún caso el Licenciante será responsable por daños directos, indirectos, incidentales, especiales, ejemplares o consecuentes, incluyendo, pero no limitado a, pérdida de beneficios, datos o uso, incluso si se le ha advertido de la posibilidad de tales daños.\n\n6. Terminación\n\n6.1. Este acuerdo tendrá vigencia hasta que sea terminado por usted o por el Licenciante. El Licenciante se reserva el derecho de terminar este acuerdo en cualquier momento y sin previo aviso si usted viola alguno de los términos y condiciones establecidos en el mismo.\n\n7. Ley Aplicable\n\n7.1. Este acuerdo se regirá e interpretará de acuerdo con las leyes del país o jurisdicción del Licenciante, sin tener en cuenta sus conflictos de principios legales.\n\nAl utilizar esta aplicación, usted acepta estar sujeto a los términos y condiciones de este Acuerdo de Licencia de Usuario Final. Si no está de acuerdo con estos términos, por favor no utilice la aplicación.\n\nFecha de entrada en vigencia: 01/05/2024\n\n\n");
        eulaText.setToolTipText("");
        eulaText.setWrapStyleWord(true);
        eulaText.setMargin(new java.awt.Insets(20, 20, 20, 20));
        scroll.setViewportView(eulaText);

        add(scroll, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(Polaris.BG_COLOR);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        leidoButton.setBackground(Polaris.MAIN_COLOR);
        leidoButton.setFont(FontManager.boldFont);
        leidoButton.setForeground(Polaris.BG_COLOR);
        leidoButton.setText("Hecho");
        leidoButton.setBorder(null);
        leidoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        leidoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(leidoButton, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        filler1.setBackground(Polaris.BG_COLOR);
        filler1.setOpaque(true);
        add(filler1, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea eulaText;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leidoButton;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel titleEula;
    // End of variables declaration//GEN-END:variables
}
