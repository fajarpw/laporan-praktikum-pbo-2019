package percobaan;

import javax.swing.JOptionPane;

public class Swing extends javax.swing.JFrame {

    private String nama, nim, jeniskelamin, info, jurusan, matakuliah, semester, alamat;

    /**
     * Creates new form Swing
     */
    public Swing() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        labelnim = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        rdjeniskelamin1 = new javax.swing.JRadioButton();
        rdjeniskelamin2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextPane();
        comboboxsemester = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMK1 = new javax.swing.JCheckBox();
        cbMK2 = new javax.swing.JCheckBox();
        cmdclear = new javax.swing.JButton();
        cmdtampil = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listjurusan = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Mahasiswa");

        labelname.setText("Nama");

        labelnim.setText("NIM");

        jLabel4.setText("Jenis Kelamin");

        jLabel6.setText("Jurusan");

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        rdjeniskelamin1.setText("Laki-Laki");

        rdjeniskelamin2.setText("Perempuan");

        jScrollPane1.setViewportView(hasil);

        comboboxsemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2" }));

        jLabel7.setText("Mata Kuliah");

        jLabel5.setText("Semester");

        cbMK1.setText("Sistem Terdistribusi");

        cbMK2.setText("PBO");
        cbMK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMK2ActionPerformed(evt);
            }
        });

        cmdclear.setText("Clear");
        cmdclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdclearActionPerformed(evt);
            }
        });

        cmdtampil.setText("Tampil");
        cmdtampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdtampilActionPerformed(evt);
            }
        });

        listjurusan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "DIV Teknik Informatika", "DIII Manajemen Informatika", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listjurusan);

        jLabel2.setText("Alamat");

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelname)
                    .addComponent(labelnim)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboboxsemester, 0, 229, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdclear)
                        .addGap(18, 18, 18)
                        .addComponent(cmdtampil)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbMK1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbMK2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rdjeniskelamin2)
                                        .addComponent(jLabel1)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rdjeniskelamin1)
                                        .addComponent(txtname)
                                        .addComponent(txtnim)
                                        .addComponent(txtalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelnim)
                            .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdjeniskelamin1)
                            .addComponent(rdjeniskelamin2)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbMK1)
                            .addComponent(cbMK2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6)
                                .addGap(0, 49, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboboxsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdclear)
                    .addComponent(cmdtampil))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void cbMK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMK2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMK2ActionPerformed

    private void cmdtampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdtampilActionPerformed
        // TODO add your handling code here:
        nama = txtname.getText();
        nim = txtnim.getText();
        alamat = txtalamat.getText();
        if (cbMK1.isSelected()) {
            matakuliah = "Sistem Terdistribusi";
        }
        if (cbMK2.isSelected()) {
            matakuliah += "PBO";
        }
        if (rdjeniskelamin1.isSelected()) {
            jeniskelamin = "Laki-Laki";
        }
        if (rdjeniskelamin2.isSelected()) {
            jeniskelamin = "Perempuan";
        }

        jurusan = listjurusan.getSelectedValue().toString();
        semester = comboboxsemester.getSelectedItem().toString();

        info = "Nama: " + nama + "\n";
        info += "NIM: " + nim+ "\n";
        info += "Alamat: " + alamat + "\n";
        info += "Jenis Kelamin: " + jeniskelamin+ "\n";
        info += "Mata Kuliah " + matakuliah+ "\n";
        info += "Jurusan: " + jurusan+ "\n";
        info += "Semester: " + semester+ "\n";
        if ("".equals(alamat) || alamat==null) {
            String alert = "Alamat harus diisi";
            JOptionPane.showMessageDialog(null,alert);
        }else{
           hasil.setText(info);
//        JOptionPane.showMessageDialog(null, info); 
        }
        
    }//GEN-LAST:event_cmdtampilActionPerformed

    private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdclearActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtnim.setText("");
        txtalamat.setText("");
        cbMK1.setSelected(false);
        cbMK2.setSelected(false);
        hasil.setText("");
    }//GEN-LAST:event_cmdclearActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

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
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbMK1;
    private javax.swing.JCheckBox cbMK2;
    private javax.swing.JButton cmdclear;
    private javax.swing.JButton cmdtampil;
    private javax.swing.JComboBox<String> comboboxsemester;
    private javax.swing.JTextPane hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelnim;
    private javax.swing.JList<String> listjurusan;
    private javax.swing.JRadioButton rdjeniskelamin1;
    private javax.swing.JRadioButton rdjeniskelamin2;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
