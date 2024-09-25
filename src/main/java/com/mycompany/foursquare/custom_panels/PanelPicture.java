package com.mycompany.foursquare.custom_panels;

import com.mycompany.foursquare.Principal;
import java.awt.Dimension;
import java.awt.Image;
import java.util.Base64;
import javax.swing.ImageIcon;
import org.json.simple.JSONObject;

public class PanelPicture extends javax.swing.JPanel {
    Principal principal;
    JSONObject jobject;
    byte[] fotob;

    public PanelPicture() {
        initComponents();
    }
    
    public PanelPicture(Principal principal, JSONObject jobject){
        initComponents();
        this.principal = principal;
        this.jobject = jobject;
        fotob = null;
        
        this.setMaximumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(200,200));
        this.setPreferredSize(new Dimension(200,200));
        
        setPicData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ico = new javax.swing.JLabel();

        setBackground(new java.awt.Color(34, 39, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ico, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ico, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ico;
    // End of variables declaration//GEN-END:variables

    public void setPicData(){
        fotob = Base64.getDecoder().decode(T("foto"));
        ImageIcon img = new ImageIcon(fotob);
        ico.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
    }
    
    private String T(String key){
        return jobject.get(key).toString();
    }

}
