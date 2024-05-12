
package loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customers extends javax.swing.JFrame {
    // Define column names for the data to be displayed in a table 
    String[] columnNames = {"ID", "Customer Name", "Email", "Phone", "Gender"};
    DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
    
    public Customers() {
        
        initComponents();

        refreshTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        lbl_customerName = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_phone = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        jRadioButton_female = new javax.swing.JRadioButton();
        jRadioButton_male = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_add = new javax.swing.JMenuItem();
        jMenuItem_update = new javax.swing.JMenuItem();
        jMenuItem_delete = new javax.swing.JMenuItem();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Customer Name", "Email", "Phone", "Gender"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        lbl_customerName.setForeground(new java.awt.Color(0, 0, 0));
        lbl_customerName.setText("Customer Name :");

        label_email.setForeground(new java.awt.Color(0, 0, 0));
        label_email.setText("Email : ");

        label_phone.setForeground(new java.awt.Color(0, 0, 0));
        label_phone.setText("Phone :");

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("If you want to edit something, click on the Edit menu");

        lbl_gender.setForeground(new java.awt.Color(0, 0, 0));
        lbl_gender.setText("Gender :");

        buttonGroup1.add(jRadioButton_female);
        jRadioButton_female.setText("Female");

        buttonGroup1.add(jRadioButton_male);
        jRadioButton_male.setText("Male");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(label_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_customerName)
                        .addGap(48, 48, 48)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_gender)
                        .addGap(75, 75, 75)
                        .addComponent(jRadioButton_female)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton_male)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_customerName)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_email)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_phone)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_gender)
                        .addComponent(jRadioButton_female))
                    .addComponent(jRadioButton_male))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\employees_2911076.png")); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 153));

        jMenu2.setText("Edit");

        jMenuItem_add.setText("Add");
        jMenuItem_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_add);

        jMenuItem_update.setText("Update");
        jMenuItem_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_updateActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_update);

        jMenuItem_delete.setText("Delete");
        jMenuItem_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_deleteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_delete);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        HomePage hpage = new HomePage();
        hpage.setVisible(true); 
    }//GEN-LAST:event_btn_backActionPerformed
int key =0; // define a variable 'key' to hold an identifier value
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
          // Get the index of the selected row in the jTable
        int myIndex = jTable.getSelectedRow();
        // Retrieve the value from the first column (Id)
        key = Integer.valueOf(tableModel.getValueAt(myIndex, 0).toString());
        // Populate text fields with data from the selected row
        txt_name.setText(tableModel.getValueAt(myIndex, 1).toString());
        txt_email.setText(tableModel.getValueAt(myIndex, 2).toString());
        txt_phone.setText(tableModel.getValueAt(myIndex, 3).toString());
    }//GEN-LAST:event_jTableMouseClicked

    private void jMenuItem_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_deleteActionPerformed
        // Check if a customer is selected
        if(key == 0){
           JOptionPane.showMessageDialog(rootPane, "select a customer .");
       } else{
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
           
            String sql = "DELETE FROM customers  WHERE id="+key;
            Statement Delete = con.createStatement();
            Delete.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Customer Deleted.");
            txt_name.setText("");
            txt_email.setText("");
            txt_phone.setText("");
            refreshTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }}
    }//GEN-LAST:event_jMenuItem_deleteActionPerformed

    private void jMenuItem_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            String customerName = txt_name.getText();
            String email = txt_email.getText();
            String phone = txt_phone.getText();
            
            String SelectedGender = "";
              if (jRadioButton_male.isSelected()) {
                  SelectedGender = "Male";
                } else if (jRadioButton_female.isSelected()) {
                 SelectedGender = "Female";
                }
            Statement stm = con.createStatement();
           
            //Regular Expretion for email and phone
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            String phoneRegex = "^05.*";
            
            boolean isValidEmail = email.matches(emailRegex);
            boolean isValidPhone = phone.matches(phoneRegex);
            boolean isValidFields = !email.isEmpty() && !phone.isEmpty();
           if (!isValidFields) {
               JOptionPane.showMessageDialog(rootPane, "Please fill in all fields.");
           } else if (!isValidEmail) {
           JOptionPane.showMessageDialog(rootPane, "Email is not valid");
           } else if (!isValidPhone) {
           JOptionPane.showMessageDialog(rootPane, "phone number is not valid"); 
      
           }else{ 
            String sql = "INSERT INTO customers (name, email, phone,gender) VALUES"
                    + "('" + customerName + "','" + email + "','" + phone + "','" + SelectedGender + "')";

            int rowsAffected = stm.executeUpdate(sql);

          
             if(rowsAffected > 0){
                refreshTable();
               JOptionPane.showMessageDialog(rootPane, "customer added successfully");
                txt_name.setText("");
                txt_email.setText("");
                txt_phone.setText("");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Failed to add customer!.");
            }
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jMenuItem_addActionPerformed

    private void jMenuItem_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_updateActionPerformed
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            String customerName = txt_name.getText();
            String email = txt_email.getText();
            String phone = txt_phone.getText();
           
            //  update customer information based on their 'id'
            String sql = "UPDATE customers SET name=?, email=?, phone=? WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            // Set parameters for the PreparedStatement
            pst.setInt(4, key);   // Set the 'id' parameter for the WHERE clause
            pst.setString(1, customerName); // Set the 'name' parameter
            pst.setString(2, email); // Set the 'email' parameter
            pst.setString(3, phone); // Set the 'phone' parameter
           
             // check if one row was updated
            if (pst.executeUpdate() == 1) {
                refreshTable(); // Refresh the table after successful update
                JOptionPane.showMessageDialog(rootPane, "Customer information Updated.");
                txt_name.setText("");
                txt_email.setText("");
                txt_phone.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Failed to update customer information.");
            }

            pst.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jMenuItem_updateActionPerformed

   private void refreshTable() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT id, name, email, phone, gender FROM customers");

            tableModel.setRowCount(0); // Clear previous data

            while (rs.next()) {
                String customerId = rs.getString("id");
                System.out.println(rs.getString("id"));
                String customerName = rs.getString("name"); 
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String gender = rs.getString("gender");

                // Add data to table model, including customerId
                tableModel.addRow(new Object[]{customerId, customerName, email, phone,gender});

            }

            jTable.setModel(tableModel); // Set the table model with updated data

            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_add;
    private javax.swing.JMenuItem jMenuItem_delete;
    private javax.swing.JMenuItem jMenuItem_update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel lbl_customerName;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
