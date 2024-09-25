package com.mycompany.foursquare.custom_panels;

import com.mycompany.foursquare.Principal;
import com.mycompany.foursquare.entities.Puntuacion;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.json.simple.JSONObject;

public class PanelCom extends javax.swing.JPanel {
    JSONObject jobject;
    Puntuacion p;
    Principal principal;

    public PanelCom() {
        initComponents();
        try {
            ico.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\" + "UserIMG\\u5.png")).getScaledInstance(85, 99, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PanelCom(Principal principal, JSONObject jobject) {
        initComponents();
        this.principal = principal;
        this.jobject = jobject;

        try {
            ico.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\" + "UserIMG\\u5.png")).getScaledInstance(85, 99, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ico = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(34, 39, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        name.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Nombre Usuario");

        jScrollPane1.setBorder(null);

        content.setBackground(new java.awt.Color(34, 39, 51));
        content.setBorder(null);
        content.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setText("Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia, molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum numquam blanditiis");
        content.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(content);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(19, 21, 28));
        content.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(34, 39, 51));
        content.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_formMouseExited

    private void contentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentMouseEntered
        this.setBackground(new Color(19, 21, 28));
        content.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_contentMouseEntered

    private void contentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentMouseExited
        this.setBackground(new Color(34, 39, 51));
        content.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_contentMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane content;
    private javax.swing.JLabel ico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

    private String T (String key){
        return jobject.get(key).toString();
    }
    
    private void setData(){
        name.setText(T("usuario_user"));
        content.setText(T("comentario"));
    }
}
