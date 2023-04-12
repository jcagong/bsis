/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Conductor.Conductor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class CompanyDaoImpl implements CompanyDao{
    
    private List<Company> companies = new ArrayList<Company>();
    
    public boolean addCompany(Company company){
        this.companies.add(company);
        
        return true;
    }
    
    public boolean updateCompany(int index, Company company){
        boolean success = false;
        
        try{
            this.companies.set(index, company);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deleteCompany(int index){
        boolean success = false;
        
        try{
            this.companies.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getCompany(int id){
        int index = -1;
        
        for (int n = 0; n < this.companies.size(); n++){
            if (this.companies.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Company> getCompanies(){
        return this.companies;
    }
    
}
