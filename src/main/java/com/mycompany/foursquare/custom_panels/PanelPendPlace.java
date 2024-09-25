package com.mycompany.foursquare.custom_panels;

import com.mycompany.foursquare.Principal;
import com.mycompany.foursquare.custom_frames.ShowMessage;
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

public class PanelPendPlace extends javax.swing.JPanel {

    JSONObject jobject;
    Principal principal;

    public PanelPendPlace() {
        initComponents();
    }

    public PanelPendPlace(Principal principal, JSONObject jobject) {
        initComponents();
        this.principal = principal;
        this.jobject = jobject;

        try {
            line5.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\line.png")).getScaledInstance(20, 241, Image.SCALE_SMOOTH)));
            setInfo(jobject);
            imgs(b1, "b1.png");
            imgs(b2, "b2.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
        content5.setEditable(false);
        content5.setBackground(new Color(34, 39, 51));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        line5 = new javax.swing.JLabel();
        tit5 = new javax.swing.JLabel();
        tag5 = new javax.swing.JLabel();
        ubi5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        content5 = new javax.swing.JTextPane();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(34, 39, 51));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        tit5.setBackground(new java.awt.Color(26, 29, 39));
        tit5.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        tit5.setForeground(new java.awt.Color(255, 255, 255));
        tit5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit5.setText("TÍTULO");

        tag5.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        tag5.setForeground(new java.awt.Color(255, 255, 255));
        tag5.setText("#Etiquetas");

        ubi5.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        ubi5.setForeground(new java.awt.Color(255, 255, 255));
        ubi5.setText("UBICACIÓN");

        jScrollPane7.setBackground(new java.awt.Color(34, 39, 51));
        jScrollPane7.setBorder(null);

        content5.setBackground(new java.awt.Color(34, 39, 51));
        content5.setBorder(null);
        content5.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        content5.setForeground(new java.awt.Color(176, 179, 189));
        content5.setText("Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia, molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium optio, eaque rerum! Provident similique accusantium nemo autem.");
        content5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                content5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                content5MouseExited(evt);
            }
        });
        jScrollPane7.setViewportView(content5);

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b1KeyPressed(evt);
            }
        });

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(line5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tag5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tit5, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(line5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tit5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tag5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubi5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void content5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content5MouseClicked
        //principal.jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_content5MouseClicked

    private void content5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content5MouseEntered
        jPanel6.setBackground(new Color(19, 21, 28));
        content5.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_content5MouseEntered

    private void content5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content5MouseExited
        jPanel6.setBackground(new Color(34, 39, 51));
        content5.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_content5MouseExited

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        //principal.jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new Color(19, 21, 28));
        content5.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(34, 39, 51));
        content5.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_jPanel6MouseExited

    private void b1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyPressed

    }//GEN-LAST:event_b1KeyPressed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        String url = URL_ROOT + "deletePendPlace.php";
        try {
            Form form = Form.form();
            form.add("name", jobject.get("name").toString());
            System.out.println(Request.post(url).bodyForm(form.build()).execute().returnContent().asString());

            principal.pendplaces.removeAll();
            principal.addPendPlaces();
            principal.pendplaces.updateUI();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b2MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        String url = URL_ROOT + "updateValidoPlace.php";
        try {
            Form form = Form.form();
            form.add("name", jobject.get("name").toString());
            System.out.println(Request.post(url).bodyForm(form.build()).execute().returnContent().asString());

            principal.pendplaces.removeAll();
            principal.addPendPlaces();
            principal.pendplaces.updateUI();

            principal.content.removeAll();
            principal.addPlaces();
            principal.content.updateUI();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JTextPane content5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel line5;
    private javax.swing.JLabel tag5;
    private javax.swing.JLabel tit5;
    private javax.swing.JLabel ubi5;
    // End of variables declaration//GEN-END:variables

    private void setInfo(JSONObject jobject) {
        tit5.setText(jobject.get("name").toString());
        tag5.setText(jobject.get("etiquetas").toString().replace("_", " "));
        ubi5.setText(jobject.get("estado").toString() + ", " + jobject.get("ciudad").toString() + ", " + jobject.get("colonia").toString()
                + ", cp:" + jobject.get("cp").toString() + ", " + jobject.get("calle").toString() + ", #" + jobject.get("numeroext").toString() + ", " + jobject.get("numeroint").toString());
        content5.setText(jobject.get("descripcion").toString());
    }

    private void imgs(JLabel label, String name) {
        try {
            label.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\" + name)).getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
