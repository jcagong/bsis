/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Person;

import java.util.List;

/**
 *
 * @author fernando
 */
public interface PersonDao {
    public boolean addPerson(Person person);
    public boolean updatePerson(int index, Person person);
    public boolean deletePerson(int index);
    public int getPerson(int id);
    public List<Person> getPersons();
    
}
