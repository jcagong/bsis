/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Route;

import Role.Role;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface RouteDao {
    public boolean addRoute(Route route);
    public boolean updateRoute(int index, Route route);
    public boolean deleteRoute(int index);
    public int getRoute(int id);
    public List<Route> getRoutes();
    
}
