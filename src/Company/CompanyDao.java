/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Company;

import Conductor.Conductor;
import java.util.List;

/**
 *
 * @author fernando
 */
public interface CompanyDao {
    public boolean addCompany(Company company);
    public boolean updateCompany(int index, Company company);
    public boolean deleteCompany(int index);
    public int getCompany(int id);
    public List<Company> getCompanies();
    
}
