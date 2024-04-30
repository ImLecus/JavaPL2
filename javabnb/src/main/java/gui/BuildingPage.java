package gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import poo.javabnb.util.FontManager;
import polaris.*;
import poo.javabnb.*;
import poo.javabnb.Range;
        
public class BuildingPage extends javax.swing.JPanel implements DynamicPage {
    private int commentRating;
    private Building b;
    ArrayList<CommentWidget> widgets;
    private boolean saved = false;
    private boolean click = false;
    public BuildingPage() {
        initComponents();
        Polaris.highlightOnHover(submitButton);
        widgets = new ArrayList<>();
        Polaris.highlightOnHover(submitCommentButton); 
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(20);
        
    }
    
    @Override
    public void reloadContent(){  
      deleteDynamicContent();
      submitCommentButton.setVisible(!App.session.isHost);
      try{
        pfp.setIcon(new ImageIcon(getClass().getResource("/images/" + App.session.user.getDNI() + "2.png")));
      }
      catch(Exception e){
        pfp.setIcon(new ImageIcon(getClass().getResource("/images/profile_default_mini.png")));
      }
      starsPanel2.setVisible(!App.session.isHost);
      msgInput.setVisible(!App.session.isHost);
      b = App.focusedBuilding;
      saved = App.session.user.pinnedPosts.contains(b.getID());
      name.setText(b.info.title);
      description.setText(b.description);
      host.setText(b.info.host.getName() + (b.info.host.superhost ? "(Superanfitrión)" : ""));
      msgInput.setText("Escribe aquí tu mensaje...");
      setStar1.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar2.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar3.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar4.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar5.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      star1.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 1 ? "/images/star_filled.png" : b.info.rating >= 0.5f? "/images/star_half.png" : "/images/star.png")));
      star2.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 2 ? "/images/star_filled.png" : b.info.rating >= 1.5f? "/images/star_half.png" : "/images/star.png")));
      star3.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 3 ? "/images/star_filled.png" : b.info.rating >= 2.5f? "/images/star_half.png" : "/images/star.png")));
      star4.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating >= 4 ? "/images/star_filled.png" : b.info.rating >= 3.5f? "/images/star_half.png" : "/images/star.png")));
      star5.setDisabledIcon( new ImageIcon(getClass().getResource( b.info.rating == 5 ? "/images/star_filled.png" : b.info.rating >= 4.5f? "/images/star_half.png" : "/images/star.png")));
      props.setText(String.valueOf(b.rooms) + " habitaciones · " + String.valueOf(b.baths) + " baños · " + String.valueOf(b.visitors) + " huéspedes");
      saveButton.setIcon( new ImageIcon(getClass().getResource( saved ? "/images/save_filled.png" : "/images/save.png")));
      createDynamicContent();
    }

    @Override
    public void createDynamicContent(){
        int i = 0;
        for(Comment c: b.comments){   
            CommentWidget cw = new CommentWidget();
            widgets.add(cw);
            comments.add(cw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250*i, -1, -1));
            cw.init(c);
            ++i;
        }
    }
    
    @Override
    public void deleteDynamicContent(){
        for(CommentWidget cw: widgets){
            comments.remove(cw);
        }
    }
    
    public void calculateTotalPrice(){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateEntrada = null;
            Date dateSalida = null;
            dateEntrada = sdf.parse(idaLabel.getText());
            dateSalida = sdf.parse(vueltaLabel.getText());
            Calendar calEntrada = Calendar.getInstance();
            Calendar calSalida = Calendar.getInstance();
            calEntrada.setTime(dateEntrada);
            calSalida.setTime(dateSalida);

            long millisEntrada = calEntrada.getTimeInMillis();
            long millisSalida = calSalida.getTimeInMillis();

            long diff = millisSalida - millisEntrada;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            long totalPrice = -1 * diffDays * b.info.price;
            
            precioTotalLabel.setText("Total: " + String.valueOf(totalPrice) + "€");
        }
        catch(Exception E){
            precioTotalLabel.setText("Total: XXX€");
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
        pfp = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        body = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainBody = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 0));
        carousel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 100));
        information = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 10));
        leftSide = new javax.swing.JPanel();
        host = new javax.swing.JLabel();
        props = new javax.swing.JLabel();
        description = new javax.swing.JTextArea();
        name = new javax.swing.JLabel();
        starsPanel = new javax.swing.JPanel();
        star1 = new javax.swing.JButton();
        star2 = new javax.swing.JButton();
        star3 = new javax.swing.JButton();
        star4 = new javax.swing.JButton();
        star5 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        rightSide = new javax.swing.JPanel();
        savedAndReport = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        reservation = new javax.swing.JPanel();
        precioTotalLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        idaLabel = new javax.swing.JFormattedTextField();
        vueltaLabel = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        information1 = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        leftSide2 = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        msgInput = new javax.swing.JTextArea();
        starsPanel2 = new javax.swing.JPanel();
        setStar1 = new javax.swing.JButton();
        setStar2 = new javax.swing.JButton();
        setStar3 = new javax.swing.JButton();
        setStar4 = new javax.swing.JButton();
        setStar5 = new javax.swing.JButton();
        submitCommentButton = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        information2 = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        leftSide4 = new javax.swing.JPanel();
        comments = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

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

        pfp.setBackground(Polaris.MAIN_COLOR);
        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile_default_mini.png"))); // NOI18N
        pfp.setBorder(null);
        pfp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfpActionPerformed(evt);
            }
        });
        jPanel10.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 110));

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

        add(header);

        body.setBackground(polaris.Polaris.BG_COLOR);
        body.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportView(mainBody);

        mainBody.setBackground(polaris.Polaris.BG_COLOR);
        mainBody.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                mainBodyComponentMoved(evt);
            }
        });
        mainBody.setLayout(new javax.swing.BoxLayout(mainBody, javax.swing.BoxLayout.PAGE_AXIS));
        mainBody.add(filler4);

        carousel.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jButton1.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/example1.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        carousel.add(jButton1);

        mainBody.add(carousel);
        mainBody.add(filler12);

        information.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        information.setLayout(new java.awt.GridLayout(1, 0));
        information.add(filler1);

        leftSide.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        leftSide.setLayout(new java.awt.GridBagLayout());

        host.setBackground(polaris.Polaris.TEXT_COLOR);
        host.setFont(FontManager.boldFont);
        host.setText("Anfitrión: Pedrito (Superanfitrión)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        leftSide.add(host, gridBagConstraints);

        props.setBackground(polaris.Polaris.TEXT_COLOR);
        props.setFont(FontManager.boldFont);
        props.setText("4 huéspedes · 1 baño · 3 habitaciones · 3 camas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        leftSide.add(props, gridBagConstraints);

        description.setEditable(false);
        description.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        description.setColumns(20);
        description.setFont(FontManager.regularFont);
        description.setForeground(polaris.Polaris.TEXT_COLOR);
        description.setLineWrap(true);
        description.setRows(5);
        description.setText("Esta es la descripción del inmueble.\n\nEn principio cuando esto sobrepase el tamaño de la preview, habrá un botón de \"Mostrar más\" que mostrará el texto completo.");
        description.setWrapStyleWord(true);
        description.setBorder(null);
        description.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        description.setFocusable(false);
        description.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 40, 0);
        leftSide.add(description, gridBagConstraints);

        name.setBackground(polaris.Polaris.TEXT_COLOR);
        name.setFont(FontManager.titleFont);
        name.setText("Nombre del inmueble");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        leftSide.add(name, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        leftSide.add(starsPanel, gridBagConstraints);
        leftSide.add(filler2, new java.awt.GridBagConstraints());

        information.add(leftSide);

        rightSide.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        rightSide.setLayout(new javax.swing.BoxLayout(rightSide, javax.swing.BoxLayout.PAGE_AXIS));

        savedAndReport.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        savedAndReport.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        saveButton.setBackground(polaris.Polaris.BG_COLOR);
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setBorderPainted(false);
        saveButton.setContentAreaFilled(false);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saveButton.setDefaultCapable(false);
        saveButton.setFocusPainted(false);
        saveButton.setFocusable(false);
        saveButton.setRequestFocusEnabled(false);
        saveButton.setVerifyInputWhenFocusTarget(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        savedAndReport.add(saveButton);

        reportButton.setBackground(polaris.Polaris.BG_COLOR);
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        reportButton.setBorder(null);
        reportButton.setContentAreaFilled(false);
        reportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportButtonMouseExited(evt);
            }
        });
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        savedAndReport.add(reportButton);
        savedAndReport.add(filler7);

        rightSide.add(savedAndReport);

        reservation.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        reservation.setLayout(new java.awt.GridBagLayout());

        precioTotalLabel.setFont(FontManager.boldFont);
        precioTotalLabel.setText("Total XXX€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 10, 0);
        reservation.add(precioTotalLabel, gridBagConstraints);

        submitButton.setBackground(polaris.Polaris.MAIN_COLOR);
        submitButton.setFont(FontManager.boldFont);
        submitButton.setForeground(polaris.Polaris.BG_COLOR);
        submitButton.setText("Reserva");
        submitButton.setBorder(null);
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 12;
        reservation.add(submitButton, gridBagConstraints);

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        idaLabel.setBackground(Polaris.INPUT_BG_COLOR);
        idaLabel.setBorder(null);
        idaLabel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        idaLabel.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        idaLabel.setFont(FontManager.regularFont);
        idaLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idaLabelActionPerformed(evt);
            }
        });
        jPanel1.add(idaLabel);

        vueltaLabel.setBackground(Polaris.INPUT_BG_COLOR);
        vueltaLabel.setBorder(null);
        vueltaLabel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        vueltaLabel.setFont(FontManager.regularFont);
        vueltaLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idaLabelActionPerformed(evt);
            }
        });
        jPanel1.add(vueltaLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        reservation.add(jPanel1, gridBagConstraints);

        jLabel1.setFont(FontManager.subText);
        jLabel1.setText("Fecha de entrada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        reservation.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(FontManager.subText);
        jLabel2.setText("Fecha de salida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        reservation.add(jLabel2, gridBagConstraints);

        rightSide.add(reservation);

        information.add(rightSide);
        information.add(filler3);

        mainBody.add(information);

        information1.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        information1.setLayout(new java.awt.GridLayout(1, 0));
        information1.add(filler5);

        leftSide2.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        leftSide2.setLayout(new java.awt.GridBagLayout());

        name2.setBackground(polaris.Polaris.TEXT_COLOR);
        name2.setFont(FontManager.titleFont);
        name2.setText("Reseñas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        leftSide2.add(name2, gridBagConstraints);

        msgInput.setBackground(Polaris.INPUT_BG_COLOR);
        msgInput.setColumns(20);
        msgInput.setFont(FontManager.regularFont);
        msgInput.setRows(5);
        msgInput.setText("Escribe aquí tu reseña...\n");
        msgInput.setPreferredSize(new java.awt.Dimension(300, 100));
        msgInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msgInputMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        leftSide2.add(msgInput, gridBagConstraints);

        starsPanel2.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        starsPanel2.setOpaque(false);
        starsPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        setStar1.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        setStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar1.setBorder(null);
        setStar1.setBorderPainted(false);
        setStar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setStar1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar1.setFocusPainted(false);
        setStar1.setFocusable(false);
        setStar1.setPreferredSize(new java.awt.Dimension(20, 20));
        setStar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStar1ActionPerformed(evt);
            }
        });
        starsPanel2.add(setStar1);

        setStar2.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        setStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar2.setBorder(null);
        setStar2.setBorderPainted(false);
        setStar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setStar2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar2.setFocusPainted(false);
        setStar2.setFocusable(false);
        setStar2.setPreferredSize(new java.awt.Dimension(20, 20));
        setStar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStar2ActionPerformed(evt);
            }
        });
        starsPanel2.add(setStar2);

        setStar3.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        setStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar3.setBorder(null);
        setStar3.setBorderPainted(false);
        setStar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setStar3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar3.setFocusPainted(false);
        setStar3.setFocusable(false);
        setStar3.setPreferredSize(new java.awt.Dimension(20, 20));
        setStar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStar3ActionPerformed(evt);
            }
        });
        starsPanel2.add(setStar3);

        setStar4.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        setStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar4.setBorder(null);
        setStar4.setBorderPainted(false);
        setStar4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setStar4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar4.setFocusPainted(false);
        setStar4.setFocusable(false);
        setStar4.setPreferredSize(new java.awt.Dimension(20, 20));
        setStar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStar4ActionPerformed(evt);
            }
        });
        starsPanel2.add(setStar4);

        setStar5.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        setStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar5.setBorder(null);
        setStar5.setBorderPainted(false);
        setStar5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setStar5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        setStar5.setFocusPainted(false);
        setStar5.setFocusable(false);
        setStar5.setPreferredSize(new java.awt.Dimension(20, 20));
        setStar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStar5ActionPerformed(evt);
            }
        });
        starsPanel2.add(setStar5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        leftSide2.add(starsPanel2, gridBagConstraints);

        submitCommentButton.setBackground(Polaris.MAIN_COLOR);
        submitCommentButton.setFont(FontManager.boldFont);
        submitCommentButton.setForeground(Polaris.BG_COLOR);
        submitCommentButton.setText("Enviar");
        submitCommentButton.setBorder(null);
        submitCommentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submitCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCommentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        leftSide2.add(submitCommentButton, gridBagConstraints);

        information1.add(leftSide2);
        information1.add(filler6);

        mainBody.add(information1);

        information2.setBackground(polaris.Polaris.BG_COLOR);
        information2.setLayout(new java.awt.GridLayout(1, 0));
        information2.add(filler8);

        leftSide4.setBackground(polaris.Polaris.TRANSPARENT_COLOR);
        leftSide4.setLayout(new java.awt.GridBagLayout());

        comments.setBackground(Polaris.TRANSPARENT_COLOR);
        comments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        leftSide4.add(comments, gridBagConstraints);

        information2.add(leftSide4);
        information2.add(filler9);

        mainBody.add(information2);
        mainBody.add(filler11);

        jScrollPane2.setViewportView(mainBody);

        body.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        add(body);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saved = !saved;
        saveButton.setIcon( new ImageIcon(getClass().getResource( saved ? "/images/save_filled.png" : "/images/save.png")));
        repaint();
        if(saved){
            App.session.addPinnedPost(b.getID());
            System.out.println("Añadido el inmueble con id " + String.valueOf(b.getID()) + ". El usuario tiene " + String.valueOf(App.session.user.pinnedPosts.size()) + " posts guardados");
        }
        if(!saved && App.session.user.pinnedPosts.contains(b.getID())){
            App.session.deletePinnedPost(b.getID());
            System.out.println("Eliminado el inmueble con id " + String.valueOf(b.getID()) + ". El usuario tiene " + String.valueOf(App.session.user.pinnedPosts.size()) + " posts guardados");
        }
        repaint();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void mainBodyComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainBodyComponentMoved
        repaint();
    }//GEN-LAST:event_mainBodyComponentMoved

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        Bill bill = new Bill();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateEntrada = null;
        Date dateSalida = null;
        try {
            dateEntrada = sdf.parse(idaLabel.getText());
            dateSalida = sdf.parse(vueltaLabel.getText());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Range<Date> range = new Range<>(dateEntrada, dateSalida);
        Reservation r = new Reservation((Particular)App.session.user, range, new Date());
        bill.generateBill(App.session.user,b,idaLabel.getText(),vueltaLabel.getText());
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        repaint();
    }//GEN-LAST:event_saveButtonMouseExited

    private void reportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseExited
        repaint();
    }//GEN-LAST:event_reportButtonMouseExited

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        repaint();
    }//GEN-LAST:event_saveButtonMouseEntered

    private void reportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseEntered
        repaint();
    }//GEN-LAST:event_reportButtonMouseEntered

    private void setStar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStar1ActionPerformed
      commentRating = 1;
      setStar1.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar2.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar3.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar4.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar5.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      repaint();
    }//GEN-LAST:event_setStar1ActionPerformed

    private void setStar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStar2ActionPerformed
      commentRating = 2;
      setStar1.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar2.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar3.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar4.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar5.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      repaint();
    }//GEN-LAST:event_setStar2ActionPerformed

    private void setStar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStar3ActionPerformed
      commentRating = 3;
      setStar1.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar2.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar3.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar4.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      setStar5.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      repaint();
    }//GEN-LAST:event_setStar3ActionPerformed

    private void setStar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStar4ActionPerformed
      commentRating = 4;
      setStar1.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar2.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar3.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar4.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar5.setIcon( new ImageIcon(getClass().getResource("/images/star.png")));
      repaint();
    }//GEN-LAST:event_setStar4ActionPerformed

    private void setStar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStar5ActionPerformed
      commentRating = 5;
      setStar1.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar2.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar3.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar4.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      setStar5.setIcon( new ImageIcon(getClass().getResource("/images/star_filled.png")));
      repaint();
    }//GEN-LAST:event_setStar5ActionPerformed

    private void submitCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCommentButtonActionPerformed
        Comment c = new Comment(App.session.user,commentRating,msgInput.getText());
        Building newBuilding = b;
        newBuilding.recalculateRating(commentRating);
        newBuilding.comments.add(c);
        App.buildings.update(b, newBuilding);
        App.focusedBuilding = newBuilding;
        App.redirect("BUILDING");
    }//GEN-LAST:event_submitCommentButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        Building newBuilding = b;
        newBuilding.reportedBy.add(App.session.user);
        App.buildings.update(b, newBuilding);
    }//GEN-LAST:event_reportButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        App.redirect("MAIN");
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        SearchEngine.search( App.buildings.entries,
            locationInput.getText(),
            peopleInput.getText().length() == 0? 0: Integer.parseInt(peopleInput.getText()),
            SortType.PRICE
        );
    }//GEN-LAST:event_searchBarActionPerformed

    private void idaLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idaLabelActionPerformed
        calculateTotalPrice();
        repaint();
    }//GEN-LAST:event_idaLabelActionPerformed

    private void msgInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgInputMouseClicked
        if(click == false){
            msgInput.setText(null);
            click = true;
        }
    }//GEN-LAST:event_msgInputMouseClicked

    private void pfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfpActionPerformed
        comboBox.setPopupVisible(true);
    }//GEN-LAST:event_pfpActionPerformed

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
    private javax.swing.JPanel body;
    private javax.swing.JPanel carousel;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel comments;
    private javax.swing.JFormattedTextField dateFrom;
    private javax.swing.JTextField dateTo;
    private javax.swing.JTextArea description;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JPanel header;
    private javax.swing.JLabel host;
    private javax.swing.JFormattedTextField idaLabel;
    private javax.swing.JPanel information;
    private javax.swing.JPanel information1;
    private javax.swing.JPanel information2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel leftSide;
    private javax.swing.JPanel leftSide2;
    private javax.swing.JPanel leftSide4;
    private javax.swing.JTextField locationInput;
    private javax.swing.JPanel mainBody;
    private javax.swing.JTextArea msgInput;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name2;
    private javax.swing.JFormattedTextField peopleInput;
    private javax.swing.JButton pfp;
    private javax.swing.JLabel precioTotalLabel;
    private javax.swing.JLabel props;
    private javax.swing.JButton reportButton;
    private javax.swing.JPanel reservation;
    private javax.swing.JPanel rightSide;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel savedAndReport;
    private javax.swing.JButton searchBar;
    private javax.swing.JButton setStar1;
    private javax.swing.JButton setStar2;
    private javax.swing.JButton setStar3;
    private javax.swing.JButton setStar4;
    private javax.swing.JButton setStar5;
    private javax.swing.JButton star1;
    private javax.swing.JButton star2;
    private javax.swing.JButton star3;
    private javax.swing.JButton star4;
    private javax.swing.JButton star5;
    private javax.swing.JPanel starsPanel;
    private javax.swing.JPanel starsPanel2;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitCommentButton;
    private javax.swing.JFormattedTextField vueltaLabel;
    // End of variables declaration//GEN-END:variables
}
