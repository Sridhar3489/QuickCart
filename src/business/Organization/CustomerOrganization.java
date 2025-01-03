/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.CustomerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SAI SRIDHAR
 */
public class CustomerOrganization extends Organization {

    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerRole());
        return roles;
    }
}

