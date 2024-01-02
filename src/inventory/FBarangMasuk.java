/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import database.InventoryDB;
import java.text.SimpleDateFormat;
import java.util.Objects;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author indak
 */
public class FBarangMasuk extends javax.swing.JFrame {

    private Connection conn;
    private ResultSet rs;
    DefaultTableModel model = new DefaultTableModel();
    InventoryDB ks = new InventoryDB();

    /**
     * Creates new form FormMhs
     */
    public FBarangMasuk() {
        initComponents();

        model = new DefaultTableModel();
        tblBarangMasuk.setModel(model);
        model.addColumn("Kode Transaksi");
        model.addColumn("Nama Barang");
        model.addColumn("Supplier");
        model.addColumn("Jumlah");
        model.addColumn("Tanggal");
        loadDatabase();
        bersih();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarangMasuk = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKodeTransaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();
        spinnerJumlah = new javax.swing.JSpinner();
        cbBarang = new javax.swing.JComboBox<>();
        cbSupplier = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dateTanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barang Masuk");

        tblBarangMasuk.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBarangMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMasukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarangMasuk);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Barang Masuk");

        jLabel2.setText("Kode Transaksi");

        txtKodeTransaksi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtKodeTransaksiCaretUpdate(evt);
            }
        });

        jLabel3.setText("Barang");

        jLabel4.setText("Supplier");

        jLabel5.setText("Jumlah");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        cbBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Tanggal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(btnSimpan)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTutup))
                                    .addComponent(spinnerJumlah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKodeTransaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(cbBarang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbSupplier, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(spinnerJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtKodeTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(dateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnTutup)
                    .addComponent(btnHapus))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBarangMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMasukMouseClicked
        int selectedRow = tblBarangMasuk.getSelectedRow();

        if (selectedRow != -1) {
            try {
                String transactionCode = tblBarangMasuk.getValueAt(selectedRow, 0).toString();
                String productName = tblBarangMasuk.getValueAt(selectedRow, 1).toString();
                String supplierName = tblBarangMasuk.getValueAt(selectedRow, 2).toString();
                String amountStr = tblBarangMasuk.getValueAt(selectedRow, 3).toString();
                String dateString = tblBarangMasuk.getValueAt(selectedRow, 4).toString();

                // Assuming the product code and supplier code are at the beginning of the string
                String productCode = productName.split(" - ")[0];
                String supplierCode = supplierName.split(" - ")[0];

                int amount = Integer.parseInt(amountStr);

                // Set values to your UI components accordingly
                txtKodeTransaksi.setText(transactionCode);
                cbBarang.setSelectedItem(productName);
                cbSupplier.setSelectedItem(supplierName);
                spinnerJumlah.setValue(amount);

                // Parsing the date string to a java.util.Date object if needed
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = dateFormat.parse(dateString);
                dateTanggal.setDate(date);

                JOptionPane.showMessageDialog(this, "Data berhasil ditampilkan");
            } catch (Exception e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(this, "Gagal menampilkan data");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih baris terlebih dahulu");
        }
    }//GEN-LAST:event_tblBarangMasukMouseClicked

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String code = this.txtKodeTransaksi.getText();

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data dengan kode " + code + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection c = InventoryDB.getKoneksi();
                String sql = "DELETE FROM products WHERE code = ?";

                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, code);
                p.executeUpdate();
                p.close();

                JOptionPane.showMessageDialog(this, "Berhasil menghapus data dengan kode " + code);
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(this, "Gagal menghapus data");
            } finally {
                loadDatabase();
                bersih();
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String code = txtKodeTransaksi.getText();
        String selectedProductString = Objects.toString(cbBarang.getSelectedItem(), "");
        String selectedSupplierString = Objects.toString(cbSupplier.getSelectedItem(), "");
        java.util.Date selectedDate = dateTanggal.getDate();

        if (code.isEmpty() || selectedProductString.isEmpty() || selectedSupplierString.isEmpty() || selectedProductString == "- Pilih Barang -" || selectedSupplierString == "- Pilih Supplier -" || selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Kode transaksi, barang, supplier, dan tanggal wajib diisi");
        } else {
            String selectedProductCode = selectedProductString.split(" - ")[0];
            String selectedSupplierCode = selectedSupplierString.split(" - ")[0];

            SimpleDateFormat sqlDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = sqlDateFormat.format(selectedDate);

            SpinnerNumberModel jumlahModel = (SpinnerNumberModel) spinnerJumlah.getModel();
            int amount = jumlahModel.getNumber().intValue();

            try {
                Connection c = InventoryDB.getKoneksi();

                // Get product_id from products table using code
                String getProductIDQuery = "SELECT id FROM products WHERE code = ?";
                PreparedStatement getProductIDStmt = c.prepareStatement(getProductIDQuery);
                getProductIDStmt.setString(1, selectedProductCode);
                ResultSet productIDResult = getProductIDStmt.executeQuery();

                int productID = -1;
                if (productIDResult.next()) {
                    productID = productIDResult.getInt("id");
                }

                // Get supplier_id from suppliers table using code
                String getSupplierIDQuery = "SELECT id FROM suppliers WHERE code = ?";
                PreparedStatement getSupplierIDStmt = c.prepareStatement(getSupplierIDQuery);
                getSupplierIDStmt.setString(1, selectedSupplierCode);
                ResultSet supplierIDResult = getSupplierIDStmt.executeQuery();

                int supplierID = -1;
                if (supplierIDResult.next()) {
                    supplierID = supplierIDResult.getInt("id");
                }

                // Check if the transaction code exists in the transactions table
                String checkIfExistsQuery = "SELECT COUNT(*) FROM transactions WHERE code = ?";
                PreparedStatement checkIfExistsStmt = c.prepareStatement(checkIfExistsQuery);
                checkIfExistsStmt.setString(1, code);
                ResultSet rs = checkIfExistsStmt.executeQuery();

                if (rs.next() && rs.getInt(1) > 0) {
                    int confirmUpdate = JOptionPane.showConfirmDialog(this, "Apakah Anda ingin melakukan update transaksi dengan kode " + code + "?", "Konfirmasi Update", JOptionPane.YES_NO_OPTION);

                    if (confirmUpdate == JOptionPane.YES_OPTION) {
                        // If the code exists, perform an update operation
                        String updateQuery = "UPDATE transactions SET product_id = ?, supplier_id = ?, date = ?, amount = ? WHERE code = ?";
                        PreparedStatement updateStmt = c.prepareStatement(updateQuery);
                        updateStmt.setInt(1, productID);
                        updateStmt.setInt(2, supplierID);
                        updateStmt.setString(3, formattedDate);
                        updateStmt.setInt(4, amount);
                        updateStmt.setString(5, code);
                        updateStmt.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Berhasil diubah");
                    } else {
                        JOptionPane.showMessageDialog(this, "Update dibatalkan");
                    }
                } else {
                    // If the code does not exist, perform an insert operation
                    String insertQuery = "INSERT INTO transactions (code, product_id, supplier_id, date, amount, type) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement insertStmt = c.prepareStatement(insertQuery);
                    insertStmt.setString(1, code);
                    insertStmt.setInt(2, productID);
                    insertStmt.setInt(3, supplierID);
                    insertStmt.setString(4, formattedDate);
                    insertStmt.setInt(5, amount);
                    insertStmt.setString(6, "In");
                    insertStmt.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Data transaksi berhasil ditambahkan");
                }

                loadDatabase();
                bersih();
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(this, "Gagal memproses data transaksi");
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtKodeTransaksiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtKodeTransaksiCaretUpdate
        try {
            Connection c = InventoryDB.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT t.code AS transaction_code, CONCAT(p.code, ' - ', p.name) AS product_info, CONCAT(s.code, ' - ', s.name) AS supplier_info, t.amount, t.type, t.date "
                    + "FROM transactions t "
                    + "LEFT JOIN products p ON t.product_id = p.id "
                    + "LEFT JOIN suppliers s ON t.supplier_id = s.id "
                    + "WHERE t.code = '" + this.txtKodeTransaksi.getText() + "'";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                // Get the transaction type
                String transactionType = r.getString("type");

                if (!transactionType.equals("In")) {
                    JOptionPane.showMessageDialog(this, "Transaksi dengan kode " + r.getString("transaction_code") + " bukan transaksi barang masuk");
                    // Do additional handling or actions based on the specific requirements for non-in transactions
                } else {
                    // Set values if it's an 'Out' transaction
                    String product = r.getString("product_info");
                    String supplier = r.getString("supplier_info");
                    this.cbBarang.setSelectedItem(product);
                    this.cbSupplier.setSelectedItem(supplier);
                    this.spinnerJumlah.setValue(r.getInt("amount"));

                    // If there's a JDateChooser named dateTanggal in your UI
                    java.sql.Date sqlDate = r.getDate("date");
                    java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
                    dateTanggal.setDate(utilDate);
                }
            }

            r.close();
            s.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_txtKodeTransaksiCaretUpdate

    public void loadDatabase() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = InventoryDB.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT t.code AS transaction_code, p.name AS product_name, s.name AS supplier_name, t.amount, t.date "
                    + "FROM transactions t "
                    + "LEFT JOIN products p ON t.product_id = p.id "
                    + "LEFT JOIN suppliers s ON t.supplier_id = s.id "
                    + "WHERE t.type = 'In'"; // Hanya transaksi barang masuk ('In')
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("transaction_code");
                o[1] = r.getString("product_name");
                o[2] = r.getString("supplier_name");
                o[3] = r.getInt("amount");
                o[4] = r.getString("date");

                model.addRow(o);
            }

            r.close();
            s.close();
        } catch (SQLException e) {
            System.err.println(e);
        }

        try {
            Connection c = InventoryDB.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT code, name FROM products";
            ResultSet r = s.executeQuery(sql);

            // Clean the combo box
            cbBarang.removeAllItems();
            cbBarang.addItem("- Pilih Barang -");

            // Enter the results of the query into the combo box
            while (r.next()) {
                String code = r.getString("code");
                String name = r.getString("name");
                cbBarang.addItem(code + " - " + name); // Add to combo box
            }

            // Close connection and statement
            r.close();
            s.close();
        } catch (SQLException e) {
            // Handle errors if any
            e.printStackTrace();
        }

        try {
            Connection c = InventoryDB.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT code, name FROM suppliers";
            ResultSet r = s.executeQuery(sql);

            // Clean the combo box
            cbSupplier.removeAllItems();
            cbSupplier.addItem("- Pilih Supplier -");

            // Enter the results of the query into the combo box
            while (r.next()) {
                String code = r.getString("code");
                String name = r.getString("name");
                cbSupplier.addItem(code + " - " + name); // Add to combo box
            }

            // Tutup koneksi dan statement
            r.close();
            s.close();
        } catch (SQLException e) {
            // Tangani kesalahan jika ada
            e.printStackTrace();
        }
    }

    public void bersih() {
        txtKodeTransaksi.requestFocus();
        txtKodeTransaksi.setText("");
        cbBarang.setSelectedItem("- Pilih Barang -");
        cbSupplier.setSelectedItem("- Pilih Supplier -");
        spinnerJumlah.setValue(0);
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
            java.util.logging.Logger.getLogger(FBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FBarangMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTutup;
    private javax.swing.JComboBox<String> cbBarang;
    private javax.swing.JComboBox<String> cbSupplier;
    private com.toedter.calendar.JDateChooser dateTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerJumlah;
    private javax.swing.JTable tblBarangMasuk;
    private javax.swing.JTextField txtKodeTransaksi;
    // End of variables declaration//GEN-END:variables
}
