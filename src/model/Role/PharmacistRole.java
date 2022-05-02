/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;


import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Organization.TreatmentOrganization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.MedicalCareEnterprise;
import model.Network.Network;
import model.Organization.AnimalRegisterOrganization;
import ui.AnimalRegistorRole.AnimalRegistorWorkAreaJPanel;
import ui.Pharmacist.PharmacistWorkArea;


/**
 *
 * @author Kunjan
 */
public class PharmacistRole extends Role{

    public PharmacistRole() {
        this.type = RoleType.Pharmacist;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.Pharmacist;
        return new PharmacistWorkArea(userProcessContainer, account, (TreatmentOrganization) organization, (MedicalCareEnterprise) enterprise, network, ecosystem);
    }

}