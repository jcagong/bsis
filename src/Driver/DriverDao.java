/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Driver;

import User.User;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface DriverDao {
    public boolean addDriver(Driver driver);
    public boolean updateDriver(int index, Driver driver);
    public boolean deleteDriver(int index);
    public int getDriver(int id);
    public List<Driver> getDrivers();
    
}
