/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schedule;

import User.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class ScheduleDaoImpl implements ScheduleDao{
    
    private List<Schedule> schedules = new ArrayList<Schedule>();
    
    public boolean addSchedule(Schedule schedule){
        this.schedules.add(schedule);
        
        return true;
    }
    
    public boolean updateSchedule(int index, Schedule schedule){
        boolean success = false;
        
        try{
            this.schedules.set(index, schedule);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteSchedule(int index){
        boolean success = false;
        
        try{
            this.schedules.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getSchedule(int id){
        int index = -1;
        
        for (int n = 0; n < this.schedules.size(); n++){
            if (this.schedules.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Schedule> getSchedules(){
        return this.schedules;
    }
    
}
