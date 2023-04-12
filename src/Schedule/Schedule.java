/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schedule;

import Bus.Bus;
import Person.Person;
import Route.Route;

/**
 *
 * @author fernando
 */
public class Schedule {
    public static int currentNo = 1;
    
    private int id;
    private int days;
    private String status;
    
    private Bus Bus;
    private Route route;

    public Schedule(int days, String status, Bus Bus, Route route) {
        this.id = currentNo;
        this.days = days;
        this.status = status;
        this.Bus = Bus;
        this.route = route;
        
        currentNo++;
    }

    public static void setCurrentNo(int currentNo) {
        Schedule.currentNo = currentNo;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBus(Bus Bus) {
        this.Bus = Bus;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getId() {
        return id;
    }

    public int getDays() {
        return days;
    }

    public String getStatus() {
        return status;
    }

    public Bus getBus() {
        return Bus;
    }

    public Route getRoute() {
        return route;
    }
    
    
    
}
