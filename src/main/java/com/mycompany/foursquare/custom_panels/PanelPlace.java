package com.mycompany.foursquare.custom_panels;

import com.mycompany.foursquare.Principal;
import com.mycompany.foursquare.entities.Lugar;
import com.mycompany.foursquare.entities.Puntuacion;
import static com.mycompany.foursquare.entities.utils.URL_ROOT;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PanelPlace extends javax.swing.JPanel {

    Principal principal;
    JSONObject jobject;
    Lugar lugar;

    public PanelPlace(Principal principal, JSONObject jobject) {
        initComponents();
        this.principal = principal;
        this.jobject = jobject;

        try {
            line.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\line.png")).getScaledInstance(20, 241, Image.SCALE_SMOOTH)));
            setInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        content.setEditable(false);
        content.setBackground(new Color(34, 39, 51));

        if (checked()) {
            jPanel1.setBackground(new Color(64, 42, 57));
            content.setBackground(new Color(64, 42, 57));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        line = new javax.swing.JLabel();
        tit = new javax.swing.JLabel();
        tag = new javax.swing.JLabel();
        ubi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        content = new javax.swing.JTextPane();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 39, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        tit.setBackground(new java.awt.Color(26, 29, 39));
        tit.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        tit.setForeground(new java.awt.Color(255, 255, 255));
        tit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit.setText("TÍTULO");

        tag.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        tag.setForeground(new java.awt.Color(255, 255, 255));
        tag.setText("#Etiquetas");

        ubi.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        ubi.setForeground(new java.awt.Color(255, 255, 255));
        ubi.setText("UBICACIÓN");

        jScrollPane2.setBackground(new java.awt.Color(34, 39, 51));
        jScrollPane2.setBorder(null);

        content.setBackground(new java.awt.Color(34, 39, 51));
        content.setBorder(null);
        content.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        content.setForeground(new java.awt.Color(176, 179, 189));
        content.setText("Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia, molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium optio, eaque rerum! Provident similique accusantium nemo autem.");
        content.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(content);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tit, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(tag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(new Color(19, 21, 28));
        content.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        if (checked()) {
            jPanel1.setBackground(new Color(64, 42, 57));
            content.setBackground(new Color(64, 42, 57));
            return;
        }

        jPanel1.setBackground(new Color(34, 39, 51));
        content.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_jPanel1MouseExited

    private void contentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentMouseEntered
        jPanel1.setBackground(new Color(19, 21, 28));
        content.setBackground(new Color(19, 21, 28));
    }//GEN-LAST:event_contentMouseEntered

    private void contentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentMouseExited
        if (checked()) {
            jPanel1.setBackground(new Color(64, 42, 57));
            content.setBackground(new Color(64, 42, 57));
            return;
        }
        jPanel1.setBackground(new Color(34, 39, 51));
        content.setBackground(new Color(34, 39, 51));
    }//GEN-LAST:event_contentMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        principal.jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_formMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if(!checked())
            addCheck();
        
        principal.jTabbedPane2.setSelectedIndex(2);
        setPlaceInfo();
        principal.infoPlace();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void contentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentMouseClicked
        if(!checked())
            addCheck();
        
        principal.jTabbedPane2.setSelectedIndex(2);
        setPlaceInfo();
        principal.infoPlace();
    }//GEN-LAST:event_contentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel line;
    private javax.swing.JLabel tag;
    private javax.swing.JLabel tit;
    private javax.swing.JLabel ubi;
    // End of variables declaration//GEN-END:variables

    private void setInfo() {
        lugar = new Lugar(
                T("name"), T("ciudad"), T("estado"),
                Integer.parseInt(T("cp")), Integer.parseInt(T("numeroext")), Integer.parseInt(T("numeroint")),
                T("colonia"), T("calle"), T("etiquetas"), T("descripcion"),
                Integer.parseInt(T("valido")) == 1,
                T("usuario_user"),
                promedio()
        );

        tit.setText(T("name"));
        tag.setText(T("etiquetas").replace("_", " "));
        ubi.setText(T("estado") + ", " + T("ciudad") + ", " + T("colonia")
                + ", cp:" + T("cp") + ", " + T("calle") + ", #" + T("numeroext") + ", " + T("numeroint"));
        content.setText(T("descripcion"));
    }

    public void setPlaceInfo() {
        principal.lugar = this.lugar;
    }

    private String T(String key) {
        return jobject.get(key).toString();
    }

    private float promedio() {
        String url = URL_ROOT + "getComments.php";
        float stars = 0f;
        int i = 0;

        try {
            Form form = Form.form();
            form.add("lugar_name", T("name"));

            String resultado = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(resultado);

            JSONParser jp = new JSONParser();
            JSONArray jarray = (JSONArray) jp.parse(resultado);

            for (; i < jarray.size(); i++) {
                Object star = ((JSONObject) jarray.get(i)).get("estrellas");
                if (star == null) {
                    continue;
                }
                stars += Float.parseFloat(star.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return i == 0 ? 0.0f : (stars / i);
    }

    private void addCheck() {
        String url = URL_ROOT + "setCheck.php";

        try {
            Form form = Form.form();
            form.add("lugar_name", lugar.getName());
            form.add("usuario_user", principal.user.getUser());

            String res = Request.post(url).bodyForm(form.build()).execute().returnContent().asString();
            //System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checked() {
        String url2 = URL_ROOT + "getCheck.php";
        String res = "[]";
        try {
            Form form = Form.form();
            form.add("lugar_name", lugar.getName());
            form.add("usuario_user", principal.user.getUser());

            res = Request.post(url2).bodyForm(form.build()).execute().returnContent().asString();
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return !res.equals("[]");
    }

}
