/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inpongopi;

/**
 *
 * @author ThinkPad
 */
public class FCaffe extends javax.swing.JFrame {

    /**
     * Creates new form FCaffe
     */
    public FCaffe() {
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

        btn_Industrial = new javax.swing.JLabel();
        btn_Klasik = new javax.swing.JLabel();
        btn_Modern = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        Jlatar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Industrial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C_industrial.png"))); // NOI18N
        btn_Industrial.setText("jLabel2");
        getContentPane().add(btn_Industrial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 310, 400));

        btn_Klasik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C_klasik.png"))); // NOI18N
        btn_Klasik.setText("jLabel3");
        getContentPane().add(btn_Klasik, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 270, 410));

        btn_Modern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C_modern.png"))); // NOI18N
        btn_Modern.setText("jLabel4");
        getContentPane().add(btn_Modern, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 290, 410));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backk.png"))); // NOI18N
        btn_back.setText("jLabel1");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 460, 270, 70));

        Jlatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nuansa cafe.png"))); // NOI18N
        getContentPane().add(Jlatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        tipe t = new tipe();
        t.setLocationRelativeTo(null);
        t.setVisible(true);
        this.setVisible(false);
        System.out.println("Warkop form berhasil");
    }//GEN-LAST:event_btn_backMouseClicked

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
            java.util.logging.Logger.getLogger(FCaffe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCaffe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCaffe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCaffe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCaffe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlatar;
    public javax.swing.JLabel btn_Industrial;
    private javax.swing.JLabel btn_Klasik;
    private javax.swing.JLabel btn_Modern;
    private javax.swing.JLabel btn_back;
    // End of variables declaration//GEN-END:variables
}
