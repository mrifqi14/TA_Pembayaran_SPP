/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Koneksi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bank_90492;
import model.Mahasiswa_90492;
import model.Pembayaran_Spp_90492;

/**
 *
 * @author X
 */
public class Transaksiview extends javax.swing.JFrame {

    /**
     * Creates new form Transaksiview
     */
    private ArrayList<Pembayaran_Spp_90492> arrSpp;
    private ArrayList<Bank_90492> arrBank;
//    private Connection connect;
    public Transaksiview() throws SQLException {
        
        initComponents();
        matikan();
        showTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txnpm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txalamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txidbank = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txidspp = new javax.swing.JTextField();
        txnominal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txdenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txbulan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtanggal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsimpan = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        talog = new javax.swing.JTextArea();
        txnamabank = new javax.swing.JTextField();
        txjk = new javax.swing.JTextField();
        txstatus = new javax.swing.JTextField();
        btntambah1 = new javax.swing.JButton();
        btntambah2 = new javax.swing.JButton();
        btnhapus1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEMBAYARAN SPP");

        jLabel2.setText("NPM                :");

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        jLabel3.setText("NPM                :");

        jLabel4.setText("Nama              :");

        jLabel5.setText("Alamat            :");

        jLabel6.setText("ID Bank           :");

        jLabel7.setText("Nama Bank    :");

        jLabel8.setText("ID SPP           :");

        txidspp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidsppActionPerformed(evt);
            }
        });

        jLabel9.setText("Nominal         :");

        jLabel10.setText("Denda           :");

        jLabel11.setText("Bulan            :");

        jLabel12.setText("Tanggal           :");

        tblsimpan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID SPP", "NPM", "Nama", "Tanggal", "Nominal", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblsimpan);

        jLabel13.setText("Status           :");

        btntambah.setText("Data Mahasiswa");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel14.setText("Jenis Kelamin  :");

        talog.setColumns(20);
        talog.setRows(5);
        jScrollPane2.setViewportView(talog);

        txnamabank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnamabankActionPerformed(evt);
            }
        });

        btntambah1.setText("Data Bank");
        btntambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambah1ActionPerformed(evt);
            }
        });

        btntambah2.setText("Data SPP");
        btntambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambah2ActionPerformed(evt);
            }
        });

        btnhapus1.setText("Lihat");
        btnhapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapus1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txidbank, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txjk, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txbulan))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txnominal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txidspp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txdenda, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txstatus))
                                    .addComponent(btntambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btntambah1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btntambah2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(btnhapus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txcari, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncari)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txnamabank, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtanggal)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(279, 279, 279))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btncari))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txnamabank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txidbank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txbulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(btntambah2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txidspp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(txstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txnominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txdenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(btntambah1)))
                            .addComponent(btntambah))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhapus1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        String car = txcari.getText();
        if (car.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Tidak boleh ada yang kosong");
        }else if (!(new Scanner(car).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Npm harus angka");
            txcari.requestFocus();
        }else{
        try {
            btncari();
            talog.setText("sukses cari");
        } catch (SQLException ex) {
            Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void txidsppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidsppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidsppActionPerformed

    private void txnamabankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnamabankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnamabankActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        bersih();
        talog.setText("Sukses hapus");
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        setVisible(false);
        try {
            new rMahasiswa().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btntambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambah1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try {
            new rBank().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btntambah1ActionPerformed

    private void btntambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambah2ActionPerformed
        setVisible(false);
        try {
            new rSpp().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btntambah2ActionPerformed

    private void btnhapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapus1ActionPerformed
        setVisible(false);
        try {
            new rLihat().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnhapus1ActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Transaksiview().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void matikan(){
        txnpm.setEnabled(false);
        txnama.setEnabled(false);
        txjk.setEnabled(false);
        txalamat.setEnabled(false);
        txidspp.setEnabled(false);
        txtanggal.setEnabled(false);
        txbulan.setEnabled(false);
        txnominal.setEnabled(false);
        txdenda.setEnabled(false);
        txstatus.setEnabled(false);
        txidbank.setEnabled(false);
        txnamabank.setEnabled(false);
        }
    public void bersih(){
        
        txcari.setText("");
        txnpm.setText("");
        txnama.setText("");
        txjk.setText("");
        txalamat.setText("");
        txidspp.setText("");
        txtanggal.setText("");
        txbulan.setText("");
        txnominal.setText("");
        txdenda.setText("");
        txstatus.setText("");
        txidbank.setText("");
        txnamabank.setText("");
    }
    public void simpan() throws SQLException{
        
//        Mahasiswa_90492 mahasiswa = new Mahasiswa_90492();
//        Pembayaran_Spp_90492 spp = new Pembayaran_Spp_90492();
//        Bank_90492 bank = new Bank_90492();
//        mahasiswa.setNpm_Mahasiswa(Integer.parseInt(txnpm.getText()));
//        mahasiswa.setNama_Mahasiswa(txnama.getText());
//        if(rbp.isSelected()){
//            mahasiswa.setJenis_Kelamin("P");
//            mahasiswa.setAlamat(txalamat.getText());
//            spp.setId_Spp(Integer.parseInt(txidspp.getText()));
//            spp.setBank(setId_Bank(Integer.parseInt(txidbank.getText())));
//            spp.setBulan_Spp(Integer.parseInt(txbulan.getText()));
//            spp.setDenda_Spp(Integer.parseInt(txdenda.getText()));
//            if(rbsudah.isSelected()){
//                spp.setKonfirmasi("Sudah");
//                spp.setNominal_Spp(Integer.parseInt(txnominal.getText()));
//                spp.setMahasiswa(mahasiswa);
//                bank.setId_Bank(Integer.parseInt(txidbank.getText()));
//                bank.setNama_Bank(txnamabank.getText());
//            }
//        }
//        else if(rblaki.isSelected()){
//            mahasiswa.setJenis_Kelamin("P");
//            mahasiswa.setAlamat(txalamat.getText());
//            spp.setId_Spp(Integer.parseInt(txidspp.getText()));
//            spp.setBank(bank);
//            spp.setBulan_Spp(Integer.parseInt(txbulan.getText()));
//            spp.setDenda_Spp(Integer.parseInt(txdenda.getText()));
//            if(rbsudah.isSelected()){
//                spp.setKonfirmasi("Sudah");
//                spp.setNominal_Spp(Integer.parseInt(txnominal.getText()));
//                spp.setMahasiswa(mahasiswa);
//                bank.setId_Bank(Integer.parseInt(txidbank.getText()));
//                bank.setNama_Bank(txnamabank.getText());
//            }
//        }
//        spp.setId_Spp(Integer.parseInt(txidspp.getText()));
//        spp.setMahasiswa(mahasiswa);
        
    }
    public void showTabel() throws SQLException{
        Object[] judul_kolom = {"ID SPP", "NPM", "Tanggal","Nominal", "Status"};
            DefaultTableModel tabModel=new DefaultTableModel(null,judul_kolom);
            tblsimpan.setModel(tabModel);
            
            Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohrifqi_90492","mohamad");
            Statement statement = connect.createStatement();
            tabModel.getDataVector().removeAllElements();
            ResultSet RsTabel=statement.executeQuery("SELECT * from pembayaran_spp_90492");  
            while(RsTabel.next()){
                Object[] data={
                    RsTabel.getString("Id_spp"),
                    RsTabel.getString("Npm_mahasiswa"),
//                    RsTabel.getString("Nama"),
                    RsTabel.getString("tanggal_spp"),
                    RsTabel.getString("npm90492_nominal_spp"),
                    RsTabel.getString("konfirmasi_pembayaran_spp")
//                    RsGudang.getString("CreateDate")         
                };
               tabModel.addRow(data);
        
    }
    }
//    public void showTabel(){
//        DefaultTableModel dtmTabel = new DefaultTableModel (new String[]{"Id Spp", "NPM", "Nama", "Tanggal", "Nominal", "Status"},0);
//        dtmTabel.setRowCount(0);
//        
//        for(Pembayaran_Spp_90492 m : this.arrSpp){
//            dtmTabel.addRow(new String [] {m.getId_Spp().toString(),m.getMahasiswa().getNpm_Mahasiswa().toString(),m.getMahasiswa().getNama_Mahasiswa().toString(),m.getTanggal_Spp().toString(),m.getNominal_Spp().toString(),m.getKonfirmasi().toString()});
//        }
//        this.tblsimpan.setModel(dtmTabel);
//    }
//    public void showCBBank() throws SQLException{
//        DefaultComboBoxModel dcbmBank = new DefaultComboBoxModel();
//        
//        for(Bank_90492 b : this.transaksi.getDataBank()){
//            dcbmBank.addElement(b.getNama_Bank());
//        }
//        this.cbBank.setModel(dcbmBank);
//    }
    public void btncari() throws SQLException{
        String car = txcari.getText();
        int cari =  Integer.parseInt(car);
        
        Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohrifqi_90492","mohamad");
        Statement statement = connect.createStatement();
        String sql="select a.npm_mahasiswa, a.nama_mahasiswa, a.jenis_kelamin_mahasiswa, a.alamat_mahasiswa, b.id_spp, b.tanggal_spp, b.bulan_spp, b.npm90492_nominal_spp, b.denda_spp, b.konfirmasi_pembayaran_spp, c.id_bank, c.nama_bank from mahasiswa_90492 a join pembayaran_spp_90492 b on a.npm_mahasiswa = b.npm_mahasiswa join bank_90492 c on b.id_bank = c.id_bank where a.NPM_Mahasiswa like '"+cari+"'";
        ResultSet rs=statement.executeQuery(sql);
        Boolean sudah=true;
        while(rs.next()){
            txnpm.setText(rs.getString(1));
            txnama.setText(rs.getString(2));
            txjk.setText(rs.getString(3));
            txalamat.setText(rs.getString(4));
            txidspp.setText(rs.getString(5));                    
            txtanggal.setText(rs.getString(6));
            txbulan.setText(rs.getString(7));
            txnominal.setText(rs.getString(8));
            txdenda.setText(rs.getString(9));
            txstatus.setText(rs.getString(10));
            txidbank.setText(rs.getString(11));
            txnamabank.setText(rs.getString(12));
            }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhapus1;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntambah1;
    private javax.swing.JButton btntambah2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea talog;
    private javax.swing.JTable tblsimpan;
    private javax.swing.JTextField txalamat;
    private javax.swing.JTextField txbulan;
    private javax.swing.JTextField txcari;
    private javax.swing.JTextField txdenda;
    private javax.swing.JTextField txidbank;
    private javax.swing.JTextField txidspp;
    private javax.swing.JTextField txjk;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnamabank;
    private javax.swing.JTextField txnominal;
    private javax.swing.JTextField txnpm;
    private javax.swing.JTextField txstatus;
    private javax.swing.JTextField txtanggal;
    // End of variables declaration//GEN-END:variables
}
