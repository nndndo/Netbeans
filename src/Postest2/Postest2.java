package Postest2;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elizabeth
 */
public class Postest2 extends javax.swing.JFrame {

    /**
     * Creates new form Postest2
     */
    public Postest2() {
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

        kelamin = new javax.swing.ButtonGroup();
        negara = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tempatlahir = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        laki = new javax.swing.JRadioButton();
        cewe = new javax.swing.JRadioButton();
        rt = new javax.swing.JTextField();
        desa = new javax.swing.JTextField();
        kecamatan = new javax.swing.JTextField();
        kota = new javax.swing.JTextField();
        agama = new javax.swing.JComboBox();
        status = new javax.swing.JComboBox();
        golongandarah = new javax.swing.JComboBox();
        pekerjaan = new javax.swing.JTextField();
        indo = new javax.swing.JRadioButton();
        asing = new javax.swing.JRadioButton();
        rw = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Alamat");

        jLabel6.setText("RT/RW");

        jLabel7.setText("Kel/Desa");

        jLabel8.setText("Kecamatan");

        jLabel9.setText("Kota");

        jLabel10.setText("Agama");

        jLabel11.setText("Status");

        jLabel12.setText("Golongan Darah");

        jLabel2.setText("Nama Lengkap");

        jLabel13.setText("Pekerjaan");

        jLabel3.setText("Tempat/Tanggal Lahir");

        jLabel14.setText("Kewarganegaraan");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaKeyPressed(evt);
            }
        });

        tempatlahir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempatlahirKeyPressed(evt);
            }
        });

        tanggal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tanggalKeyPressed(evt);
            }
        });

        jLabel15.setText("/");

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        alamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alamatKeyPressed(evt);
            }
        });

        kelamin.add(laki);
        laki.setText("L");
        laki.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lakiKeyPressed(evt);
            }
        });

        kelamin.add(cewe);
        cewe.setText("P");

        rt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtActionPerformed(evt);
            }
        });
        rt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rtKeyPressed(evt);
            }
        });

        desa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                desaKeyPressed(evt);
            }
        });

        kecamatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kecamatanKeyPressed(evt);
            }
        });

        kota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kotaKeyPressed(evt);
            }
        });

        agama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ISLAM", "KATOLIK", "KRISTEN", "HINDU", "BUDHA", "LAINNYA" }));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KAWIN", "BELUM KAWIN" }));

        golongandarah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB", "O" }));
        golongandarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golongandarahActionPerformed(evt);
            }
        });

        pekerjaan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pekerjaanKeyPressed(evt);
            }
        });

        negara.add(indo);
        indo.setText("WNI");

        negara.add(asing);
        asing.setText("WNA");

        rw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rwActionPerformed(evt);
            }
        });
        rw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rwKeyPressed(evt);
            }
        });

        jLabel16.setText("/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alamat)
                            .addComponent(desa)
                            .addComponent(kecamatan)
                            .addComponent(kota)
                            .addComponent(pekerjaan)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(indo)
                                .addGap(18, 18, 18)
                                .addComponent(asing))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(laki)
                                .addGap(10, 10, 10)
                                .addComponent(cewe)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(golongandarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(laki)
                            .addComponent(cewe)
                            .addComponent(golongandarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(desa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(kota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(indo)
                    .addComponent(asing))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        save.setBackground(new java.awt.Color(0, 153, 255));
        save.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(0, 153, 255));
        hapus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        hapus.setText("Clear");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("FORM KARTU TANDA PENDUDUK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(save)
                        .addGap(18, 18, 18)
                        .addComponent(hapus))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(hapus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void rtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtActionPerformed

    private void rwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rwActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String name = nama.getText();
        String tempat = tempatlahir.getText();
        String tgl = tanggal.getText();
        String kelamin=null;
        if(laki.isSelected()){
            kelamin = laki.getText();
        }else if(cewe.isSelected()){
            kelamin = cewe.getText();
        }
        String alamatrmh = alamat.getText();
        String rtt = rt.getText();
        String rww = rw.getText();
        String desaa = desa.getText();
        String kec = kecamatan.getText();
        String kotaa = kota.getText();
        String agamaa = agama.getSelectedItem().toString();
        String statuss = status.getSelectedItem().toString();
        String gologan = golongandarah.getSelectedItem().toString();
        String work = pekerjaan.getText();
        String negara=null;
        if(indo.isSelected()){
            negara = indo.getText();
        }else if(asing.isSelected()){
            negara = asing.getText();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
        String name = nama.getText();
        String tempat = tempatlahir.getText();
        String tgl = tanggal.getText();
        String kelamin=null;
        if(laki.isSelected()){
            kelamin = laki.getText();
        }else if(cewe.isSelected()){
            kelamin = cewe.getText();
        }
        String alamatrmh = alamat.getText();
        String rtt = rt.getText();
        String rww = rw.getText();
        String desaa = desa.getText();
        String kec = kecamatan.getText();
        String kotaa = kota.getText();
        String agamaa = agama.getSelectedItem().toString();
        String statuss = status.getSelectedItem().toString();
        String golongan = golongandarah.getSelectedItem().toString();
        String work = pekerjaan.getText();
        String negara=null;
        if(indo.isSelected()){
            negara = indo.getText();
        }else if(asing.isSelected()){
            negara = asing.getText();
        }
        JOptionPane.showMessageDialog(this, "Nama Lengkap : "+name+
                "\nTempat/Tanggal Lahir : "+tempat+"  "+tgl+
                "\nJenis Kelamin : "+kelamin+
                "\nAlamat : "+alamatrmh+
                "\nRT/RW : "+rtt+"  "+rww+
                "\nKel/Desa : "+desaa+
                "\nKecamatan : "+kec+
                "\nKota : "+kotaa+
                "\nAgama : "+agamaa+
                "\nStatus : "+statuss+
                "\nGolongan Darah : "+golongan+
                "\nPekerjaan : "+work+
                "\nKewarganegaraan : "+negara);
    }//GEN-LAST:event_saveMouseClicked

    private void namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(nama.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                nama.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_namaKeyPressed

    private void tempatlahirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempatlahirKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(tempatlahir.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                tempatlahir.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_tempatlahirKeyPressed

    private void tanggalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tanggalKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(tanggal.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                tanggal.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_tanggalKeyPressed

    private void lakiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lakiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiKeyPressed

    private void alamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alamatKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(alamat.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                alamat.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_alamatKeyPressed

    private void rtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rtKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(rt.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                rt.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_rtKeyPressed

    private void rwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rwKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(rw.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                rw.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_rwKeyPressed

    private void desaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(desa.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                desa.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_desaKeyPressed

    private void kecamatanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kecamatanKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(kecamatan.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                kecamatan.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_kecamatanKeyPressed

    private void kotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kotaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(kota.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                kota.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_kotaKeyPressed

    private void pekerjaanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pekerjaanKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(pekerjaan.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Input","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                pekerjaan.requestFocus();
                return;
            }
                save.requestFocus();
        }
    }//GEN-LAST:event_pekerjaanKeyPressed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        nama.setText("");
        tempatlahir.setText("");
        tanggal.setText("");
        kelamin.clearSelection();
        alamat.setText("");
        rt.setText("");
        rw.setText("");
        desa.setText("");
        kecamatan.setText("");
        kota.setText("");
        pekerjaan.setText("");
        negara.clearSelection();
    }//GEN-LAST:event_hapusActionPerformed

    private void golongandarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golongandarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_golongandarahActionPerformed

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
            java.util.logging.Logger.getLogger(Postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox agama;
    private javax.swing.JTextField alamat;
    private javax.swing.JRadioButton asing;
    private javax.swing.JRadioButton cewe;
    private javax.swing.JTextField desa;
    private javax.swing.JComboBox golongandarah;
    private javax.swing.JButton hapus;
    private javax.swing.JRadioButton indo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kecamatan;
    private javax.swing.ButtonGroup kelamin;
    private javax.swing.JTextField kota;
    private javax.swing.JRadioButton laki;
    private javax.swing.JTextField nama;
    private javax.swing.ButtonGroup negara;
    private javax.swing.JTextField pekerjaan;
    private javax.swing.JTextField rt;
    private javax.swing.JTextField rw;
    private javax.swing.JButton save;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField tempatlahir;
    // End of variables declaration//GEN-END:variables
}