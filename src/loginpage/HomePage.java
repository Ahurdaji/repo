
package loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class HomePage extends javax.swing.JFrame {
 // Create a DefaultListModel to manage a list of strings for components
    DefaultListModel<String> ListModel = new DefaultListModel();

       
    public HomePage() {
        initComponents();
        
        refreshList();
         refreshDash();
         jList1.setModel(ListModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane = new javax.swing.JTabbedPane();
        pnl_product = new javax.swing.JPanel();
        btn_product = new javax.swing.JButton();
        btn_customer = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_sales = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pnl_dashboard = new javax.swing.JPanel();
        num_productLabel = new javax.swing.JLabel();
        num_customerLabel = new javax.swing.JLabel();
        total_salesLabel = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneMouseClicked(evt);
            }
        });

        pnl_product.setBackground(new java.awt.Color(204, 204, 255));
        pnl_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_productMouseClicked(evt);
            }
        });

        btn_product.setText("Products");
        btn_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productActionPerformed(evt);
            }
        });

        btn_customer.setText("Customers");
        btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customerActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Write the product name you want to seach about:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Search field :");

        btn_sales.setText("Sales");
        btn_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salesActionPerformed(evt);
            }
        });

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout pnl_productLayout = new javax.swing.GroupLayout(pnl_product);
        pnl_product.setLayout(pnl_productLayout);
        pnl_productLayout.setHorizontalGroup(
            pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_productLayout.createSequentialGroup()
                        .addGroup(pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnl_productLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_search)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_productLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_productLayout.createSequentialGroup()
                                .addGroup(pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_customer)
                                    .addComponent(btn_product))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_productLayout.createSequentialGroup()
                                .addComponent(btn_sales)
                                .addGap(33, 33, 33))))))
        );
        pnl_productLayout.setVerticalGroup(
            pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_productLayout.createSequentialGroup()
                        .addComponent(btn_product)
                        .addGap(18, 18, 18)
                        .addComponent(btn_customer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sales))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Search Product", pnl_product);

        pnl_dashboard.setBackground(new java.awt.Color(204, 204, 255));

        num_productLabel.setForeground(new java.awt.Color(0, 0, 0));
        num_productLabel.setText("Number Of Products ");

        num_customerLabel.setForeground(new java.awt.Color(0, 0, 0));
        num_customerLabel.setText("Number Of Customers  ");

        total_salesLabel.setForeground(new java.awt.Color(0, 0, 0));
        total_salesLabel.setText("Total Sales");

        javax.swing.GroupLayout pnl_dashboardLayout = new javax.swing.GroupLayout(pnl_dashboard);
        pnl_dashboard.setLayout(pnl_dashboardLayout);
        pnl_dashboardLayout.setHorizontalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(num_productLabel)
                .addGap(62, 62, 62))
            .addGroup(pnl_dashboardLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(total_salesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dashboardLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(num_customerLabel)
                    .addContainerGap(302, Short.MAX_VALUE)))
        );
        pnl_dashboardLayout.setVerticalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(num_productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(total_salesLabel)
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dashboardLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(num_customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        jTabbedPane.addTab("Dashboard", pnl_dashboard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       private void refreshList() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            // Create a statement to execute SQL queries
            Statement stm = con.createStatement();
            // Execute the query to retrieve product names from the 'product' table
            ResultSet rs = stm.executeQuery("SELECT  name FROM product");

            while (rs.next()) {
               // Retrieve the product name from the result set
                String productName = rs.getString("name");
              
                // Add each product name to the list model
                ListModel.addElement( productName);
            }
             // Set the list model to the JList component
            jList1.setModel(ListModel);
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
       private void refreshDash() {
            try{
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
                 //Count number of customer in the 'customers' table
                 PreparedStatement CustomerStatement = con.prepareStatement("SELECT COUNT(*) AS customerCount FROM customers");
                 ResultSet customerResult = CustomerStatement.executeQuery();
                 // Check if the query returned any result
                 if(customerResult.next()){
                     // Retrieve the count of customers from the result set
                     int customerCount = customerResult.getInt("customerCount");
                     num_customerLabel.setText("Number Of Customers: " + customerCount);
                 }
                 //Count number of Product in the 'product' table
                 PreparedStatement ProductStatement = con.prepareStatement("SELECT COUNT(*) AS productCount FROM product");
                 ResultSet productResult = ProductStatement.executeQuery();
                 if(productResult.next()){
                     int productCount = productResult.getInt("productCount");
                     num_productLabel.setText("Number Of Product: " + productCount);
                 }
                //Calculate total sales in the 'sales' table
                 PreparedStatement SalesStatement = con.prepareStatement("SELECT Count(*) AS totalSales FROM sales");
                 ResultSet SalesResult = SalesStatement.executeQuery();
                 if(SalesResult.next()){
                     int totalSales = SalesResult.getInt("totalSales");
                     total_salesLabel.setText("Total Sales: " + totalSales);
                 }


                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                    
                }
       }

    private void jTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneMouseClicked

    }//GEN-LAST:event_jTabbedPaneMouseClicked

    private void pnl_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_productMouseClicked

    }//GEN-LAST:event_pnl_productMouseClicked

    private void btn_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customerActionPerformed
        Customers cu = new Customers();
        cu.setVisible(true);
    }//GEN-LAST:event_btn_customerActionPerformed

    private void btn_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productActionPerformed
        Products pr = new Products();
        pr.setVisible(true);
    }//GEN-LAST:event_btn_productActionPerformed

    private void btn_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salesActionPerformed
       Sales sa = new Sales();
       sa.setVisible(true);
    }//GEN-LAST:event_btn_salesActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
      try {
            String search = txt_search.getText();
            if(search.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Please fill in the search field");
            }else{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            ListModel.removeAllElements();
            String sql = "SELECT * FROM product WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" +search+ "%");
           
            ResultSet rs = ps.executeQuery();
           if (rs.next()) {
                    String productName = rs.getString("name");
                    String price = rs.getString("price");
                    String quantity = rs.getString("quantity");
                    ListModel.addElement("Product Name: " +productName + " - Price: " + price + "- Quantity: " + quantity);
                } else if (rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Product found");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Product not found");
            }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btn_searchActionPerformed


    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_customer;
    private javax.swing.JButton btn_product;
    private javax.swing.JButton btn_sales;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel num_customerLabel;
    private javax.swing.JLabel num_productLabel;
    private javax.swing.JPanel pnl_dashboard;
    private javax.swing.JPanel pnl_product;
    private javax.swing.JLabel total_salesLabel;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
