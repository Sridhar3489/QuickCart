/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.RestaurantEnterpriseAdmin;

import business.EcoSystem.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.EmployeeAccount;
import business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class EditEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEnterpriseJPanel
     */
    JPanel userProcessContainer;
    EmployeeAccount account;
    Organization organization;
    EcoSystem business;
    Enterprise enterprise;
    Network network;

    public EditEnterpriseJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = (EmployeeAccount) account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        this.network = this.business.getNetworkList().get(0);
        txtName.setText(enterprise.getName());
        txtAddress.setText(enterprise.getAddress());
        txtPhone.setText(enterprise.getPhone());
        txtEmail.setText(enterprise.getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Restaurant Name");

        txtName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Restaurant Address");

        txtAddress.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Restaurant Phone");

        txtPhone.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Restaurant Email");

        txtEmail.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton1.setText("Submit");
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
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail))))
                .addGap(356, 356, 356))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText().trim();
        String address = txtAddress.getText().trim();
        String phone = txtPhone.getText().trim();
        String email = txtEmail.getText().trim();

        if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (name.isEmpty() || !name.matches("^[A-Za-z ]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Name must be at least 2 characters long and contain only letters and spaces.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (address.isEmpty() || !address.matches("^[A-Za-z0-9 ,#.-]{5,}$")) {
            JOptionPane.showMessageDialog(this, "Address must be at least 5 characters long and can contain letters, numbers, commas, periods, and hash symbols.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (phone.isEmpty() || !phone.matches("^\\d{10}$")) {
            JOptionPane.showMessageDialog(this, "Phone number must be exactly 10 digits.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (email.isEmpty() || !email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Email must be in a valid format (e.g., example@domain.com).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        enterprise.setName(name);
        enterprise.setAddress(address);
        enterprise.setPhone(phone);
        enterprise.setEmail(email);

        JOptionPane.showMessageDialog(this, "Restaurant updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
