/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Person.Person;
import User.User;

/**
 *
 * @author fernando
 */
public class Role {
    public static int currentNo = 1;
    
    private int id;
    private String name;
    private String level;
    
    private User user;

    public Role(String name, String level, User user) {
        this.id = currentNo;
        this.name = name;
        this.level = level;
        this.user = user;
        
        currentNo++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public User getUser() {
        return user;
    }
    
    
}
