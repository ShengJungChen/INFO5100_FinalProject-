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
import ui.AdministrativeRole.AdminWorkAreaJPanel;
import ui.Volunteer.VolunteerWorkArea;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role {

    public SystemAdminRole() {
        this.type = RoleType.SystemAdmin;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.SystemAdmin;
        return new AdminWorkAreaJPanel(userProcessContainer, account, ecosystem);
    }

}
