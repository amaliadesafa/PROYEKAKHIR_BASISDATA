package projek;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class transaksi extends javax.swing.JFrame {

    public transaksi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        searchValue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pegawaiValue = new javax.swing.JTextField();
        notaValue = new javax.swing.JTextField();
        sepedaValue = new javax.swing.JTextField();
        polisiValue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        masukValue = new javax.swing.JTextField();
        keluarValue = new javax.swing.JTextField();
        namaValue = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        kodeValue = new javax.swing.JTextField();
        hargaValue = new javax.swing.JTextField();
        jumlahValue = new javax.swing.JTextField();
        subValue = new javax.swing.JTextField();
        totalValue = new javax.swing.JTextField();
        uangMukaValue = new javax.swing.JTextField();
        sisaValue = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        barangValue = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(16, 32767));
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        searchValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchValueActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Pegawai");

        jLabel2.setText("No. Nota");

        jLabel3.setText("Jenis Sepeda");

        jLabel4.setText("Nomor Polisi");

        pegawaiValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawaiValueActionPerformed(evt);
            }
        });

        notaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaValueActionPerformed(evt);
            }
        });

        sepedaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepedaValueActionPerformed(evt);
            }
        });

        polisiValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polisiValueActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal Masuk");

        jLabel6.setText("Tanggal Keluar");

        jLabel7.setText("Nama Pelanggan");

        masukValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukValueActionPerformed(evt);
            }
        });

        keluarValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarValueActionPerformed(evt);
            }
        });

        namaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaValueActionPerformed(evt);
            }
        });

        jLabel9.setText("Kode Barang");

        jLabel10.setText("Harga Barang");

        jLabel11.setText("Jumlah Barang");

        jLabel12.setText("Sub Total");

        jLabel13.setText("Total");

        jLabel14.setText("Uang Muka");

        jLabel15.setText("Sisa");

        btnCreate.setBackground(new java.awt.Color(0, 153, 153));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
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

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        kodeValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeValueActionPerformed(evt);
            }
        });

        hargaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaValueActionPerformed(evt);
            }
        });

        jumlahValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahValueActionPerformed(evt);
            }
        });

        subValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subValueActionPerformed(evt);
            }
        });

        totalValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalValueActionPerformed(evt);
            }
        });

        uangMukaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangMukaValueActionPerformed(evt);
            }
        });

        sisaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisaValueActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Pelanggan", "Kode Barang" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Nama Barang");

        barangValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangValueActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Pelanggan", "Kode Barang", "Harga Barang", "Sub Total", "Total"
            }
        ));
        jScrollPane2.setViewportView(table);

        jScrollPane3.setViewportView(jScrollPane2);

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(10, 10, 10)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pegawaiValue, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(notaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sepedaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(polisiValue, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(117, 117, 117)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(keluarValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(masukValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel11))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jumlahValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(barangValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(namaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel15))
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(uangMukaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sisaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subValue, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(372, 372, 372)))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pegawaiValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(keluarValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(notaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(masukValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sepedaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(kodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(barangValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(polisiValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jumlahValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(hargaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(uangMukaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sisaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(totalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(subValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)))))
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void barangValueActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String enteredText = barangValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                           

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String selectedOption = jComboBox1.getSelectedItem().toString();

        if (selectedOption.equals("Nama Pelanggan")) {
            String namaPelanggan = searchValue.getText(); // Ambil teks pencarian
            cariDanTampilkanDataPelanggan(namaPelanggan); // Method untuk mencari dan menampilkan data pelanggan
        } else if (selectedOption.equals("Kode Barang")) {
            String kodeBarang = searchValue.getText(); // Ambil teks pencarian
            cariDanTampilkanDataBarang(kodeBarang); // Method untuk mencari dan menampilkan data barang
        }
        }

        // Method untuk mencari dan menampilkan data pelanggan sesuai dengan nama pelanggan yang dicari
        private void cariDanTampilkanDataPelanggan(String namaPelanggan) {
            // Lakukan kueri ke database untuk mencari data pelanggan berdasarkan nama pelanggan
            // Gunakan hasil kueri untuk mengisi tabel dengan data yang ditemukan
            // Gunakan DefaultTableModel untuk mengatur data yang ditemukan ke dalam tabel
            DefaultTableModel model = (DefaultTableModel) table.getModel(); // Ganti 'namaTabel' dengan nama tabel Anda

            // Hapus semua baris yang ada di tabel sebelum menambahkan data hasil pencarian
            model.setRowCount(0);

            try {
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

                String query = "SELECT * FROM PELANGGAN WHERE nama_pelanggan LIKE '%" + namaPelanggan + "%'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                // Loop melalui hasil pencarian dan tambahkan data ke dalam tabel
                while (resultSet.next()) {
                    String nama = resultSet.getString("nama_pelanggan");
                    String telepon = resultSet.getString("telepon_pelanggan");
                    //String kode = resultSet.getString("kode_barang")

                    // Tambahkan baris baru ke tabel untuk setiap entri yang ditemukan
                    model.addRow(new Object[]{nama, telepon});
                }

                connection.close();
            } catch (SQLException e) {
                // Tangani kesalahan SQL jika terjadi
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }

        // Method untuk mencari dan menampilkan data barang sesuai dengan kode barang yang dicari
        private void cariDanTampilkanDataBarang(String kodeBarang) {
            // Lakukan kueri ke database untuk mencari data barang berdasarkan kode barang
            // Gunakan hasil kueri untuk mengisi tabel dengan data yang ditemukan
            // Gunakan DefaultTableModel untuk mengatur data yang ditemukan ke dalam tabel
            DefaultTableModel model = (DefaultTableModel) table.getModel(); // Ganti 'namaTabel' dengan nama tabel Anda

            // Hapus semua baris yang ada di tabel sebelum menambahkan data hasil pencarian
            model.setRowCount(0);

            try {
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

                String query = "SELECT * FROM BARANG WHERE kode_barang LIKE '%" + kodeBarang + "%'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                // Loop melalui hasil pencarian dan tambahkan data ke dalam tabel
                while (resultSet.next()) {
                    String kode = resultSet.getString("kode_barang");
                    String namaBarang = resultSet.getString("nama_barang");
                    String stok = resultSet.getString("stok_barang");
                    String harga = resultSet.getString("harga_satuan");

                    // Tambahkan baris baru ke tabel untuk setiap entri yang ditemukan
                    model.addRow(new Object[]{kode, namaBarang, stok, harga});
                }

                connection.close();
            } catch (SQLException e) {
                // Tangani kesalahan SQL jika terjadi
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
    }                                          

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String input = searchValue.getText();
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tblModel);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(input));
    }                                         

    private void sisaValueActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String enteredText = sisaValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                         

    private void uangMukaValueActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String enteredText = uangMukaValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                             

    private void totalValueActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String enteredText = totalValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                          

    private void subValueActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String enteredText = subValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                        

    private void jumlahValueActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String enteredText = jumlahValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                           

    private void hargaValueActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String enteredText = hargaValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                          

    private void kodeValueActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String enteredText = kodeValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                         

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int selectedRowIndex = table.getSelectedRow();

        if (selectedRowIndex != -1) {
            String kodeBarang = (String) table.getValueAt(selectedRowIndex, 1); // Ambil kode barang dari baris yang dipilih

            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete data for item code " + kodeBarang + "?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Establish database connection
                    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

                    // Delete data from TRANSAKSI table based on the provided Kode Barang
                    String deleteTRANSAKSIQuery = "DELETE FROM TRANSAKSI WHERE kode_barang = ?";
                    try (PreparedStatement deleteTRANSAKSIStatement = connection.prepareStatement(deleteTRANSAKSIQuery)) {
                        deleteTRANSAKSIStatement.setString(1, kodeBarang);
                        int deletedRows = deleteTRANSAKSIStatement.executeUpdate();

                        // Check if any rows were deleted
                        if (deletedRows > 0) {
                            JOptionPane.showMessageDialog(null, "Data for item code " + kodeBarang + " has been deleted from the TRANSAKSI table.");
                            // Optionally, perform any additional actions after successful deletion.
                        } else {
                            JOptionPane.showMessageDialog(null, "Data for item code " + kodeBarang + " was not found in the TRANSAKSI table.");
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
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }                                         

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        masukValue.setText("");
        keluarValue.setText("");
        namaValue.setText("");
        //teleponValue.setText("");
        pegawaiValue.setText("");
        notaValue.setText("");
        sepedaValue.setText("");
        polisiValue.setText("");
        kodeValue.setText("");
        hargaValue.setText("");
        jumlahValue.setText("");
        subValue.setText("");
        totalValue.setText("");
        uangMukaValue.setText("");
        sisaValue.setText("");
        barangValue.setText("");
    }                                        

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {                                          
    String masuk = masukValue.getText();
    String keluar = keluarValue.getText();
    String nama = namaValue.getText();
    String pegawai = pegawaiValue.getText();
    String nota = notaValue.getText();
    String sepeda = sepedaValue.getText();
    String polisi = polisiValue.getText();
    String kode = kodeValue.getText();
    String harga = hargaValue.getText();
    String jumlah = jumlahValue.getText();
    String sub = subValue.getText();
    String total = totalValue.getText();
    String uang = uangMukaValue.getText();
    String sisa = sisaValue.getText();
    String barang = barangValue.getText();
    
        if(masukValue.getText().equals("")||keluarValue.getText().equals("")||namaValue.getText().equals("")||pegawaiValue.getText().equals("")||notaValue.getText().equals("")||sepedaValue.getText().equals("")||polisiValue.getText().equals("")||kodeValue.getText().equals("")||hargaValue.getText().equals("")||jumlahValue.getText().equals("")||subValue.getText().equals("")||totalValue.getText().equals("")||uangMukaValue.getText().equals("")||sisaValue.getText().equals("")||barangValue.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter All Data !");
        } else {
        String data[] = {nama,kode, harga, sub, total};
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        tblModel.addRow(data);
        
        JOptionPane.showMessageDialog(this, "Add Data Successfully...!!");
        masukValue.setText("");
        keluarValue.setText("");
        namaValue.setText("");
        pegawaiValue.setText("");
        notaValue.setText("");
        sepedaValue.setText("");
        polisiValue.setText("");
        kodeValue.setText("");
        hargaValue.setText("");
        jumlahValue.setText("");
        subValue.setText("");
        totalValue.setText("");
        uangMukaValue.setText("");
        sisaValue.setText("");
        barangValue.setText("");
    }
    try {
        // Establish database connection
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

        // Validate if the kode_barang already exists in the database
        String checkDuplicateQuery = "SELECT COUNT(*) FROM BARANG WHERE kode_barang = ?";
        try (PreparedStatement checkDuplicateStatement = connection.prepareStatement(checkDuplicateQuery)) {
            checkDuplicateStatement.setString(1, kode);
            ResultSet resultSet = checkDuplicateStatement.executeQuery();

//            if (resultSet.next() && resultSet.getInt(1) > 0) {
//                JOptionPane.showMessageDialog(null, "Kode barang " + kode + " already exists. Please enter a different kode_barang.");
//                return; // Exit the method without inserting duplicate kode_barang
//            }
        }
        // Check if nama_pelanggan exists in PELANGGAN table
        String checkPelangganQuery = "SELECT COUNT(*) FROM PELANGGAN WHERE nama_pelanggan = ?";
        try (PreparedStatement checkPelangganStatement = connection.prepareStatement(checkPelangganQuery)) {
            checkPelangganStatement.setString(1, nama);
            ResultSet resultSet = checkPelangganStatement.executeQuery();

//            if (resultSet.next() && resultSet.getInt(1) == 0) {
//                JOptionPane.showMessageDialog(null, "Nama pelanggan " + nama + " does not exist in PELANGGAN table. Please enter a valid nama_pelanggan.");
//                return; // Exit the method without inserting into NOTA
//            }
        }
        
        // Insert data into NOTA table
        String insertNOTAQuery = "INSERT INTO NOTA (no_nota, tanggal_masuk, tanggal_keluar, jenis_sepeda, nomor_polisi, nama_pelanggan, nama_toko, nama_pegawai, subtotal, total, kode_barang, nama_barang) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement insertNOTAStatement = connection.prepareStatement(insertNOTAQuery)) {
            insertNOTAStatement.setString(1, nota);
            insertNOTAStatement.setString(2, masuk);
            insertNOTAStatement.setString(3, keluar);
            insertNOTAStatement.setString(4, sepeda);
            insertNOTAStatement.setString(5, polisi);
            insertNOTAStatement.setString(6, nama);
            insertNOTAStatement.setString(7, "Toko Gayang Marem");
            insertNOTAStatement.setString(8, pegawai);
            insertNOTAStatement.setString(9, sub);
            insertNOTAStatement.setString(10, total);
            insertNOTAStatement.setString(11, kode);
            insertNOTAStatement.setString(12, barang); // Assuming 'barang' is the variable for 'nama_barang'
            insertNOTAStatement.executeUpdate();
        }

        // Insert data into BARANG table
        String insertBARANGQuery = "INSERT INTO BARANG (kode_barang, nama_barang, stok_barang, harga_satuan) VALUES (?, ?, ?, ?)";
        try (PreparedStatement insertBARANGStatement = connection.prepareStatement(insertBARANGQuery)) {
            insertBARANGStatement.setString(1, kode);
            insertBARANGStatement.setString(2, barang);
            insertBARANGStatement.setString(3, jumlah);
            insertBARANGStatement.setString(4, harga);
            insertBARANGStatement.executeUpdate();
        }

        // Select specific columns to display in the table
        String selectColumnsQuery = "SELECT nama_pelanggan, kode_barang FROM NOTA; " + 
                                    "SELECT harga_satuan FROM BARANG; " + 
                                    "SELECT subtotal, total FROM NOTA WHERE no_nota = ?";
        try (PreparedStatement selectStatement = connection.prepareStatement(selectColumnsQuery)) {
            selectStatement.setString(1, nota);
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
            table.setModel(model);

            resultSet.close();
        }

        // Close the connection
        connection.close();

        } catch (SQLException e) {
        // Handle any potential SQL exceptions
        JOptionPane.showMessageDialog(null, "Error creating transaction: " + e.getMessage());
        e.printStackTrace();
        }
    }                                         

    private void namaValueActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String enteredText = namaValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                         

    private void keluarValueActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String enteredText = keluarValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                           

    private void masukValueActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String enteredText = masukValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                          

    private void polisiValueActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String enteredText = btnUpdate.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                           

    private void sepedaValueActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String enteredText = sepedaValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                           

    private void notaValueActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String enteredText = notaValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                         

    private void pegawaiValueActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String enteredText = pegawaiValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                            

    private void searchValueActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String enteredText = searchValue.getText();
        if (!enteredText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entered text: " + enteredText);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter some text!");
        }
    }                                           

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();

        if (selectedRowIndex != -1) {
            // Get the data from the text fields
            String masuk = masukValue.getText();
            String keluar = keluarValue.getText();
            String nama = namaValue.getText();
            String pegawai = pegawaiValue.getText();
            String nota = notaValue.getText();
            String sepeda = sepedaValue.getText();
            String polisi = polisiValue.getText();
            String kode = kodeValue.getText();
            String harga = hargaValue.getText();
            String jumlah = jumlahValue.getText();
            String sub = subValue.getText();
            String total = totalValue.getText();
            String uang = uangMukaValue.getText();
            String sisa = sisaValue.getText();
            String barang = barangValue.getText();

            // Update the table model
            DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
            tblModel.setValueAt(nama, selectedRowIndex, 0);
            tblModel.setValueAt(kode, selectedRowIndex, 1);
            tblModel.setValueAt(harga, selectedRowIndex, 2);
            tblModel.setValueAt(sub, selectedRowIndex, 3);
            tblModel.setValueAt(total, selectedRowIndex, 4);
            JOptionPane.showMessageDialog(null, "Data has been successfully updated.");

            try {
                // Establish database connection
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BENGKEL;encrypt=true;trustServerCertificate=true", "sa", "12345678");

                // Update data in Barang table
                String updateBARANGQuery = "UPDATE BARANG SET nama_barang = ?, jumlah = ?, harga_satuan = ? WHERE kode_barang = ?";
                try (PreparedStatement updateBARANGStatement = connection.prepareStatement(updateBARANGQuery)) {
                    updateBARANGStatement.setString(1, barang);
                    updateBARANGStatement.setString(2, jumlah);
                    updateBARANGStatement.setString(3, harga);
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
        String url = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=BENGKEL";
        String user = "sa";
        String password = "12345678";

        try {
            // Attempt to establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);
             System.out.println("Connection successful!");


            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions that may occur during the connection attempt
            System.err.println("Connection failed. Error message: " + e.getMessage());
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField barangValue;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JTextField hargaValue;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlahValue;
    private javax.swing.JTextField keluarValue;
    private javax.swing.JTextField kodeValue;
    private javax.swing.JTextField masukValue;
    private javax.swing.JTextField namaValue;
    private javax.swing.JTextField notaValue;
    private javax.swing.JTextField pegawaiValue;
    private javax.swing.JTextField polisiValue;
    private javax.swing.JTextField searchValue;
    private javax.swing.JTextField sepedaValue;
    private javax.swing.JTextField sisaValue;
    private javax.swing.JTextField subValue;
    private javax.swing.JTable table;
    private javax.swing.JTextField totalValue;
    private javax.swing.JTextField uangMukaValue;
    // End of variables declaration                   
}
