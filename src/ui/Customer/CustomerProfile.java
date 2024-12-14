/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.Enterprise.Enterprise.EnterpriseType;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.UserAccount.CustomerAccount;
import business.WorkQueue.OrderRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerProfile extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProfile
     */
    Network network;
    CustomerAccount account;
    EnterpriseType type;
    RestaurantEnterprise restaurant;
    GroceryEnterprise grocery;

    public CustomerProfile(Network network, CustomerAccount ca) {
        initComponents();
        this.network = network;
        this.account = ca;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
        dtm.setRowCount(0);
        System.out.println("Inside populate Table " + account.getWorkQueue().getWorkRequestList().size());
        for (WorkRequest wr : this.account.getWorkQueue().getWorkRequestList()) {
            OrderRequest or = (OrderRequest) wr;

            Object row[] = new Object[5];
            System.out.println(or.getMerchant());
            row[0] = or;
            row[1] = or.getMerchant();
            row[2] = or.getAmount();
            row[3] = or.getStatus();

            if (or.getReview() == 0) {
                row[4] = "Not Rated";
            } else {
                row[4] = or.getReview();
            }
            dtm.addRow(row);

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnRate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 102));

        orderTable.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order #", "Merchant", "Amount", "Status", "Review"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(1).setHeaderValue("Merchant");
        }

        btnRate.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnRate.setText("Rate Order");
        btnRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRate)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnRate)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked

    }//GEN-LAST:event_orderTableMouseClicked

    private void btnRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select an order to rate.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        OrderRequest orderRequest = (OrderRequest) orderTable.getValueAt(selectedRow, 0);

        if (selectedRow >= 0) {
            String reviewStatus = orderTable.getValueAt(selectedRow, 4).toString();

            if ("Not Rated".equalsIgnoreCase(reviewStatus)) {
                btnRate.setEnabled(true);
            } else {
                btnRate.setEnabled(false);
            }
        } else {
            btnRate.setEnabled(false);
        }

        if (!"Order Delivered".equalsIgnoreCase(orderRequest.getStatus())) {
            JOptionPane.showMessageDialog(this, "Only delivered orders can be rated.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String input = JOptionPane.showInputDialog(this, "Please rate your order (1-5):", "Rate Order", JOptionPane.QUESTION_MESSAGE);

        if (input == null) {
            return;
        }

        try {
            int rating = Integer.parseInt(input);

            if (rating < 1 || rating > 5) {
                JOptionPane.showMessageDialog(this, "Rating must be between 1 and 5.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            orderRequest.setReview(rating);

            JOptionPane.showMessageDialog(this, "Thank you for rating the order!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric rating.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables

}