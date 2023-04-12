/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bus;

import Conductor.Conductor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class BusDaoImpl implements BusDao{
    
    private List<Bus> buses = new ArrayList<Bus>();
    
    public boolean addBus(Bus bus){
        this.buses.add(bus);
        
        return true;
    }
    
    public boolean updateBus(int index, Bus bus){
        boolean success = false;
        
        try{
            this.buses.set(index, bus);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteBus(int index){
        boolean success = false;
        
        try{
            this.buses.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getBus(int id){
        int index = -1;
        
        for (int n = 0; n < this.buses.size(); n++){
            if (this.buses.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Bus> getBuses(){
        return this.buses;
    }
    
}
