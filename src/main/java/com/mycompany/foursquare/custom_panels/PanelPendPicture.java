package com.mycompany.foursquare.custom_panels;

import com.mycompany.foursquare.Principal;
import static com.mycompany.foursquare.entities.utils.URL_ROOT;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;
import org.json.simple.JSONObject;

public class PanelPendPicture extends javax.swing.JPanel {

    Principal principal;
    JSONObject jobject;
    byte[] fotob;

    public PanelPendPicture() {
        initComponents();
    }

    public PanelPendPicture(Principal principal, JSONObject jobject) {
        initComponents();
        this.principal = principal;
        this.jobject = jobject;
        fotob = null;

        try {
            imgs(b1, "b1.png");
            imgs(b2, "b2.png");
        } catch (Exception e) {
            e.printStackTrace();
        }

        setPicData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ico = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(34, 39, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ico, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 121, Short.MAX_VALUE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        String url = URL_ROOT + "updateValidoPicture.php";
        try {
            Form form = Form.form();
            form.add("id", jobject.get("id").toString());
            System.out.println(Request.post(url).bodyForm(form.build()).execute().returnContent().asString());

            principal.pendGal.removeAll();
            principal.addPendGalery();
            principal.pendGal.updateUI();

           //principal.gal.removeAll();
            //principal.addGal();
            //principal.gal.updateUI();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        String url = URL_ROOT + "deletePendPicture.php";
        try {
            Form form = Form.form();
            form.add("id", jobject.get("id").toString());
            System.out.println(Request.post(url).bodyForm(form.build()).execute().returnContent().asString());

            principal.pendGal.removeAll();
            principal.addPendGalery();
            principal.pendGal.updateUI();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b2MouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel ico;
    // End of variables declaration//GEN-END:variables

    public void setPicData() {
        fotob = Base64.getDecoder().decode(T("foto"));
        ImageIcon img = new ImageIcon(fotob);
        ico.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
    }

    private String T(String key) {
        return jobject.get(key).toString();
    }

    private void imgs(JLabel label, String name) {
        try {
            label.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\" + name)).getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
