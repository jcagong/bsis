/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Conductor;

import Driver.Driver;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface ConductorDao {
    public boolean addConductor(Conductor conductor);
    public boolean updateConductor(int index, Conductor conductor);
    public boolean deleteConductor(int index);
    public int getConductor(int id);
    public List<Conductor> getConductors();

    
}
