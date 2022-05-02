/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author anitachen
 */
public abstract class Enterprise {

    private Type type;
    private String name;
    private OrganizationDirectory organizationDirectory;
    private WorkQueue workQueue;


    public enum Type {
        AnimalShelter("Animal Shelter"), 
        MedicalCare("Medical Care"), 
        Adoption("Adoption"), 
        Volunteer("Volunteer");

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

    public Enterprise(String name, Type type) {
        this.name = name;
        this.type = type;
        this.workQueue = new WorkQueue();
        organizationDirectory = new OrganizationDirectory();        
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString() {
        return name;
    }
    

}
