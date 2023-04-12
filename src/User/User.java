/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Person.Person;

/**
 *
 * @author fernando
 */
public class User {
    public static int currentNo = 1;
    
    private int id;
    private String userName;
    private String passWord;
    private int roleId;
    
    private Person person;

    public User(String userName, String passWord, int roleId, Person person) {
        this.id = currentNo;
        this.userName = userName;
        this.passWord = passWord;
        this.roleId = roleId;
        this.person = person;
        
        currentNo++;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getRoleId() {
        return roleId;
    }

    public Person getPerson() {
        return person;
    }

    
}
