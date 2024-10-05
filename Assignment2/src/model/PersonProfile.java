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
    public void deletePerson(String FName){
        person.remove(person);
        
            }
 public Person searchPerson(String FName){   
 for (Person p:person){
            if(p.getFName().contains(FName)){
                return p;
            }
        }
     return null;
 }
}

