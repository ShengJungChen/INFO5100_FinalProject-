/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.AdopterRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anitachen
 */
public class AdopterOrganization extends Organization{

    public AdopterOrganization(String name) {
        super(name, Organization.Type.Adopter);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdopterRole());
        return roles;
    }
    
}
