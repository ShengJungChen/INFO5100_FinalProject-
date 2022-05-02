package model.EcoSystem;



//import model.Employee.Employee;
import model.Role.SystemAdminRole;
import model.UserAccount.UserAccount;

/**
 *
 * @author anitachen
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecoSystem = new EcoSystem();  

     //   ecoSystem.getSystemAdmin();
             
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());
        
        ecoSystem.setSystemAdmin(account);

  //      adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        return ecoSystem;
    }
    
}
