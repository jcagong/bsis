/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Driver;

import Person.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class DriverDaoImpl implements DriverDao{
    
    private List<Driver> drivers = new ArrayList<Driver>();
    
    public boolean addDriver(Driver driver){
        this.drivers.add(driver);
        
        return true;
    }
    
    public boolean updateDriver(int index, Driver driver){
        boolean success = false;
        
        try{
            this.drivers.set(index, driver);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteDriver(int index){
        boolean success = false;
        
        try{
            this.drivers.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getDriver(int id){
        int index = -1;
        
        for (int n = 0; n < this.drivers.size(); n++){
            if (this.drivers.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Driver> getDrivers(){
        return this.drivers;
    }
    

    
}
