/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Route;

import User.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class RouteDaoImpl implements RouteDao{
    
    private List<Route> routes = new ArrayList<Route>();
    
    public boolean addRoute(Route route){
        this.routes.add(route);
        
        return true;
    }
    
    public boolean updateRoute(int index, Route route){
        boolean success = false;
        
        try{
            this.routes.set(index, route);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteRoute(int index){
        boolean success = false;
        
        try{
            this.routes.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getRoute(int id){
        int index = -1;
        
        for (int n = 0; n < this.routes.size(); n++){
            if (this.routes.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Route> getRoutes(){
        return this.routes;
    }
    
}
