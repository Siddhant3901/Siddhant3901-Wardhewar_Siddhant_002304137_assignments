/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class PersonProfile {
    
    private ArrayList<Person>person;
    
    public PersonProfile (){
        this.person = new ArrayList<Person>();
        
    }
    public ArrayList<Person> getPerson(){
        return person;
        
    }
    public Person addPerson(){
        Person p = new Person();
        person.add(p);
        return p;
        
    }
    public void deletePerson(Person p){
        person.remove(p);
        
            }
 public Person searchPerson(String  search){   
 for (Person p:person){
            Address add = p.getAddress();
            if(p.getFName().contains(search) || p.getLName().contains(search) ||
               add.getHStreetAdd().contains(search) || String.valueOf(add.getHUnNo()).contains(search) || add.getHCity().contains(search) || add.getHstate().contains(search) || String.valueOf(add.getHzip()).contains(search) || String.valueOf(add.getHPno()).contains(search)
               || add.getWStreetAdd().contains(search) || String.valueOf(add.getWUnNo()).contains(search) || add.getWCity().contains(search) || add.getWstate().contains(search) || String.valueOf(add.getWzip()).contains(search) || String.valueOf(add.getWPno()).contains(search)) {
                return p;
        }
     
    }
          return null;
 }

    public void deleteAccount(Person selectedPerson) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

