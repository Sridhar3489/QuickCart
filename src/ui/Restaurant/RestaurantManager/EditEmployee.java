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
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SAI SRIDHAR
 */
public class EditEmployee extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployee
     */
    JPanel workArea;
    UserAccount account;
    EcoSystem ecosystem;
    RestaurantEnterprise restaurant;
    Network network;
    Employee emp;

    public EditEmployee(JPanel workArea, UserAccount account, EcoSystem ecosystem, RestaurantEnterprise restaurant, Employee selectedEmployee) {
        initComponents();
        this.workArea = workArea;
        this.account = (EmployeeAccount) account;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        this.emp = selectedEmployee;
        network = ecosystem.getNetworkList().get(0);
        txtName.setText(emp.getName());
        txtEmail.setText(emp.getEmail());
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
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 62, 70));

        lblName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lblName.setText("Name");

        lblEmail.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lblEmail.setText("Email Id");

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
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSubmit)
                .addContainerGap(291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String newName = txtName.getText().trim();
        String newEmail = txtEmail.getText().trim();

        if (newName.isEmpty() || newEmail.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "All fields are required!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (newName.isEmpty() || !newName.matches("^[A-Za-z ]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Name must be at least 2 characters long and contain only letters and spaces.", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (newEmail.isEmpty() || !newEmail.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Email must be in a valid format (e.g., example@domain.com).", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        emp.setName(newName);
        emp.setEmail(newEmail);

        javax.swing.JOptionPane.showMessageDialog(this, "Employee updated successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        if (parent != null) {
            parent.dispose();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
