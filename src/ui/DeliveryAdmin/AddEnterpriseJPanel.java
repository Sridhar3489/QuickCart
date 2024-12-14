/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DeliveryAdmin;

import ui.GroceryAdmin.*;
import ui.RestaurantEnterpriseAdmin.*;
import business.EcoSystem.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.DeliveryEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.GroceryEnterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.Role.RestaurantManagerRole;
import business.UserAccount.EmployeeAccount;
import business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class AddEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEnterpriseJPanel
     */
    JPanel userProcessContainer;
    EmployeeAccount account;
    Organization organization;
    EcoSystem business;
    Enterprise enterprise;
    Network network;

    public AddEnterpriseJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = (EmployeeAccount) account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        this.network = this.business.getNetworkList().get(0);
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
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 173, 245));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Delivery Enterprise Name");

        txtName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Delivery Enterprise Address");

        txtAddress.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Delivery Enterprise Phone");

        txtPhone.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Delivery Enterprise Email");

        txtEmail.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Manager Name");

        jTextField1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Username");

        jTextField2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtAddress)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText().trim();
        String address = txtAddress.getText().trim();
        String phone = txtPhone.getText().trim();
        String email = txtEmail.getText().trim();
        String Managername = jTextField1.getText();
        String username = jTextField2.getText();
        String password = jTextField3.getText();
        if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty() || Managername.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (name.isEmpty() || !name.matches("^[A-Za-z ]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Enterprise Name must contain only letters, spaces, and be at least 2 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (address.isEmpty() || !address.matches("^[A-Za-z0-9 ,.]{10,}$")) {
            JOptionPane.showMessageDialog(this, "Address must be at least 10 characters long and can include letters, numbers, commas, and periods.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (phone.isEmpty() || !phone.matches("^\\d{10}$")) {
            JOptionPane.showMessageDialog(this, "Phone number must be exactly 10 digits.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (email.isEmpty() || !email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Invalid email format. Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Managername.isEmpty() || !Managername.matches("^[A-Za-z ]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Manager Name must contain only letters, spaces, and be at least 2 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (username.isEmpty() || !username.matches("^[A-Za-z0-9_]{4,20}$")) {
            JOptionPane.showMessageDialog(this, "Username must be 4-20 characters long and can include letters, numbers, and underscores.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.isEmpty() || !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long, include an uppercase letter, a lowercase letter, a digit, and a special character.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DeliveryEnterprise restaurant = network.getEnterpriseDirectory().createDelivery(name, address, phone, email);
        Employee emp2 = restaurant.getEmployeeDirectory().createEmployee(Managername, email);
        EmployeeAccount ua = business.getUserAccountDirectory().createUserAccount(username, password, new RestaurantManagerRole());
        ua.setEmployee(emp2);
        JOptionPane.showMessageDialog(this, "Store added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}