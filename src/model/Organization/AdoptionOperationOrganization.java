/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.AdoptionManagerRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anitachen
 */
public class AdoptionOperationOrganization extends Organization{

    public AdoptionOperationOrganization(String name) {
        super(name, Organization.Type.AdoptionOperation);
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdoptionManagerRole());
        return roles;
    }
    
}
