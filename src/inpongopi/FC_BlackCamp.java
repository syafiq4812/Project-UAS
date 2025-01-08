/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inpongopi;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Thomas Fajar Nugraha
 */
public class FC_BlackCamp extends javax.swing.JFrame {

    /**
     * Creates new form FC_BlackCamp
     */
    public FC_BlackCamp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnhone = new javax.swing.JLabel();
        btnfinish = new javax.swing.JLabel();
        btnback = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        latar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_all/iconHome.png"))); // NOI18N
        btnhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhoneMouseClicked(evt);
            }
        });
        getContentPane().add(btnhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 150, 70));

        btnfinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_all/finish.png"))); // NOI18N
        btnfinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfinishMouseClicked(evt);
            }
        });
        getContentPane().add(btnfinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 150, 70));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_all/Back2.png"))); // NOI18N
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 150, 70));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 270, 80, -1));

        latar.setBackground(new java.awt.Color(0, 153, 153));
        latar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cafe/FI_BlackCamp.png"))); // NOI18N
        getContentPane().add(latar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhoneMouseClicked
        // TODO add your handling code here:
        home h = new home();
        h.setLocationRelativeTo(null);
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnhoneMouseClicked

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        // TODO add your handling code here:
        C_industrial ci = new C_industrial();
        ci.setLocationRelativeTo(null);
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnfinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinishMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnfinishMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Desktop browser = Desktop.getDesktop();
        try {
                browser.browse(new URI ("https://maps.app.goo.gl/SCYPoxfTNgRbAEBj6"));
        }
        catch (IOException err) {
        }
        catch (URISyntaxException err) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FC_BlackCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FC_BlackCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FC_BlackCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FC_BlackCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FC_BlackCamp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel btnfinish;
    private javax.swing.JLabel btnhone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel latar;
    // End of variables declaration//GEN-END:variables
}
