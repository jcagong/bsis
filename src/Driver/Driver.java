/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Driver;

import Person.Person;

/**
 *
 * @author fernando
 */
public class Driver {
    public static int currentNo = 1;
    
    private int id;
    private int licenseNo;
    
    private  Person person;

    public Driver(int licenseNo, Person person) {
        this.id = currentNo;
        this.licenseNo = licenseNo;
        this.person = person;
        
        currentNo++;
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public Person getPerson() {
        return person;
    }
    
    
}
