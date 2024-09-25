package com.mycompany.foursquare;
//1' or 1 or '1
import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.foursquare.custom_frames.AddComment;
import com.mycompany.foursquare.custom_frames.AddPlace;
// Vlamydir был здесь
import com.mycompany.foursquare.custom_frames.MessageFactory;
import com.mycompany.foursquare.custom_frames.MessageFrame;
import com.mycompany.foursquare.custom_frames.ShowMessage;
import com.mycompany.foursquare.custom_panels.PanelCom;
import com.mycompany.foursquare.custom_panels.PanelPendComment;
import com.mycompany.foursquare.custom_panels.PanelPendPicture;
import com.mycompany.foursquare.custom_panels.PanelPendPlace;
import com.mycompany.foursquare.custom_panels.PanelPicture;
import com.mycompany.foursquare.custom_panels.PanelPlace;
import com.mycompany.foursquare.entities.Foto;
import com.mycompany.foursquare.entities.Lugar;
import com.mycompany.foursquare.entities.Usuario;
import static com.mycompany.foursquare.entities.utils.URL_ROOT;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;
import org.jdesktop.swingx.image.GaussianBlurFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import observers.Observer;

public class Principal extends javax.swing.JFrame implements Observer{

    GridLayout gl, gl1, glgal, glpplaces, glpcomments, glpgalery;
    public BlurredGlassPane blurredGlassPane;
    boolean activeTag[];
    int xMouse, yMouse;

    public Usuario user = null;
    public Lugar lugar = null;
    public Foto foto = null;

    byte byteImg[];

    public Principal() {
        initComponents();
        initialize();
    }
    
