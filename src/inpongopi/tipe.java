/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inpongopi;

/**
 *
 * @author ThinkPad
 */
public class tipe extends javax.swing.JFrame {

    /**
     * Creates new form tipe
     */
    public tipe() {
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

        btn_warkop = new javax.swing.JLabel();
        btn_cafe = new javax.swing.JLabel();
        jlatar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_warkop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wrkop.png"))); // NOI18N
        btn_warkop.setText("jLabel2");
        btn_warkop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_warkopMouseClicked(evt);
            }
        });
        getContentPane().add(btn_warkop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 480, 210));

        btn_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cave.png"))); // NOI18N
        btn_cafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cafeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 430, 230));

        jlatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tipe.png"))); // NOI18N
        getContentPane().add(jlatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_warkopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_warkopMouseClicked
        // TODO add your handling code here:
        FWarkop jr = new FWarkop();
        jr.setLocationRelativeTo(null);
        jr.setVisible(true);
        this.setVisible(false);
        System.out.println("Warkop form berhasil");
    }//GEN-LAST:event_btn_warkopMouseClicked

    private void btn_cafeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cafeMouseClicked
        // TODO add your handling code here:
        FCaffe jr = new FCaffe();
        jr.setLocationRelativeTo(null);
        jr.setVisible(true);
        this.setVisible(false);
        System.out.println("caffe form berhasil");
    }//GEN-LAST:event_btn_cafeMouseClicked

  
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
            java.util.logging.Logger.getLogger(tipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tipe t  = new tipe();
                t.setVisible(true);
                t.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_cafe;
    public javax.swing.JLabel btn_warkop;
    public javax.swing.JLabel jlatar;
    // End of variables declaration//GEN-END:variables
}
