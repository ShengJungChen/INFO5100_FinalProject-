/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem.EcoSystem;
import model.Network.Network;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.Enterprise.VolunteerEnterprise;
import model.Organization.VolunteerManagementOrganization;
import ui.VolunteerManager.VolunteerManagerWorkArea;

/**
 *
 * @author raunak
 */
public class VolunteerManagerRole extends Role {

    public VolunteerManagerRole() {
        this.type = RoleType.VolunteerManeger;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.VolunteerManeger;
        return new VolunteerManagerWorkArea(userProcessContainer, account, (VolunteerManagementOrganization) organization, (VolunteerEnterprise) enterprise, network, ecosystem);
    }


}
