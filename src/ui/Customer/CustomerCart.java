/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.Customer.ItemOrder;
import business.EcoSystem.EcoSystem;
import business.Network.Network;
import business.UserAccount.CustomerAccount;
import java.awt.CardLayout;
import java.math.BigDecimal;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerCart extends javax.swing.JPanel {

    /**
     * Creates new form CustomerCart
     */
    private EcoSystem system;
    private CustomerAccount account;
    private Network net;
    private JPanel container;
    public CustomerCart(EcoSystem system, JPanel container, CustomerAccount account, Network net) {
        initComponents();
        this.system = system;
        this.container = container;
        this.account = account;
        this.net = net;
        
        populateTable();
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
        tblCart = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 102));

        tblCart.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCart);

        lblTitle.setFont(new java.awt.Font("Bahnschrift", 1, 32)); // NOI18N
        lblTitle.setText("Shopping Cart");

        btnPlaceOrder.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnPlaceOrder.setText("Checkout");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnClear.setText("Clear Cart");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(28, 28, 28)
                        .addComponent(btnPlaceOrder))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(70, 70, 70)
                        .addComponent(lblTitle)
                        .addGap(141, 141, 141))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder)
                    .addComponent(btnClear))
                .addContainerGap(418, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        PlaceOrderJPanel panel = new PlaceOrderJPanel(this.system, this.container, this.account, account.getCart().getItemList().get(0).getShopModel(), net);
        this.container.add(panel);
        CardLayout layout = (CardLayout) this.container.getLayout();
        layout.next(this.container);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        account.getCart().clearCart(); 

        populateTable(); 

        javax.swing.JOptionPane.showMessageDialog(this, "Cart cleared successfully!");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed
    
     public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCart.getModel();
        dtm.setRowCount(0);
        for (ItemOrder order : account.getCart().getItemList()) {
//            System.out.println(order.getShopModel().getName());
            Object row[] = new Object[3];
            row[0] = order;
            row[1] = order.getQuantity();
            row[2] = order.getTotalPrice();
            dtm.addRow(row);
        }
        BigDecimal bd = new BigDecimal(this.account.getCart().getTotalPrice());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCart;
    // End of variables declaration//GEN-END:variables
}