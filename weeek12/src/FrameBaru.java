/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author D2K
 */
public class FrameBaru extends javax.swing.JFrame {

    /**
     * Creates new form FrameBaru
     */
    public FrameBaru() {
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

        tambah = new javax.swing.JToggleButton();
        angka1 = new javax.swing.JTextField();
        txthasil = new javax.swing.JLabel();
        angka2 = new javax.swing.JTextField();
        kurang = new javax.swing.JToggleButton();
        kali = new javax.swing.JToggleButton();
        modulo = new javax.swing.JToggleButton();
        bagi1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tambah.setBackground(java.awt.Color.orange);
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        angka1.setToolTipText("Masukan Nama Lengkap");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        txthasil.setBackground(java.awt.Color.white);
        txthasil.setForeground(java.awt.Color.darkGray);

        kurang.setBackground(java.awt.Color.orange);
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        kali.setBackground(java.awt.Color.orange);
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        modulo.setBackground(java.awt.Color.orange);
        modulo.setText("%");
        modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloActionPerformed(evt);
            }
        });

        bagi1.setBackground(java.awt.Color.orange);
        bagi1.setText("/");
        bagi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modulo)
                    .addComponent(kali)
                    .addComponent(kurang)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambah)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bagi1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txthasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kurang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bagi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modulo)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tambah.getAccessibleContext().setAccessibleName("simpan");
        tambah.getAccessibleContext().setAccessibleDescription("");
        txthasil.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        //String nama = angka1.getText();
        //labelNama.setText("Hello,"+nama);
        double hasil = Double.parseDouble(angka1.getText()) + Double.parseDouble(angka2.getText());
        txthasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tambahActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angka1ActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
         double hasil = Double.parseDouble(angka1.getText()) - Double.parseDouble(angka2.getText());
        txthasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
         double hasil = Double.parseDouble(angka1.getText()) * Double.parseDouble(angka2.getText());
        txthasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_kaliActionPerformed

    private void moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloActionPerformed
        // TODO add your handling code here:
         double hasil = Double.parseDouble(angka1.getText()) % Double.parseDouble(angka2.getText());
        txthasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_moduloActionPerformed

    private void bagi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagi1ActionPerformed
        // TODO add your handling code here:
        try {
        double num1 = Double.parseDouble(angka1.getText());
        double num2 = Double.parseDouble(angka2.getText());
        
        if (num2 == 0) {
            txthasil.setText("Error: Division by zero!");
        } else {
            double hasil = num1 / num2;
            txthasil.setText(Double.toString(hasil));
        }
    } catch (NumberFormatException e) {
        txthasil.setText("Error: Invalid input!");
    }
    }//GEN-LAST:event_bagi1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JToggleButton bagi1;
    private javax.swing.JToggleButton kali;
    private javax.swing.JToggleButton kurang;
    private javax.swing.JToggleButton modulo;
    private javax.swing.JToggleButton tambah;
    private javax.swing.JLabel txthasil;
    // End of variables declaration//GEN-END:variables
}
