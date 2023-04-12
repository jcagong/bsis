/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conductor;

import Person.Person;

/**
 *
 * @author fernando
 */
public class Conductor {
    public static int currentNo = 1;
    
    private int id;
    
    private  Person person;

    public Conductor(Person person) {
        this.id = currentNo;
        this.person = person;
        
        currentNo++;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }
    
    
    
}
