/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Organization.AdopterOrganization;
import model.Organization.AdoptionOperationOrganization;
import model.Organization.Organization;

/**
 *
 * @author anitachen
 */
public class AdoptionEnterprise extends Enterprise{

    public AdoptionEnterprise(String name) {
        super(name, Enterprise.Type.Adoption);
    }
    
}
