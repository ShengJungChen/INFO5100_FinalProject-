/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;


import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.MedicalCareEnterprise;
import model.Network.Network;
import model.Organization.TreatmentOrganization;
import ui.BehaviorTherapist.BTWorkArea;

/**
 *
 * @author raunak
 */
public class BehaviorTherapistRole extends Role {

    public BehaviorTherapistRole() {
        this.type = RoleType.BehaviorTherapist;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.BehaviorTherapist;
        return new BTWorkArea(userProcessContainer, account, (TreatmentOrganization) organization, (MedicalCareEnterprise) enterprise, network, ecosystem);
    }

}