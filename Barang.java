/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class barang extends javax.swing.JFrame {
    
    public barang() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        KodeBarangValue = new javax.swing.JTextField();
        NamaBarangValue = new javax.swing.JTextField();
        SumStockValue = new javax.swing.JTextField();
        HgSatuanValue = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("DAFTAR BARANG");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Kode Barang");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jumlah Stock");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Harga Satuan");

        KodeBarangValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        KodeBarangValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KodeBarangValueActionPerformed(evt);
            }
        });

        NamaBarangValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NamaBarangValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaBarangValueActionPerformed(evt);
            }
        });

        SumStockValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SumStockValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumStockValueActionPerformed(evt);
            }
        });

        HgSatuanValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HgSatuanValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HgSatuanValueActionPerformed(evt);
            }
        });

        tableBarang.setForeground(new java.awt.Color(0, 102, 102));
        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jumlah Stock", "Harga Satuan"
            }
        ));
        jScrollPane2.setViewportView(tableBarang);

        btnCreate.setBackground(new java.awt.Color(0, 153, 153));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 153, 153));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NamaBarangValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(KodeBarangValue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SumStockValue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HgSatuanValue)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel6)))
                .addGap(246, 246, 246))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel6)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(KodeBarangValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NamaBarangValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SumStockValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(HgSatuanValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(btnUpdate))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void KodeBarangValueActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        String enteredText = KodeBarangValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                               

    private void SumStockValueActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        String enteredText = SumStockValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                             

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String kode = KodeBarangValue.getText();
        String namaBarang = NamaBarangValue.getText();
        String jumlah = SumStockValue.getText();
        String HargaSatuan = HgSatuanValue.getText();
  
        if(KodeBarangValue.getText().equals("")||NamaBarangValue.getText().equals("")||SumStockValue.getText().equals("")||HgSatuanValue.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter All Data !");
    } else {
        String data[] = {kode, namaBarang, jumlah, HargaSatuan};
        DefaultTableModel tblModel = (DefaultTableModel)tableBarang.getModel();
        tblModel.addRow(data);

        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

            // Validate if the kode_barang already exists in the database
            String checkDuplicateQuery = "SELECT COUNT(*) FROM BARANG WHERE kode_barang = ?";
            try (PreparedStatement checkDuplicateStatement = connection.prepareStatement(checkDuplicateQuery)) {
                checkDuplicateStatement.setString(1, kode);
                ResultSet resultSet = checkDuplicateStatement.executeQuery();

                if (resultSet.next() && resultSet.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Kode barang " + kode + " already exists. Please enter a different kode_barang.");
                    return; // Exit the method without inserting duplicate kode_barang
                }
            }
    
            // Insert data into BARANG table
            String insertBARANGQuery = "INSERT INTO BARANG (kode , namaBarang, jumlah, HargaSatuan) VALUES (?,?,?,?)";
            try (PreparedStatement insertBARANGStatement = connection.prepareStatement(insertBARANGQuery)) {
                insertBARANGStatement.setString(1, kode);
                insertBARANGStatement.setString(2, namaBarang);
                insertBARANGStatement.setString(3, jumlah);
                insertBARANGStatement.setString(4, HargaSatuan);
                insertBARANGStatement.executeUpdate();

                // Display a confirmation message
                JOptionPane.showMessageDialog(null, "Data has been successfully created.");
            }

        // Select specific columns to display in the table
        String selectColumnsQuery = "SELECT nama_pelanggan, kode_barang FROM NOTA; " + 
                            "SELECT harga_satuan FROM BARANG; " + 
                            "SELECT subtotal, total FROM NOTA WHERE no_nota = ?";
            try (PreparedStatement selectStatement = connection.prepareStatement(selectColumnsQuery)) {
                // Ensure 'barang' is defined and initialized before this line
                String barang = "your_value"; // replace "your_value" with the actual value
                selectStatement.setString(1, barang);
                ResultSet resultSet = selectStatement.executeQuery();

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Nama Pelanggan");
                model.addColumn("Kode Barang");
                model.addColumn("Harga Barang");
                model.addColumn("Sub Total");
                model.addColumn("Total");

                while (resultSet.next()) {
                    Object[] row = new Object[5];
                    row[0] = resultSet.getString("nama_pelanggan");
                    row[1] = resultSet.getString("kode_barang");
                    row[2] = resultSet.getString("harga_barang");
                    row[3] = resultSet.getString("subtotal");
                    row[4] = resultSet.getString("total");
                    model.addRow(row);
                }

                // Update your table component with the model data
                // For example, if you're using a JTable:
                tableBarang.setModel(model);

                resultSet.close();
            }
        // Close the connection
        connection.close();
        // Provide feedback to the user upon successful insertion
        } catch (SQLException e) {
        // Handle any potential SQL exceptions
        JOptionPane.showMessageDialog(null, "Error creating transaction: " + e.getMessage());
        e.printStackTrace();
        }
        }
    }                                         

    private void NamaBarangValueActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        String enteredText = NamaBarangValue.getText();
            if (!enteredText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter some text!");
            }
    }                                               

    private void HgSatuanValueActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        String enteredText = HgSatuanValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                             

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        KodeBarangValue.setText("");
        NamaBarangValue.setText("");
        SumStockValue.setText("");
        HgSatuanValue.setText("");
    }                                        

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
               String kodeBarang = KodeBarangValue.getText(); // Ambil kode barang dari kolom input

        if (!kodeBarang.isEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data untuk kode barang " + kodeBarang + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Establish database connection
                    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

                    // Delete data from BARANG table based on the provided Kode Barang
                    String deleteBARANGQuery = "DELETE FROM BARANG WHERE kode_barang = ?";
                    try (PreparedStatement deleteBARANGStatement = connection.prepareStatement(deleteBARANGQuery)) {
                        deleteBARANGStatement.setString(1, kodeBarang);
                        int deletedRows = deleteBARANGStatement.executeUpdate();

                        // Check if any rows were deleted
                        if (deletedRows > 0) {
                            JOptionPane.showMessageDialog(null, "Data untuk kode barang " + kodeBarang + " telah dihapus dari tabel BARANG.");
                            // Optionally, perform any additional actions after successful deletion.
                        } else {
                            JOptionPane.showMessageDialog(null, "Data untuk kode barang " + kodeBarang + " tidak ditemukan di tabel BARANG.");
                            // Optionally, provide feedback if the data was not found for deletion.
                        }
                    }
                    
                    // Close the connection
                    connection.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error deleting data: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Masukkan kode barang yang ingin dihapus.");
        }
    }                                         

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int selectedRowIndex = tableBarang.getSelectedRow();

    if (selectedRowIndex != -1) {
        // Get the data from the text fields
        String kode = KodeBarangValue.getText();
        String namaBarang = NamaBarangValue.getText();
        String jumlah = SumStockValue.getText();
        String HargaSatuan = HgSatuanValue.getText();

        // Update the table model
        DefaultTableModel tblModel = (DefaultTableModel)tableBarang.getModel();
        tblModel.setValueAt(kode, selectedRowIndex, 0);
        tblModel.setValueAt(namaBarang, selectedRowIndex, 1);
        tblModel.setValueAt(jumlah, selectedRowIndex, 2);
        tblModel.setValueAt(HargaSatuan, selectedRowIndex, 3);

        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

            // Update data in Barang table
            String updateBARANGQuery = "UPDATE BARANG SET namaBarang = ?, jumlah = ?, HargaSatuan = ? WHERE kode = ?";
            try (PreparedStatement updateBARANGStatement = connection.prepareStatement(updateBARANGQuery)) {
                updateBARANGStatement.setString(1, namaBarang);
                updateBARANGStatement.setString(2, jumlah);
                updateBARANGStatement.setString(3, HargaSatuan);
                updateBARANGStatement.setString(4, kode);
                updateBARANGStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data has been successfully updated.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to update!");
    }
    }                                         

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.setVisible(false);
    
        // Membuat dan menampilkan frame sebelumnya
        login login = new login();
        login.setVisible(true);
    }                                       

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
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField HgSatuanValue;
    private javax.swing.JTextField KodeBarangValue;
    private javax.swing.JTextField NamaBarangValue;
    private javax.swing.JTextField SumStockValue;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableBarang;
    // End of variables declaration                   
}
