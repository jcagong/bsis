/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Person.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class UserDaoImpl implements UserDao{
    
    private List<User> users = new ArrayList<User>();
    
    public boolean addUser(User user){
        this.users.add(user);
        
        return true;
    }
    
    public boolean updateUser(int index, User user){
        boolean success = false;
        
        try{
            this.users.set(index, user);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteUser(int index){
        boolean success = false;
        
        try{
            this.users.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getUser(int id){
        int index = -1;
        
        for (int n = 0; n < this.users.size(); n++){
            if (this.users.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;

    }
    
    public List<User> getUsers(){
        return this.users;
    }
    
}
