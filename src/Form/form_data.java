/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;
import Konfigurasi.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.util.Arrays;


public class form_data extends javax.swing.JFrame {
    
    private DefaultTableModel DftTblModel_customers;
    private DefaultTableModel DftTblModel_sellers;
    private DefaultTableModel DftTblModel_products;
    private String SQL; 
    private String CurrentId;
    
    public void TampilDataCustomer() {
        DftTblModel_customers = new DefaultTableModel();
        DftTblModel_customers.addColumn("Id");
        DftTblModel_customers.addColumn("Nama");
        DftTblModel_customers.addColumn("Email");

        Table_customer.setModel(DftTblModel_customers);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from customers";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_customers.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("name"),
                    res.getString("email"),
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void TampilDataSeller() {
	DftTblModel_sellers = new DefaultTableModel();
        DftTblModel_sellers.addColumn("Id");
        DftTblModel_sellers.addColumn("Nama");
        DftTblModel_sellers.addColumn("Email");
        DftTblModel_sellers.addColumn("Location");
        Table_seller.setModel(DftTblModel_sellers);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from sellers";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_sellers.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("name"),
                    res.getString("email"),
                    res.getString("location"),
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void TampilDataProduct() {
	DftTblModel_products = new DefaultTableModel();
        DftTblModel_products.addColumn("Id");
        DftTblModel_products.addColumn("Nama");
        DftTblModel_products.addColumn("Harga");
        DftTblModel_products.addColumn("Stock");
        Table_product.setModel(DftTblModel_products);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from products";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_products.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("name"),
                    res.getString("price"),
                    res.getString("stock"),
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Creates new form form_data
     */
    public form_data() {
        initComponents();
        this.CurrentId = "null";
        this.TampilDataCustomer();
        this.TampilDataSeller();
        this.TampilDataProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customer_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        customer_email = new javax.swing.JTextField();
        customer_simpan = new javax.swing.JButton();
        customer_edit = new javax.swing.JButton();
        customer_hapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_customer = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Seller_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Seller_email = new javax.swing.JTextField();
        Seller_simpan = new javax.swing.JButton();
        Seller_edit = new javax.swing.JButton();
        Seller_hapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_seller = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Seller_location = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Product_name = new javax.swing.JTextField();
        Product_price = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Product_stock = new javax.swing.JTextField();
        Product_simpan = new javax.swing.JButton();
        Product_edit = new javax.swing.JButton();
        Product_hapus = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_product = new javax.swing.JTable();

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

        jTabbedPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTabbedPane1PropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Daftar Data Customer");

        jLabel2.setText("Name");

        jLabel4.setText("Email");

        customer_simpan.setText("Simpan");
        customer_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_simpanActionPerformed(evt);
            }
        });

        customer_edit.setText("Edit");
        customer_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_editActionPerformed(evt);
            }
        });

        customer_hapus.setText("Hapus");
        customer_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_hapusActionPerformed(evt);
            }
        });

        Table_customer.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_customerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_customer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(customer_name)
                            .addComponent(jLabel4)
                            .addComponent(customer_email, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customer_simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customer_edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customer_hapus))
                            .addComponent(jScrollPane2))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer_simpan)
                    .addComponent(customer_edit)
                    .addComponent(customer_hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customers", jPanel1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Daftar Data Seller");

        jLabel6.setText("Name");

        jLabel8.setText("Email");

        Seller_simpan.setText("Simpan");
        Seller_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seller_simpanActionPerformed(evt);
            }
        });

        Seller_edit.setText("Edit");
        Seller_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seller_editActionPerformed(evt);
            }
        });

        Seller_hapus.setText("Hapus");
        Seller_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seller_hapusActionPerformed(evt);
            }
        });

        Table_seller.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_sellerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Table_seller);

        jLabel9.setText("Location");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(Seller_name)
                    .addComponent(jLabel8)
                    .addComponent(Seller_email, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Seller_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seller_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seller_hapus))
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel9)
                    .addComponent(Seller_location, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(319, 319, 319))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seller_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seller_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seller_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seller_simpan)
                    .addComponent(Seller_edit)
                    .addComponent(Seller_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jTabbedPane1.addTab("Sellers", jPanel2);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Daftar Data Product");

        jLabel11.setText("Name");

        jLabel12.setText("Price");

        jLabel13.setText("Stock");

        Product_simpan.setText("Simpan");
        Product_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_simpanActionPerformed(evt);
            }
        });

        Product_edit.setText("Edit");
        Product_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_editActionPerformed(evt);
            }
        });

        Product_hapus.setText("Hapus");
        Product_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_hapusActionPerformed(evt);
            }
        });

        Table_product.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_productMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Table_product);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(305, 305, 305))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Product_name)
                    .addComponent(Product_price, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(Product_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Product_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_hapus)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Product_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Product_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Product_simpan)
                    .addComponent(Product_edit)
                    .addComponent(Product_hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Products", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customer_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_simpanActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            int temp = Integer.parseInt(this.CurrentId)+1;
            String row = Integer.toString(temp);
            PreparedStatement stmt = conn.prepareStatement("insert into customers(id, name, email) values(?,?,?)");
            stmt.setString(1, row);
            stmt.setString(2, Seller_name.getText());
            stmt.setString(3, Seller_email.getText());
            stmt.executeUpdate();
            this.TampilDataSeller();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_customer_simpanActionPerformed

    private void customer_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_editActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update customers set name=?, email=? where id=?");
            stmt.setString(1, customer_name.getText());
            stmt.setString(2, customer_email.getText());
            stmt.setString(3, this.CurrentId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilDataCustomer();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_customer_editActionPerformed

    private void customer_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_hapusActionPerformed
        if(this.CurrentId == "null"){
            JOptionPane.showMessageDialog(null, "Silahkan pilih data yang ingin dihapus", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Connection conn = Koneksi.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from customers where id ='" + this.CurrentId + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
                TampilDataCustomer();
                customer_name.setText("");
                customer_email.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_customer_hapusActionPerformed

    private void Seller_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seller_simpanActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            int temp = Integer.parseInt(this.CurrentId)+1;
            String row = Integer.toString(temp);
            PreparedStatement stmt = conn.prepareStatement("insert into sellers(id, name, email, location) values(?,?,?,?)");
            stmt.setString(1, row);
            stmt.setString(2, Seller_name.getText());
            stmt.setString(3, Seller_email.getText());
            stmt.setString(4, Seller_location.getText());
            stmt.executeUpdate();
            this.TampilDataSeller();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Seller_simpanActionPerformed

    private void Seller_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seller_editActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update sellers set name=?, email=?, location=? where id=?");
            stmt.setString(1, Seller_name.getText());
            stmt.setString(2, Seller_email.getText());
            stmt.setString(3, Seller_location.getText());
            stmt.setString(4, this.CurrentId);
            stmt.executeUpdate();
            this.TampilDataSeller();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Seller_editActionPerformed

    
    private void Seller_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seller_hapusActionPerformed
        Connection conn = Koneksi.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from sellers where id ='" + this.CurrentId + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                TampilDataSeller();
                Seller_name.setText("");
                Seller_email.setText("");
                Seller_location.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Seller_hapusActionPerformed

    private void Product_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_simpanActionPerformed
         try {
            Connection conn = Koneksi.getConnection();
            int temp = Integer.parseInt(this.CurrentId)+1;
            String row = Integer.toString(temp);
            PreparedStatement stmt = conn.prepareStatement("insert into products(id, name, price, stock) values(?,?,?,?)");
            stmt.setString(1, row);
            stmt.setString(2, Product_name.getText());
            stmt.setString(3, Product_price.getText());
            stmt.setString(4, Product_stock.getText());
            stmt.executeUpdate();
            this.TampilDataProduct();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Product_simpanActionPerformed

    private void Product_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_editActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update product set nama=?, price=?, stok=? where id=?");
            stmt.setString(1, Product_name.getText());
            stmt.setString(2, Product_price.getText());
            stmt.setString(3, Product_stock.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilDataProduct();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Product_editActionPerformed

    private void Product_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_hapusActionPerformed
        // TODO add your handling code here:
        Connection conn = Koneksi.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from products where id ='" + this.CurrentId + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                TampilDataProduct();
                Product_name.setText("");
                Product_price.setText("");
                Product_stock.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Product_hapusActionPerformed

    private void jTabbedPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1PropertyChange
        this.CurrentId = "null";
    }//GEN-LAST:event_jTabbedPane1PropertyChange

    private void Table_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_productMouseClicked
        int barisP = Table_product.getSelectedRow();
        this.CurrentId = DftTblModel_products.getValueAt(barisP, 0).toString();
        Product_name.setText(DftTblModel_products.getValueAt(barisP, 0).toString());
        Product_price.setText(DftTblModel_products.getValueAt(barisP, 1).toString());
        Product_stock.setText(DftTblModel_products.getValueAt(barisP, 2).toString());
    }//GEN-LAST:event_Table_productMouseClicked

    private void Table_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_sellerMouseClicked
        int baris = Table_seller.getSelectedRow();
        this.CurrentId = DftTblModel_sellers.getValueAt(baris, 0).toString();
        Seller_name.setText(DftTblModel_sellers.getValueAt(baris, 1).toString());
        Seller_email.setText(DftTblModel_sellers.getValueAt(baris, 2).toString());
        Seller_location.setText(DftTblModel_sellers.getValueAt(baris, 3).toString());
    }//GEN-LAST:event_Table_sellerMouseClicked

    private void Table_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_customerMouseClicked
       
    }//GEN-LAST:event_Table_customerMouseClicked

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
            java.util.logging.Logger.getLogger(form_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Product_edit;
    private javax.swing.JButton Product_hapus;
    private javax.swing.JTextField Product_name;
    private javax.swing.JTextField Product_price;
    private javax.swing.JButton Product_simpan;
    private javax.swing.JTextField Product_stock;
    private javax.swing.JButton Seller_edit;
    private javax.swing.JTextField Seller_email;
    private javax.swing.JButton Seller_hapus;
    private javax.swing.JTextField Seller_location;
    private javax.swing.JTextField Seller_name;
    private javax.swing.JButton Seller_simpan;
    private javax.swing.JTable Table_customer;
    private javax.swing.JTable Table_product;
    private javax.swing.JTable Table_seller;
    private javax.swing.JButton customer_edit;
    private javax.swing.JTextField customer_email;
    private javax.swing.JButton customer_hapus;
    private javax.swing.JTextField customer_name;
    private javax.swing.JButton customer_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