    @Override
    public void update(String message) {
        // Este método se llamará cuando AddComment notifique un cambio
        MessageFrame showMessage =  MessageFactory.createMessage("Nuevo Comentario", message);       
        showMessage.showMessage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        locate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aport = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pend = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        b3 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        addplace = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        star = new javax.swing.JLabel();
        grade = new javax.swing.JLabel();
        tagP = new javax.swing.JLabel();
        ubiP = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        nameP = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        icoimg = new javax.swing.JLabel();
        icocom = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        commentsPlace = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comments = new javax.swing.JPanel();
        galery = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        verC = new javax.swing.JLabel();
        verL = new javax.swing.JLabel();
        verG = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pendplaces = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pendComments = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pendGal = new javax.swing.JPanel();
        connect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 39, 51));

        ico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Conectado");

        jPanel2.setBackground(new java.awt.Color(26, 29, 39));

        locate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Buscar Lugar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Lugar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        aport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Cerrar Sesión");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Pendientes");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        pend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(locate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(aport, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(pend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(locate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(pend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(34, 39, 51));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel7MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jTabbedPane2.setBackground(new java.awt.Color(34, 39, 51));
        jTabbedPane2.setEnabled(false);

        jPanel8.setBackground(new java.awt.Color(34, 39, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel8);

        jPanel9.setBackground(new java.awt.Color(34, 39, 51));
        jPanel9.setEnabled(false);

        search.setBackground(new java.awt.Color(26, 29, 39));
        search.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Buscar");
        search.setBorder(null);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(34, 39, 51));
        jScrollPane1.setBorder(null);

        content.setBackground(new java.awt.Color(34, 39, 51));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(content);

        jPanel5.setBackground(new java.awt.Color(26, 29, 39));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desayuno");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(26, 29, 39));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Comida");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(26, 29, 39));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Diversión");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(26, 29, 39));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cultura");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(26, 29, 39));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cena");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel30.setBackground(new java.awt.Color(26, 29, 39));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel30MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Tendencias");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel31.setBackground(new java.awt.Color(26, 29, 39));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ecoturismo");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addplace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addplaceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(search))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addplace, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addplace, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("tab2", jPanel9);

        jPanel4.setBackground(new java.awt.Color(34, 39, 51));

        star.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        grade.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        grade.setForeground(new java.awt.Color(204, 204, 204));
        grade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grade.setText("4.5");

        tagP.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        tagP.setForeground(new java.awt.Color(255, 255, 255));
        tagP.setText("#Etiqueta1 #Etiqueta2 #Etiqueta3");

        ubiP.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        ubiP.setForeground(new java.awt.Color(204, 204, 204));
        ubiP.setText("Una unbicación col. Colonia Calle. Cierta calle número #123");

        jPanel13.setBackground(new java.awt.Color(26, 29, 39));

        nameP.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        nameP.setForeground(new java.awt.Color(204, 204, 204));
        nameP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameP.setText("Nombre del lugar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameP, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(19, 21, 28));

        icoimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoimgMouseClicked(evt);
            }
        });

        icocom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icocomMouseClicked(evt);
            }
        });

        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icoimg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icocom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icocom, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(icoimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.setBackground(new java.awt.Color(34, 39, 51));
        jTabbedPane3.setEnabled(false);

        commentsPlace.setBackground(new java.awt.Color(34, 39, 51));

        jScrollPane2.setBorder(null);

        comments.setBackground(new java.awt.Color(34, 39, 51));

        javax.swing.GroupLayout commentsLayout = new javax.swing.GroupLayout(comments);
        comments.setLayout(commentsLayout);
        commentsLayout.setHorizontalGroup(
            commentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
        commentsLayout.setVerticalGroup(
            commentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(comments);

        javax.swing.GroupLayout commentsPlaceLayout = new javax.swing.GroupLayout(commentsPlace);
        commentsPlace.setLayout(commentsPlaceLayout);
        commentsPlaceLayout.setHorizontalGroup(
            commentsPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentsPlaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        commentsPlaceLayout.setVerticalGroup(
            commentsPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentsPlaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPane3.addTab("tab1", commentsPlace);

        galery.setBackground(new java.awt.Color(34, 39, 51));

        jScrollPane3.setBorder(null);

        gal.setBackground(new java.awt.Color(34, 39, 51));
        gal.setLayout(new java.awt.GridLayout(2, 5, 5, 5));
        jScrollPane3.setViewportView(gal);

        javax.swing.GroupLayout galeryLayout = new javax.swing.GroupLayout(galery);
        galery.setLayout(galeryLayout);
        galeryLayout.setHorizontalGroup(
            galeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(galeryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        galeryLayout.setVerticalGroup(
            galeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(galeryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jTabbedPane3.addTab("tab2", galery);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubiP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tagP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ubiP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(grade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTabbedPane3))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane2.addTab("tab4", jPanel4);

        jPanel3.setBackground(new java.awt.Color(34, 39, 51));

        jPanel14.setBackground(new java.awt.Color(19, 21, 28));

        verC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verCMouseClicked(evt);
            }
        });

        verL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verLMouseClicked(evt);
            }
        });

        verG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verGMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verL, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(verC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.setEnabled(false);

        jPanel15.setBackground(new java.awt.Color(34, 39, 51));

        jScrollPane4.setBorder(null);

        pendplaces.setBackground(new java.awt.Color(34, 39, 51));

        javax.swing.GroupLayout pendplacesLayout = new javax.swing.GroupLayout(pendplaces);
        pendplaces.setLayout(pendplacesLayout);
        pendplacesLayout.setHorizontalGroup(
            pendplacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        pendplacesLayout.setVerticalGroup(
            pendplacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(pendplaces);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel15);

        jPanel19.setBackground(new java.awt.Color(34, 39, 51));

        jScrollPane5.setBorder(null);

        pendComments.setBackground(new java.awt.Color(34, 39, 51));

        javax.swing.GroupLayout pendCommentsLayout = new javax.swing.GroupLayout(pendComments);
        pendComments.setLayout(pendCommentsLayout);
        pendCommentsLayout.setHorizontalGroup(
            pendCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        pendCommentsLayout.setVerticalGroup(
            pendCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jScrollPane5.setViewportView(pendComments);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel19);

        jPanel20.setBackground(new java.awt.Color(34, 39, 51));

        jScrollPane6.setBorder(null);

        pendGal.setBackground(new java.awt.Color(34, 39, 51));

        javax.swing.GroupLayout pendGalLayout = new javax.swing.GroupLayout(pendGal);
        pendGal.setLayout(pendGalLayout);
        pendGalLayout.setHorizontalGroup(
            pendGalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        pendGalLayout.setVerticalGroup(
            pendGalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jScrollPane6.setViewportView(pendGal);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", jPanel20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1))
        );

        jTabbedPane2.addTab("tab3", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(connect, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(connect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setVisible(false);
        new Login(this).setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        //log.setVisible(true);
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_b3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        addPlaces();
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        iluminate(jLabel4);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        uniluminate(jLabel4);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        iluminate(jLabel5);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        uniluminate(jLabel5);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        iluminate(jLabel6);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        uniluminate(jLabel6);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        iluminate(jLabel7);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        uniluminate(jLabel7);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setVisible(false);
        //this.removeAll();
        //this.getContentPane().removeAll();
        new Login(this).setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        if (this.getExtendedState() == JFrame.NORMAL) {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            return;
        }
        this.setExtendedState(JFrame.NORMAL);
    }//GEN-LAST:event_b4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        tags(jPanel5, 0);
        content.removeAll();
        searchData();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        tags(jPanel6, 1);
        content.removeAll();
        searchData();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        tags(jPanel12, 2);
        content.removeAll();
        searchData();
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        tags(jPanel10, 3);
        content.removeAll();
        searchData();
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        tags(jPanel11, 4);
        content.removeAll();
        searchData();
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseClicked
        tags(jPanel30, 5);
        content.removeAll();
        searchData();
    }//GEN-LAST:event_jPanel30MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
        tags(jPanel31, 6);
        content.removeAll();
        searchData();
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged
        if (this.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            return;
        }

        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel7MouseDragged

    private void icoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoMouseClicked
        changePic(1);
    }//GEN-LAST:event_icoMouseClicked

    private void icocomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icocomMouseClicked
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_icocomMouseClicked

    private void icoimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoimgMouseClicked
        gal.removeAll();
        addGal();
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_icoimgMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // Add picture or comment
        if (jTabbedPane3.getSelectedIndex() == 0) {
            this.blurredGlassPane.setVisible(true);
            AddComment addComment = new AddComment(this);
            addComment.addObserver((Observer) this); // Registrar Principal como observador
            addComment.setVisible(true);
            return;
        }

        changePic(2);
    }//GEN-LAST:event_addMouseClicked

    private void addplaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addplaceMouseClicked

        blurredGlassPane.setVisible(true);
        new AddPlace(this).setVisible(true);
    }//GEN-LAST:event_addplaceMouseClicked

    private void verLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verLMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_verLMouseClicked

    private void verCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_verCMouseClicked

    private void verGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verGMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_verGMouseClicked

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        content.removeAll();
        if (search.getText().equals("") || search.getText().equalsIgnoreCase("buscar")) {
            addPlaces();
            return;
        }
        searchData();
    }//GEN-LAST:event_searchKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            UIManager.setLookAndFeel(new FlatLightLaf());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } /*catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/ catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel addplace;
    private javax.swing.JLabel aport;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel cerrar;
    public javax.swing.JPanel comments;
    private javax.swing.JPanel commentsPlace;
    private javax.swing.JLabel connect;
    public javax.swing.JPanel content;
    public javax.swing.JPanel gal;
    private javax.swing.JPanel galery;
    private javax.swing.JLabel grade;
    private javax.swing.JLabel ico;
    private javax.swing.JLabel icocom;
    private javax.swing.JLabel icoimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel locate;
    private javax.swing.JLabel nameP;
    private javax.swing.JLabel pend;
    public javax.swing.JPanel pendComments;
    public javax.swing.JPanel pendGal;
    public javax.swing.JPanel pendplaces;
    private javax.swing.JTextField search;
    private javax.swing.JLabel star;
    private javax.swing.JLabel tagP;
    private javax.swing.JLabel ubiP;
    private javax.swing.JLabel verC;
    private javax.swing.JLabel verG;
    private javax.swing.JLabel verL;
    // End of variables declaration//GEN-END:variables

    private void iluminate(JLabel jlabel) {
        jlabel.setForeground(new Color(176, 179, 189));
    }

    private void uniluminate(JLabel jlabel) {
        jlabel.setForeground(Color.WHITE);
    }

    public void addGal() {
        gal.removeAll();
        String url = URL_ROOT + "getPictures.php";
        try {
            Form form = Form.form();
            form.add("lugar_name", lugar.getName());

            String resultado = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                gal.add(new PanelPicture(this, (JSONObject) jarray.get(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPendGalery() {
        pendGal.removeAll();
        String url = URL_ROOT + "getPendPictures.php";
        try {
            String resultado = Request.post(url).execute().returnContent().asString();
            System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                glpgalery.setRows(glpgalery.getRows() + 1);
                pendGal.add(new PanelPendPicture(this, (JSONObject) jarray.get(i)));
                //pendGal.setLayout(glpgalery);
                pendGal.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPendComments() {
        pendComments.removeAll();
        String url = URL_ROOT + "getPendComments.php";

        try {
            String resultado = Request.post(url).execute().returnContent().asString();
            //System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                //System.out.println("herehrehr" + jarray.get(i));
                glpcomments.setRows(glpcomments.getRows() + 1);
                pendComments.add(new PanelPendComment(this, (JSONObject) jarray.get(i)));
                //pendComments.setLayout(glpcomments);
                //pendComments.updateUI();
            }

        } catch (Exception e) {

        }
    }

    public void addPendPlaces() {
        pendplaces.removeAll();
        String url = URL_ROOT + "getPendPlaces.php";

        try {
            Form form = Form.form();

            String resultado = Request.post(url).execute().returnContent().asString();
            //System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                System.out.println("herehrehr" + jarray.get(i));
                glpplaces.setRows(glpplaces.getRows() + 1);
                pendplaces.add(new PanelPendPlace(this, (JSONObject) jarray.get(i)));
                //pendplaces.setLayout(glpplaces);
                //pendplaces.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPlaces() {
        content.removeAll();
        String url = URL_ROOT + "getPlaces.php";

        try {
            String resultado = Request.post(url).execute().returnContent().asString();
            //System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                System.out.println(jarray.get(i));
                //content.setLayout(gl);
                gl.setRows(gl.getRows() + 1);
                content.add(new PanelPlace(this, (JSONObject) jarray.get(i)));
                //content.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tags(JPanel jpanel, int poc) {
        if (activeTag[poc]) {
            activeTag[poc] = false;
            jpanel.setBackground(new Color(26, 29, 39));
            return;
        }

        activeTag[poc] = true;
        jpanel.setBackground(new Color(85, 89, 108));
    }

    private void changePic(int metodo) {
        JFileChooser jFileChooser1 = new JFileChooser();
        java.io.File fileimg = null;
        if (jFileChooser1.showOpenDialog(null) == javax.swing.JFileChooser.APPROVE_OPTION) {
            fileimg = jFileChooser1.getSelectedFile();
            if (metodo == 1) {
                userImag(fileimg);
                return;
            }
            selectImage(fileimg);
        }
    }

    private void selectImage(File fileimg) {
        String url = URL_ROOT + "addPicture.php";
        if (fileimg.length() >= 100000) {
            
            MessageFrame message = MessageFactory.createMessage("Error", "Tu foto es muy pesada");
            message.showMessage();
            //new ShowMessage("Error", "Tu foto es muy pesada").setVisible(true);
            return;
        }

        try {
            Form form = Form.form();
            form.add("foto", encodePic(fileimg));
            form.add("lugar_name", lugar.getName());
            form.add("usuario_user", user.getUser());

            String resultado = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(resultado);

            pendGal.removeAll();
            this.addPendGalery();
            pendGal.updateUI();
            
            MessageFrame message = MessageFactory.createMessage("Completo", "Tu foto está por revisarse");
            message.showMessage();
            //new ShowMessage("Completo", "Tu foto está por revisarse").setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void userImag(File fileimg) {
        try {
            Image img = ImageIO.read(fileimg).getScaledInstance(ico.getWidth(), ico.getHeight(), Image.SCALE_SMOOTH);
            ico.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            byteImg = Files.readAllBytes(fileimg.toPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void imgs(JLabel label, String name) {
        try {
            label.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\" + name)).getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addComment() {
        comments.removeAll();
        String url = URL_ROOT + "getComments.php";

        try {
            Form form = Form.form();
            form.add("lugar_name", lugar.getName());

            String resultado = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                System.out.println(jarray.get(i));

                gl1.setRows(gl1.getRows() + 1);
                comments.add(new PanelCom(this, (JSONObject) jarray.get(i)));
                //comments.setLayout(gl1);
                //comments.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ///////////////////
    public class BlurredGlassPane extends JPanel {

        private BufferedImage background;

        @Override
        public void setVisible(boolean visible) {
            if (visible) {
                Container parent = SwingUtilities.getAncestorOfClass(JRootPane.class, this);
                if (parent != null) {
                    JRootPane rootPane = (JRootPane) parent;

                    BufferedImage img = new BufferedImage(rootPane.getWidth(), rootPane.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D g2d = img.createGraphics();
                    rootPane.printAll(g2d);
                    g2d.dispose();

                    background = new GaussianBlurFilter(50).filter(img, null);
                }
            }
            super.setVisible(visible);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(background, 0, 0, this);
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void updateData() {
        pend.setSize(29, 29);
        imgs(pend, "pend.png");
        pend.setEnabled(true);
        pend.setEnabled(true);

        jLabel7.setVisible(true);
        jLabel7.setEnabled(true);

        addPlaces();
        addPendPlaces();
        addPendComments();
        addPendGalery();

        if (user.isAdmin()) {
            return;
        }

        pend.setIcon(null);

        pend.setEnabled(false);
        pend.setEnabled(false);

        jLabel7.setVisible(false);
        jLabel7.setEnabled(false);
    }

    public void initialize() {
        this.setLocationRelativeTo(null);
        this.setResizable(true);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane4.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane5.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane6.getVerticalScrollBar().setUnitIncrement(16);

        try {
            Image img = ImageIO.read(new java.io.File("Imagenes\\" + "logo.png"));
            this.setIconImage(img);

            imgs(b2, "b1.png");
            imgs(b3, "b2.png");
            imgs(b4, "b4.png");
            imgs(ico, "UserIMG\\ud7.png");

            imgs(locate, "loc.png");
            imgs(aport, "aport.png");
            imgs(pend, "pend.png");
            imgs(cerrar, "sal.png");
            imgs(connect, "b3.png");
            imgs(star, "star.png");

            //Imagenes de boton comantarios, galería y añadir
            imgs(icocom, "coment.png");
            imgs(icoimg, "gal.png");
            imgs(add, "add.png");
            imgs(addplace, "add.png");

            ////imagenes de botones verG, verL, verC
            imgs(verG, "verG.png");
            imgs(verL, "verL.png");
            imgs(verC, "verC.png");

            ////set gridLayoutes
            gl = new GridLayout();
            gl1 = new GridLayout();

            /*glgal = new GridLayout(3, 4, 10, 30);
            glgal.setVgap(5);
            glgal.setHgap(5);*/
            //gal.setLayout(glgal);
            glpplaces = new GridLayout();
            glpcomments = new GridLayout();

            glpgalery = new GridLayout();

            blurredGlassPane = new BlurredGlassPane();
            blurredGlassPane.setLayout(new GridBagLayout());

            pendGal.setLayout(glpgalery);
            content.setLayout(gl);
            comments.setLayout(gl1);
            pendplaces.setLayout(glpplaces);
            pendComments.setLayout(glpcomments);

            ////////////
            gl1.setRows(gl1.getRows() + 5);
            gl.setRows(gl.getRows() + 5);
            glpplaces.setRows(glpplaces.getRows() + 5);
            glpgalery.setRows(glpgalery.getRows() + 5);
            glpcomments.setRows(glpcomments.getRows() + 5);

            activeTag = new boolean[7];

            jTabbedPane2.setSelectedIndex(1);
            Window win = SwingUtilities.getWindowAncestor(jPanel1);
            if (win instanceof JFrame frame) {
                frame.setGlassPane(blurredGlassPane);
                blurredGlassPane.setVisible(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void infoPlace() {
        nameP.setText(lugar.getName());
        tagP.setText(lugar.getEtiquetas().replace("_", " "));
        ubiP.setText(lugar.getEstado() + ", " + lugar.getCiudad() + ", " + lugar.getColonia()
                + ", cp: " + lugar.getCp() + ", " + lugar.getCalle()
                + ", #" + lugar.getNumeroext() + ", " + lugar.getNumeroint()
        );
        grade.setText(String.valueOf(lugar.getCalif()));

        comments.removeAll();
        addComment();
        jTabbedPane3.setSelectedIndex(0);
        comments.updateUI();

        /*gal.removeAll();
        addGal();*/
        //gal.updateUI();
    }

    private String encodePic(File fileimg) {
        try {
            return Base64.getEncoder().encodeToString(Files.readAllBytes(fileimg.toPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private void searchData() {
        if ((search.getText().equals("") || search.getText().endsWith("Buscar")) && !allZero()) {
            getTagsData();
        } else if ((!search.getText().equals("") && !search.getText().endsWith("Buscar")) && allZero()) {
            getSearchData();
        } else {
            getBoth();
        }
    }

    private void getBoth() {
        String url = URL_ROOT + "getBoth.php";

        try {
            Form form = Form.form();
            form.add("name", search.getText());
            form = getTags(form);

            String resultado = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                System.out.println(jarray.get(i));
                gl.setRows(gl.getRows() + 1);
                content.add(new PanelPlace(this, (JSONObject) jarray.get(i)));
                //content.setLayout(gl);
                content.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getSearchData() {
        String url = URL_ROOT + "getSearchData.php";

        try {
            Form form = Form.form();
            form.add("name", search.getText());
            String resultado = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                System.out.println(jarray.get(i));
                gl.setRows(gl.getRows() + 1);
                content.add(new PanelPlace(this, (JSONObject) jarray.get(i)));
                //content.setLayout(gl);
                content.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getTagsData() {
        String url = URL_ROOT + "getTagsData.php";

        try {
            Form form = Form.form();
            form = getTags(form);
            String resultado = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (int i = 0; i < jarray.size(); i++) {
                System.out.println(jarray.get(i));
                gl.setRows(gl.getRows() + 1);
                content.add(new PanelPlace(this, (JSONObject) jarray.get(i)));
                //content.setLayout(gl);
                content.updateUI();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean allZero() {
        int n = 0;
        for (int i = 0; i < activeTag.length; i++) {
            n = activeTag[i] == false ? n + 1 : n + 0;
        }
        return activeTag.length == n;
    }

    private Form getTags(Form form) {
        for (int i = 0; i < activeTag.length; i++) {
            if (!activeTag[i]) {
                form.add("T" + (i + 1), "");
                continue;
            }
            switch (i) {
                case 0 ->
                    form.add("T1", "Desayuno");
                case 1 ->
                    form.add("T2", "Comida");
                case 2 ->
                    form.add("T3", "Cena");
                case 3 ->
                    form.add("T4", "Diversion");
                case 4 ->
                    form.add("T5", "Cultura");
                case 5 ->
                    form.add("T6", "Tendencias");
                case 6 ->
                    form.add("T7", "Ecoturismo");
            }
        }
        return form;
    }
}

/*        try {
            Image image = null;
            if (fileimg.length() >= 100000) {
                //new ShowMessage("Error", "Tu foto es muy pesada").setVisible(true);
                //return;
                //esto deja la imagen original en un objeto Image
                image = Toolkit.getDefaultToolkit().getImage(fileimg.getAbsolutePath());

                // esto reduce la imagen a los valores de las variables width, height
                BufferedImage tnsImg = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
                Graphics2D graphics2D = tnsImg.createGraphics();
                graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                graphics2D.drawImage(image, 0, 0, 200, 200, null);
            }

            return Base64.getEncoder().encodeToString(Files.readAllBytes(fileimg.toPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
