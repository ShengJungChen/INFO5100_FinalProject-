/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.PharmacistRole;
import model.Role.BehaviorTherapistRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kunjan
 */
public class TreatmentOrganization extends Organization{

    public TreatmentOrganization(String name) {
        super(name, Organization.Type.Treatment);
       
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacistRole());
        roles.add(new BehaviorTherapistRole());
        return roles;
    }

    
}