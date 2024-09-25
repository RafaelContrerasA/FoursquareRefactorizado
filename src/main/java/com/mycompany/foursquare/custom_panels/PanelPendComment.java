package com.mycompany.foursquare.custom_panels;

import com.mycompany.foursquare.Principal;
import static com.mycompany.foursquare.entities.utils.URL_ROOT;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;
import org.json.simple.JSONObject;

public class PanelPendComment extends javax.swing.JPanel {

    Principal principal;
    JSONObject jobject;

    public PanelPendComment() {
        initComponents();
    }

    public PanelPendComment(Principal principal, JSONObject jobject) {
        initComponents();
        this.principal = principal;
        this.jobject = jobject;
        try {
            ico.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\" + "UserIMG\\u5.png")).getScaledInstance(85, 99, Image.SCALE_SMOOTH)));
            imgs(b1, "b1.png");
            imgs(b2, "b2.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
        content.setEditable(false);

        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ico = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JTextPane();
        nomlug = new javax.swing.JLabel();
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

        nomlug.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        nomlug.setForeground(new java.awt.Color(153, 153, 153));
        nomlug.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomlug.setText("Nombre Lugar");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomlug, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomlug, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentMouseEntered
        this.setBackground(new Color(19, 21, 28));
        content.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_contentMouseEntered

    private void contentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentMouseExited
        this.setBackground(new Color(34, 39, 51));
        content.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_contentMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(19, 21, 28));
        content.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(34, 39, 51));
        content.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_formMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        String url = URL_ROOT + "updateValidoComment.php";
        try {
            Form form = Form.form();
            form.add("id", jobject.get("id").toString());
            System.out.println(Request.post(url).bodyForm(form.build()).execute().returnContent().asString());

            principal.pendComments.removeAll();
            principal.addPendComments();
            principal.pendComments.updateUI();

            principal.comments.removeAll();
            principal.addComment();
            principal.comments.updateUI();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        String url = URL_ROOT + "deletePendComment.php";
        try {
            Form form = Form.form();
            form.add("id", jobject.get("id").toString());
            System.out.println(Request.post(url).bodyForm(form.build()).execute().returnContent().asString());

            principal.pendComments.removeAll();
            principal.addPendComments();
            principal.pendComments.updateUI();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JTextPane content;
    private javax.swing.JLabel ico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nomlug;
    // End of variables declaration//GEN-END:variables

    private void imgs(JLabel label, String name) {
        try {
            label.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\" + name)).getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String T(String key) {
        return jobject.get(key).toString();
    }

    private void setData() {
        name.setText(T("usuario_user"));
        content.setText(T("comentario"));
        nomlug.setText(T("lugar_name"));
    }
}
