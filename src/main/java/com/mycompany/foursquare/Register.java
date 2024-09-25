
package com.mycompany.foursquare;

// Vlamydir estis ĉi tie    
import com.mycompany.foursquare.custom_frames.MessageFactory;
import com.mycompany.foursquare.custom_frames.MessageFrame;
import com.mycompany.foursquare.custom_frames.ShowMessage;
import static com.mycompany.foursquare.entities.utils.URL_ROOT;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;

public class Register extends javax.swing.JFrame {
    Login log;
    boolean passC;
    
    public Register() {
        initComponents();
    }
    
    public Register(Login log){
        initComponents();
        passC = false;
        this.log = log;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        try{
            b2.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\b1.png")).getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
            b3.setIcon(new ImageIcon(ImageIO.read(new File("Imagenes\\b2.png")).getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
        }catch(Exception e ){}
        Hilo hilo = new Hilo();
        hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        reg = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        pass2 = new javax.swing.JPasswordField();
        pass1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(33, 42, 57));
        jPanel1.setForeground(new java.awt.Color(33, 42, 57));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(34, 39, 51));

        reg.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));
        reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reg.setText("Registrarse");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reg, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reg, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        name.setBackground(new java.awt.Color(34, 39, 51));
        name.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("Nombre");
        name.setBorder(null);
        name.setCaretColor(new java.awt.Color(204, 204, 204));

        pass2.setBackground(new java.awt.Color(34, 39, 51));
        pass2.setForeground(new java.awt.Color(204, 204, 204));
        pass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass2.setText("********");
        pass2.setBorder(null);
        pass2.setCaretColor(new java.awt.Color(204, 204, 204));

        pass1.setBackground(new java.awt.Color(34, 39, 51));
        pass1.setForeground(new java.awt.Color(204, 204, 204));
        pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass1.setText("********");
        pass1.setBorder(null);
        pass1.setCaretColor(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(pass2)
                                    .addComponent(pass1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_b3MouseClicked

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
        if(!passC)
            return;
        
        String url = URL_ROOT + "addUser.php";

        try {
            Form form = Form.form();
            form.add("user", name.getText());
            form.add("pass", pass1.getText());

            String resultado = Request.post(url)
            .bodyForm(form.build()).execute()
            .returnContent().asString();
            
            MessageFrame message = MessageFactory.createMessage("Registrado Correctamente", "Un gusto verte aquí "+name.getText());
            message.showMessage();
            //new ShowMessage("Registrado Correctamente", "Un gusto verte aquí "+name.getText()).setVisible(true);
            //log.setVisible(true);
            //this.dispose();
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageFrame message = MessageFactory.createMessage("Error", "Los datos ingresados no son válidos");
            message.showMessage();
            //new ShowMessage("Error", "Los datos ingresado son inválidos").setVisible(true);
        }
    }//GEN-LAST:event_regMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel reg;
    // End of variables declaration//GEN-END:variables

    class Hilo extends Thread{
        @Override
        public void run(){
            while(true){
                if(pass1.getText().equals(pass2.getText())){
                    passC = true;
                    pass2.setForeground(new Color(204,204,204));
                    continue;
                }
                pass2.setForeground(new Color(254, 124, 97));
                passC = false;
            }
        }
    }


}
