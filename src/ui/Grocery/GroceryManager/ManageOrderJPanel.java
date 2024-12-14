/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Grocery.GroceryManager;

import business.Customer.ItemOrder;
import business.EcoSystem.EcoSystem;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.UserAccount.UserAccount;
import business.WorkQueue.DeliveryRequest;
import business.WorkQueue.OrderRequest;
import business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAI SRIDHAR
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    JPanel workArea;
    UserAccount account;
    EcoSystem ecosystem;
    GroceryEnterprise grocery;
    Network network;
    public ManageOrderJPanel(JPanel workArea, UserAccount account, EcoSystem ecosystem, GroceryEnterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.account = account;
        this.ecosystem = ecosystem;
        this.grocery = enterprise;
        network = ecosystem.getNetworkList().get(0);
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
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 203, 70));

        jTable1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Id", "Customer Name", "Customer Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton3.setText("Assign Delivery Partner");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jButton3)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please select an order to assign a delivery partner");
            return;
        }
        
        OrderRequest selectedOrder = (OrderRequest) jTable1.getValueAt(selectedRow, 0);
        
        selectedOrder.setStatus("Assigning to Delivery Partner");

        ArrayList<DeliveryEnterprise> deliveryCompanies = network.getEnterpriseDirectory().getDelivery().getDeliveryList();  
    
        JComboBox<DeliveryEnterprise> deliveryCompanyComboBox = new JComboBox<>();
        for (DeliveryEnterprise company : deliveryCompanies) {
            deliveryCompanyComboBox.addItem(company);
        }

        int option = JOptionPane.showConfirmDialog(
            null,
            deliveryCompanyComboBox,
            "Select Delivery Company",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            // Step 4: Get the selected delivery company
            DeliveryEnterprise selectedDeliveryCompany = (DeliveryEnterprise) deliveryCompanyComboBox.getSelectedItem();

            // Step 5: Create a new DeliveryRequest
            DeliveryRequest deliveryRequest = new DeliveryRequest(
                selectedDeliveryCompany, 
                selectedOrder.getSender(), 
                selectedOrder.getOrderId()
            );


            deliveryRequest.setDeliveryAddress(selectedOrder.getDeliveryAddress());
            deliveryRequest.setDeliveryPhone(selectedOrder.getDeliveryPhone());
            deliveryRequest.setDeliveryCharge(10.0); // Set a default or calculated charge
            //selectedDeliveryCompany.getWorkQueue().getWorkRequestList().add(selectedOrder);
            deliveryRequest.setOrderRequest(selectedOrder);

            selectedDeliveryCompany.getWorkQueue().getWorkRequestList().add(deliveryRequest);

            selectedOrder.setStatus("Assigning to Delivery Partner");

            javax.swing.JOptionPane.showMessageDialog(null, "Delivery partner assigning to the order.");

            populateTable();
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : grocery.getWorkQueue().getWorkRequestList()) {
             if (wr instanceof OrderRequest){
                 OrderRequest or = (OrderRequest) wr;
                    Object row[] = new Object[4];
                    row[0] = or;
                    row[1] = or.getDeliveryName();
                    row[2] = or.getDeliveryPhone();
                    row[3] = or.getStatus();
                    dtm.addRow(row);
             }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}