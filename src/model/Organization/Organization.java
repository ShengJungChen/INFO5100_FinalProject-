/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.Role;
import model.UserAccount.UserAccountDirectory;
import model.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author anitachen
 */
public abstract class Organization {

    private Type type;
    private String name;
//    private WorkQueue workQueue;
//    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int idCounter;
    
    public enum Type {
        AnimalRegister("Animal Register Organization"), 
        AnimalManagement("Animal Management Organization"), 
        Vet("Vet Organization"),
        Treatment("Treatment Organization"),
        Adopter("Adopter Organization"), 
        AdoptionOperation("Adoption Operation Organization"), 
        VolunteerManagement("Volunteer Management Organization"), 
        Volunteer("Volunteer Organization");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
        
    }

    public Organization(String name, Type type) {
        this.name = name;
        this.type = type;
//        workQueue = new WorkQueue();
//        userAccountDirectory = new UserAccountDirectory();
        organizationID = idCounter;
        ++idCounter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

    public int getOrganizationID() {
        return organizationID;
    }

    public Type getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
