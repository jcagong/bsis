/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package User;

import Person.Person;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface UserDao {
    public boolean addUser(User user);
    public boolean updateUser(int index, User user);
    public boolean deleteUser(int index);
    public int getUser(int id);
    public List<User> getUsers();
    
}
