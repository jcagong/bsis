/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

/**
 *
 * @author fernando
 */
public class Company {
    public static int currentNo = 1;
    
    private int id;
    private String companyName;

    public Company(String companyName) {
        this.id = currentNo;
        this.companyName = companyName;
        
        currentNo++;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }
    
    
    
}
