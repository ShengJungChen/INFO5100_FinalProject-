/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.VetRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class VetOrganization extends Organization {

    public VetOrganization(String name) {
        super(name, Organization.Type.Vet);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VetRole());
        return roles;
    }
}
