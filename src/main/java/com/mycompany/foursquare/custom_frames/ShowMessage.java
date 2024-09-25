package com.mycompany.foursquare.custom_frames;

import java.awt.Color;

public class ShowMessage extends javax.swing.JFrame implements MessageFrame{
    int Xmouse, Ymouse;
    private static ShowMessage instance;  // Instancia única
    
    public static ShowMessage getInstance(String tit, String cont) {
        if (instance == null) {
            instance = new ShowMessage(tit, cont);
        }
        // Actualizamos los valores de título y contenido
        instance.tittle.setText(tit);
        instance.content.setText(cont);
        return instance;
    }

    public ShowMessage() {
        initComponents();
    }
    
    public ShowMessage(String tit, String cont){
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
       // jScrollPane1.setBorder(null);
        content.setEditable(false);
       // content.setFont(jScrollPane1.getFont());
        //content.setBackground(new Color(33,42,57));
        //jScrollPane1.setBackground(new Color(33,42,57));
        //content.setForeground(Color.WHITE);
        content.setBorder(null);
        content.setText(cont);
        
        tittle.setText(tit);
        //obj.enable(false);
    }
    
    @Override
    public void showMessage(){
    
        this.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        ok_btn = new javax.swing.JPanel();
        ok_txt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        content = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(34, 39, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(98, 9, 217)));

        jPanel2.setBackground(new java.awt.Color(98, 9, 217));

        tittle.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(204, 204, 204));
        tittle.setText("Tittle");
        tittle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tittle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tittleMouseDragged(evt);
            }
        });
        tittle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tittleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tittleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        ok_btn.setBackground(new java.awt.Color(9, 16, 217));

        ok_txt.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        ok_txt.setForeground(new java.awt.Color(204, 204, 204));
        ok_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ok_txt.setText("Aceptar");
        ok_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ok_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ok_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ok_btnLayout = new javax.swing.GroupLayout(ok_btn);
        ok_btn.setLayout(ok_btnLayout);
        ok_btnLayout.setHorizontalGroup(
            ok_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ok_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        ok_btnLayout.setVerticalGroup(
            ok_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ok_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jScrollPane2.setBorder(null);

        content.setBackground(new java.awt.Color(34, 39, 51));
        content.setBorder(null);
        content.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        content.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(content);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 285, Short.MAX_VALUE)
                        .addComponent(ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tittleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tittleMouseDragged
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_tittleMouseDragged

    private void tittleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tittleMouseClicked

    }//GEN-LAST:event_tittleMouseClicked

    private void tittleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tittleMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_tittleMousePressed

    private void ok_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_txtMouseClicked
        //obj.enable(true);
        this.dispose();
    }//GEN-LAST:event_ok_txtMouseClicked

    private void ok_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_txtMouseEntered
        ok_btn.setBackground(new Color(204,204,204));
        ok_txt.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_ok_txtMouseEntered

    private void ok_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_txtMouseExited
        ok_btn.setBackground(new Color(9,16,217));
        ok_txt.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_ok_txtMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel ok_btn;
    private javax.swing.JLabel ok_txt;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
