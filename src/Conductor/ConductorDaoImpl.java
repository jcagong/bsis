/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conductor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class ConductorDaoImpl implements ConductorDao{
    
    private List<Conductor> conductors = new ArrayList<Conductor>();
    
    public boolean addConductor(Conductor conductor){
        this.conductors.add(conductor);
        
        return true;
    }
    
    public boolean updateConductor(int index, Conductor conductor){
        boolean success = false;
        
        try{
            this.conductors.set(index, conductor);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteConductor(int index){
        boolean success = false;
        
        try{
            this.conductors.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getConductor(int id){
        int index = -1;
        
        for (int n = 0; n < this.conductors.size(); n++){
            if (this.conductors.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Conductor> getConductors(){
        return this.conductors;
    }
    
}
