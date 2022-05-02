/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.Enterprise.Enterprise;
import model.Organization.VetOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.MedicalCareEnterprise;
import model.Network.Network;
import model.Organization.TreatmentOrganization;
import ui.Pharmacist.PharmacistWorkArea;
import ui.Vet.VetWorkArea;

/**
 *
 * @author raunak
 */
public class VetRole extends Role{

    
    public VetRole() {
        this.type = RoleType.Vet;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.Vet;
        return new VetWorkArea(userProcessContainer, account, (VetOrganization) organization, (MedicalCareEnterprise) enterprise, network, ecosystem);
    }

}
