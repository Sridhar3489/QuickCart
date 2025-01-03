/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.EcoSystem.EcoSystem;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.CustomerAccount;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.LoginJPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    JPanel workArea;
    UserAccount account;
    Organization organization;
    CustomerAccount ca;
    EcoSystem ecosystem;
    Network network;
    public CustomerWorkAreaJPanel(JPanel workArea, UserAccount account, Organization organization, EcoSystem ecosystem, Network network) {
        initComponents();
        this.revalidate();
this.repaint();
        this.workArea = workArea;
        this.account= account;
        this.organization = organization;
        this.ecosystem = ecosystem;
        this.network = ecosystem.getNetworkList().get(0);
        ca = (CustomerAccount) account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnOrder = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        upc = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        btnOrder.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnProfile.setText("My Orders");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnCart.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnCart.setText("Cart");
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton1.setText("Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(btnOrder)
                .addGap(35, 35, 35)
                .addComponent(btnProfile)
                .addGap(35, 35, 35)
                .addComponent(btnCart)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(49, 49, 49)
                .addComponent(btnLogout)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrder)
                    .addComponent(btnProfile)
                    .addComponent(btnCart)
                    .addComponent(btnLogout)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        upc.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(upc);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.workArea.removeAll(); // Clear the current work area

        LoginJPanel loginPanel = new LoginJPanel(this.workArea);
        this.workArea.add("LoginJPanel", loginPanel);

        CardLayout layout = (CardLayout) this.workArea.getLayout();
        layout.next(this.workArea);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        // TODO add your handling code here:
        CartJFrame frame = new CartJFrame(this.ecosystem, ca, network);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_btnCartActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        ca = (CustomerAccount) account;
        CustomerProfile cojp = new CustomerProfile(network, ca);
        upc.add(cojp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        System.out.println(ecosystem);
        ca = (CustomerAccount) account;
        CustomerOrderJPanel cojp = new CustomerOrderJPanel(network, ca);
        upc.add(cojp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ca = (CustomerAccount) account;
        ProfileJPanel cojp = new ProfileJPanel(this.ecosystem, ca, network);
        upc.add(cojp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel upc;
    // End of variables declaration//GEN-END:variables
}
