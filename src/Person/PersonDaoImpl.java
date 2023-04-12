/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class PersonDaoImpl implements PersonDao{
    
    private List<Person> persons = new ArrayList<Person>();
    
    public boolean addPerson(Person person){
        this.persons.add(person);
        
        return true;
    }
    
    public boolean updatePerson(int index, Person person){
        boolean success = false;
        
        try{
            this.persons.set(index, person);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public boolean deletePerson(int index){
        boolean success = false;
        
        try{
            this.persons.remove(index);
            success = true;
        } catch (Exception e){
            success = false;
        }
        
        return success;
    }
    
    public int getPerson(int id){
        int index = -1;
        
        for (int n = 0; n < this.persons.size(); n++){
            if (this.persons.get(n).getId() == id){
                index = n;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
    
    public List<Person> getPersons(){
        return this.persons;
    }
    
}
