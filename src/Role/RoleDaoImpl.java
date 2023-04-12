/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import User.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class RoleDaoImpl implements RoleDao{
    
    private List<Role> roles = new ArrayList<Role>();
    
    public boolean addRole(Role role){
        this.roles.add(role);
        
        return true;
    }
    
    public boolean updateRole(int index, Role role){
        boolean success = false;
        
        try{
            this.roles.set(index, role);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteRole(int index){
        boolean success = false;
        
        try{
            this.roles.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getRole(int id){
        int index = -1;
        
        for (int n = 0; n < this.roles.size(); n++){
            if (this.roles.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Role> getRoles(){
        return this.roles;
    }
    
}
