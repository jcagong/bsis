/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Role;

import User.User;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface RoleDao {
    public boolean addRole(Role role);
    public boolean updateRole(int index, Role role);
    public boolean deleteRole(int index);
    public int getRole(int id);
    public List<Role> getRoles();
    
}
