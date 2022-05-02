/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.UserAccount.UserAccount;

/**
 *
 * @author yuujadz
 */
public class VolunteerRequest extends WorkRequest {
    //manager, volunteer
    private UserAccount assignedVolunteer;

    public UserAccount getAssignedVolunteer() {
        return assignedVolunteer;
    }

    public void setAssignedVolunteer(UserAccount assignedVolunteer) {
        this.assignedVolunteer = assignedVolunteer;
    }
    
}
