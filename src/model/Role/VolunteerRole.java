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
import model.Organization.VolunteerOrganization;
import ui.Volunteer.VolunteerWorkArea;

/**
 *
 * @author raunak
 */
public class VolunteerRole extends Role {

    public VolunteerRole() {
        this.type = RoleType.Volunteer;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.Volunteer;
        return new VolunteerWorkArea(userProcessContainer, account, (VolunteerOrganization) organization, (VolunteerEnterprise) enterprise, network, ecosystem);
    }


}
