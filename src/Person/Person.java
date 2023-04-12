/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author fernando
 */
public class Person {
    public static int currentNo = 1;
    
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String date;
    private String address;
    private int contactNo;

    public Person(String firstName, String middleName, String lastName, String gender, String date, String address, int contactNo) {
        this.id = currentNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.contactNo = contactNo;
        
        currentNo++;
    }

    public static void setCurrentNo(int currentNo) {
        Person.currentNo = currentNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public static int getCurrentNo() {
        return currentNo;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public int getContactNo() {
        return contactNo;
    }
    
    
    
}
