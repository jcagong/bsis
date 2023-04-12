/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Schedule;

import User.User;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface ScheduleDao {
    public boolean addSchedule(Schedule schedule);
    public boolean updateSchedule(int index, Schedule schedule);
    public boolean deleteSchedule(int index);
    public int getSchedule(int id);
    public List<Schedule> getSchedules();
    
}
