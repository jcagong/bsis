/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bus;

import Company.Company;
import Conductor.Conductor;
import Driver.Driver;

/**
 *
 * @author fernando
 */
public class Bus {
    public static int currentNo = 1;
    
    private int id;
    private int bodyNo;
    private int capacity;
    
    private Driver driver;
    private Conductor conductor;
    private Company company;

    public Bus(int bodyNo, int capacity, Driver driver, Conductor conductor, Company company) {
        this.bodyNo = bodyNo;
        this.capacity = capacity;
        this.driver = driver;
        this.conductor = conductor;
        this.company = company;
    }

    public static void setCurrentNo(int currentNo) {
        Bus.currentNo = currentNo;
    }

    public void setBodyNo(int bodyNo) {
        this.bodyNo = bodyNo;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static int getCurrentNo() {
        return currentNo;
    }

    public int getId() {
        return id;
    }

    public int getBodyNo() {
        return bodyNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Company getCompany() {
        return company;
    }
    
    
    
}
