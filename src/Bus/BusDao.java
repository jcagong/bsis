/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Bus;

import Company.Company;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface BusDao {
    public boolean addBus(Bus bus);
    public boolean updateBus(int index, Bus bus);
    public boolean deleteBus(int index);
    public int getBus(int id);
    public List<Bus> getBuses();
    
}
