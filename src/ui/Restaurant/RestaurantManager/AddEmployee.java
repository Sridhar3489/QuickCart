/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Restaurant.RestaurantManager;

import business.EcoSystem.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Role.RestaurantCookRole;
import business.UserAccount.EmployeeAccount;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class AddEmployee extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployee
     */
    JPanel workArea;
    UserAccount account;
    EcoSystem ecosystem;
    RestaurantEnterprise restaurant;
    Network network;

    public AddEmployee(JPanel workArea, UserAccount account, EcoSystem ecosystem, RestaurantEnterprise restaurant) {
        initComponents();
        this.workArea = workArea;
        this.account = (EmployeeAccount) account;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        System.out.println(restaurant.getName());
        network = ecosystem.getNetworkList().get(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnPassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 62, 70));

        lblName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name");

        lblEmail.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email Id");

        lblUsername.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password");

        btnSubmit.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtUsername)
                            .addComponent(btnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPassword, txtEmail, txtName, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(btnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnSubmit)
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText().trim();
        String email = txtEmail.getText().trim();
        String username = txtUsername.getText().trim();
        String password = btnPassword.getText().trim();

        if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "All fields are required!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (name.isEmpty() || !name.matches("^[A-Za-z ]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Name must be at least 2 characters long and contain only letters and spaces.", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (email.isEmpty() || !email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Email must be in a valid format (e.g., example@domain.com).", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (username.isEmpty() || !username.matches("^[A-Za-z0-9_]{4,20}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Username must be 4-20 characters long and can include letters, numbers, and underscores.", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.isEmpty() || !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long, with one uppercase letter, one lowercase letter, one digit, and one special character.", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (UserAccount ua : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getUsername().equals(username)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Username already exists. Please choose another username.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Create new employee and account
        Employee newEmployee = restaurant.getEmployeeDirectory().createEmployee(name, email);
        EmployeeAccount newAccount = ecosystem.getUserAccountDirectory().createUserAccount(username, password, new RestaurantCookRole());
        newAccount.setEmployee(newEmployee);

        // Display success message and reset fields
        javax.swing.JOptionPane.showMessageDialog(this, "Employee account created successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        txtName.setText("");
        txtEmail.setText("");
        txtUsername.setText("");
        btnPassword.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnPassword;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
